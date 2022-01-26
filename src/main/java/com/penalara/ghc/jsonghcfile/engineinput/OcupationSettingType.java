
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * OcupationSettingType
 * <p>
 * Indicates whether the automatic calculation of the value must be adjusted to higher or lower. The adjustment will set with the duration of the greater section.
 * 
 */
@Generated("jsonschema2pojo")
public enum OcupationSettingType {

    AUTO("auto"),
    HIGHER("higher"),
    LOWER("lower");
    private final String value;
    private final static Map<String, OcupationSettingType> CONSTANTS = new HashMap<String, OcupationSettingType>();

    static {
        for (OcupationSettingType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OcupationSettingType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OcupationSettingType fromValue(String value) {
        OcupationSettingType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
