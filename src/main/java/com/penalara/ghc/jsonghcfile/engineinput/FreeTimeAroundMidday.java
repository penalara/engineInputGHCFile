
package com.penalara.ghc.jsonghcfile.engineinput;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FreeTimeAroundMidday
 * <p>
 * Do not have less than a custom free time around noon pause.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "minutes"
})
public class FreeTimeAroundMidday {

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionType type;
    /**
     * Custom time in minutes for incompatibility.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    @JsonPropertyDescription("Custom time in minutes for incompatibility.")
    private Integer minutes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FreeTimeAroundMidday() {
    }

    /**
     * 
     * @param minutes
     * @param type
     */
    public FreeTimeAroundMidday(ConditionType type, Integer minutes) {
        super();
        this.type = type;
        this.minutes = minutes;
    }

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("type")
    public ConditionType getType() {
        return type;
    }

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("type")
    public void setType(ConditionType type) {
        this.type = type;
    }

    /**
     * Custom time in minutes for incompatibility.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Custom time in minutes for incompatibility.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

}
