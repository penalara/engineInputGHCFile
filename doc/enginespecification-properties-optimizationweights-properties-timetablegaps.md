# TimetableGaps Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/timetableGaps
```

It contains options related to timetable-gaps weights.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## timetableGaps Type

`object` ([TimetableGaps](enginespecification-properties-optimizationweights-properties-timetablegaps.md))

# timetableGaps Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                          |
| :-------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [groupGaps](#groupgaps)     | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-timetablegaps-properties-groupgaps.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/timetableGaps/properties/groupGaps")     |
| [teacherGaps](#teachergaps) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-timetablegaps-properties-teachergaps.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/timetableGaps/properties/teacherGaps") |

## groupGaps

It indicates the weight given to the fact of leaving gaps in groups' timetables.

`groupGaps`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-timetablegaps-properties-groupgaps.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/timetableGaps/properties/groupGaps")

### groupGaps Type

`integer`

### groupGaps Default Value

The default value is:

```json
5
```

## teacherGaps

It indicates the weight given to the fact of leaving gaps in teachers' timetables.

`teacherGaps`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-timetablegaps-properties-teachergaps.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/timetableGaps/properties/teacherGaps")

### teacherGaps Type

`integer`

### teacherGaps Default Value

The default value is:

```json
2
```
