
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EngineInputGHCSchema
 * <p>
 * Schema document to keep the timetable information that will be created by the PenalaraGHC.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "versionJson",
    "date",
    "ghcData"
})
public class EngineInputGHCSchema {

    /**
     * SchemaVersion
     * <p>
     * Version of EngineInputGHCSchema used
     * (Required)
     * 
     */
    @JsonProperty("versionJson")
    @JsonPropertyDescription("Version of EngineInputGHCSchema used")
    private String versionJson;
    /**
     * JsonGenerationDate
     * <p>
     * Json's generation date.
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Json's generation date.")
    private Date date;
    /**
     * GhcData
     * <p>
     * Schema of the object that contains the timetable planning data.
     * (Required)
     * 
     */
    @JsonProperty("ghcData")
    @JsonPropertyDescription("Schema of the object that contains the timetable planning data.")
    private GhcData ghcData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * SchemaVersion
     * <p>
     * Version of EngineInputGHCSchema used
     * (Required)
     * 
     */
    @JsonProperty("versionJson")
    public String getVersionJson() {
        return versionJson;
    }

    /**
     * SchemaVersion
     * <p>
     * Version of EngineInputGHCSchema used
     * (Required)
     * 
     */
    @JsonProperty("versionJson")
    public void setVersionJson(String versionJson) {
        this.versionJson = versionJson;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Json's generation date.
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
     * Json's generation date.
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * GhcData
     * <p>
     * Schema of the object that contains the timetable planning data.
     * (Required)
     * 
     */
    @JsonProperty("ghcData")
    public GhcData getGhcData() {
        return ghcData;
    }

    /**
     * GhcData
     * <p>
     * Schema of the object that contains the timetable planning data.
     * (Required)
     * 
     */
    @JsonProperty("ghcData")
    public void setGhcData(GhcData ghcData) {
        this.ghcData = ghcData;
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
