# TimetableGaps Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/timetableGaps
```

Contains options related to timetable-gaps weights.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## timetableGaps Type

`object` ([TimetableGaps](ghc-properties-ghcdata-properties-optimizationweights-properties-timetablegaps.md))

# TimetableGaps Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                 |
| :-------------------------- | --------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [groupGaps](#groupgaps)     | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-timetablegaps-properties-groupgaps.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/timetableGaps/properties/groupGaps")     |
| [teacherGaps](#teachergaps) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-timetablegaps-properties-teachergaps.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/timetableGaps/properties/teacherGaps") |

## groupGaps

Indicates the weight that is assigned to the fact of leaving gaps in the group timetables.


`groupGaps`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-timetablegaps-properties-groupgaps.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/timetableGaps/properties/groupGaps")

### groupGaps Type

`integer`

### groupGaps Default Value

The default value is:

```json
5
```

## teacherGaps

Indicates the weight that is assigned to the fact of leaving gaps in the teacher timetables.


`teacherGaps`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-timetablegaps-properties-teachergaps.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/timetableGaps/properties/teacherGaps")

### teacherGaps Type

`integer`

### teacherGaps Default Value

The default value is:

```json
2
```
