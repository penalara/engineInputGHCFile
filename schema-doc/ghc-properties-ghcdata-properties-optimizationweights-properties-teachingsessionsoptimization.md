# TeachingSessionsOptimization Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions
```

Contains options related to optimizable conditions for teaching sessions with students.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## teachingSessions Type

`object` ([TeachingSessionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization.md))

# TeachingSessionsOptimization Properties

| Property                                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                     |
| :------------------------------------------------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [consecutiveDays](#consecutivedays)                           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-consecutivedays.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/consecutiveDays")                           |
| [bordersTimetable](#borderstimetable)                         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-borderstimetable.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/bordersTimetable")                         |
| [afternoonOrAfterBreakClasses](#afternoonorafterbreakclasses) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-afternoonorafterbreakclasses.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/afternoonOrAfterBreakClasses") |
| [sameHourSessionClasses](#samehoursessionclasses)             | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-samehoursessionclasses.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/sameHourSessionClasses")             |
| [classRoomsChanges](#classroomschanges)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-classroomschanges.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/classRoomsChanges")                       |

## consecutiveDays

 Indicates the weight of the condition which it has been established in each case on the properties of each session, to be placed two or three class units, that is, all of them on consecutive days.


`consecutiveDays`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-consecutivedays.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/consecutiveDays")

### consecutiveDays Type

`integer`

### consecutiveDays Default Value

The default value is:

```json
3
```

## bordersTimetable

Indicates the weight of have assigned classes at the borders of the timetable.


`bordersTimetable`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-borderstimetable.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/bordersTimetable")

### bordersTimetable Type

`integer`

### bordersTimetable Default Value

The default value is:

```json
2
```

## afternoonOrAfterBreakClasses

Indicates the weight of penalization of have classes after the last break or in the afternoon.


`afternoonOrAfterBreakClasses`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-afternoonorafterbreakclasses.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/afternoonOrAfterBreakClasses")

### afternoonOrAfterBreakClasses Type

`integer`

### afternoonOrAfterBreakClasses Default Value

The default value is:

```json
3
```

## sameHourSessionClasses

Indicates the weight of penalization of not fulfilling the preferred about assignment on consecutive days.


`sameHourSessionClasses`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-samehoursessionclasses.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/sameHourSessionClasses")

### sameHourSessionClasses Type

`integer`

### sameHourSessionClasses Default Value

The default value is:

```json
3
```

## classRoomsChanges

 Indicates the weight of all class units of each subject is not taught in the same classroom, and also to avoid changes in the classroom of groups. It means a change of classroom of a group only between consecutive intervals, not the ones divided by a break.


`classRoomsChanges`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-teachingsessionsoptimization-properties-classroomschanges.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/teachingSessions/properties/classRoomsChanges")

### classRoomsChanges Type

`integer`

### classRoomsChanges Default Value

The default value is:

```json
3
```
