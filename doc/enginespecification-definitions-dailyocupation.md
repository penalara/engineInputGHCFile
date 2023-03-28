# DailyOcupation Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation
```

Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## dailyOcupation Type

`object` ([DailyOcupation](enginespecification-definitions-dailyocupation.md))

# dailyOcupation Properties

| Property                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                          |
| :------------------------------------ | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [allowFreeDays](#allowfreedays)       | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-allowfreedays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/allowFreeDays")       |
| [minimumTeaching](#minimumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-minimumteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/minimumTeaching")   |
| [maximumTeaching](#maximumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumTeaching")   |
| [minimumOccupancy](#minimumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-minimumoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/minimumOccupancy") |
| [maximumOccupancy](#maximumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumOccupancy") |

## allowFreeDays

It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.

`allowFreeDays`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-allowfreedays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/allowFreeDays")

### allowFreeDays Type

`boolean`

## minimumTeaching

Minimum teaching time of the teacher with students.

`minimumTeaching`

*   is optional

*   Type: `object` ([MinimumTeaching](enginespecification-definitions-dailyocupation-properties-minimumteaching.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-minimumteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/minimumTeaching")

### minimumTeaching Type

`object` ([MinimumTeaching](enginespecification-definitions-dailyocupation-properties-minimumteaching.md))

## maximumTeaching

Minimum teaching time of the teacher with students.

`maximumTeaching`

*   is optional

*   Type: `object` ([MaximumTeaching](enginespecification-definitions-dailyocupation-properties-maximumteaching.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumTeaching")

### maximumTeaching Type

`object` ([MaximumTeaching](enginespecification-definitions-dailyocupation-properties-maximumteaching.md))

## minimumOccupancy

Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

`minimumOccupancy`

*   is optional

*   Type: `object` ([MinimumOccupancy](enginespecification-definitions-dailyocupation-properties-minimumoccupancy.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-minimumoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/minimumOccupancy")

### minimumOccupancy Type

`object` ([MinimumOccupancy](enginespecification-definitions-dailyocupation-properties-minimumoccupancy.md))

## maximumOccupancy

Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

`maximumOccupancy`

*   is optional

*   Type: `object` ([MaximumOccupancy](enginespecification-definitions-dailyocupation-properties-maximumoccupancy.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumOccupancy")

### maximumOccupancy Type

`object` ([MaximumOccupancy](enginespecification-definitions-dailyocupation-properties-maximumoccupancy.md))
