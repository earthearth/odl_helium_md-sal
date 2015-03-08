package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.Profile;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>earth-rpcprovider</b>
 * <br />(Source path: <i>META-INF/yang/earth-rpcprovider.yang</i>):
 * <pre>
 * container output {
 *     leaf url {
 *         type uri;
 *     }
 *     leaf qq {
 *         type string;
 *     }
 *     leaf city {
 *         type string;
 *     }
 *     leaf employees {
 *         type uint32;
 *     }
 *     uses profile;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>earth-rpcprovider/earth-rpcprovider/output</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutputBuilder
 */
public interface EarthRpcproviderOutput
    extends
    Profile,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:sdnap:rpcprovider","2015-03-01","output");;

    Uri getUrl();
    
    java.lang.String getQq();

}

