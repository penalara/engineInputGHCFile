# WeeklyVariable Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable
```

Define the distribution as a number of sections per week and a maximum range of sections per day.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## weeklyVariable Type

`object` ([WeeklyVariable](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable.md))

# WeeklyVariable Properties

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                                                           |
| :---------------------------------------- | ------------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [numSessions](#numsessions)               | `number`      | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-numsessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/numSessions")               |
| [maxSessionsDaily](#maxsessionsdaily)     | `number`      | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-maxsessionsdaily.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/maxSessionsDaily")     |
| [minSessionsDayly](#minsessionsdayly)     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-minsessionsdayly.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/minSessionsDayly")     |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/avoidMaxDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/allowDiscontinuity") |

## numSessions

.


`numSessions`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-numsessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/numSessions")

### numSessions Type

`number`

## maxSessionsDaily

.


`maxSessionsDaily`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-maxsessionsdaily.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/maxSessionsDaily")

### maxSessionsDaily Type

`number`

## minSessionsDayly

.


`minSessionsDayly`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-minsessionsdayly.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/minSessionsDayly")

### minSessionsDayly Type

unknown

### minSessionsDayly Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"allow"`     |             |
| `"avoid"`     |             |
| `"forbidden"` |             |

### minSessionsDayly Default Value

The default value is:

```json
"allow"
```

## avoidMaxDuration

.


`avoidMaxDuration`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/avoidMaxDuration")

### avoidMaxDuration Type

`boolean`

## allowDiscontinuity

.


`allowDiscontinuity`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0-properties-stableperiods-oneof-1-properties-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/oneOf/0/properties/stablePeriods/oneOf/1/properties/weeklyVariable/properties/allowDiscontinuity")

### allowDiscontinuity Type

`boolean`
