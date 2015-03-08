package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.earth.rpcprovider.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl
 */
public class EarthRpcproviderImplBuilder {

    private java.lang.String _contentsSwitchFlag;
    private RpcRegistry _rpcRegistry;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>> augmentation = new HashMap<>();

    public EarthRpcproviderImplBuilder() {
    } 
    

    public EarthRpcproviderImplBuilder(EarthRpcproviderImpl base) {
        this._contentsSwitchFlag = base.getContentsSwitchFlag();
        this._rpcRegistry = base.getRpcRegistry();
        if (base instanceof EarthRpcproviderImplImpl) {
            EarthRpcproviderImplImpl _impl = (EarthRpcproviderImplImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.String getContentsSwitchFlag() {
        return _contentsSwitchFlag;
    }
    
    public RpcRegistry getRpcRegistry() {
        return _rpcRegistry;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EarthRpcproviderImplBuilder setContentsSwitchFlag(java.lang.String value) {
        this._contentsSwitchFlag = value;
        return this;
    }
    
    public EarthRpcproviderImplBuilder setRpcRegistry(RpcRegistry value) {
        this._rpcRegistry = value;
        return this;
    }
    
    public EarthRpcproviderImplBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EarthRpcproviderImpl build() {
        return new EarthRpcproviderImplImpl(this);
    }

    private static final class EarthRpcproviderImplImpl implements EarthRpcproviderImpl {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl.class;
        }

        private final java.lang.String _contentsSwitchFlag;
        private final RpcRegistry _rpcRegistry;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>> augmentation = new HashMap<>();

        private EarthRpcproviderImplImpl(EarthRpcproviderImplBuilder base) {
            this._contentsSwitchFlag = base.getContentsSwitchFlag();
            this._rpcRegistry = base.getRpcRegistry();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.String getContentsSwitchFlag() {
            return _contentsSwitchFlag;
        }
        
        @Override
        public RpcRegistry getRpcRegistry() {
            return _rpcRegistry;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_contentsSwitchFlag == null) ? 0 : _contentsSwitchFlag.hashCode());
            result = prime * result + ((_rpcRegistry == null) ? 0 : _rpcRegistry.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl other = (org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl)obj;
            if (_contentsSwitchFlag == null) {
                if (other.getContentsSwitchFlag() != null) {
                    return false;
                }
            } else if(!_contentsSwitchFlag.equals(other.getContentsSwitchFlag())) {
                return false;
            }
            if (_rpcRegistry == null) {
                if (other.getRpcRegistry() != null) {
                    return false;
                }
            } else if(!_rpcRegistry.equals(other.getRpcRegistry())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EarthRpcproviderImplImpl otherImpl = (EarthRpcproviderImplImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.earth.rpcprovider.impl.rev150303.modules.module.configuration.EarthRpcproviderImpl>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EarthRpcproviderImpl [");
            boolean first = true;
        
            if (_contentsSwitchFlag != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_contentsSwitchFlag=");
                builder.append(_contentsSwitchFlag);
             }
            if (_rpcRegistry != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_rpcRegistry=");
                builder.append(_rpcRegistry);
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
