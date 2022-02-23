# WeeklyVariable Schema

```txt
engineInputGHCSchema#/definitions/distribution/properties/variablePeriods/properties/weeklyVariable
```

It defines the distribution as a number of sections per week and a maximum range of sections per day.

> It indicates a variable distribution among all the periods over which it is distributed. It is not the distribution of each period, but the total of this class unit.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## weeklyVariable Type

`object` ([WeeklyVariable](ghc-definitions-weeklyvariable.md))

# weeklyVariable Properties

| Property                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                               |
| :---------------------------------------- | :-------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [minutesAmount](#minutesamount)           | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minutesamount.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minutesAmount")           |
| [maxMinutesDaily](#maxminutesdaily)       | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxminutesdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxMinutesDaily")       |
| [minMinutesDaily](#minminutesdaily)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minminutesdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minMinutesDaily")       |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")     |
| [avoidMinDuration](#avoidminduration)     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidminduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMinDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity") |

## minutesAmount

Total of session's weekly minutes.

`minutesAmount`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minutesamount.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minutesAmount")

### minutesAmount Type

`integer`

## maxMinutesDaily

Maximum of minutes per day.

`maxMinutesDaily`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxminutesdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxMinutesDaily")

### maxMinutesDaily Type

`integer`

## minMinutesDaily

Minimun of minutes per day.

`minMinutesDaily`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minminutesdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minMinutesDaily")

### minMinutesDaily Type

`integer`

## avoidMaxDuration

It indicates the preference for class units of maximum duration.

`avoidMaxDuration`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")

### avoidMaxDuration Type

`boolean`

## avoidMinDuration

It indicates the preference for class units of minimun duration.

`avoidMinDuration`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidminduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMinDuration")

### avoidMinDuration Type

`boolean`

## allowDiscontinuity

It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.

`allowDiscontinuity`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity")

### allowDiscontinuity Type

`boolean`
