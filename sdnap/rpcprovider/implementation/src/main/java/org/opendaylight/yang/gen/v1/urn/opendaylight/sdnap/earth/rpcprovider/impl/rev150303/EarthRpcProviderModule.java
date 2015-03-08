package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;
import org.opendaylight.sdnap.EarthRpcProviderImpl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EarthRpcProviderModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.AbstractEarthRpcProviderModule {

  //create logger.
  private final static Logger _logger = LoggerFactory.getLogger(EarthRpcProviderModule.class);

  public EarthRpcProviderModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
    super(identifier, dependencyResolver);
  }

  public EarthRpcProviderModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.EarthRpcProviderModule oldModule, java.lang.AutoCloseable oldInstance) {
    super(identifier, dependencyResolver, oldModule, oldInstance);
  }

  @Override
  public void customValidation() {
    // add custom validation form module attributes here.
  }

  @Override
  public java.lang.AutoCloseable createInstance() {
    _logger.info("EarthRcpProvider is called.");

    EarthRpcProviderImpl earthRpcProviderImpl = new EarthRpcProviderImpl();
    earthRpcProviderImpl.setContentsSwitchFlag(getContentsSwitchFlag());
    final RpcRegistration<EarthRpcproviderService> earthRpcproviderService = getRpcRegistryDependency().addRpcImplementation(EarthRpcproviderService.class, earthRpcProviderImpl);

    final class CloseResources implements AutoCloseable {
    @Override
      public void close() throws Exception {
        earthRpcproviderService.close();
        _logger.info("EarthRpcProvider was closed.", this);
      }
    }

    AutoCloseable ret = new CloseResources();
    return ret;
  }

}
