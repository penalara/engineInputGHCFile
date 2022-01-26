# TeachersOptimization Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers
```

It contains options related to optimisable conditions for teachers.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## teachers Type

`object` ([TeachersOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization.md))

# teachers Properties

| Property                                                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                   |
| :---------------------------------------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [teacherIncompatibities](#teacherincompatibities)           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-teacherincompatibities.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/teacherIncompatibities")           |
| [uniformDailyDistribution](#uniformdailydistribution)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-uniformdailydistribution.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/uniformDailyDistribution")       |
| [excessContinuousTeaching](#excesscontinuousteaching)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-excesscontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/excessContinuousTeaching")       |
| [excessPermanence](#excesspermanence)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-excesspermanence.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/excessPermanence")                       |
| [continuousSessionsWithGroup](#continuoussessionswithgroup) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-continuoussessionswithgroup.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/continuousSessionsWithGroup") |
| [onCallSectionsOnBorders](#oncallsectionsonborders)         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-oncallsectionsonborders.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/onCallSectionsOnBorders")         |

## teacherIncompatibities

It indicates the weight of the teacher's incompatibilities that can be optimised.

`teacherIncompatibities`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-teacherincompatibities.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/teacherIncompatibities")

### teacherIncompatibities Type

`integer`

### teacherIncompatibities Default Value

The default value is:

```json
3
```

## uniformDailyDistribution

It indicates the weight of placing a teacher's class units in a non-uniform way during the week.

`uniformDailyDistribution`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-uniformdailydistribution.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/uniformDailyDistribution")

### uniformDailyDistribution Type

`integer`

### uniformDailyDistribution Default Value

The default value is:

```json
3
```

## excessContinuousTeaching

It indicates the weight of placing more continuous class units than those declared in the settings.

`excessContinuousTeaching`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-excesscontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/excessContinuousTeaching")

### excessContinuousTeaching Type

`integer`

### excessContinuousTeaching Default Value

The default value is:

```json
2
```

## excessPermanence

It indicates the weight of assigning more daily or weekly stay than the declared in the settings.

`excessPermanence`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-excesspermanence.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/excessPermanence")

### excessPermanence Type

`integer`

### excessPermanence Default Value

The default value is:

```json
2
```

## continuousSessionsWithGroup

It indicates the weight of having consecutive class units taught to the same group.

`continuousSessionsWithGroup`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-continuoussessionswithgroup.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/continuousSessionsWithGroup")

### continuousSessionsWithGroup Type

`integer`

### continuousSessionsWithGroup Default Value

The default value is:

```json
1
```

## onCallSectionsOnBorders

It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units.

`onCallSectionsOnBorders`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachersoptimization-properties-oncallsectionsonborders.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachers/properties/onCallSectionsOnBorders")

### onCallSectionsOnBorders Type

`integer`

### onCallSectionsOnBorders Default Value

The default value is:

```json
1
```
