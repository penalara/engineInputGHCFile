
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EngineOutputGHCSchema
 * <p>
 * Schema document to format in Json the timetable created by PenalaraGHC.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "timetable"
})
public class EngineOutputGHCSchema {

    /**
     * JsonGenerationDate
     * <p>
     * Date of timetable creation.
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Date of timetable creation.")
    private Date date;
    /**
     * GeneratedJsonTimetable
     * <p>
     * Object with timetable specification resolved.
     * (Required)
     * 
     */
    @JsonProperty("timetable")
    @JsonPropertyDescription("Object with timetable specification resolved.")
    private GeneratedJsonTimetable timetable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EngineOutputGHCSchema() {
    }

    /**
     * 
     * @param date
     *     JsonGenerationDate. Date of timetable creation.
     * @param timetable
     *     GeneratedJsonTimetable. Object with timetable specification resolved.
     */
    public EngineOutputGHCSchema(Date date, GeneratedJsonTimetable timetable) {
        super();
        this.date = date;
        this.timetable = timetable;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Date of timetable creation.
     * (Required)
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Date of timetable creation.
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * GeneratedJsonTimetable
     * <p>
     * Object with timetable specification resolved.
     * (Required)
     * 
     */
    @JsonProperty("timetable")
    public GeneratedJsonTimetable getTimetable() {
        return timetable;
    }

    /**
     * GeneratedJsonTimetable
     * <p>
     * Object with timetable specification resolved.
     * (Required)
     * 
     */
    @JsonProperty("timetable")
    public void setTimetable(GeneratedJsonTimetable timetable) {
        this.timetable = timetable;
    }

}
