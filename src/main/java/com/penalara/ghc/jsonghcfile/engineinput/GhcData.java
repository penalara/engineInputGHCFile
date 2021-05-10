
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
 * GhcData
 * <p>
 * Schema of the object that contains the timetable planning data.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "periods",
    "frames",
    "buildings",
    "classRooms",
    "classRoomsSets",
    "tasks",
    "teachers",
    "subjects",
    "groups",
    "sessions",
    "onCallServices",
    "optimizationWeights",
    "engineSettings"
})
public class GhcData {

    /**
     * Periods
     * <p>
     * Weeks or periods with different assignments which contains the timetable.
     * 
     */
    @JsonProperty("periods")
    @JsonPropertyDescription("Weeks or periods with different assignments which contains the timetable.")
    private Periods periods;
    /**
     * Frames
     * <p>
     * Tables of the timetable that contain sections where the class units are located.
     * (Required)
     * 
     */
    @JsonProperty("frames")
    @JsonPropertyDescription("Tables of the timetable that contain sections where the class units are located.")
    private List<Frame> frames = new ArrayList<Frame>();
    /**
     * Buildings
     * <p>
     * It contains the school or educational institution buildings.
     * (Required)
     * 
     */
    @JsonProperty("buildings")
    @JsonPropertyDescription("It contains the school or educational institution buildings.")
    private List<Building> buildings = new ArrayList<Building>();
    /**
     * ClassRooms
     * <p>
     * It contains the classrooms to organize the class units.
     * (Required)
     * 
     */
    @JsonProperty("classRooms")
    @JsonPropertyDescription("It contains\u00a0the\u00a0classrooms\u00a0to organize\u00a0the\u00a0class units.")
    private List<Classroom> classRooms = new ArrayList<Classroom>();
    /**
     * ClassRoomsSets
     * <p>
     * A division of the classrooms, grouped by organizational characteristics or needs.
     * 
     */
    @JsonProperty("classRoomsSets")
    @JsonPropertyDescription("A division of the classrooms, grouped by organizational characteristics or needs.")
    private List<ClassRoomSet> classRoomsSets = new ArrayList<ClassRoomSet>();
    /**
     * Tasks
     * <p>
     * Types of tasks or activities for the teachers.
     * 
     */
    @JsonProperty("tasks")
    @JsonPropertyDescription("Types of tasks or activities for the teachers.")
    private List<Task> tasks = new ArrayList<Task>();
    /**
     * Teachers
     * <p>
     * Teachers list of the timetable.
     * (Required)
     * 
     */
    @JsonProperty("teachers")
    @JsonPropertyDescription("Teachers list of the timetable.")
    private List<Teacher> teachers = new ArrayList<Teacher>();
    /**
     * Subjects
     * <p>
     * School subjects taught in the class units.
     * (Required)
     * 
     */
    @JsonProperty("subjects")
    @JsonPropertyDescription("School subjects taught in the class units.")
    private List<Subject> subjects = new ArrayList<Subject>();
    /**
     * Groups
     * <p>
     * Sets of students.
     * (Required)
     * 
     */
    @JsonProperty("groups")
    @JsonPropertyDescription("Sets of students.")
    private List<Group> groups = new ArrayList<Group>();
    /**
     * Sessions
     * <p>
     * Definition of the teacher class units. These may be with groups of students, meetings with other teachers or complementary activities.
     * (Required)
     * 
     */
    @JsonProperty("sessions")
    @JsonPropertyDescription("Definition of the teacher class units. These may be with groups of students, meetings with other teachers or complementary activities.")
    private List<Session> sessions = new ArrayList<Session>();
    /**
     * OnCallServices
     * <p>
     * List of on-call services of teachers defined in the timetable.
     * 
     */
    @JsonProperty("onCallServices")
    @JsonPropertyDescription("List of on-call services of teachers defined in the timetable.")
    private List<OnCallService> onCallServices = new ArrayList<OnCallService>();
    /**
     * OptimizationWeights
     * <p>
     * This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.
     * 
     */
    @JsonProperty("optimizationWeights")
    @JsonPropertyDescription("This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.")
    private OptimizationWeights optimizationWeights;
    /**
     * EngineSettings
     * <p>
     * Customised engine configuration parameters.
     * 
     */
    @JsonProperty("engineSettings")
    @JsonPropertyDescription("Customised engine configuration parameters.")
    private EngineSettings engineSettings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GhcData() {
    }

    /**
     * 
     * @param classRoomsSets
     * @param sessions
     * @param frames
     * @param subjects
     * @param groups
     * @param optimizationWeights
     * @param teachers
     * @param buildings
     * @param periods
     * @param classRooms
     * @param engineSettings
     * @param onCallServices
     * @param tasks
     */
    public GhcData(Periods periods, List<Frame> frames, List<Building> buildings, List<Classroom> classRooms, List<ClassRoomSet> classRoomsSets, List<Task> tasks, List<Teacher> teachers, List<Subject> subjects, List<Group> groups, List<Session> sessions, List<OnCallService> onCallServices, OptimizationWeights optimizationWeights, EngineSettings engineSettings) {
        super();
        this.periods = periods;
        this.frames = frames;
        this.buildings = buildings;
        this.classRooms = classRooms;
        this.classRoomsSets = classRoomsSets;
        this.tasks = tasks;
        this.teachers = teachers;
        this.subjects = subjects;
        this.groups = groups;
        this.sessions = sessions;
        this.onCallServices = onCallServices;
        this.optimizationWeights = optimizationWeights;
        this.engineSettings = engineSettings;
    }

