package org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301;
import com.google.common.base.Preconditions;
import com.google.common.collect.Range;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.Serializable;
import java.math.BigInteger;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.beans.ConstructorProperties;


public class KeywordType
 implements Serializable {
    private static final long serialVersionUID = -5547397108437759817L;
    private static final List<Pattern> patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^[a-zA-Z]*$");
    
    static {
        final List<Pattern> l = new ArrayList<Pattern>();
        for (String regEx : PATTERN_CONSTANTS) {
            l.add(Pattern.compile(regEx));
        }
    
        patterns = ImmutableList.copyOf(l);
    }
    private static final List<Range<BigInteger>> _length;
    final private java.lang.String _value;

    static {
        ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
        builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(8L)));
        _length = builder.build();
    }

    @ConstructorProperties("value")
    public KeywordType(java.lang.String _value) {
        if (_value != null) {
            BigInteger _constraint = BigInteger.valueOf(_value.length());
            boolean isValidLength = false;
            for (Range<BigInteger> r : length()) {
                if (r.contains(_constraint)) {
                    isValidLength = true;
                }
            }
            if (!isValidLength) {
                throw new IllegalArgumentException(String.format("Invalid length: %s, expected: %s.", _value, length()));
            }
        }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    boolean valid = false;
    for (Pattern p : patterns) {
        if (p.matcher(_value).matches()) {
            valid = true;
            break;
        }
    }
    
    Preconditions.checkArgument(valid, "Supplied value \"%s\" does not match any of the permitted patterns %s", _value, PATTERN_CONSTANTS);
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public KeywordType(KeywordType source) {
        this._value = source._value;
    }

    public static KeywordType getDefaultInstance(String defaultValue) {
        return new KeywordType(defaultValue);
    }

    public java.lang.String getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_value == null) ? 0 : _value.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        KeywordType other = (KeywordType) obj;
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!_value.equals(other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.sdnap.rpcprovider.rev150301.KeywordType.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
         }
        return builder.append(']').toString();
    }

    public static List<Range<BigInteger>> length() {
        return _length;
    }


}
