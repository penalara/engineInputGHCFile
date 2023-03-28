# ConsecutiveAnyTimeFreeTimes Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime
```

Teacher's free intervals at any time of the day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## consecutiveAnyTime Type

`object` ([ConsecutiveAnyTimeFreeTimes](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes.md))

# consecutiveAnyTime Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                               |
| :------------------------------ | :-------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strictDays](#strictdays)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes-properties-strictdays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime/properties/strictDays")       |
| [preferredDays](#preferreddays) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes-properties-preferreddays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime/properties/preferredDays") |
| [minutes](#minutes)             | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime/properties/minutes")             |

## strictDays

Strict number of days on which the teacher must have the interval free.

`strictDays`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes-properties-strictdays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime/properties/strictDays")

### strictDays Type

`integer`

## preferredDays

Preferred number of days on which the teacher should have the interval free.

`preferredDays`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes-properties-preferreddays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime/properties/preferredDays")

### preferredDays Type

`integer`

## minutes

Minutes of free time interval.

`minutes`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime/properties/minutes")

### minutes Type

`integer`
