# Session Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Session](enginespecification-properties-sessions-session.md))

# items Properties

| Property                                                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                |
| :------------------------------------------------------ | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                               | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/id")                                                   |
| [refFrame](#refframe)                                   | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refFrame")                                       |
| [refMainTask](#refmaintask)                             | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-refmaintask.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refMainTask")                                 |
| [refMainTeacher](#refmainteacher)                       | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-refmainteacher.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refMainTeacher")                           |
| [refMainSubject](#refmainsubject)                       | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-refmainsubject.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refMainSubject")                           |
| [refMainGroup](#refmaingroup)                           | `object`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-groupreferencetype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refMainGroup")                                                    |
| [otherElementsInClassRooms](#otherelementsinclassrooms) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms") |
| [distribution](#distribution)                           | `object`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/distribution")                                                          |
| [sessionClassRooms](#sessionclassrooms)                 | `object`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionclassrooms.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionClassRooms")                     |
| [frameTemplate](#frametemplate)                         | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/frameTemplate")                                                 |
| [sessionSettings](#sessionsettings)                     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionsettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionSettings")                         |
| [sessionRelations](#sessionrelations)                   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations")                       |

## id

Session identifier.

`id`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/id")

### id Type

`integer`

## refFrame

Session's frame identifier.

`refFrame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refFrame")

### refFrame Type

`string`

## refMainTask

Main Task identifier.

`refMainTask`

*   is required

*   Type: `string` ([RefMainTask](enginespecification-properties-sessions-session-properties-refmaintask.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-refmaintask.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refMainTask")

### refMainTask Type

`string` ([RefMainTask](enginespecification-properties-sessions-session-properties-refmaintask.md))

## refMainTeacher

Main Teacher identifier.

`refMainTeacher`

*   is required

*   Type: `string` ([RefMainTeacher](enginespecification-properties-sessions-session-properties-refmainteacher.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-refmainteacher.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refMainTeacher")

### refMainTeacher Type

`string` ([RefMainTeacher](enginespecification-properties-sessions-session-properties-refmainteacher.md))

## refMainSubject

Identifier name of the main subject.

`refMainSubject`

*   is required

*   Type: `string` ([RefMainSubject](enginespecification-properties-sessions-session-properties-refmainsubject.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-refmainsubject.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refMainSubject")

### refMainSubject Type

`string` ([RefMainSubject](enginespecification-properties-sessions-session-properties-refmainsubject.md))

## refMainGroup

Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

`refMainGroup`

*   is required

*   Type: `object` ([GroupReferenceType](enginespecification-definitions-groupreferencetype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-groupreferencetype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/refMainGroup")

### refMainGroup Type

`object` ([GroupReferenceType](enginespecification-definitions-groupreferencetype.md))

## otherElementsInClassRooms

List of other time elements in the classroom related to each other.

`otherElementsInClassRooms`

*   is optional

*   Type: `object[]` ([OtherElementsInClassRooms](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms")

### otherElementsInClassRooms Type

`object[]` ([OtherElementsInClassRooms](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms.md))

## distribution

It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

> The 'periods' property is required if there is more than one period in the timetable. The 'stablePeriods' and 'variablePeriods' properties are mutually exclusive.

`distribution`

*   is required

*   Type: `object` ([Distribution](enginespecification-definitions-distribution.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/distribution")

### distribution Type

`object` ([Distribution](enginespecification-definitions-distribution.md))

## sessionClassRooms

It contains the information about the classrooms for the class units. At least one classroom is required for the class units.

`sessionClassRooms`

*   is required

*   Type: `object` ([SessionClassRooms](enginespecification-properties-sessions-session-properties-sessionclassrooms.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionclassrooms.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionClassRooms")

### sessionClassRooms Type

`object` ([SessionClassRooms](enginespecification-properties-sessions-session-properties-sessionclassrooms.md))

## frameTemplate

Complete template of preferences.

> It have non-preferred sections.

`frameTemplate`

*   is optional

*   Type: `object[]` ([SessionSectionPreference](enginespecification-definitions-sessionframetemplate-sessionsectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SessionSectionPreference](enginespecification-definitions-sessionframetemplate-sessionsectionpreference.md))

## sessionSettings

Conditions on the position of the class unit.

`sessionSettings`

*   is optional

*   Type: `object` ([SessionSettings](enginespecification-properties-sessions-session-properties-sessionsettings.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionsettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionSettings")

### sessionSettings Type

`object` ([SessionSettings](enginespecification-properties-sessions-session-properties-sessionsettings.md))

## sessionRelations

It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.

`sessionRelations`

*   is optional

*   Type: `object` ([SessionRelations](enginespecification-properties-sessions-session-properties-sessionrelations.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations")

### sessionRelations Type

`object` ([SessionRelations](enginespecification-properties-sessions-session-properties-sessionrelations.md))
