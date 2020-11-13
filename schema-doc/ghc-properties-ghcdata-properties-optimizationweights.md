# OptimizationWeights Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights
```

Indicates the weights that the ponderable options will have for engine optimization process. The engine will apply default values for elements that did not specify.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## optimizationWeights Type

`object` ([OptimizationWeights](ghc-properties-ghcdata-properties-optimizationweights.md))

# OptimizationWeights Properties

| Property                                        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                               |
| :---------------------------------------------- | -------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [timetableGaps](#timetablegaps)                 | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-timetablegaps.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/timetableGaps")                             |
| [nonPreferredPositions](#nonpreferredpositions) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions") |
| [sessions](#sessions)                           | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions")                           |
| [teachingSessions](#teachingsessions)           | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions")           |
| [teachers](#teachers)                           | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers")                           |

## timetableGaps

Contains options related to timetable-gaps weights.


`timetableGaps`

-   is optional
-   Type: `object` ([TimetableGaps](ghc-properties-ghcdata-properties-optimizationweights-properties-timetablegaps.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-timetablegaps.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/timetableGaps")

### timetableGaps Type

`object` ([TimetableGaps](ghc-properties-ghcdata-properties-optimizationweights-properties-timetablegaps.md))

## nonPreferredPositions

Contains options related to allocation in non-preferred sections.


`nonPreferredPositions`

-   is optional
-   Type: `object` ([NonPreferredPositionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/nonPreferredPositions")

### nonPreferredPositions Type

`object` ([NonPreferredPositionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-nonpreferredpositionsoptimization.md))

## sessions

Contains options related to optimizable conditions for all sessions.


`sessions`

-   is optional
-   Type: `object` ([SessionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions")

### sessions Type

`object` ([SessionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization.md))

## teachingSessions

Contains options related to optimizable conditions for teaching sessions with students.


`teachingSessions`

-   is optional
-   Type: `object` ([TeachingSessionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions")

### teachingSessions Type

`object` ([TeachingSessionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization.md))

## teachers

Contains options related to optimizable conditions for teachers.


`teachers`

-   is optional
-   Type: `object` ([TeachersOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers")

### teachers Type

`object` ([TeachersOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization.md))
