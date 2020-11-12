# WeeklyVariable Schema

```txt
engineInputGHCSchema#/definitions/weeklyVariable
```

Define the distribution as a number of sections per week and a maximum range of sections per day.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## weeklyVariable Type

`object` ([WeeklyVariable](ghc-definitions-weeklyvariable.md))

# WeeklyVariable Properties

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                               |
| :---------------------------------------- | ------------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [numSessions](#numsessions)               | `number`      | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-numsessions.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/numSessions")               |
| [maxSessionsDaily](#maxsessionsdaily)     | `number`      | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxsessionsdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxSessionsDaily")     |
| [minSessionsDayly](#minsessionsdayly)     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minsessionsdayly.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minSessionsDayly")     |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity") |

## numSessions

.


`numSessions`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-numsessions.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/numSessions")

### numSessions Type

`number`

## maxSessionsDaily

.


`maxSessionsDaily`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxsessionsdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxSessionsDaily")

### maxSessionsDaily Type

`number`

## minSessionsDayly

.


`minSessionsDayly`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minsessionsdayly.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minSessionsDayly")

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
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")

### avoidMaxDuration Type

`boolean`

## allowDiscontinuity

.


`allowDiscontinuity`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity")

### allowDiscontinuity Type

`boolean`