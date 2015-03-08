package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.KeywordType;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>earth-rpcprovider</b>
 * <br />(Source path: <i>META-INF/yang/earth-rpcprovider.yang</i>):
 * <pre>
 * container input {
 *     leaf keyword {
 *         type keyword-type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>earth-rpcprovider/earth-rpcprovider/input</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderInputBuilder
 */
public interface EarthRpcproviderInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:sdnap:rpcprovider","2015-03-01","input");;

    KeywordType getKeyword();

}

