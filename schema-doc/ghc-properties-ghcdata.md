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
| [relationsList](#relationslist)             | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList")             |
| [onCallServices](#oncallservices)           | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices")           |
| [optimizationWeights](#optimizationweights) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights") |
| [engineSettings](#enginesettings)           | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-enginesettings.md "engineInputGHCSchema#/properties/ghcData/properties/engineSettings")           |

## periods

Weeks or periods with different assignments which contains the timetable.


> If there is not periods defined the engine will created unique period with all days of the timetable.
>

`periods`

-   is optional
-   Type: `object` ([Periods](ghc-properties-ghcdata-properties-periods.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods.md "engineInputGHCSchema#/properties/ghcData/properties/periods")

### periods Type

`object` ([Periods](ghc-properties-ghcdata-properties-periods.md))

## frames

Tables of Timetable which it contains sections where subject sessions are located.


`frames`

-   is required
-   Type: `object[]` ([Frame](ghc-properties-ghcdata-properties-frames-frame.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames.md "engineInputGHCSchema#/properties/ghcData/properties/frames")

### frames Type

`object[]` ([Frame](ghc-properties-ghcdata-properties-frames-frame.md))

## buildings

Contains the buildings of the school or education centre.


`buildings`

-   is required
-   Type: `object[]` ([Building](ghc-properties-ghcdata-properties-buildings-building.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings.md "engineInputGHCSchema#/properties/ghcData/properties/buildings")

### buildings Type

`object[]` ([Building](ghc-properties-ghcdata-properties-buildings-building.md))

## classRooms

Contains the rooms to put on the sessions.


`classRooms`

-   is required
-   Type: `object[]` ([Classroom](ghc-properties-ghcdata-properties-classrooms-classroom.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms")

### classRooms Type

`object[]` ([Classroom](ghc-properties-ghcdata-properties-classrooms-classroom.md))

## classRoomsSets

A divisions of classrooms, group by characteristics or organizational needs.


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

Teacher object with personal data, preferences template and settings.


`teachers`

-   is required
-   Type: `object[]` ([Teacher](ghc-properties-ghcdata-properties-teachers-teacher.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers")

### teachers Type

`object[]` ([Teacher](ghc-properties-ghcdata-properties-teachers-teacher.md))

## subjects

School subjects which are teach at sessions.


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

Teachers sessions. These can be with students groups, meetings with other teachers or complementary activities.


`sessions`

-   is required
-   Type: `object[]` ([Session](ghc-properties-ghcdata-properties-sessions-session.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions")

### sessions Type

`object[]` ([Session](ghc-properties-ghcdata-properties-sessions-session.md))

## relationsList

Contains relations list of simultaneous and consecutive sessions.


`relationsList`

-   is optional
-   Type: `object` ([RelationsList](ghc-properties-ghcdata-properties-relationslist.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList")

### relationsList Type

`object` ([RelationsList](ghc-properties-ghcdata-properties-relationslist.md))

## onCallServices

List of on call services of teachers defined in the timetable.


`onCallServices`

-   is optional
-   Type: `object[]` ([OnCallService](ghc-properties-ghcdata-properties-oncallservices-oncallservice.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices")

### onCallServices Type

`object[]` ([OnCallService](ghc-properties-ghcdata-properties-oncallservices-oncallservice.md))

## optimizationWeights

Indicates the weights that the ponderable options will have for engine optimization process. The engine will apply default values for elements that did not specify.


`optimizationWeights`

-   is optional
-   Type: `object` ([OptimizationWeights](ghc-properties-ghcdata-properties-optimizationweights.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights")

### optimizationWeights Type

`object` ([OptimizationWeights](ghc-properties-ghcdata-properties-optimizationweights.md))

## engineSettings

Custom parameters about engine configuration.


`engineSettings`

-   is optional
-   Type: `object` ([EngineSettings](ghc-properties-ghcdata-properties-enginesettings.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-enginesettings.md "engineInputGHCSchema#/properties/ghcData/properties/engineSettings")

### engineSettings Type

`object` ([EngineSettings](ghc-properties-ghcdata-properties-enginesettings.md))
