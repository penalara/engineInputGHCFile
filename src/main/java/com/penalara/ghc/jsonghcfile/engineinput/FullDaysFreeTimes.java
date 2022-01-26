
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
 * FullDaysFreeTimes
 * <p>
 * Teacher's full days of free time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strictDays",
    "preferredDays"
})
@Generated("jsonschema2pojo")
public class FullDaysFreeTimes {

    /**
     * Number of strict days when teacher should be free.
     * 
     */
    @JsonProperty("strictDays")
    @JsonPropertyDescription("Number of strict days when teacher should be free.")
    private Integer strictDays = 0;
    /**
     * Number of preferred days when teacher should be free.
     * 
     */
    @JsonProperty("preferredDays")
    @JsonPropertyDescription("Number of preferred days when teacher should be free.")
    private Integer preferredDays = 0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FullDaysFreeTimes() {
    }

    /**
     * 
     * @param strictDays
     * @param preferredDays
     */
    public FullDaysFreeTimes(Integer strictDays, Integer preferredDays) {
        super();
        this.strictDays = strictDays;
        this.preferredDays = preferredDays;
    }

    /**
     * Number of strict days when teacher should be free.
     * 
     */
    @JsonProperty("strictDays")
    public Integer getStrictDays() {
        return strictDays;
    }

    /**
     * Number of strict days when teacher should be free.
     * 
     */
    @JsonProperty("strictDays")
    public void setStrictDays(Integer strictDays) {
        this.strictDays = strictDays;
    }

    /**
     * Number of preferred days when teacher should be free.
     * 
     */
    @JsonProperty("preferredDays")
    public Integer getPreferredDays() {
        return preferredDays;
    }

    /**
     * Number of preferred days when teacher should be free.
     * 
     */
    @JsonProperty("preferredDays")
    public void setPreferredDays(Integer preferredDays) {
        this.preferredDays = preferredDays;
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
