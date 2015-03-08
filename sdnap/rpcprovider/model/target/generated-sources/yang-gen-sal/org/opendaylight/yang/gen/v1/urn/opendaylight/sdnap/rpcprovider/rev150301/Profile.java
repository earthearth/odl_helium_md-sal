package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>earth-rpcprovider</b>
 * <br />(Source path: <i>META-INF/yang/earth-rpcprovider.yang</i>):
 * <pre>
 * grouping profile {
 *     leaf city {
 *         type string;
 *     }
 *     leaf employees {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>earth-rpcprovider/profile</i>
 */
public interface Profile
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:sdnap:rpcprovider","2015-03-01","profile");;

    java.lang.String getCity();
    
    java.lang.Long getEmployees();

}

