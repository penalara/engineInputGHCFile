
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Session
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "refFrame",
    "refTasks",
    "refTeachers",
    "refSubjects",
    "refGroups",
    "distribution",
    "sessionClassRooms",
    "frameTemplate",
    "sessionSettings",
    "sessionRelations"
})
public class Session {

    /**
     * Session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Session identifier.")
    private Integer id;
    /**
     * Session's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    @JsonPropertyDescription("Session's frame identifier.")
    private String refFrame;
    /**
     * RefTasks
     * <p>
     * List of task in the session.
     * (Required)
     * 
     */
    @JsonProperty("refTasks")
    @JsonPropertyDescription("List of task in the session.")
    private List<String> refTasks = new ArrayList<String>();
    /**
     * RefTeachers
     * <p>
     * List of teachers who teach or interact in the session.
     * (Required)
     * 
     */
    @JsonProperty("refTeachers")
    @JsonPropertyDescription("List\u00a0of\u00a0teachers\u00a0who\u00a0teach\u00a0or\u00a0interact\u00a0in\u00a0the\u00a0session.")
    private List<String> refTeachers = new ArrayList<String>();
    /**
     * RefSubjects
     * <p>
     * List of subject taught in the session. At least one is required for session with groups of students.
     * 
     */
    @JsonProperty("refSubjects")
    @JsonPropertyDescription("List of subject taught in the session. At least one is required for session with groups of students.")
    private List<String> refSubjects = new ArrayList<String>();
    /**
     * RefGroups
     * <p>
     * List of groups who are taught in the class unit. At least one is required for teaching sessions.
     * 
     */
    @JsonProperty("refGroups")
    @JsonPropertyDescription("List of groups who are taught in the class unit. At least one is required for teaching sessions.")
    private List<RefGroup> refGroups = new ArrayList<RefGroup>();
    /**
     * Distribution
     * <p>
     * It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.
     * (Required)
     * 
     */
    @JsonProperty("distribution")
    @JsonPropertyDescription("It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.")
    private Distribution distribution;
    /**
     * SessionClassRooms
     * <p>
     * It contains the information about the classrooms for the class units. At least one classroom is required for the class units.
     * 
     */
    @JsonProperty("sessionClassRooms")
    @JsonPropertyDescription("It contains the information about the classrooms for the class units. At least one classroom is required for the class units.")
    private SessionClassRooms sessionClassRooms;
    /**
     * SessionFrameTemplate
     * <p>
     * Complete template of preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Complete template of preferences.")
    private List<SessionSectionPreference> frameTemplate = new ArrayList<SessionSectionPreference>();
    /**
     * SessionSettings
     * <p>
     * Conditions on the position of the class unit.
     * 
     */
    @JsonProperty("sessionSettings")
    @JsonPropertyDescription("Conditions on the position of the class unit.")
    private SessionSettings sessionSettings;
    /**
     * SessionRelations
     * <p>
     * It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.
     * 
     */
    @JsonProperty("sessionRelations")
    @JsonPropertyDescription("It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.")
    private SessionRelations sessionRelations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Session() {
    }

    /**
     * 
     * @param refFrame
     * @param refTeachers
     * @param frameTemplate
     * @param sessionRelations
     * @param sessionClassRooms
     * @param refGroups
     * @param refSubjects
     * @param id
     * @param refTasks
     * @param distribution
     * @param sessionSettings
     */
    public Session(Integer id, String refFrame, List<String> refTasks, List<String> refTeachers, List<String> refSubjects, List<RefGroup> refGroups, Distribution distribution, SessionClassRooms sessionClassRooms, List<SessionSectionPreference> frameTemplate, SessionSettings sessionSettings, SessionRelations sessionRelations) {
        super();
        this.id = id;
        this.refFrame = refFrame;
        this.refTasks = refTasks;
        this.refTeachers = refTeachers;
        this.refSubjects = refSubjects;
        this.refGroups = refGroups;
        this.distribution = distribution;
        this.sessionClassRooms = sessionClassRooms;
        this.frameTemplate = frameTemplate;
        this.sessionSettings = sessionSettings;
        this.sessionRelations = sessionRelations;
    }

