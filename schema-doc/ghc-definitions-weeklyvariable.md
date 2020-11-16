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
| [minSessionsDaily](#minsessionsdaily)     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minsessionsdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minSessionsDaily")     |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity") |

## numSessions

Total of session's sections.


`numSessions`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-numsessions.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/numSessions")

### numSessions Type

`number`

## maxSessionsDaily

Maximum of sessions section's per day.


`maxSessionsDaily`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxsessionsdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxSessionsDaily")

### maxSessionsDaily Type

`number`

## minSessionsDaily

Indicates de preference about the session's classes of the minimum duration section.


`minSessionsDaily`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minsessionsdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minSessionsDaily")

### minSessionsDaily Type

unknown

### minSessionsDaily Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"allow"`     |             |
| `"avoid"`     |             |
| `"forbidden"` |             |

### minSessionsDaily Default Value

The default value is:

```json
"allow"
```

## avoidMaxDuration

Indicates de preference about the session's classes of the minimum duration section.


`avoidMaxDuration`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")

### avoidMaxDuration Type

`boolean`

## allowDiscontinuity

Indicates if discontinuous sections are allowed, that is, they have sections of other sessions or breaks in between.


`allowDiscontinuity`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity")

### allowDiscontinuity Type

`boolean`
