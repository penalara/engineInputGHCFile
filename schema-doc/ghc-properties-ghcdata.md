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

| Property                          | Type     | Required | Nullable       | Defined by                                                                                                                                       |
| :-------------------------------- | -------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------- |
| [periods](#periods)               | `object` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods.md "engineInputGHCSchema#/properties/ghcData/properties/periods")               |
| [frames](#frames)                 | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames.md "engineInputGHCSchema#/properties/ghcData/properties/frames")                 |
| [buildings](#buildings)           | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings.md "engineInputGHCSchema#/properties/ghcData/properties/buildings")           |
| [classRooms](#classrooms)         | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms")          |
| [classRoomsSets](#classroomssets) | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroomssets.md "engineInputGHCSchema#/properties/ghcData/properties/classRoomsSets") |
| [tasks](#tasks)                   | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks.md "engineInputGHCSchema#/properties/ghcData/properties/tasks")                   |
| [teachers](#teachers)             | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers")             |
| [subjects](#subjects)             | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects.md "engineInputGHCSchema#/properties/ghcData/properties/subjects")             |
| [groups](#groups)                 | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups.md "engineInputGHCSchema#/properties/ghcData/properties/groups")                 |
| [sessions](#sessions)             | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions")             |

## periods

Weeks or periods with different assignments which contains the timetable.


`periods`

-   is required
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
-   Type: `object[]` ([Classrom](ghc-properties-ghcdata-properties-classroms-classrom.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms")

### classRooms Type

`object[]` ([Classrom](ghc-properties-ghcdata-properties-classroms-classrom.md))

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
-   Type: `object` ([Tasks](ghc-properties-ghcdata-properties-tasks.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks.md "engineInputGHCSchema#/properties/ghcData/properties/tasks")

### tasks Type

`object` ([Tasks](ghc-properties-ghcdata-properties-tasks.md))

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