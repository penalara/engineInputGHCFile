
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
 * Teacher
 * <p>
 * Object with personal information and teachers' preferences.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "associationIdentifier",
    "frameTemplate",
    "generalSettings",
    "periodSettings"
})
public class Teacher {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.
     * 
     */
    @JsonProperty("associationIdentifier")
    @JsonPropertyDescription("Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.")
    private String associationIdentifier;
    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Templates with frame sections assignment preferences.")
    private List<SectionPreference> frameTemplate = new ArrayList<SectionPreference>();
    /**
     * GeneralSettings
     * <p>
     * Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.
     * 
     */
    @JsonProperty("generalSettings")
    @JsonPropertyDescription("Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.")
    private GeneralSettings generalSettings;
    /**
     * PeriodsSettings
     * <p>
     * Strict and measurable teacher's conditions customized by week/period
     * 
     */
    @JsonProperty("periodSettings")
    @JsonPropertyDescription("Strict and measurable teacher's conditions customized by week/period")
    private List<PeriodSetting> periodSettings = new ArrayList<PeriodSetting>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Teacher() {
    }

    /**
     * 
     * @param associationIdentifier
     * @param frameTemplate
     * @param periodSettings
     * @param generalSettings
     * @param id
     */
    public Teacher(String id, String associationIdentifier, List<SectionPreference> frameTemplate, GeneralSettings generalSettings, List<PeriodSetting> periodSettings) {
        super();
        this.id = id;
        this.associationIdentifier = associationIdentifier;
        this.frameTemplate = frameTemplate;
        this.generalSettings = generalSettings;
        this.periodSettings = periodSettings;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.
     * 
     */
    @JsonProperty("associationIdentifier")
    public String getAssociationIdentifier() {
        return associationIdentifier;
    }

    /**
     * Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.
     * 
     */
    @JsonProperty("associationIdentifier")
    public void setAssociationIdentifier(String associationIdentifier) {
        this.associationIdentifier = associationIdentifier;
    }

    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    public List<SectionPreference> getFrameTemplate() {
        return frameTemplate;
    }

    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    public void setFrameTemplate(List<SectionPreference> frameTemplate) {
        this.frameTemplate = frameTemplate;
    }

    /**
     * GeneralSettings
     * <p>
     * Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.
     * 
     */
    @JsonProperty("generalSettings")
    public GeneralSettings getGeneralSettings() {
        return generalSettings;
    }

    /**
     * GeneralSettings
     * <p>
     * Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.
     * 
     */
    @JsonProperty("generalSettings")
    public void setGeneralSettings(GeneralSettings generalSettings) {
        this.generalSettings = generalSettings;
    }

    /**
     * PeriodsSettings
     * <p>
     * Strict and measurable teacher's conditions customized by week/period
     * 
     */
    @JsonProperty("periodSettings")
    public List<PeriodSetting> getPeriodSettings() {
        return periodSettings;
    }

    /**
     * PeriodsSettings
     * <p>
     * Strict and measurable teacher's conditions customized by week/period
     * 
     */
    @JsonProperty("periodSettings")
    public void setPeriodSettings(List<PeriodSetting> periodSettings) {
        this.periodSettings = periodSettings;
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