    /**
     * Session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Session's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public String getRefFrame() {
        return refFrame;
    }

    /**
     * Session's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public void setRefFrame(String refFrame) {
        this.refFrame = refFrame;
    }

    /**
     * RefTasks
     * <p>
     * List of task in the session.
     * (Required)
     * 
     */
    @JsonProperty("refTasks")
    public List<String> getRefTasks() {
        return refTasks;
    }

    /**
     * RefTasks
     * <p>
     * List of task in the session.
     * (Required)
     * 
     */
    @JsonProperty("refTasks")
    public void setRefTasks(List<String> refTasks) {
        this.refTasks = refTasks;
    }

    /**
     * RefTeachers
     * <p>
     * List of teachers who teach or interact in the session.
     * (Required)
     * 
     */
    @JsonProperty("refTeachers")
    public List<String> getRefTeachers() {
        return refTeachers;
    }

    /**
     * RefTeachers
     * <p>
     * List of teachers who teach or interact in the session.
     * (Required)
     * 
     */
    @JsonProperty("refTeachers")
    public void setRefTeachers(List<String> refTeachers) {
        this.refTeachers = refTeachers;
    }

    /**
     * RefSubjects
     * <p>
     * List of subject taught in the session. At least one is required for session with groups of students.
     * 
     */
    @JsonProperty("refSubjects")
    public List<String> getRefSubjects() {
        return refSubjects;
    }

    /**
     * RefSubjects
     * <p>
     * List of subject taught in the session. At least one is required for session with groups of students.
     * 
     */
    @JsonProperty("refSubjects")
    public void setRefSubjects(List<String> refSubjects) {
        this.refSubjects = refSubjects;
    }

    /**
     * RefGroups
     * <p>
     * List of groups who are taught in the class unit. At least one is required for teaching sessions.
     * 
     */
    @JsonProperty("refGroups")
    public List<RefGroup> getRefGroups() {
        return refGroups;
    }

    /**
     * RefGroups
     * <p>
     * List of groups who are taught in the class unit. At least one is required for teaching sessions.
     * 
     */
    @JsonProperty("refGroups")
    public void setRefGroups(List<RefGroup> refGroups) {
        this.refGroups = refGroups;
    }

    /**
     * Distribution
     * <p>
     * It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.
     * (Required)
     * 
     */
    @JsonProperty("distribution")
    public Distribution getDistribution() {
        return distribution;
    }

    /**
     * Distribution
     * <p>
     * It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.
     * (Required)
     * 
     */
    @JsonProperty("distribution")
    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    /**
     * SessionClassRooms
     * <p>
     * It contains the information about the classrooms for the class units. At least one classroom is required for the class units.
     * 
     */
    @JsonProperty("sessionClassRooms")
    public SessionClassRooms getSessionClassRooms() {
        return sessionClassRooms;
    }

    /**
     * SessionClassRooms
     * <p>
     * It contains the information about the classrooms for the class units. At least one classroom is required for the class units.
     * 
     */
    @JsonProperty("sessionClassRooms")
    public void setSessionClassRooms(SessionClassRooms sessionClassRooms) {
        this.sessionClassRooms = sessionClassRooms;
    }

    /**
     * SessionFrameTemplate
     * <p>
     * Complete template of preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    public List<SessionSectionPreference> getFrameTemplate() {
        return frameTemplate;
    }

    /**
     * SessionFrameTemplate
     * <p>
     * Complete template of preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    public void setFrameTemplate(List<SessionSectionPreference> frameTemplate) {
        this.frameTemplate = frameTemplate;
    }

    /**
     * SessionSettings
     * <p>
     * Conditions on the position of the class unit.
     * 
     */
    @JsonProperty("sessionSettings")
    public SessionSettings getSessionSettings() {
        return sessionSettings;
    }

    /**
     * SessionSettings
     * <p>
     * Conditions on the position of the class unit.
     * 
     */
    @JsonProperty("sessionSettings")
    public void setSessionSettings(SessionSettings sessionSettings) {
        this.sessionSettings = sessionSettings;
    }

    /**
     * SessionRelations
     * <p>
     * It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.
     * 
     */
    @JsonProperty("sessionRelations")
    public SessionRelations getSessionRelations() {
        return sessionRelations;
    }

    /**
     * SessionRelations
     * <p>
     * It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.
     * 
     */
    @JsonProperty("sessionRelations")
    public void setSessionRelations(SessionRelations sessionRelations) {
        this.sessionRelations = sessionRelations;
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
