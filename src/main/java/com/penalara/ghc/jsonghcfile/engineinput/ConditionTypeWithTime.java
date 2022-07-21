
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConditionTypeWithTime
 * <p>
 * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "minutes"
})
@Generated("jsonschema2pojo")
public class ConditionTypeWithTime {

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
     * Custom time in minutes for condition.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    @JsonPropertyDescription("Custom time in minutes for condition.")
    private Integer minutes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConditionTypeWithTime() {
    }

    /**
     * 
     * @param minutes
     * @param type
     */
    public ConditionTypeWithTime(ConditionType type, Integer minutes) {
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
     * Custom time in minutes for condition.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Custom time in minutes for condition.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
