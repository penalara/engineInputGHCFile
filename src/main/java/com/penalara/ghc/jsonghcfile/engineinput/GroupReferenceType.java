
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GroupReferenceType
 * <p>
 * Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refIdGroup",
    "numStudents"
})
@Generated("jsonschema2pojo")
public class GroupReferenceType {

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("refIdGroup")
    @JsonPropertyDescription("Group identifier.")
    private String refIdGroup;
    /**
     * Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.
     * 
     */
    @JsonProperty("numStudents")
    @JsonPropertyDescription("Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.")
    private Integer numStudents;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GroupReferenceType() {
    }

    /**
     * 
     * @param refIdGroup
     * @param numStudents
     */
    public GroupReferenceType(String refIdGroup, Integer numStudents) {
        super();
        this.refIdGroup = refIdGroup;
        this.numStudents = numStudents;
    }

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("refIdGroup")
    public String getRefIdGroup() {
        return refIdGroup;
    }

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("refIdGroup")
    public void setRefIdGroup(String refIdGroup) {
        this.refIdGroup = refIdGroup;
    }

    /**
     * Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.
     * 
     */
    @JsonProperty("numStudents")
    public Integer getNumStudents() {
        return numStudents;
    }

    /**
     * Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.
     * 
     */
    @JsonProperty("numStudents")
    public void setNumStudents(Integer numStudents) {
        this.numStudents = numStudents;
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
