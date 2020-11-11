# Session Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Session](ghc-properties-ghcdata-properties-sessions-session.md))

# Session Properties

| Property                                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                   |
| :-------------------------------------- | -------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                               | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/id")                               |
| [refFrame](#refframe)                   | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refFrame")                   |
| [refTasks](#reftasks)                   | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-reftasks.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refTasks")                   |
| [refTeachers](#refteachers)             | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refteachers.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refTeachers")             |
| [refSubjects](#refsubjects)             | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refsubjects.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refSubjects")             |
| [refGroups](#refgroups)                 | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups")                 |
| [distribution](#distribution)           | Merged   | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution")           |
| [sessionClassRooms](#sessionclassrooms) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms") |
| [frameTemplate](#frametemplate)         | Merged   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate")         |
| [sessionSettings](#sessionsettings)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings")     |
| [sessionRelations](#sessionrelations)   | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations")   |

## id

Identifier name of the session.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/id")

### id Type

`string`

## refFrame

Identifier name of the session's frame.


`refFrame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refFrame")

### refFrame Type

`string`

## refTasks

List of task in the session.


`refTasks`

-   is required
-   Type: `string[]` ([RefTasks](ghc-properties-ghcdata-properties-sessions-session-properties-reftasks-reftasks.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-reftasks.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refTasks")

### refTasks Type

`string[]` ([RefTasks](ghc-properties-ghcdata-properties-sessions-session-properties-reftasks-reftasks.md))

### refTasks Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## refTeachers

List of teachers who teach or interact in the session.


`refTeachers`

-   is required
-   Type: `string[]` ([RefTeacher](ghc-properties-ghcdata-properties-sessions-session-properties-refteachers-refteacher.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refteachers.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refTeachers")

### refTeachers Type

`string[]` ([RefTeacher](ghc-properties-ghcdata-properties-sessions-session-properties-refteachers-refteacher.md))

## refSubjects

List of subject's identifier which is teach at the session. At least one is required for teaching sessions with students groups.


`refSubjects`

-   is optional
-   Type: `string[]` ([RefSubject](ghc-properties-ghcdata-properties-sessions-session-properties-refsubjects-refsubject.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refsubjects.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refSubjects")

### refSubjects Type

`string[]` ([RefSubject](ghc-properties-ghcdata-properties-sessions-session-properties-refsubjects-refsubject.md))

## refGroups

List of group's identifier which is teach at the session. At least one is required for teaching sessions.


`refGroups`

-   is optional
-   Type: `object[]` ([RefGroup](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups")

### refGroups Type

`object[]` ([RefGroup](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup.md))

## distribution

Contains information on how the classes of the session are distributed throughout the week


`distribution`

-   is required
-   Type: `object` ([Distribution](ghc-properties-ghcdata-properties-sessions-session-properties-distribution.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution")

### distribution Type

`object` ([Distribution](ghc-properties-ghcdata-properties-sessions-session-properties-distribution.md))

one (and only one) of

-   [Untitled undefined type in EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0.md "check type definition")
-   [Untitled undefined type in EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-1.md "check type definition")

## sessionClassRooms

Contains the information about classrooms for the sessions. At least one classroom  is required for teaching sessions.


`sessionClassRooms`

-   is optional
-   Type: `object` ([SessionClassRooms](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms")

### sessionClassRooms Type

`object` ([SessionClassRooms](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms.md))

## frameTemplate




`frameTemplate`

-   is optional
-   Type: merged type ([Details](ghc-properties-ghcdata-properties-sessions-session-properties-frametemplate.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate")

### frameTemplate Type

merged type ([Details](ghc-properties-ghcdata-properties-sessions-session-properties-frametemplate.md))

all of

-   [FrameTemplate](ghc-definitions-frametemplate.md "check type definition")
-   [Untitled undefined type in EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-frametemplate-allof-1.md "check type definition")

## sessionSettings

Conditions about the position of the session units.


`sessionSettings`

-   is optional
-   Type: `object` ([SessionSettings](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings")

### sessionSettings Type

`object` ([SessionSettings](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings.md))

## sessionRelations




`sessionRelations`

-   is optional
-   Type: `object` ([SessionRelations](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations")

### sessionRelations Type

`object` ([SessionRelations](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations.md))
