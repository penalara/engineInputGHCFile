# WeeklyVariable Schema

```txt
engineInputGHCSchema#/$defs/weeklyVariable
```

It defines the distribution as a number of sections per week and a maximum range of sections per day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## weeklyVariable Type

`object` ([WeeklyVariable](ghc-defs-weeklyvariable.md))

# weeklyVariable Properties

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                  |
| :---------------------------------------- | :------------ | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [minutesAmount](#minutesamount)           | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-minutesamount.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/minutesAmount")           |
| [maxMinutesDaily](#maxminutesdaily)       | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-maxminutesdaily.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/maxMinutesDaily")       |
| [minDurationDaily](#mindurationdaily)     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-mindurationdaily.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/minDurationDaily")     |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/avoidMaxDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/allowDiscontinuity") |

## minutesAmount

Total of session's weekly minutes.

`minutesAmount`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-minutesamount.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/minutesAmount")

### minutesAmount Type

`integer`

## maxMinutesDaily

Maximum of minutes per day.

`maxMinutesDaily`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-maxminutesdaily.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/maxMinutesDaily")

### maxMinutesDaily Type

`integer`

## minDurationDaily

It indicates the preference for class units of minimum duration.

`minDurationDaily`

*   is optional

*   Type: unknown

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-mindurationdaily.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/minDurationDaily")

### minDurationDaily Type

unknown

### minDurationDaily Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | :---------- |
| `"allow"`     |             |
| `"avoid"`     |             |
| `"forbidden"` |             |

### minDurationDaily Default Value

The default value is:

```json
"allow"
```

## avoidMaxDuration

It indicates the preference for class units of maximum duration.

`avoidMaxDuration`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/avoidMaxDuration")

### avoidMaxDuration Type

`boolean`

## allowDiscontinuity

It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.

`allowDiscontinuity`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/$defs/weeklyVariable/properties/allowDiscontinuity")

### allowDiscontinuity Type

`boolean`
