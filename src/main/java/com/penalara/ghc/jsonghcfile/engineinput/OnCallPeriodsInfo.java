
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * OnCallPeriodsInfo
 * <p>
 * It contains the periods when the service must be set and mirror placement in periods condition (same placement in periods).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "periods",
    "samePositionEveryPeriod"
})
public class OnCallPeriodsInfo {

    /**
     * PeriodsList
     * <p>
     * List of Periods when the service must be set.
     * (Required)
     * 
     */
    @JsonProperty("periods")
    @JsonPropertyDescription("List of Periods when the service must be set.")
    private List<String> periods = new ArrayList<String>();
    /**
     * Keep the same position each week or period for the service units.
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    @JsonPropertyDescription("Keep the same position each week or period for the service units.")
    private OnCallPeriodsInfo.SamePositionEveryPeriod samePositionEveryPeriod = OnCallPeriodsInfo.SamePositionEveryPeriod.fromValue("ignore");
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * PeriodsList
     * <p>
     * List of Periods when the service must be set.
     * (Required)
     * 
     */
    @JsonProperty("periods")
    public List<String> getPeriods() {
        return periods;
    }

    /**
     * PeriodsList
     * <p>
     * List of Periods when the service must be set.
     * (Required)
     * 
     */
    @JsonProperty("periods")
    public void setPeriods(List<String> periods) {
        this.periods = periods;
    }

    /**
     * Keep the same position each week or period for the service units.
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    public OnCallPeriodsInfo.SamePositionEveryPeriod getSamePositionEveryPeriod() {
        return samePositionEveryPeriod;
    }

    /**
     * Keep the same position each week or period for the service units.
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    public void setSamePositionEveryPeriod(OnCallPeriodsInfo.SamePositionEveryPeriod samePositionEveryPeriod) {
        this.samePositionEveryPeriod = samePositionEveryPeriod;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    /**
     * Keep the same position each week or period for the service units.
     * 
     */
    public enum SamePositionEveryPeriod {

        IGNORE("ignore"),
        ATTEMPT("attempt"),
        AVOID("avoid"),
        STRICT("strict"),
        FORBIDDEN("forbidden");
        private final String value;
        private final static Map<String, OnCallPeriodsInfo.SamePositionEveryPeriod> CONSTANTS = new HashMap<String, OnCallPeriodsInfo.SamePositionEveryPeriod>();

        static {
            for (OnCallPeriodsInfo.SamePositionEveryPeriod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SamePositionEveryPeriod(String value) {
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
        public static OnCallPeriodsInfo.SamePositionEveryPeriod fromValue(String value) {
            OnCallPeriodsInfo.SamePositionEveryPeriod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
