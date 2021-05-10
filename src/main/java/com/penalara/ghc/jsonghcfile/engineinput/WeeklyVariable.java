
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * WeeklyVariable
 * <p>
 * It defines the distribution as a number of sections per week and a maximum range of sections per day.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minutesAmount",
    "maxMinutesDaily",
    "minDurationDaily",
    "avoidMaxDuration",
    "allowDiscontinuity"
})
public class WeeklyVariable {

    /**
     * Total of session's weekly minutes.
     * (Required)
     * 
     */
    @JsonProperty("minutesAmount")
    @JsonPropertyDescription("Total of session's weekly minutes.")
    private Integer minutesAmount;
    /**
     * Maximum of minutes per day.
     * (Required)
     * 
     */
    @JsonProperty("maxMinutesDaily")
    @JsonPropertyDescription("Maximum of minutes per day.")
    private Integer maxMinutesDaily;
    /**
     * It indicates the preference for class units of minimum duration.
     * 
     */
    @JsonProperty("minDurationDaily")
    @JsonPropertyDescription("It indicates the preference for class units of minimum duration.")
    private WeeklyVariable.MinDurationDaily minDurationDaily = WeeklyVariable.MinDurationDaily.fromValue("allow");
    /**
     * It indicates the preference for class units of maximum duration.
     * 
     */
    @JsonProperty("avoidMaxDuration")
    @JsonPropertyDescription("It indicates the preference for class units of maximum duration.")
    private Boolean avoidMaxDuration = false;
    /**
     * It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.
     * 
     */
    @JsonProperty("allowDiscontinuity")
    @JsonPropertyDescription("It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.")
    private Boolean allowDiscontinuity = false;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeeklyVariable() {
    }

    /**
     * 
     * @param allowDiscontinuity
     * @param minDurationDaily
     * @param avoidMaxDuration
     * @param minutesAmount
     * @param maxMinutesDaily
     */
    public WeeklyVariable(Integer minutesAmount, Integer maxMinutesDaily, WeeklyVariable.MinDurationDaily minDurationDaily, Boolean avoidMaxDuration, Boolean allowDiscontinuity) {
        super();
        this.minutesAmount = minutesAmount;
        this.maxMinutesDaily = maxMinutesDaily;
        this.minDurationDaily = minDurationDaily;
        this.avoidMaxDuration = avoidMaxDuration;
        this.allowDiscontinuity = allowDiscontinuity;
    }

    /**
     * Total of session's weekly minutes.
     * (Required)
     * 
     */
    @JsonProperty("minutesAmount")
    public Integer getMinutesAmount() {
        return minutesAmount;
    }

    /**
     * Total of session's weekly minutes.
     * (Required)
     * 
     */
    @JsonProperty("minutesAmount")
    public void setMinutesAmount(Integer minutesAmount) {
        this.minutesAmount = minutesAmount;
    }

    /**
     * Maximum of minutes per day.
     * (Required)
     * 
     */
    @JsonProperty("maxMinutesDaily")
    public Integer getMaxMinutesDaily() {
        return maxMinutesDaily;
    }

    /**
     * Maximum of minutes per day.
     * (Required)
     * 
     */
    @JsonProperty("maxMinutesDaily")
    public void setMaxMinutesDaily(Integer maxMinutesDaily) {
        this.maxMinutesDaily = maxMinutesDaily;
    }

    /**
     * It indicates the preference for class units of minimum duration.
     * 
     */
    @JsonProperty("minDurationDaily")
    public WeeklyVariable.MinDurationDaily getMinDurationDaily() {
        return minDurationDaily;
    }

    /**
     * It indicates the preference for class units of minimum duration.
     * 
     */
    @JsonProperty("minDurationDaily")
    public void setMinDurationDaily(WeeklyVariable.MinDurationDaily minDurationDaily) {
        this.minDurationDaily = minDurationDaily;
    }

    /**
     * It indicates the preference for class units of maximum duration.
     * 
     */
    @JsonProperty("avoidMaxDuration")
    public Boolean getAvoidMaxDuration() {
        return avoidMaxDuration;
    }

    /**
     * It indicates the preference for class units of maximum duration.
     * 
     */
    @JsonProperty("avoidMaxDuration")
    public void setAvoidMaxDuration(Boolean avoidMaxDuration) {
        this.avoidMaxDuration = avoidMaxDuration;
    }

    /**
     * It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.
     * 
     */
    @JsonProperty("allowDiscontinuity")
    public Boolean getAllowDiscontinuity() {
        return allowDiscontinuity;
    }

    /**
     * It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.
     * 
     */
    @JsonProperty("allowDiscontinuity")
    public void setAllowDiscontinuity(Boolean allowDiscontinuity) {
        this.allowDiscontinuity = allowDiscontinuity;
    }


    /**
     * It indicates the preference for class units of minimum duration.
     * 
     */
    public enum MinDurationDaily {

        ALLOW("allow"),
        AVOID("avoid"),
        FORBIDDEN("forbidden");
        private final String value;
        private final static Map<String, WeeklyVariable.MinDurationDaily> CONSTANTS = new HashMap<String, WeeklyVariable.MinDurationDaily>();

        static {
            for (WeeklyVariable.MinDurationDaily c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private MinDurationDaily(String value) {
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
        public static WeeklyVariable.MinDurationDaily fromValue(String value) {
            WeeklyVariable.MinDurationDaily constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
