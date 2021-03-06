
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Section
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "day",
    "index",
    "entryTime",
    "exitTime",
    "duration",
    "type",
    "allowed"
})
public class Section {

    /**
     * Day of the week where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("Day of the week where the section is located.")
    private Integer day;
    /**
     * Index built into the day where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("index")
    @JsonPropertyDescription("Index built into the day where the section is located.")
    private Integer index;
    /**
     * Start time of the section.
     * (Required)
     * 
     */
    @JsonProperty("entryTime")
    @JsonPropertyDescription("Start time of the section.")
    private String entryTime;
    /**
     * End time of the section.
     * (Required)
     * 
     */
    @JsonProperty("exitTime")
    @JsonPropertyDescription("End time of the section.")
    private String exitTime;
    /**
     * It indicates the duration (real or proportional) of the section in minutes.
     * (Required)
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("It indicates the duration (real or proportional) of the section in minutes.")
    private Integer duration;
    /**
     * Kind of section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Kind of section.")
    private Section.Type type;
    /**
     * It indicates if the section is available to assign.
     * 
     */
    @JsonProperty("allowed")
    @JsonPropertyDescription("It indicates if the section is available to assign.")
    private Boolean allowed = true;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Section() {
    }

    /**
     * 
     * @param duration
     * @param entryTime
     * @param exitTime
     * @param allowed
     * @param index
     * @param type
     * @param day
     */
    public Section(Integer day, Integer index, String entryTime, String exitTime, Integer duration, Section.Type type, Boolean allowed) {
        super();
        this.day = day;
        this.index = index;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.duration = duration;
        this.type = type;
        this.allowed = allowed;
    }

    /**
     * Day of the week where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    /**
     * Day of the week where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * Index built into the day where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Index built into the day where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Start time of the section.
     * (Required)
     * 
     */
    @JsonProperty("entryTime")
    public String getEntryTime() {
        return entryTime;
    }

    /**
     * Start time of the section.
     * (Required)
     * 
     */
    @JsonProperty("entryTime")
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * End time of the section.
     * (Required)
     * 
     */
    @JsonProperty("exitTime")
    public String getExitTime() {
        return exitTime;
    }

    /**
     * End time of the section.
     * (Required)
     * 
     */
    @JsonProperty("exitTime")
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    /**
     * It indicates the duration (real or proportional) of the section in minutes.
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * It indicates the duration (real or proportional) of the section in minutes.
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Kind of section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Section.Type getType() {
        return type;
    }

    /**
     * Kind of section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Section.Type type) {
        this.type = type;
    }

    /**
     * It indicates if the section is available to assign.
     * 
     */
    @JsonProperty("allowed")
    public Boolean getAllowed() {
        return allowed;
    }

    /**
     * It indicates if the section is available to assign.
     * 
     */
    @JsonProperty("allowed")
    public void setAllowed(Boolean allowed) {
        this.allowed = allowed;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    /**
     * Kind of section.
     * 
     */
    public enum Type {

        TEACHING("teaching"),
        BREAK("break"),
        MIDDAY("midday");
        private final String value;
        private final static Map<String, Section.Type> CONSTANTS = new HashMap<String, Section.Type>();

        static {
            for (Section.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Section.Type fromValue(String value) {
            Section.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
