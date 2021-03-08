
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
 * RefClassRoomToAssign
 * <p>
 * Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "classRoomsList",
    "classRoomsSetsList"
})
public class RefClassRoomToAssign {

    /**
     * ClassRoomRef
     * <p>
     * Available classroom list to be assigned to session.
     * 
     */
    @JsonProperty("classRoomsList")
    @JsonPropertyDescription("Available classroom list to be assigned to session.")
    private List<String> classRoomsList = new ArrayList<String>();
    /**
     * ClassRoomsSetsList
     * <p>
     * Classroom set list where one classroom could be taken to assign to session.
     * 
     */
    @JsonProperty("classRoomsSetsList")
    @JsonPropertyDescription("Classroom set list where one classroom could be taken to assign to session.")
    private List<String> classRoomsSetsList = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ClassRoomRef
     * <p>
     * Available classroom list to be assigned to session.
     * 
     */
    @JsonProperty("classRoomsList")
    public List<String> getClassRoomsList() {
        return classRoomsList;
    }

    /**
     * ClassRoomRef
     * <p>
     * Available classroom list to be assigned to session.
     * 
     */
    @JsonProperty("classRoomsList")
    public void setClassRoomsList(List<String> classRoomsList) {
        this.classRoomsList = classRoomsList;
    }

    /**
     * ClassRoomsSetsList
     * <p>
     * Classroom set list where one classroom could be taken to assign to session.
     * 
     */
    @JsonProperty("classRoomsSetsList")
    public List<String> getClassRoomsSetsList() {
        return classRoomsSetsList;
    }

    /**
     * ClassRoomsSetsList
     * <p>
     * Classroom set list where one classroom could be taken to assign to session.
     * 
     */
    @JsonProperty("classRoomsSetsList")
    public void setClassRoomsSetsList(List<String> classRoomsSetsList) {
        this.classRoomsSetsList = classRoomsSetsList;
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
