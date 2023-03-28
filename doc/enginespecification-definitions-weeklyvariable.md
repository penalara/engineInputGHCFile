# WeeklyVariable Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable
```

It defines the distribution as a number of sections per week and a maximum range of sections per day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## weeklyVariable Type

`object` ([WeeklyVariable](enginespecification-definitions-weeklyvariable.md))

# weeklyVariable Properties

| Property                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                              |
| :---------------------------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [minutesAmount](#minutesamount)           | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-minutesamount.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/minutesAmount")           |
| [maxMinutesDaily](#maxminutesdaily)       | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-maxminutesdaily.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/maxMinutesDaily")       |
| [minMinutesDaily](#minminutesdaily)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-minminutesdaily.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/minMinutesDaily")       |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-avoidmaxduration.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/avoidMaxDuration")     |
| [avoidMinDuration](#avoidminduration)     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-avoidminduration.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/avoidMinDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-allowdiscontinuity.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/allowDiscontinuity") |

## minutesAmount

Total of session's weekly minutes.

`minutesAmount`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-minutesamount.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/minutesAmount")

### minutesAmount Type

`integer`

## maxMinutesDaily

Maximum of minutes per day.

`maxMinutesDaily`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-maxminutesdaily.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/maxMinutesDaily")

### maxMinutesDaily Type

`integer`

## minMinutesDaily

Minimun of minutes per day.

`minMinutesDaily`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-minminutesdaily.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/minMinutesDaily")

### minMinutesDaily Type

`integer`

## avoidMaxDuration

It indicates the preference for class units of maximum duration.

`avoidMaxDuration`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-avoidmaxduration.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/avoidMaxDuration")

### avoidMaxDuration Type

`boolean`

## avoidMinDuration

It indicates the preference for class units of minimun duration.

`avoidMinDuration`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-avoidminduration.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/avoidMinDuration")

### avoidMinDuration Type

`boolean`

## allowDiscontinuity

It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.

`allowDiscontinuity`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-allowdiscontinuity.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/allowDiscontinuity")

### allowDiscontinuity Type

`boolean`
