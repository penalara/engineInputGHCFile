
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OnCallService
 * <p>
 * On-call service of teachers who supervise the free time of students.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "refFrame",
    "refPeriods",
    "refTask",
    "inBreak",
    "teachersEachSection",
    "refTeachers",
    "frameTemplate",
    "refBuilding",
    "computeForMaxMinOccupancy"
})
public class OnCallService {

    /**
     * On-Call service identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("On-Call service identifier.")
    private Integer id;
    /**
     * Identifier of the frame where the service will be set.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    @JsonPropertyDescription("Identifier\u00a0of\u00a0the\u00a0frame\u00a0where\u00a0the service will\u00a0be\u00a0set.")
    private String refFrame;
    /**
     * OnCallPeriodsInfo
     * <p>
     * It contains the periods when the service must be set and mirror placement in periods condition (same placement in periods).
     * 
     */
    @JsonProperty("refPeriods")
    @JsonPropertyDescription("It contains the periods when the service must be set and mirror placement in periods condition (same placement in periods).")
    private OnCallPeriodsInfo refPeriods;
    /**
     * Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTask")
    @JsonPropertyDescription("Task identifier.")
    private String refTask;
    /**
     * It indicates whether it is a break supervision.
     * 
     */
    @JsonProperty("inBreak")
    @JsonPropertyDescription("It indicates whether it is a break supervision.")
    private Boolean inBreak = false;
    /**
     * TeachersEachSection
     * <p>
     * Information about number of teacher in all sections.
     * (Required)
     * 
     */
    @JsonProperty("teachersEachSection")
    @JsonPropertyDescription("Information about number of teacher in all sections.")
    private TeachersEachSection teachersEachSection;
    /**
     * RefTeachers
     * <p>
     * List of teachers who in the service.
     * (Required)
     * 
     */
    @JsonProperty("refTeachers")
    @JsonPropertyDescription("List of teachers who in the service.")
    private List<RefTeacher> refTeachers = new ArrayList<RefTeacher>();
    /**
     * OnCallTemplate
     * <p>
     * Template with teacher's preferences in the on-call service.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Template with teacher's preferences in the on-call service.")
    private List<OnCallSectionPreference> frameTemplate = new ArrayList<OnCallSectionPreference>();
    /**
     * Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.
     * 
     */
    @JsonProperty("refBuilding")
    @JsonPropertyDescription("Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.")
    private String refBuilding;
    /**
     * It indicates whether the service calculates the maximum and minimum daily occupancy of the teacher.
     * 
     */
    @JsonProperty("computeForMaxMinOccupancy")
    @JsonPropertyDescription("It indicates whether the service calculates the maximum and minimum daily occupancy of the teacher.")
    private Boolean computeForMaxMinOccupancy = false;

    /**
     * On-Call service identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * On-Call service identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Identifier of the frame where the service will be set.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public String getRefFrame() {
        return refFrame;
    }

    /**
     * Identifier of the frame where the service will be set.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public void setRefFrame(String refFrame) {
        this.refFrame = refFrame;
    }

    /**
     * OnCallPeriodsInfo
     * <p>
     * It contains the periods when the service must be set and mirror placement in periods condition (same placement in periods).
     * 
     */
    @JsonProperty("refPeriods")
    public OnCallPeriodsInfo getRefPeriods() {
        return refPeriods;
    }

    /**
     * OnCallPeriodsInfo
     * <p>
     * It contains the periods when the service must be set and mirror placement in periods condition (same placement in periods).
     * 
     */
    @JsonProperty("refPeriods")
    public void setRefPeriods(OnCallPeriodsInfo refPeriods) {
        this.refPeriods = refPeriods;
    }

    /**
     * Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTask")
    public String getRefTask() {
        return refTask;
    }

    /**
     * Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTask")
    public void setRefTask(String refTask) {
        this.refTask = refTask;
    }

    /**
     * It indicates whether it is a break supervision.
     * 
     */
    @JsonProperty("inBreak")
    public Boolean getInBreak() {
        return inBreak;
    }

    /**
     * It indicates whether it is a break supervision.
     * 
     */
    @JsonProperty("inBreak")
    public void setInBreak(Boolean inBreak) {
        this.inBreak = inBreak;
    }

    /**
     * TeachersEachSection
     * <p>
     * Information about number of teacher in all sections.
     * (Required)
     * 
     */
    @JsonProperty("teachersEachSection")
    public TeachersEachSection getTeachersEachSection() {
        return teachersEachSection;
    }

    /**
     * TeachersEachSection
     * <p>
     * Information about number of teacher in all sections.
     * (Required)
     * 
     */
    @JsonProperty("teachersEachSection")
    public void setTeachersEachSection(TeachersEachSection teachersEachSection) {
        this.teachersEachSection = teachersEachSection;
    }

    /**
     * RefTeachers
     * <p>
     * List of teachers who in the service.
     * (Required)
     * 
     */
    @JsonProperty("refTeachers")
    public List<RefTeacher> getRefTeachers() {
        return refTeachers;
    }

    /**
     * RefTeachers
     * <p>
     * List of teachers who in the service.
     * (Required)
     * 
     */
    @JsonProperty("refTeachers")
    public void setRefTeachers(List<RefTeacher> refTeachers) {
        this.refTeachers = refTeachers;
    }

    /**
     * OnCallTemplate
     * <p>
     * Template with teacher's preferences in the on-call service.
     * 
     */
    @JsonProperty("frameTemplate")
    public List<OnCallSectionPreference> getFrameTemplate() {
        return frameTemplate;
    }

    /**
     * OnCallTemplate
     * <p>
     * Template with teacher's preferences in the on-call service.
     * 
     */
    @JsonProperty("frameTemplate")
    public void setFrameTemplate(List<OnCallSectionPreference> frameTemplate) {
        this.frameTemplate = frameTemplate;
    }

    /**
     * Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.
     * 
     */
    @JsonProperty("refBuilding")
    public String getRefBuilding() {
        return refBuilding;
    }

    /**
     * Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.
     * 
     */
    @JsonProperty("refBuilding")
    public void setRefBuilding(String refBuilding) {
        this.refBuilding = refBuilding;
    }

    /**
     * It indicates whether the service calculates the maximum and minimum daily occupancy of the teacher.
     * 
     */
    @JsonProperty("computeForMaxMinOccupancy")
    public Boolean getComputeForMaxMinOccupancy() {
        return computeForMaxMinOccupancy;
    }

    /**
     * It indicates whether the service calculates the maximum and minimum daily occupancy of the teacher.
     * 
     */
    @JsonProperty("computeForMaxMinOccupancy")
    public void setComputeForMaxMinOccupancy(Boolean computeForMaxMinOccupancy) {
        this.computeForMaxMinOccupancy = computeForMaxMinOccupancy;
    }

}
