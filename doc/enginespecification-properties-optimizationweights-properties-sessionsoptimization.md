# SessionsOptimization Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions
```

It contains options related to optimisable conditions for sessions.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## sessions Type

`object` ([SessionsOptimization](enginespecification-properties-optimizationweights-properties-sessionsoptimization.md))

# sessions Properties

| Property                                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                              |
| :------------------------------------------------------------ | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [nonPreferredClassRoom](#nonpreferredclassroom)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-nonpreferredclassroom.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/nonPreferredClassRoom")               |
| [samePositionEveryPeriod](#samepositioneveryperiod)           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-samepositioneveryperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/samePositionEveryPeriod")           |
| [consecutiveDays](#consecutivedays)                           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-consecutivedays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/consecutiveDays")                           |
| [bordersTimetable](#borderstimetable)                         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-borderstimetable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/bordersTimetable")                         |
| [afternoonOrAfterBreakClasses](#afternoonorafterbreakclasses) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-afternoonorafterbreakclasses.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/afternoonOrAfterBreakClasses") |
| [sameHourSessionClasses](#samehoursessionclasses)             | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-samehoursessionclasses.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/sameHourSessionClasses")             |
| [classRoomsChanges](#classroomschanges)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-classroomschanges.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/classRoomsChanges")                       |

## nonPreferredClassRoom

It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.

`nonPreferredClassRoom`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-nonpreferredclassroom.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/nonPreferredClassRoom")

### nonPreferredClassRoom Type

`integer`

### nonPreferredClassRoom Default Value

The default value is:

```json
3
```

## samePositionEveryPeriod

It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).

`samePositionEveryPeriod`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-samepositioneveryperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/samePositionEveryPeriod")

### samePositionEveryPeriod Type

`integer`

### samePositionEveryPeriod Default Value

The default value is:

```json
1
```

## consecutiveDays

It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.

`consecutiveDays`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-consecutivedays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/consecutiveDays")

### consecutiveDays Type

`integer`

### consecutiveDays Default Value

The default value is:

```json
3
```

## bordersTimetable

It indicates the weight of the class units assigned at the ends of the timetable.

`bordersTimetable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-borderstimetable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/bordersTimetable")

### bordersTimetable Type

`integer`

### bordersTimetable Default Value

The default value is:

```json
2
```

## afternoonOrAfterBreakClasses

It indicates the weight of the penalty of having class units after the last break or in the afternoon.

`afternoonOrAfterBreakClasses`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-afternoonorafterbreakclasses.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/afternoonOrAfterBreakClasses")

### afternoonOrAfterBreakClasses Type

`integer`

### afternoonOrAfterBreakClasses Default Value

The default value is:

```json
3
```

## sameHourSessionClasses

It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.

`sameHourSessionClasses`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-samehoursessionclasses.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/sameHourSessionClasses")

### sameHourSessionClasses Type

`integer`

### sameHourSessionClasses Default Value

The default value is:

```json
3
```

## classRoomsChanges

It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break.

`classRoomsChanges`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights-properties-sessionsoptimization-properties-classroomschanges.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights/properties/sessions/properties/classRoomsChanges")

### classRoomsChanges Type

`integer`

### classRoomsChanges Default Value

The default value is:

```json
3
```