    /**
     * Periods
     * <p>
     * Weeks or periods with different assignments which contains the timetable.
     * 
     */
    @JsonProperty("periods")
    public Periods getPeriods() {
        return periods;
    }

    /**
     * Periods
     * <p>
     * Weeks or periods with different assignments which contains the timetable.
     * 
     */
    @JsonProperty("periods")
    public void setPeriods(Periods periods) {
        this.periods = periods;
    }

    /**
     * Frames
     * <p>
     * Tables of the timetable that contain sections where the class units are located.
     * (Required)
     * 
     */
    @JsonProperty("frames")
    public List<Frame> getFrames() {
        return frames;
    }

    /**
     * Frames
     * <p>
     * Tables of the timetable that contain sections where the class units are located.
     * (Required)
     * 
     */
    @JsonProperty("frames")
    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }

    /**
     * Buildings
     * <p>
     * It contains the school or educational institution buildings.
     * (Required)
     * 
     */
    @JsonProperty("buildings")
    public List<Building> getBuildings() {
        return buildings;
    }

    /**
     * Buildings
     * <p>
     * It contains the school or educational institution buildings.
     * (Required)
     * 
     */
    @JsonProperty("buildings")
    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    /**
     * ClassRooms
     * <p>
     * It contains the classrooms to organize the class units.
     * (Required)
     * 
     */
    @JsonProperty("classRooms")
    public List<Classroom> getClassRooms() {
        return classRooms;
    }

    /**
     * ClassRooms
     * <p>
     * It contains the classrooms to organize the class units.
     * (Required)
     * 
     */
    @JsonProperty("classRooms")
    public void setClassRooms(List<Classroom> classRooms) {
        this.classRooms = classRooms;
    }

    /**
     * ClassRoomsSets
     * <p>
     * A division of the classrooms, grouped by organizational characteristics or needs.
     * 
     */
    @JsonProperty("classRoomsSets")
    public List<ClassRoomSet> getClassRoomsSets() {
        return classRoomsSets;
    }

    /**
     * ClassRoomsSets
     * <p>
     * A division of the classrooms, grouped by organizational characteristics or needs.
     * 
     */
    @JsonProperty("classRoomsSets")
    public void setClassRoomsSets(List<ClassRoomSet> classRoomsSets) {
        this.classRoomsSets = classRoomsSets;
    }

    /**
     * Tasks
     * <p>
     * Types of tasks or activities for the teachers.
     * 
     */
    @JsonProperty("tasks")
    public List<Task> getTasks() {
        return tasks;
    }

    /**
     * Tasks
     * <p>
     * Types of tasks or activities for the teachers.
     * 
     */
    @JsonProperty("tasks")
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Teachers
     * <p>
     * Teachers list of the timetable.
     * (Required)
     * 
     */
    @JsonProperty("teachers")
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Teachers
     * <p>
     * Teachers list of the timetable.
     * (Required)
     * 
     */
    @JsonProperty("teachers")
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    /**
     * Subjects
     * <p>
     * School subjects taught in the class units.
     * (Required)
     * 
     */
    @JsonProperty("subjects")
    public List<Subject> getSubjects() {
        return subjects;
    }

    /**
     * Subjects
     * <p>
     * School subjects taught in the class units.
     * (Required)
     * 
     */
    @JsonProperty("subjects")
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    /**
     * Groups
     * <p>
     * Sets of students.
     * (Required)
     * 
     */
    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    /**
     * Groups
     * <p>
     * Sets of students.
     * (Required)
     * 
     */
    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    /**
     * Sessions
     * <p>
     * Definition of the teacher class units. These may be with groups of students, meetings with other teachers or complementary activities.
     * (Required)
     * 
     */
    @JsonProperty("sessions")
    public List<Session> getSessions() {
        return sessions;
    }

    /**
     * Sessions
     * <p>
     * Definition of the teacher class units. These may be with groups of students, meetings with other teachers or complementary activities.
     * (Required)
     * 
     */
    @JsonProperty("sessions")
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    /**
     * OnCallServices
     * <p>
     * List of on-call services of teachers defined in the timetable.
     * 
     */
    @JsonProperty("onCallServices")
    public List<OnCallService> getOnCallServices() {
        return onCallServices;
    }

    /**
     * OnCallServices
     * <p>
     * List of on-call services of teachers defined in the timetable.
     * 
     */
    @JsonProperty("onCallServices")
    public void setOnCallServices(List<OnCallService> onCallServices) {
        this.onCallServices = onCallServices;
    }

    /**
     * OptimizationWeights
     * <p>
     * This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.
     * 
     */
    @JsonProperty("optimizationWeights")
    public OptimizationWeights getOptimizationWeights() {
        return optimizationWeights;
    }

    /**
     * OptimizationWeights
     * <p>
     * This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.
     * 
     */
    @JsonProperty("optimizationWeights")
    public void setOptimizationWeights(OptimizationWeights optimizationWeights) {
        this.optimizationWeights = optimizationWeights;
    }

    /**
     * EngineSettings
     * <p>
     * Customised engine configuration parameters.
     * 
     */
    @JsonProperty("engineSettings")
    public EngineSettings getEngineSettings() {
        return engineSettings;
    }

    /**
     * EngineSettings
     * <p>
     * Customised engine configuration parameters.
     * 
     */
    @JsonProperty("engineSettings")
    public void setEngineSettings(EngineSettings engineSettings) {
        this.engineSettings = engineSettings;
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
