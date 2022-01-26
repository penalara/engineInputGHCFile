
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Frame
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "days"
})
@Generated("jsonschema2pojo")
public class Frame {

    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Frame identifier.")
    private String id;
    /**
     * Days
     * <p>
     * List of the days in the frame
     * (Required)
     * 
     */
    @JsonProperty("days")
    @JsonPropertyDescription("List of the days in the frame")
    private List<FrameDay> days = new ArrayList<FrameDay>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Frame() {
    }

    /**
     * 
     * @param days
     * @param id
     */
    public Frame(String id, List<FrameDay> days) {
        super();
        this.id = id;
        this.days = days;
    }

    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Days
     * <p>
     * List of the days in the frame
     * (Required)
     * 
     */
    @JsonProperty("days")
    public List<FrameDay> getDays() {
        return days;
    }

    /**
     * Days
     * <p>
     * List of the days in the frame
     * (Required)
     * 
     */
    @JsonProperty("days")
    public void setDays(List<FrameDay> days) {
        this.days = days;
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
