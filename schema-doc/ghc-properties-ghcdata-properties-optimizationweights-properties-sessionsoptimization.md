# SessionsOptimization Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions
```

Contains options related to optimizable conditions for sessions.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## sessions Type

`object` ([SessionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization.md))

# SessionsOptimization Properties

| Property                                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                     |
| :------------------------------------------------------------ | --------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [nonPreferredClassRoom](#nonpreferredclassroom)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-nonpreferredclassroom.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/nonPreferredClassRoom")               |
| [samePositionEveryPeriod](#samepositioneveryperiod)           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-samepositioneveryperiod.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/samePositionEveryPeriod")           |
| [consecutiveDays](#consecutivedays)                           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-consecutivedays.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/consecutiveDays")                           |
| [bordersTimetable](#borderstimetable)                         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-borderstimetable.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/bordersTimetable")                         |
| [afternoonOrAfterBreakClasses](#afternoonorafterbreakclasses) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-afternoonorafterbreakclasses.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/afternoonOrAfterBreakClasses") |
| [sameHourSessionClasses](#samehoursessionclasses)             | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-samehoursessionclasses.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/sameHourSessionClasses")             |
| [classRoomsChanges](#classroomschanges)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-classroomschanges.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/classRoomsChanges")                       |

## nonPreferredClassRoom

Indicates the weight of if class units are configured with a preferred classroom and with a group of alternative classrooms, it will be punished with the weight to be placed in one of the alternative classrooms.


`nonPreferredClassRoom`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-nonpreferredclassroom.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/nonPreferredClassRoom")

### nonPreferredClassRoom Type

`integer`

### nonPreferredClassRoom Default Value

The default value is:

```json
3
```

## samePositionEveryPeriod

Indicates the weight of placing the entities of a session that belongs to several periods in the same positions or not (it affects the on call services too).


`samePositionEveryPeriod`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-samepositioneveryperiod.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/samePositionEveryPeriod")

### samePositionEveryPeriod Type

`integer`

### samePositionEveryPeriod Default Value

The default value is:

```json
1
```

## consecutiveDays

 Indicates the weight of the condition which it has been established in each case on the properties of each session, to be placed two or three class units, that is, all of them on consecutive days.


`consecutiveDays`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-consecutivedays.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/consecutiveDays")

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
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-borderstimetable.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/bordersTimetable")

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
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-afternoonorafterbreakclasses.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/afternoonOrAfterBreakClasses")

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
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-samehoursessionclasses.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/sameHourSessionClasses")

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
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-classroomschanges.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/classRoomsChanges")

### classRoomsChanges Type

`integer`

### classRoomsChanges Default Value

The default value is:

```json
3
```
