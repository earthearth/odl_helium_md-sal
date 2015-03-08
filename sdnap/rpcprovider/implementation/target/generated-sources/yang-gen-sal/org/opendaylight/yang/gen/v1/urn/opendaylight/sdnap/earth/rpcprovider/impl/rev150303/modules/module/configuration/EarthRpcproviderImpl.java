package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.earth.rpcprovider.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>earth-rpcprovider-impl</b>
 * <br />(Source path: <i>META-INF/yang/earth-rpcprovider-impl.yang</i>):
 * <pre>
 * case earth-rpcprovider-impl {
 *     container rpc-registry {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:sdnap:earth:rpcprovider-impl?revision=2015-03-03)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     leaf contents-switch-flag {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>earth-rpcprovider-impl/modules/module/configuration/(urn:opendaylight:sdnap:earth:rpcprovider-impl?revision=2015-03-03)earth-rpcprovider-impl</i>
 */
public interface EarthRpcproviderImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:sdnap:earth:rpcprovider-impl","2015-03-03","earth-rpcprovider-impl");;

    RpcRegistry getRpcRegistry();
    
    java.lang.String getContentsSwitchFlag();

}

