# TeachersOptimization Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers
```

Contains options related to optimizable conditions for teachers.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## teachers Type

`object` ([TeachersOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization.md))

# TeachersOptimization Properties

| Property                                                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                   |
| :---------------------------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [teacherIncompatibities](#teacherincompatibities)           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-teacherincompatibities.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/teacherIncompatibities")           |
| [uniformDailyDistribution](#uniformdailydistribution)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-uniformdailydistribution.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/uniformDailyDistribution")       |
| [excessContinuousTeaching](#excesscontinuousteaching)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-excesscontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/excessContinuousTeaching")       |
| [excessPermanence](#excesspermanence)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-excesspermanence.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/excessPermanence")                       |
| [continuousSessionsWithGroup](#continuoussessionswithgroup) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-continuoussessionswithgroup.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/continuousSessionsWithGroup") |
| [onCallSectionsOnBorders](#oncallsectionsonborders)         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-oncallsectionsonborders.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/onCallSectionsOnBorders")         |

## teacherIncompatibities

Indicates the weight for optimizable teacher's incompatibilities.


`teacherIncompatibities`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-teacherincompatibities.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/teacherIncompatibities")

### teacherIncompatibities Type

`integer`

### teacherIncompatibities Default Value

The default value is:

```json
3
```

## uniformDailyDistribution

Indicates the weight of placing the sessions of a teacher in a non-uniform way during the week.


`uniformDailyDistribution`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-uniformdailydistribution.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/uniformDailyDistribution")

### uniformDailyDistribution Type

`integer`

### uniformDailyDistribution Default Value

The default value is:

```json
3
```

## excessContinuousTeaching

Indicates the weight of placing more continuous sessions than declared in its settings.


`excessContinuousTeaching`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-excesscontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/excessContinuousTeaching")

### excessContinuousTeaching Type

`integer`

### excessContinuousTeaching Default Value

The default value is:

```json
2
```

## excessPermanence

Indicates the weight of assign more daily or weekly permanence than declared in its settings (contando los huecos entre sesiones).


`excessPermanence`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-excesspermanence.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/excessPermanence")

### excessPermanence Type

`integer`

### excessPermanence Default Value

The default value is:

```json
2
```

## continuousSessionsWithGroup

Indicates the weight of having consecutive sessions taught to the same group.


`continuousSessionsWithGroup`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-continuoussessionswithgroup.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/continuousSessionsWithGroup")

### continuousSessionsWithGroup Type

`integer`

### continuousSessionsWithGroup Default Value

The default value is:

```json
1
```

## onCallSectionsOnBorders

Indicates the weight of the teacher got assigned a on call service at the borders of his schedule, thus trying to fit them into the gaps of his class sessions.


`onCallSectionsOnBorders`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-oncallsectionsonborders.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/onCallSectionsOnBorders")

### onCallSectionsOnBorders Type

`integer`

### onCallSectionsOnBorders Default Value

The default value is:

```json
1
```
