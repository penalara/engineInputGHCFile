
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
 * SessionSettings
 * <p>
 * Conditions on the position of the class unit.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "computeForMaxMinOccupancy",
    "avoidFirstHourSessions",
    "avoidLastHourSessions",
    "avoidAssingLastHourAndFirstNextDay",
    "sameHourPreference",
    "avoidAfternoonSessions",
    "avoidSectionsAfterBreak",
    "nonBreakInTheMiddleOfSession",
    "followedDaysPreference",
    "consecutiveWeeksBorders",
    "samePositionEveryPeriod"
})
public class SessionSettings {

    /**
     *  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.
     * 
     */
    @JsonProperty("computeForMaxMinOccupancy")
    @JsonPropertyDescription(" It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.")
    private Boolean computeForMaxMinOccupancy = false;
    /**
     * It penalises the position of the class units if more than 50% of the class units are at first hour.
     * 
     */
    @JsonProperty("avoidFirstHourSessions")
    @JsonPropertyDescription("It penalises the position of the class units if more than 50% of the class units are at first hour.")
    private Boolean avoidFirstHourSessions = true;
    /**
     * It penalises the position of the class units if more than 50% of the class units are at last hour.
     * 
     */
    @JsonProperty("avoidLastHourSessions")
    @JsonPropertyDescription("It penalises the position of the class units if more than 50% of the class units are at last hour.")
    private Boolean avoidLastHourSessions = true;
    /**
     * It penalises if the last hour and the first hour of the following day match.
     * 
     */
    @JsonProperty("avoidAssingLastHourAndFirstNextDay")
    @JsonPropertyDescription("It penalises if the last hour and the first hour of the following day match.")
    private Boolean avoidAssingLastHourAndFirstNextDay = true;
    /**
     * Preference over class units that coincide in the same time slot.
     * 
     */
    @JsonProperty("sameHourPreference")
    @JsonPropertyDescription("Preference over class units that coincide in the same time slot.")
    private SessionSettings.SameHourPreference sameHourPreference = SessionSettings.SameHourPreference.fromValue("ignore");
    /**
     * It penalises if there is more than one class unit after noon stop..
     * 
     */
    @JsonProperty("avoidAfternoonSessions")
    @JsonPropertyDescription("It penalises if there is more than one class unit after noon stop..")
    private Boolean avoidAfternoonSessions = true;
    /**
     * It penalises if more than 50% of the class unit are after the last break of the day.
     * 
     */
    @JsonProperty("avoidSectionsAfterBreak")
    @JsonPropertyDescription("It penalises if more than 50% of the class unit are after the last break of the day.")
    private Boolean avoidSectionsAfterBreak = true;
    /**
     * Do not allow breaks between class units of multiple duration (class duration of more than one section).
     * 
     */
    @JsonProperty("nonBreakInTheMiddleOfSession")
    @JsonPropertyDescription("Do not allow breaks between class units of multiple duration (class duration of more than one section).")
    private Boolean nonBreakInTheMiddleOfSession = false;
    /**
     * If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.
     * 
     */
    @JsonProperty("followedDaysPreference")
    @JsonPropertyDescription("If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.")
    private SessionSettings.FollowedDaysPreference followedDaysPreference = SessionSettings.FollowedDaysPreference.fromValue("ignore");
    /**
     * It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'.
     * 
     */
    @JsonProperty("consecutiveWeeksBorders")
    @JsonPropertyDescription("It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'.")
    private Boolean consecutiveWeeksBorders = false;
    /**
     * Keep the same position every week or period for the class units.
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    @JsonPropertyDescription("Keep the same position every week or period for the class units.")
    private SessionSettings.SamePositionEveryPeriod samePositionEveryPeriod = SessionSettings.SamePositionEveryPeriod.fromValue("ignore");

    /**
     * No args constructor for use in serialization
     * 
     */
    public SessionSettings() {
    }

