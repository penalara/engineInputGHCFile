
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OptimizationWeights
 * <p>
 * This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timetableGaps",
    "nonPreferredPositions",
    "sessions",
    "teachers"
})
public class OptimizationWeights {

    /**
     * TimetableGaps
     * <p>
     * It contains options related to timetable-gaps weights.
     * 
     */
    @JsonProperty("timetableGaps")
    @JsonPropertyDescription("It contains options related to timetable-gaps weights.")
    private TimetableGaps timetableGaps;
    /**
     * NonPreferredPositionsOptimization
     * <p>
     * It contains options related to allocation in non-preferred sections.
     * 
     */
    @JsonProperty("nonPreferredPositions")
    @JsonPropertyDescription("It contains options related to allocation in non-preferred sections.")
    private NonPreferredPositionsOptimization nonPreferredPositions;
    /**
     * SessionsOptimization
     * <p>
     * It contains options related to optimisable conditions for sessions.
     * 
     */
    @JsonProperty("sessions")
    @JsonPropertyDescription("It contains options related to optimisable conditions for sessions.")
    private SessionsOptimization sessions;
    /**
     * TeachersOptimization
     * <p>
     * It contains options related to optimisable conditions for teachers.
     * 
     */
    @JsonProperty("teachers")
    @JsonPropertyDescription("It contains options related to optimisable conditions for teachers.")
    private TeachersOptimization teachers;

    /**
     * TimetableGaps
     * <p>
     * It contains options related to timetable-gaps weights.
     * 
     */
    @JsonProperty("timetableGaps")
    public TimetableGaps getTimetableGaps() {
        return timetableGaps;
    }

    /**
     * TimetableGaps
     * <p>
     * It contains options related to timetable-gaps weights.
     * 
     */
    @JsonProperty("timetableGaps")
    public void setTimetableGaps(TimetableGaps timetableGaps) {
        this.timetableGaps = timetableGaps;
    }

    /**
     * NonPreferredPositionsOptimization
     * <p>
     * It contains options related to allocation in non-preferred sections.
     * 
     */
    @JsonProperty("nonPreferredPositions")
    public NonPreferredPositionsOptimization getNonPreferredPositions() {
        return nonPreferredPositions;
    }

    /**
     * NonPreferredPositionsOptimization
     * <p>
     * It contains options related to allocation in non-preferred sections.
     * 
     */
    @JsonProperty("nonPreferredPositions")
    public void setNonPreferredPositions(NonPreferredPositionsOptimization nonPreferredPositions) {
        this.nonPreferredPositions = nonPreferredPositions;
    }

    /**
     * SessionsOptimization
     * <p>
     * It contains options related to optimisable conditions for sessions.
     * 
     */
    @JsonProperty("sessions")
    public SessionsOptimization getSessions() {
        return sessions;
    }

    /**
     * SessionsOptimization
     * <p>
     * It contains options related to optimisable conditions for sessions.
     * 
     */
    @JsonProperty("sessions")
    public void setSessions(SessionsOptimization sessions) {
        this.sessions = sessions;
    }

    /**
     * TeachersOptimization
     * <p>
     * It contains options related to optimisable conditions for teachers.
     * 
     */
    @JsonProperty("teachers")
    public TeachersOptimization getTeachers() {
        return teachers;
    }

    /**
     * TeachersOptimization
     * <p>
     * It contains options related to optimisable conditions for teachers.
     * 
     */
    @JsonProperty("teachers")
    public void setTeachers(TeachersOptimization teachers) {
        this.teachers = teachers;
    }

}
