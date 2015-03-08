package org.opendaylight.sdnap;

import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.Futures;

import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.KeywordType;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;

import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.opendaylight.yangtools.yang.common.RpcError.ErrorType;

public class EarthRpcProviderImpl implements EarthRpcproviderService {

  //create logger.
  private static final Logger _logger = LoggerFactory
    .getLogger(EarthRpcProviderImpl.class);

  //properties.
  private String _contentsSwitchFlag;

  private final Uri _sdnapUrl;
  private final String _sdnapQq;
  private final String _sdnapCity;
  private final Long _sdnapEmployees;

  private final Uri _sdnlabUrl;
  private final String _sdnlabQq;
  private final String _sdnlabCity;
  private final Long _sdnlabEmployees;

  //default branch control values.
  private final String URL_CONTENTS_SWITCH_FLAG = new String("url");
  private final String QQ_CONTENTS_SWITCH_FLAG = new String("qq");
  private final String KEYWORD_SDNAP = new String("sdnap");
  private final String KEYWORD_SDNLAB = new String("sdnlab");

  //profile values, they should be stored in DB usually.
  private final String SDNAP_URL = new String("http://www.sdnap.com/");
  private final String SDNAP_QQ = new String("279796875");
  private final String SDNAP_CITY = new String("Peking");
  private final Long SDNAP_EMPLOYEES = new Long(1);

  private final String SDNLAB_URL = new String("http://www.sdnlab.com/");
  private final String SDNLAB_QQ = new String("194240432");
  private final String SDNLAB_CITY = new String("Nanking");
  private final Long SDNLAB_EMPLOYEES = new Long(2);

  public EarthRpcProviderImpl() {
    //set default values.
    this._contentsSwitchFlag = URL_CONTENTS_SWITCH_FLAG;

    this._sdnapUrl = new Uri(SDNAP_URL);
    this._sdnapQq = SDNAP_QQ;
    this._sdnapCity = SDNAP_CITY;
    this._sdnapEmployees = SDNAP_EMPLOYEES;

    this._sdnlabUrl = new Uri(SDNLAB_URL);
    this._sdnlabQq = SDNLAB_QQ;
    this._sdnlabCity = SDNLAB_CITY;
    this._sdnlabEmployees = SDNLAB_EMPLOYEES;
  }

  //_contentsSwitchFlag setter.
  public void setContentsSwitchFlag(String contentsSwitchFlag) {
    this._contentsSwitchFlag = contentsSwitchFlag;
  }

  @Override
  public Future<RpcResult<EarthRpcproviderOutput>> earthRpcprovider(EarthRpcproviderInput input) {

    this._logger.info("EarthRpcproviderImp is closed.", this);

    //check input, if input is null throw NullPointerException.
    Preconditions.checkNotNull(input, "input can not be null, throw NullPointerException.");

    KeywordType keywordInput = null;
    RpcResultBuilder<EarthRpcproviderOutput> earthRpcproviderBuilder = null;
    EarthRpcproviderOutput output = null;
    EarthRpcproviderOutputBuilder outputBuilder = null;

    //check keyword, if keyword is null return app error.
    if ((keywordInput = input.getKeyword()) == null) {
      earthRpcproviderBuilder = RpcResultBuilder.<EarthRpcproviderOutput>failed()
        .withError(ErrorType.APPLICATION, "Invalid input value",
          "Argument can not be null.");
    //check keyword, if keyword is invalid return app error.
    }else if (!(keywordInput.getValue().equals(KEYWORD_SDNAP)) && 
        !(keywordInput.getValue().equals(KEYWORD_SDNLAB))){
      earthRpcproviderBuilder = RpcResultBuilder.<EarthRpcproviderOutput>failed()
        .withError(ErrorType.APPLICATION, "Invalid input value",
          "only sdnap or sdnlab is acceptable as a keyword.");
    //set profiles into outputBuilder.
    }else {
      outputBuilder = new EarthRpcproviderOutputBuilder();

      //set sdnap profile into outputBuilder.
      if (keywordInput.getValue().equals(KEYWORD_SDNAP)) {
        outputBuilder
          .setUrl(this._sdnapUrl)
          .setQq(this._sdnapQq)
          .setCity(this._sdnapCity)
          .setEmployees(this._sdnapEmployees);

      //set sdnlab profile as outputBuilder.
      }else if (keywordInput.getValue().equals(KEYWORD_SDNLAB)) {
        outputBuilder
          .setUrl(this._sdnlabUrl)
          .setQq(this._sdnlabQq)
          .setCity(this._sdnlabCity)
          .setEmployees(this._sdnlabEmployees);
      //set null into outputBuilder if input is mismatched.
      }else {
        outputBuilder
          .setUrl(null)
          .setQq(null)
          .setCity(null)
          .setEmployees(null);
      }

      //set Url as null if flag is qq.
      if (this._contentsSwitchFlag.equals(QQ_CONTENTS_SWITCH_FLAG)) {
          outputBuilder
            .setUrl(null);

      //set Qq as null if flag is not qq.
      }else {
          outputBuilder
            .setQq(null);
      }

      //If output is not null, build output.
      if ((output = outputBuilder.build()) != null) {
        earthRpcproviderBuilder = RpcResultBuilder.success(output);
      //if null throw app error.
      }else {
        earthRpcproviderBuilder = RpcResultBuilder.<EarthRpcproviderOutput>failed()
          .withError(ErrorType.APPLICATION, "Invalid output value",
              "Output is null.");
      }
    }
    return Futures.immediateFuture(earthRpcproviderBuilder.build());
  }
}