    /**
     * 
     * @param avoidSectionsAfterBreak
     * @param avoidAfternoonSessions
     * @param nonBreakInTheMiddleOfSession
     * @param avoidAssingLastHourAndFirstNextDay
     * @param computeForMaxMinOccupancy
     * @param avoidFirstHourSessions
     * @param avoidLastHourSessions
     * @param samePositionEveryPeriod
     * @param sameHourPreference
     * @param consecutiveWeeksBorders
     * @param followedDaysPreference
     */
    public SessionSettings(Boolean computeForMaxMinOccupancy, Boolean avoidFirstHourSessions, Boolean avoidLastHourSessions, Boolean avoidAssingLastHourAndFirstNextDay, SessionSettings.SameHourPreference sameHourPreference, Boolean avoidAfternoonSessions, Boolean avoidSectionsAfterBreak, Boolean nonBreakInTheMiddleOfSession, SessionSettings.FollowedDaysPreference followedDaysPreference, Boolean consecutiveWeeksBorders, SessionSettings.SamePositionEveryPeriod samePositionEveryPeriod) {
        super();
        this.computeForMaxMinOccupancy = computeForMaxMinOccupancy;
        this.avoidFirstHourSessions = avoidFirstHourSessions;
        this.avoidLastHourSessions = avoidLastHourSessions;
        this.avoidAssingLastHourAndFirstNextDay = avoidAssingLastHourAndFirstNextDay;
        this.sameHourPreference = sameHourPreference;
        this.avoidAfternoonSessions = avoidAfternoonSessions;
        this.avoidSectionsAfterBreak = avoidSectionsAfterBreak;
        this.nonBreakInTheMiddleOfSession = nonBreakInTheMiddleOfSession;
        this.followedDaysPreference = followedDaysPreference;
        this.consecutiveWeeksBorders = consecutiveWeeksBorders;
        this.samePositionEveryPeriod = samePositionEveryPeriod;
    }

    /**
     *  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.
     * 
     */
    @JsonProperty("computeForMaxMinOccupancy")
    public Boolean getComputeForMaxMinOccupancy() {
        return computeForMaxMinOccupancy;
    }

    /**
     *  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.
     * 
     */
    @JsonProperty("computeForMaxMinOccupancy")
    public void setComputeForMaxMinOccupancy(Boolean computeForMaxMinOccupancy) {
        this.computeForMaxMinOccupancy = computeForMaxMinOccupancy;
    }

    /**
     * It penalises the position of the class units if more than 50% of the class units are at first hour.
     * 
     */
    @JsonProperty("avoidFirstHourSessions")
    public Boolean getAvoidFirstHourSessions() {
        return avoidFirstHourSessions;
    }

    /**
     * It penalises the position of the class units if more than 50% of the class units are at first hour.
     * 
     */
    @JsonProperty("avoidFirstHourSessions")
    public void setAvoidFirstHourSessions(Boolean avoidFirstHourSessions) {
        this.avoidFirstHourSessions = avoidFirstHourSessions;
    }

    /**
     * It penalises the position of the class units if more than 50% of the class units are at last hour.
     * 
     */
    @JsonProperty("avoidLastHourSessions")
    public Boolean getAvoidLastHourSessions() {
        return avoidLastHourSessions;
    }

    /**
     * It penalises the position of the class units if more than 50% of the class units are at last hour.
     * 
     */
    @JsonProperty("avoidLastHourSessions")
    public void setAvoidLastHourSessions(Boolean avoidLastHourSessions) {
        this.avoidLastHourSessions = avoidLastHourSessions;
    }

    /**
     * It penalises if the last hour and the first hour of the following day match.
     * 
     */
    @JsonProperty("avoidAssingLastHourAndFirstNextDay")
    public Boolean getAvoidAssingLastHourAndFirstNextDay() {
        return avoidAssingLastHourAndFirstNextDay;
    }

    /**
     * It penalises if the last hour and the first hour of the following day match.
     * 
     */
    @JsonProperty("avoidAssingLastHourAndFirstNextDay")
    public void setAvoidAssingLastHourAndFirstNextDay(Boolean avoidAssingLastHourAndFirstNextDay) {
        this.avoidAssingLastHourAndFirstNextDay = avoidAssingLastHourAndFirstNextDay;
    }

    /**
     * Preference over class units that coincide in the same time slot.
     * 
     */
    @JsonProperty("sameHourPreference")
    public SessionSettings.SameHourPreference getSameHourPreference() {
        return sameHourPreference;
    }

    /**
     * Preference over class units that coincide in the same time slot.
     * 
     */
    @JsonProperty("sameHourPreference")
    public void setSameHourPreference(SessionSettings.SameHourPreference sameHourPreference) {
        this.sameHourPreference = sameHourPreference;
    }

    /**
     * It penalises if there is more than one class unit after noon stop..
     * 
     */
    @JsonProperty("avoidAfternoonSessions")
    public Boolean getAvoidAfternoonSessions() {
        return avoidAfternoonSessions;
    }

    /**
     * It penalises if there is more than one class unit after noon stop..
     * 
     */
    @JsonProperty("avoidAfternoonSessions")
    public void setAvoidAfternoonSessions(Boolean avoidAfternoonSessions) {
        this.avoidAfternoonSessions = avoidAfternoonSessions;
    }

