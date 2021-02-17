# NonPreferredPositionsOptimization Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions
```

It contains options related to allocation in non-preferred sections.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## nonPreferredPositions Type

`object` ([NonPreferredPositionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization.md))

# NonPreferredPositionsOptimization Properties

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                         |
| :-------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [inGroups](#ingroups)                   | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization-properties-ingroups.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions/properties/inGroups")                   |
| [inTeachers](#inteachers)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization-properties-inteachers.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions/properties/inTeachers")               |
| [inSubjectsAndTask](#insubjectsandtask) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization-properties-insubjectsandtask.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions/properties/inSubjectsAndTask") |
| [inSessions](#insessions)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization-properties-insessions.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions/properties/inSessions")               |

## inGroups

It indicates the weight to be placed in a non-preferential section of a group.


`inGroups`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization-properties-ingroups.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions/properties/inGroups")

### inGroups Type

`integer`

### inGroups Default Value

The default value is:

```json
4
```

## inTeachers

It indicates the weight to be placed in a non-preferential section of a teacher.


`inTeachers`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization-properties-inteachers.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions/properties/inTeachers")

### inTeachers Type

`integer`

### inTeachers Default Value

The default value is:

```json
3
```

## inSubjectsAndTask

It indicates the weight to be placed in a non-preferential section of a subject or a task.


`inSubjectsAndTask`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization-properties-insubjectsandtask.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions/properties/inSubjectsAndTask")

### inSubjectsAndTask Type

`integer`

### inSubjectsAndTask Default Value

The default value is:

```json
1
```

## inSessions

Indicates the weight to be placed in a non-preferential section of a session.


`inSessions`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization-properties-insessions.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions/properties/inSessions")

### inSessions Type

`integer`

### inSessions Default Value

The default value is:

```json
2
```
