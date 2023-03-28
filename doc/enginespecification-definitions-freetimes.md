# FreeTimes Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes
```

It contains the free time spaces that the teacher must have.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## freeTimes Type

`object` ([FreeTimes](enginespecification-definitions-freetimes.md))

# freeTimes Properties

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                             |
| :---------------------------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [fullDay](#fullday)                       | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-fulldaysfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/fullDay")                      |
| [firstMinutes](#firstminutes)             | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-firstminutesfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/firstMinutes")             |
| [lastMinutes](#lastminutes)               | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes")               |
| [consecutiveAnyTime](#consecutiveanytime) | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime") |

## fullDay

Teacher's full days of free time.

`fullDay`

*   is optional

*   Type: `object` ([FullDaysFreeTimes](enginespecification-definitions-freetimes-properties-fulldaysfreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-fulldaysfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/fullDay")

### fullDay Type

`object` ([FullDaysFreeTimes](enginespecification-definitions-freetimes-properties-fulldaysfreetimes.md))

## firstMinutes

Teacher's free intervals at the beginning of the day.

`firstMinutes`

*   is optional

*   Type: `object` ([FirstMinutesFreeTimes](enginespecification-definitions-freetimes-properties-firstminutesfreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-firstminutesfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/firstMinutes")

### firstMinutes Type

`object` ([FirstMinutesFreeTimes](enginespecification-definitions-freetimes-properties-firstminutesfreetimes.md))

## lastMinutes

Teacher's free intervals at the end of the day.

`lastMinutes`

*   is optional

*   Type: `object` ([LastMinutesFreeTimes](enginespecification-definitions-freetimes-properties-lastminutesfreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes")

### lastMinutes Type

`object` ([LastMinutesFreeTimes](enginespecification-definitions-freetimes-properties-lastminutesfreetimes.md))

## consecutiveAnyTime

Teacher's free intervals at any time of the day.

`consecutiveAnyTime`

*   is optional

*   Type: `object` ([ConsecutiveAnyTimeFreeTimes](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime")

### consecutiveAnyTime Type

`object` ([ConsecutiveAnyTimeFreeTimes](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes.md))
