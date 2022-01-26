
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RefTeacher
 * <p>
 * It contains a teacher reference and the number of section oversight .
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "teacherId",
    "numOfSections",
    "teacherFrameTemplate"
})
@Generated("jsonschema2pojo")
public class RefTeacher {

    /**
     * Teacher identifier.
     * (Required)
     * 
     */
    @JsonProperty("teacherId")
    @JsonPropertyDescription("Teacher identifier.")
    private String teacherId;
    /**
     * Number of on-call services to be done weekly by the teacher.
     * 
     */
    @JsonProperty("numOfSections")
    @JsonPropertyDescription("Number of on-call services to be done weekly by the teacher.")
    private Integer numOfSections = 1;
    /**
     * OnCallTemplate
     * <p>
     * Template with teacher's preferences in the on-call service.
     * 
     */
    @JsonProperty("teacherFrameTemplate")
    @JsonPropertyDescription("Template with teacher's preferences in the on-call service.")
    private List<OnCallSectionPreference> teacherFrameTemplate = new ArrayList<OnCallSectionPreference>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RefTeacher() {
    }

    /**
     * 
     * @param teacherId
     * @param teacherFrameTemplate
     * @param numOfSections
     */
    public RefTeacher(String teacherId, Integer numOfSections, List<OnCallSectionPreference> teacherFrameTemplate) {
        super();
        this.teacherId = teacherId;
        this.numOfSections = numOfSections;
        this.teacherFrameTemplate = teacherFrameTemplate;
    }

    /**
     * Teacher identifier.
     * (Required)
     * 
     */
    @JsonProperty("teacherId")
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * Teacher identifier.
     * (Required)
     * 
     */
    @JsonProperty("teacherId")
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * Number of on-call services to be done weekly by the teacher.
     * 
     */
    @JsonProperty("numOfSections")
    public Integer getNumOfSections() {
        return numOfSections;
    }

    /**
     * Number of on-call services to be done weekly by the teacher.
     * 
     */
    @JsonProperty("numOfSections")
    public void setNumOfSections(Integer numOfSections) {
        this.numOfSections = numOfSections;
    }

    /**
     * OnCallTemplate
     * <p>
     * Template with teacher's preferences in the on-call service.
     * 
     */
    @JsonProperty("teacherFrameTemplate")
    public List<OnCallSectionPreference> getTeacherFrameTemplate() {
        return teacherFrameTemplate;
    }

    /**
     * OnCallTemplate
     * <p>
     * Template with teacher's preferences in the on-call service.
     * 
     */
    @JsonProperty("teacherFrameTemplate")
    public void setTeacherFrameTemplate(List<OnCallSectionPreference> teacherFrameTemplate) {
        this.teacherFrameTemplate = teacherFrameTemplate;
    }

}
