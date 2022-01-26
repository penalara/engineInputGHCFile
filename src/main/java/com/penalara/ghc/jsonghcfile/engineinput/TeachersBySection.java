
package com.penalara.ghc.jsonghcfile.engineinput;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TeachersBySection
 * <p>
 * Custom number of teachers in one timetable section.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "day",
    "index",
    "numTeachers"
})
@Generated("jsonschema2pojo")
public class TeachersBySection {

    /**
     * Day of the week.
     * (Required)
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("Day of the week.")
    private Integer day;
    /**
     * Index of the section.
     * (Required)
     * 
     */
    @JsonProperty("index")
    @JsonPropertyDescription("Index of the section.")
    private Integer index;
    /**
     * Custom number of teachers to be assigned in the section.
     * (Required)
     * 
     */
    @JsonProperty("numTeachers")
    @JsonPropertyDescription("Custom number of teachers to be assigned in the section.")
    private Integer numTeachers;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TeachersBySection() {
    }

    /**
     * 
     * @param index
     * @param day
     * @param numTeachers
     */
    public TeachersBySection(Integer day, Integer index, Integer numTeachers) {
        super();
        this.day = day;
        this.index = index;
        this.numTeachers = numTeachers;
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
     * Index of the section.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Index of the section.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Custom number of teachers to be assigned in the section.
     * (Required)
     * 
     */
    @JsonProperty("numTeachers")
    public Integer getNumTeachers() {
        return numTeachers;
    }

    /**
     * Custom number of teachers to be assigned in the section.
     * (Required)
     * 
     */
    @JsonProperty("numTeachers")
    public void setNumTeachers(Integer numTeachers) {
        this.numTeachers = numTeachers;
    }

}
