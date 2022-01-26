
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
 * FrameDay
 * <p>
 * Day with its sections.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "day",
    "sections"
})
@Generated("jsonschema2pojo")
public class FrameDay {

    /**
     * Day of the week.
     * (Required)
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("Day of the week.")
    private Integer day;
    /**
     * Sections
     * <p>
     * Timetable cells where class units are located.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    @JsonPropertyDescription("Timetable\u00a0cells\u00a0where class units\u00a0are\u00a0located.")
    private List<Section> sections = new ArrayList<Section>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FrameDay() {
    }

    /**
     * 
     * @param day
     * @param sections
     */
    public FrameDay(Integer day, List<Section> sections) {
        super();
        this.day = day;
        this.sections = sections;
    }

    /**
     * Day of the week.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    /**
     * Day of the week.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * Sections
     * <p>
     * Timetable cells where class units are located.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    public List<Section> getSections() {
        return sections;
    }

    /**
     * Sections
     * <p>
     * Timetable cells where class units are located.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    public void setSections(List<Section> sections) {
        this.sections = sections;
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
