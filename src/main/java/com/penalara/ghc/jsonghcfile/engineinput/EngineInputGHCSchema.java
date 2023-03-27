
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EngineInputGHCSchema
 * <p>
 * Schema with the structure of GHC Engine files
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "meta",
    "specifications",
    "results"
})
public class EngineInputGHCSchema {

    /**
     * IdFile
     * <p>
     * Indicates the id number of the file at the Penalara Server.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Indicates the id number of the file at the Penalara Server.")
    private Integer id;
    /**
     * FileMetadata
     * <p>
     * Information about the file.
     * (Required)
     * 
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("Information about the file.")
    private FileMetadata meta;
    /**
     * GhcData
     * <p>
     * Schema of the object that contains the timetable planning data.
     * (Required)
     * 
     */
    @JsonProperty("specifications")
    @JsonPropertyDescription("Schema of the object that contains the timetable planning data.")
    private GhcData specifications;
    /**
     * EngineResults
     * <p>
     * Tables of the timetable that contain sections where the class units are located.
     * 
     */
    @JsonProperty("results")
    @JsonPropertyDescription("Tables of the timetable that contain sections where the class units are located.")
    private List<EngineOutputGHCSchema> results = new ArrayList<EngineOutputGHCSchema>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EngineInputGHCSchema() {
    }

    /**
     * 
     * @param meta
     *     FileMetadata. Information about the file.
     * @param id
     *     IdFile. Indicates the id number of the file at the Penalara Server.
     * @param results
     *     EngineResults. Tables of the timetable that contain sections where the class units are located.
     */
    public EngineInputGHCSchema(Integer id, FileMetadata meta, GhcData specifications, List<EngineOutputGHCSchema> results) {
        super();
        this.id = id;
        this.meta = meta;
        this.specifications = specifications;
        this.results = results;
    }

    /**
     * IdFile
     * <p>
     * Indicates the id number of the file at the Penalara Server.
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * IdFile
     * <p>
     * Indicates the id number of the file at the Penalara Server.
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * FileMetadata
     * <p>
     * Information about the file.
     * (Required)
     * 
     */
    @JsonProperty("meta")
    public FileMetadata getMeta() {
        return meta;
    }

    /**
     * FileMetadata
     * <p>
     * Information about the file.
     * (Required)
     * 
     */
    @JsonProperty("meta")
    public void setMeta(FileMetadata meta) {
        this.meta = meta;
    }

    /**
     * GhcData
     * <p>
     * Schema of the object that contains the timetable planning data.
     * (Required)
     * 
     */
    @JsonProperty("specifications")
    public GhcData getSpecifications() {
        return specifications;
    }

    /**
     * GhcData
     * <p>
     * Schema of the object that contains the timetable planning data.
     * (Required)
     * 
     */
    @JsonProperty("specifications")
    public void setSpecifications(GhcData specifications) {
        this.specifications = specifications;
    }

    /**
     * EngineResults
     * <p>
     * Tables of the timetable that contain sections where the class units are located.
     * 
     */
    @JsonProperty("results")
    public List<EngineOutputGHCSchema> getResults() {
        return results;
    }

    /**
     * EngineResults
     * <p>
     * Tables of the timetable that contain sections where the class units are located.
     * 
     */
    @JsonProperty("results")
    public void setResults(List<EngineOutputGHCSchema> results) {
        this.results = results;
    }

}
