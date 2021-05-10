
package com.penalara.ghc.jsonghcfile.engineinput;

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
 * RefGroup
 * <p>
 * Value pair: group identifier and number of students.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refGroup",
    "numStudents"
})
public class RefGroup {

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("refGroup")
    @JsonPropertyDescription("Group identifier.")
    private String refGroup;
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
    public RefGroup() {
    }

    /**
     * 
     * @param numStudents
     * @param refGroup
     */
    public RefGroup(String refGroup, Integer numStudents) {
        super();
        this.refGroup = refGroup;
        this.numStudents = numStudents;
    }

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("refGroup")
    public String getRefGroup() {
        return refGroup;
    }

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("refGroup")
    public void setRefGroup(String refGroup) {
        this.refGroup = refGroup;
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
