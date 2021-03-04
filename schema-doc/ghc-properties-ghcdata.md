# GhcData Schema

```txt
engineInputGHCSchema#/properties/ghcData
```

Schema of the object that contains the timetable planning data.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## ghcData Type

`object` ([GhcData](ghc-properties-ghcdata.md))

# GhcData Properties

| Property                                    | Type     | Required | Nullable       | Defined by                                                                                                                                                 |
| :------------------------------------------ | -------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [periods](#periods)                         | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods.md "engineInputGHCSchema#/properties/ghcData/properties/periods")                         |
| [frames](#frames)                           | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames.md "engineInputGHCSchema#/properties/ghcData/properties/frames")                           |
| [buildings](#buildings)                     | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings.md "engineInputGHCSchema#/properties/ghcData/properties/buildings")                     |
| [classRooms](#classrooms)                   | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms")                   |
| [classRoomsSets](#classroomssets)           | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroomssets.md "engineInputGHCSchema#/properties/ghcData/properties/classRoomsSets")           |
| [tasks](#tasks)                             | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks.md "engineInputGHCSchema#/properties/ghcData/properties/tasks")                             |
| [teachers](#teachers)                       | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers")                       |
| [subjects](#subjects)                       | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects.md "engineInputGHCSchema#/properties/ghcData/properties/subjects")                       |
| [groups](#groups)                           | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups.md "engineInputGHCSchema#/properties/ghcData/properties/groups")                           |
| [sessions](#sessions)                       | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions")                       |
| [onCallServices](#oncallservices)           | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices")           |
| [optimizationWeights](#optimizationweights) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights") |
| [engineSettings](#enginesettings)           | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-enginesettings.md "engineInputGHCSchema#/properties/ghcData/properties/engineSettings")           |

## periods

Weeks or periods with different assignments which contains the timetable.


> If there are no defined periods, the engine will create a single period with all the days of the timetable.
>

`periods`

-   is optional
-   Type: `object` ([Periods](ghc-properties-ghcdata-properties-periods.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods.md "engineInputGHCSchema#/properties/ghcData/properties/periods")

### periods Type

`object` ([Periods](ghc-properties-ghcdata-properties-periods.md))

## frames

Tables of the timetable that contain sections where the class units are located.


`frames`

-   is required
-   Type: `object[]` ([Frame](ghc-properties-ghcdata-properties-frames-frame.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames.md "engineInputGHCSchema#/properties/ghcData/properties/frames")

### frames Type

`object[]` ([Frame](ghc-properties-ghcdata-properties-frames-frame.md))

## buildings

It contains the school or educational institution buildings.


`buildings`

-   is required
-   Type: `object[]` ([Building](ghc-properties-ghcdata-properties-buildings-building.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings.md "engineInputGHCSchema#/properties/ghcData/properties/buildings")

### buildings Type

`object[]` ([Building](ghc-properties-ghcdata-properties-buildings-building.md))

## classRooms

It contains the classrooms to organize the class units.


`classRooms`

-   is required
-   Type: `object[]` ([Classroom](ghc-properties-ghcdata-properties-classrooms-classroom.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms")

### classRooms Type

`object[]` ([Classroom](ghc-properties-ghcdata-properties-classrooms-classroom.md))

## classRoomsSets

A division of the classrooms, grouped by organizational characteristics or needs.


`classRoomsSets`

-   is optional
-   Type: `object[]` ([ClassRoomSet](ghc-properties-ghcdata-properties-classroomssets-classroomset.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroomssets.md "engineInputGHCSchema#/properties/ghcData/properties/classRoomsSets")

### classRoomsSets Type

`object[]` ([ClassRoomSet](ghc-properties-ghcdata-properties-classroomssets-classroomset.md))

## tasks

Types of tasks or activities for the teachers.


`tasks`

-   is optional
-   Type: `object[]` ([Task](ghc-properties-ghcdata-properties-tasks-task.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks.md "engineInputGHCSchema#/properties/ghcData/properties/tasks")

### tasks Type

`object[]` ([Task](ghc-properties-ghcdata-properties-tasks-task.md))

## teachers

Teachers list of the timetable.


`teachers`

-   is required
-   Type: `object[]` ([Teacher](ghc-properties-ghcdata-properties-teachers-teacher.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers")

### teachers Type

`object[]` ([Teacher](ghc-properties-ghcdata-properties-teachers-teacher.md))

## subjects

School subjects taught in the class units.


`subjects`

-   is required
-   Type: `object[]` ([Subject](ghc-properties-ghcdata-properties-subjects-subject.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects.md "engineInputGHCSchema#/properties/ghcData/properties/subjects")

### subjects Type

`object[]` ([Subject](ghc-properties-ghcdata-properties-subjects-subject.md))

## groups

Sets of students.


`groups`

-   is required
-   Type: `object[]` ([Group](ghc-properties-ghcdata-properties-groups-group.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups.md "engineInputGHCSchema#/properties/ghcData/properties/groups")

### groups Type

`object[]` ([Group](ghc-properties-ghcdata-properties-groups-group.md))

## sessions

Definition of the teacher class units. These may be with groups of students, meetings with other teachers or complementary activities.


`sessions`

-   is required
-   Type: `object[]` ([Session](ghc-properties-ghcdata-properties-sessions-session.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions")

### sessions Type

`object[]` ([Session](ghc-properties-ghcdata-properties-sessions-session.md))

## onCallServices

List of on-call services of teachers defined in the timetable.


`onCallServices`

-   is optional
-   Type: `object[]` ([OnCallService](ghc-properties-ghcdata-properties-oncallservices-oncallservice.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices")

### onCallServices Type

`object[]` ([OnCallService](ghc-properties-ghcdata-properties-oncallservices-oncallservice.md))

## optimizationWeights

This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.


`optimizationWeights`

-   is optional
-   Type: `object` ([OptimizationWeights](ghc-properties-ghcdata-properties-optimizationweights.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights")

### optimizationWeights Type

`object` ([OptimizationWeights](ghc-properties-ghcdata-properties-optimizationweights.md))

## engineSettings

Customised engine configuration parameters.


`engineSettings`

-   is optional
-   Type: `object` ([EngineSettings](ghc-properties-ghcdata-properties-enginesettings.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-enginesettings.md "engineInputGHCSchema#/properties/ghcData/properties/engineSettings")

### engineSettings Type

`object` ([EngineSettings](ghc-properties-ghcdata-properties-enginesettings.md))
