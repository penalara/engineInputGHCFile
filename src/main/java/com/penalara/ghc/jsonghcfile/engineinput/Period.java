
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Period
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "lastDay"
})
public class Period {

    /**
     * Period identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Period identifier.")
    private String id;
    /**
     * The end day of the period (included).
     * (Required)
     * 
     */
    @JsonProperty("lastDay")
    @JsonPropertyDescription("The end day of the period (included).")
    private Integer lastDay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Period() {
    }

    /**
     * 
     * @param lastDay
     * @param id
     */
    public Period(String id, Integer lastDay) {
        super();
        this.id = id;
        this.lastDay = lastDay;
    }

    /**
     * Period identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Period identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The end day of the period (included).
     * (Required)
     * 
     */
    @JsonProperty("lastDay")
    public Integer getLastDay() {
        return lastDay;
    }

    /**
     * The end day of the period (included).
     * (Required)
     * 
     */
    @JsonProperty("lastDay")
    public void setLastDay(Integer lastDay) {
        this.lastDay = lastDay;
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
