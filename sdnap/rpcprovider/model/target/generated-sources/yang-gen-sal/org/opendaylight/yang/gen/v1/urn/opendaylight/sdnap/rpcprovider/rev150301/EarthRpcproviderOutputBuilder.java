package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput
 */
public class EarthRpcproviderOutputBuilder {

    private java.lang.String _city;
    private java.lang.Long _employees;
    private static List<Range<BigInteger>> _employees_range;
    private java.lang.String _qq;
    private Uri _url;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>> augmentation = new HashMap<>();

    public EarthRpcproviderOutputBuilder() {
    } 
    
    public EarthRpcproviderOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.Profile arg) {
        this._city = arg.getCity();
        this._employees = arg.getEmployees();
    }

    public EarthRpcproviderOutputBuilder(EarthRpcproviderOutput base) {
        this._city = base.getCity();
        this._employees = base.getEmployees();
        this._qq = base.getQq();
        this._url = base.getUrl();
        if (base instanceof EarthRpcproviderOutputImpl) {
            EarthRpcproviderOutputImpl _impl = (EarthRpcproviderOutputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.Profile</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.Profile) {
            this._city = ((org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.Profile)arg).getCity();
            this._employees = ((org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.Profile)arg).getEmployees();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.Profile] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getCity() {
        return _city;
    }
    
    public java.lang.Long getEmployees() {
        return _employees;
    }
    
    public java.lang.String getQq() {
        return _qq;
    }
    
    public Uri getUrl() {
        return _url;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EarthRpcproviderOutputBuilder setCity(java.lang.String value) {
        this._city = value;
        return this;
    }
    
    public EarthRpcproviderOutputBuilder setEmployees(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _employees_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _employees_range));
            }
        }
        this._employees = value;
        return this;
    }
    public static List<Range<BigInteger>> _employees_range() {
        if (_employees_range == null) {
            synchronized (EarthRpcproviderOutputBuilder.class) {
                if (_employees_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _employees_range = builder.build();
                }
            }
        }
        return _employees_range;
    }
    
    public EarthRpcproviderOutputBuilder setQq(java.lang.String value) {
        this._qq = value;
        return this;
    }
    
    public EarthRpcproviderOutputBuilder setUrl(Uri value) {
        this._url = value;
        return this;
    }
    
    public EarthRpcproviderOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EarthRpcproviderOutput build() {
        return new EarthRpcproviderOutputImpl(this);
    }

    private static final class EarthRpcproviderOutputImpl implements EarthRpcproviderOutput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput.class;
        }

        private final java.lang.String _city;
        private final java.lang.Long _employees;
        private final java.lang.String _qq;
        private final Uri _url;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>> augmentation = new HashMap<>();

        private EarthRpcproviderOutputImpl(EarthRpcproviderOutputBuilder base) {
            this._city = base.getCity();
            this._employees = base.getEmployees();
            this._qq = base.getQq();
            this._url = base.getUrl();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.String getCity() {
            return _city;
        }
        
        @Override
        public java.lang.Long getEmployees() {
            return _employees;
        }
        
        @Override
        public java.lang.String getQq() {
            return _qq;
        }
        
        @Override
        public Uri getUrl() {
            return _url;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_city == null) ? 0 : _city.hashCode());
            result = prime * result + ((_employees == null) ? 0 : _employees.hashCode());
            result = prime * result + ((_qq == null) ? 0 : _qq.hashCode());
            result = prime * result + ((_url == null) ? 0 : _url.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput)obj;
            if (_city == null) {
                if (other.getCity() != null) {
                    return false;
                }
            } else if(!_city.equals(other.getCity())) {
                return false;
            }
            if (_employees == null) {
                if (other.getEmployees() != null) {
                    return false;
                }
            } else if(!_employees.equals(other.getEmployees())) {
                return false;
            }
            if (_qq == null) {
                if (other.getQq() != null) {
                    return false;
                }
            } else if(!_qq.equals(other.getQq())) {
                return false;
            }
            if (_url == null) {
                if (other.getUrl() != null) {
                    return false;
                }
            } else if(!_url.equals(other.getUrl())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EarthRpcproviderOutputImpl otherImpl = (EarthRpcproviderOutputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.EarthRpcproviderOutput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EarthRpcproviderOutput [");
            boolean first = true;
        
            if (_city != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_city=");
                builder.append(_city);
             }
            if (_employees != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_employees=");
                builder.append(_employees);
             }
            if (_qq != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_qq=");
                builder.append(_qq);
             }
            if (_url != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_url=");
                builder.append(_url);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
