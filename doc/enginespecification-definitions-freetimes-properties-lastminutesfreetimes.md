# LastMinutesFreeTimes Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes
```

Teacher's free intervals at the end of the day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## lastMinutes Type

`object` ([LastMinutesFreeTimes](enginespecification-definitions-freetimes-properties-lastminutesfreetimes.md))

# lastMinutes Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                 |
| :------------------------------ | :-------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strictDays](#strictdays)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes-properties-strictdays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes/properties/strictDays")       |
| [preferredDays](#preferreddays) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes-properties-preferreddays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes/properties/preferredDays") |
| [minutes](#minutes)             | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes/properties/minutes")             |

## strictDays

Strict number of days on which the teacher must have the interval free at the end of the day.

`strictDays`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes-properties-strictdays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes/properties/strictDays")

### strictDays Type

`integer`

## preferredDays

Preferred number of days on which the teacher should have the interval free at the end of the day. .

`preferredDays`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes-properties-preferreddays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes/properties/preferredDays")

### preferredDays Type

`integer`

## minutes

Minutes of free time at the end of the day.

`minutes`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes/properties/minutes")

### minutes Type

`integer`
