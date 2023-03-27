
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SessionSectionPreference
 * <p>
 * Section assignment preference.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "day",
    "index",
    "frame",
    "type"
})
public class SessionSectionPreference {

    /**
     * Day of the week when the section is located.
     * (Required)
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("Day of the week when the section is located.")
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
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("frame")
    @JsonPropertyDescription("Frame identifier.")
    private String frame;
    /**
     * SectionPreferenceTypeWithPreset
     * <p>
     * Session availability to be assigned to the section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Session availability to be assigned to the section.")
    private SessionSectionPreference.SectionPreferenceTypeWithPreset type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SessionSectionPreference() {
    }

    /**
     * 
     * @param index
     *     Index built into the day where the section is located.
     * @param type
     *     SectionPreferenceTypeWithPreset. Session availability to be assigned to the section.
     * @param day
     *     Day of the week when the section is located.
     * @param frame
     *     Frame identifier.
     */
    public SessionSectionPreference(Integer day, Integer index, String frame, SessionSectionPreference.SectionPreferenceTypeWithPreset type) {
        super();
        this.day = day;
        this.index = index;
        this.frame = frame;
        this.type = type;
    }

    /**
     * Day of the week when the section is located.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    /**
     * Day of the week when the section is located.
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
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public String getFrame() {
        return frame;
    }

    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public void setFrame(String frame) {
        this.frame = frame;
    }

    /**
     * SectionPreferenceTypeWithPreset
     * <p>
     * Session availability to be assigned to the section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public SessionSectionPreference.SectionPreferenceTypeWithPreset getType() {
        return type;
    }

    /**
     * SectionPreferenceTypeWithPreset
     * <p>
     * Session availability to be assigned to the section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(SessionSectionPreference.SectionPreferenceTypeWithPreset type) {
        this.type = type;
    }


    /**
     * SectionPreferenceTypeWithPreset
     * <p>
     * Session availability to be assigned to the section.
     * 
     */
    public enum SectionPreferenceTypeWithPreset {

        BANNED("banned"),
        STRONG_NON_PREFERRED("strong-non-preferred"),
        WEAK_NON_PREFERRED("weak-non-preferred"),
        PRESET("preset");
        private final String value;
        private final static Map<String, SessionSectionPreference.SectionPreferenceTypeWithPreset> CONSTANTS = new HashMap<String, SessionSectionPreference.SectionPreferenceTypeWithPreset>();

        static {
            for (SessionSectionPreference.SectionPreferenceTypeWithPreset c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SectionPreferenceTypeWithPreset(String value) {
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
        public static SessionSectionPreference.SectionPreferenceTypeWithPreset fromValue(String value) {
            SessionSectionPreference.SectionPreferenceTypeWithPreset constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
