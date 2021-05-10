
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
 * AfternoonFreePartTimes
 * <p>
 * Afternoons off.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strict",
    "preferable"
})
public class AfternoonFreePartTimes {

    /**
     * Strict number of afternoons off..
     * 
     */
    @JsonProperty("strict")
    @JsonPropertyDescription("Strict number of afternoons off..")
    private Integer strict;
    /**
     * Preferable number of afternoons off.
     * 
     */
    @JsonProperty("preferable")
    @JsonPropertyDescription("Preferable number of afternoons off.")
    private Integer preferable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AfternoonFreePartTimes() {
    }

    /**
     * 
     * @param preferable
     * @param strict
     */
    public AfternoonFreePartTimes(Integer strict, Integer preferable) {
        super();
        this.strict = strict;
        this.preferable = preferable;
    }

    /**
     * Strict number of afternoons off..
     * 
     */
    @JsonProperty("strict")
    public Integer getStrict() {
        return strict;
    }

    /**
     * Strict number of afternoons off..
     * 
     */
    @JsonProperty("strict")
    public void setStrict(Integer strict) {
        this.strict = strict;
    }

    /**
     * Preferable number of afternoons off.
     * 
     */
    @JsonProperty("preferable")
    public Integer getPreferable() {
        return preferable;
    }

    /**
     * Preferable number of afternoons off.
     * 
     */
    @JsonProperty("preferable")
    public void setPreferable(Integer preferable) {
        this.preferable = preferable;
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