    /**
     * It penalises if more than 50% of the class unit are after the last break of the day.
     * 
     */
    @JsonProperty("avoidSectionsAfterBreak")
    public Boolean getAvoidSectionsAfterBreak() {
        return avoidSectionsAfterBreak;
    }

    /**
     * It penalises if more than 50% of the class unit are after the last break of the day.
     * 
     */
    @JsonProperty("avoidSectionsAfterBreak")
    public void setAvoidSectionsAfterBreak(Boolean avoidSectionsAfterBreak) {
        this.avoidSectionsAfterBreak = avoidSectionsAfterBreak;
    }

    /**
     * Do not allow breaks between class units of multiple duration (class duration of more than one section).
     * 
     */
    @JsonProperty("nonBreakInTheMiddleOfSession")
    public Boolean getNonBreakInTheMiddleOfSession() {
        return nonBreakInTheMiddleOfSession;
    }

    /**
     * Do not allow breaks between class units of multiple duration (class duration of more than one section).
     * 
     */
    @JsonProperty("nonBreakInTheMiddleOfSession")
    public void setNonBreakInTheMiddleOfSession(Boolean nonBreakInTheMiddleOfSession) {
        this.nonBreakInTheMiddleOfSession = nonBreakInTheMiddleOfSession;
    }

    /**
     * If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.
     * 
     */
    @JsonProperty("followedDaysPreference")
    public SessionSettings.FollowedDaysPreference getFollowedDaysPreference() {
        return followedDaysPreference;
    }

    /**
     * If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.
     * 
     */
    @JsonProperty("followedDaysPreference")
    public void setFollowedDaysPreference(SessionSettings.FollowedDaysPreference followedDaysPreference) {
        this.followedDaysPreference = followedDaysPreference;
    }

    /**
     * It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'.
     * 
     */
    @JsonProperty("consecutiveWeeksBorders")
    public Boolean getConsecutiveWeeksBorders() {
        return consecutiveWeeksBorders;
    }

    /**
     * It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'.
     * 
     */
    @JsonProperty("consecutiveWeeksBorders")
    public void setConsecutiveWeeksBorders(Boolean consecutiveWeeksBorders) {
        this.consecutiveWeeksBorders = consecutiveWeeksBorders;
    }

    /**
     * Keep the same position every week or period for the class units.
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    public SessionSettings.SamePositionEveryPeriod getSamePositionEveryPeriod() {
        return samePositionEveryPeriod;
    }

    /**
     * Keep the same position every week or period for the class units.
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    public void setSamePositionEveryPeriod(SessionSettings.SamePositionEveryPeriod samePositionEveryPeriod) {
        this.samePositionEveryPeriod = samePositionEveryPeriod;
    }


    /**
     * If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.
     * 
     */
    public enum FollowedDaysPreference {

        IGNORE("ignore"),
        ATTEMPT("attempt"),
        AVOID("avoid"),
        STRICT("strict"),
        FORBIDDEN("forbidden");
        private final String value;
        private final static Map<String, SessionSettings.FollowedDaysPreference> CONSTANTS = new HashMap<String, SessionSettings.FollowedDaysPreference>();

        static {
            for (SessionSettings.FollowedDaysPreference c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FollowedDaysPreference(String value) {
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
        public static SessionSettings.FollowedDaysPreference fromValue(String value) {
            SessionSettings.FollowedDaysPreference constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Preference over class units that coincide in the same time slot.
     * 
     */
    public enum SameHourPreference {

        IGNORE("ignore"),
        AVOID("avoid"),
        SAME("same");
        private final String value;
        private final static Map<String, SessionSettings.SameHourPreference> CONSTANTS = new HashMap<String, SessionSettings.SameHourPreference>();

        static {
            for (SessionSettings.SameHourPreference c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SameHourPreference(String value) {
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
        public static SessionSettings.SameHourPreference fromValue(String value) {
            SessionSettings.SameHourPreference constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Keep the same position every week or period for the class units.
     * 
     */
    public enum SamePositionEveryPeriod {

        IGNORE("ignore"),
        ATTEMPT("attempt"),
        AVOID("avoid"),
        STRICT("strict"),
        FORBIDDEN("forbidden");
        private final String value;
        private final static Map<String, SessionSettings.SamePositionEveryPeriod> CONSTANTS = new HashMap<String, SessionSettings.SamePositionEveryPeriod>();

        static {
            for (SessionSettings.SamePositionEveryPeriod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SamePositionEveryPeriod(String value) {
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
        public static SessionSettings.SamePositionEveryPeriod fromValue(String value) {
            SessionSettings.SamePositionEveryPeriod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
