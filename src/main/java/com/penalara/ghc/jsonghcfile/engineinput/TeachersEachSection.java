
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TeachersEachSection
 * <p>
 * Information about number of teacher in all sections.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "byDefault",
    "bySection"
})
public class TeachersEachSection {

    /**
     * Default value for number of teacher in all sections.
     * 
     */
    @JsonProperty("byDefault")
    @JsonPropertyDescription("Default value for number of teacher in all sections.")
    private Integer byDefault;
    /**
     * TeachersBySections
     * <p>
     * Custom number of teachers in each section.
     * 
     */
    @JsonProperty("bySection")
    @JsonPropertyDescription("Custom number of teachers in each section.")
    private List<TeachersBySection> bySection = new ArrayList<TeachersBySection>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TeachersEachSection() {
    }

    /**
     * 
     * @param bySection
     * @param byDefault
     */
    public TeachersEachSection(Integer byDefault, List<TeachersBySection> bySection) {
        super();
        this.byDefault = byDefault;
        this.bySection = bySection;
    }

    /**
     * Default value for number of teacher in all sections.
     * 
     */
    @JsonProperty("byDefault")
    public Integer getByDefault() {
        return byDefault;
    }

    /**
     * Default value for number of teacher in all sections.
     * 
     */
    @JsonProperty("byDefault")
    public void setByDefault(Integer byDefault) {
        this.byDefault = byDefault;
    }

    /**
     * TeachersBySections
     * <p>
     * Custom number of teachers in each section.
     * 
     */
    @JsonProperty("bySection")
    public List<TeachersBySection> getBySection() {
        return bySection;
    }

    /**
     * TeachersBySections
     * <p>
     * Custom number of teachers in each section.
     * 
     */
    @JsonProperty("bySection")
    public void setBySection(List<TeachersBySection> bySection) {
        this.bySection = bySection;
    }

}
