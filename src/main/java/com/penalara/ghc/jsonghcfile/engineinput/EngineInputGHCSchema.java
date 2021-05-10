
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
    "createdDate",
    "lastModifiedDate",
    "ghcData"
})
public class EngineInputGHCSchema {

    /**
     * SchemaVersion
     * <p>
     * Version of EngineInputGHCSchema used
     * 
     */
    @JsonProperty("versionJson")
    @JsonPropertyDescription("Version of EngineInputGHCSchema used")
    private String versionJson;
    /**
     * JsonCreatedDate
     * <p>
     * Json generation date.
     * 
     */
    @JsonProperty("createdDate")
    @JsonPropertyDescription("Json generation date.")
    private Date createdDate;
    /**
     * JsonGenerationDate
     * <p>
     * Json last modification date.
     * 
     */
    @JsonProperty("lastModifiedDate")
    @JsonPropertyDescription("Json last modification date.")
    private Date lastModifiedDate;
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
     * No args constructor for use in serialization
     * 
     */
    public EngineInputGHCSchema() {
    }

    /**
     * 
     * @param ghcData
     * @param createdDate
     * @param lastModifiedDate
     * @param versionJson
     */
    public EngineInputGHCSchema(String versionJson, Date createdDate, Date lastModifiedDate, GhcData ghcData) {
        super();
        this.versionJson = versionJson;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.ghcData = ghcData;
    }

    /**
     * SchemaVersion
     * <p>
     * Version of EngineInputGHCSchema used
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
     * 
     */
    @JsonProperty("versionJson")
    public void setVersionJson(String versionJson) {
        this.versionJson = versionJson;
    }

    /**
     * JsonCreatedDate
     * <p>
     * Json generation date.
     * 
     */
    @JsonProperty("createdDate")
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * JsonCreatedDate
     * <p>
     * Json generation date.
     * 
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Json last modification date.
     * 
     */
    @JsonProperty("lastModifiedDate")
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Json last modification date.
     * 
     */
    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
