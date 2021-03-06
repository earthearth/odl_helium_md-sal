package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.earth.rpcprovider.impl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>earth-rpcprovider-impl</b>
 * <br />(Source path: <i>META-INF/yang/earth-rpcprovider-impl.yang</i>):
 * <pre>
 * container rpc-registry {
 *     leaf type {
 *         type service-type-ref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:sdnap:earth:rpcprovider-impl?revision=2015-03-03)type {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>earth-rpcprovider-impl/modules/module/configuration/(urn:opendaylight:sdnap:earth:rpcprovider-impl?revision=2015-03-03)earth-rpcprovider-impl/rpc-registry</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.earth.rpcprovider.impl.RpcRegistryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.earth.rpcprovider.impl.RpcRegistryBuilder
 */
public interface RpcRegistry
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.earth.rpcprovider.impl.RpcRegistry>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:sdnap:earth:rpcprovider-impl","2015-03-03","rpc-registry");;


}

