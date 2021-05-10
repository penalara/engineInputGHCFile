
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Distribution
 * <p>
 * It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "periods",
    "stablePeriods",
    "variablePeriods"
})
public class Distribution {

    /**
     * RefPeriods
     * <p>
     * List of periods or weeks in which the class unit must be assigned.
     * 
     */
    @JsonProperty("periods")
    @JsonPropertyDescription("List of periods or weeks in which the class unit must be assigned.")
    private List<String> periods = new ArrayList<String>();
    /**
     * StablePeriods
     * <p>
     * The distribution of the class unit of the session is the same in each period.
     * 
     */
    @JsonProperty("stablePeriods")
    @JsonPropertyDescription("The distribution of the class unit of the session is the same in each period.")
    private StablePeriods stablePeriods;
    /**
     * VariablePeriods
     * <p>
     * The total of the class units of the distribution are divided between the periods.
     * 
     */
    @JsonProperty("variablePeriods")
    @JsonPropertyDescription("The total of the class units of the distribution are divided between the periods.")
    private VariablePeriods variablePeriods;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Distribution() {
    }

    /**
     * 
     * @param variablePeriods
     * @param periods
     * @param stablePeriods
     */
    public Distribution(List<String> periods, StablePeriods stablePeriods, VariablePeriods variablePeriods) {
        super();
        this.periods = periods;
        this.stablePeriods = stablePeriods;
        this.variablePeriods = variablePeriods;
    }

    /**
     * RefPeriods
     * <p>
     * List of periods or weeks in which the class unit must be assigned.
     * 
     */
    @JsonProperty("periods")
    public List<String> getPeriods() {
        return periods;
    }

    /**
     * RefPeriods
     * <p>
     * List of periods or weeks in which the class unit must be assigned.
     * 
     */
    @JsonProperty("periods")
    public void setPeriods(List<String> periods) {
        this.periods = periods;
    }

    /**
     * StablePeriods
     * <p>
     * The distribution of the class unit of the session is the same in each period.
     * 
     */
    @JsonProperty("stablePeriods")
    public StablePeriods getStablePeriods() {
        return stablePeriods;
    }

    /**
     * StablePeriods
     * <p>
     * The distribution of the class unit of the session is the same in each period.
     * 
     */
    @JsonProperty("stablePeriods")
    public void setStablePeriods(StablePeriods stablePeriods) {
        this.stablePeriods = stablePeriods;
    }

    /**
     * VariablePeriods
     * <p>
     * The total of the class units of the distribution are divided between the periods.
     * 
     */
    @JsonProperty("variablePeriods")
    public VariablePeriods getVariablePeriods() {
        return variablePeriods;
    }

    /**
     * VariablePeriods
     * <p>
     * The total of the class units of the distribution are divided between the periods.
     * 
     */
    @JsonProperty("variablePeriods")
    public void setVariablePeriods(VariablePeriods variablePeriods) {
        this.variablePeriods = variablePeriods;
    }

}
