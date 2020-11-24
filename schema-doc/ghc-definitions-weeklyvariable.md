# WeeklyVariable Schema

```txt
engineInputGHCSchema#/definitions/weeklyVariable
```

Define the distribution as a number of sections per week and a maximum range of sections per day.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## weeklyVariable Type

`object` ([WeeklyVariable](ghc-definitions-weeklyvariable.md))

# WeeklyVariable Properties

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                               |
| :---------------------------------------- | ------------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [minutesAmount](#minutesamount)           | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minutesamount.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minutesAmount")           |
| [maxMinutesDaily](#maxminutesdaily)       | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxminutesdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxMinutesDaily")       |
| [minDurationDaily](#mindurationdaily)     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-mindurationdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minDurationDaily")     |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity") |

## minutesAmount

Total of session's weekly minutes.


`minutesAmount`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minutesamount.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minutesAmount")

### minutesAmount Type

`integer`

## maxMinutesDaily

Maximum of minutes per day.


`maxMinutesDaily`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxminutesdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxMinutesDaily")

### maxMinutesDaily Type

`integer`

## minDurationDaily

Indicates de preference about the session's classes of the minimum duration.


`minDurationDaily`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-mindurationdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minDurationDaily")

### minDurationDaily Type

unknown

### minDurationDaily Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"allow"`     |             |
| `"avoid"`     |             |
| `"forbidden"` |             |

### minDurationDaily Default Value

The default value is:

```json
"allow"
```

## avoidMaxDuration

Indicates de preference about the session's classes of the maximum duration.


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
