# Meeting Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/meetings/items
```

Sevice of meeting between teachers.

> It is incompatible set at same time refClassRoomToAssign and refBuilding.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Meeting](ghc-properties-ghcdata-properties-meetings-meeting.md))

# items Properties

| Property                                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                       |
| :-------------------------------------------- | :------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                     | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/id")                   |
| [refFrame](#refframe)                         | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refFrame")       |
| [refTask](#reftask)                           | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-reftask.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refTask")         |
| [refTeachers](#refteachers)                   | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-refteachers.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refTeachers") |
| [distribution](#distribution)                 | `object` | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-distribution.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/distribution")                                             |
| [frameTemplate](#frametemplate)               | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-sessionframetemplate.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/frameTemplate")                                    |
| [refClassRoomToAssign](#refclassroomtoassign) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-refclassroomtoassign.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refClassRoomToAssign")                             |
| [refBuilding](#refbuilding)                   | `string` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refBuilding") |
| [settings](#settings)                         | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-nonclasssessionsettings.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/settings")                                      |

## id

Session identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/id")

### id Type

`string`

## refFrame

Session's frame identifier.

`refFrame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refFrame")

### refFrame Type

`string`

## refTask

Task identifier.

`refTask`

*   is required

*   Type: `string` ([RefTask](ghc-properties-ghcdata-properties-meetings-meeting-properties-reftask.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-reftask.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refTask")

### refTask Type

`string` ([RefTask](ghc-properties-ghcdata-properties-meetings-meeting-properties-reftask.md))

## refTeachers

List of teachers who in the service.

`refTeachers`

*   is required

*   Type: `string[]` ([RefTeacher](ghc-properties-ghcdata-properties-meetings-meeting-properties-refteachers-refteacher.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-refteachers.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refTeachers")

### refTeachers Type

`string[]` ([RefTeacher](ghc-properties-ghcdata-properties-meetings-meeting-properties-refteachers-refteacher.md))

## distribution

It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

> The 'periods' property is required if there is more than one period in the timetable. The 'stablePeriods' and 'variablePeriods' properties are mutually exclusive.

`distribution`

*   is required

*   Type: `object` ([Distribution](ghc-definitions-distribution.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-distribution.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/distribution")

### distribution Type

`object` ([Distribution](ghc-definitions-distribution.md))

## frameTemplate

Complete template of preferences.

> It have non-preferred sections.

`frameTemplate`

*   is optional

*   Type: `object[]` ([SessionSectionPreference](ghc-definitions-sessionframetemplate-sessionsectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-sessionframetemplate.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SessionSectionPreference](ghc-definitions-sessionframetemplate-sessionsectionpreference.md))

## refClassRoomToAssign

Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

`refClassRoomToAssign`

*   is optional

*   Type: `object` ([RefClassRoomToAssign](ghc-definitions-refclassroomtoassign.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-refclassroomtoassign.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refClassRoomToAssign")

### refClassRoomToAssign Type

`object` ([RefClassRoomToAssign](ghc-definitions-refclassroomtoassign.md))

## refBuilding

Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.

> It is incompatible with the other properties of 'sessionClassRooms' object.

`refBuilding`

*   is optional

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-meetings-meeting-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/refBuilding")

### refBuilding Type

`string`

## settings

Settings of the meeting.

`settings`

*   is optional

*   Type: `object` ([NonClassSessionSettings](ghc-definitions-nonclasssessionsettings.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-nonclasssessionsettings.md "engineInputGHCSchema#/properties/ghcData/properties/meetings/items/properties/settings")

### settings Type

`object` ([NonClassSessionSettings](ghc-definitions-nonclasssessionsettings.md))
