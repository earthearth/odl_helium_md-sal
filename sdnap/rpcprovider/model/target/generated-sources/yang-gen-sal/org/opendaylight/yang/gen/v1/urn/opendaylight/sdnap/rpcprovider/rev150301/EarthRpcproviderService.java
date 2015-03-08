package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301;
import java.util.concurrent.Future;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderInput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>earth-rpcprovider</b>
 * <br />(Source path: <i>META-INF/yang/earth-rpcprovider.yang</i>):
 * <pre>
 * rpc earth-rpcprovider {
 *     input {
 *         leaf keyword {
 *             type keyword-type;
 *         }
 *     }
 *     
 *     output {
 *         leaf url {
 *             type uri;
 *         }
 *         leaf qq {
 *             type string;
 *         }
 *         leaf city {
 *             type string;
 *         }
 *         leaf employees {
 *             type uint32;
 *         }
 *     }
 *     status CURRENT;
 * }
 * </pre>
 */
public interface EarthRpcproviderService
    extends
    RpcService
{




    Future<RpcResult<EarthRpcproviderOutput>> earthRpcprovider(EarthRpcproviderInput input);

}

