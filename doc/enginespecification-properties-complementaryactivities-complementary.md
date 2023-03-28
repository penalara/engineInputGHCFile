# Complementary Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items
```

Service of teacher\`s complementary activity.

> It is incompatible set at same time refClassRoomToAssign and refBuilding.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Complementary](enginespecification-properties-complementaryactivities-complementary.md))

# items Properties

| Property                                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                    |
| :-------------------------------------------- | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                     | `string` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/id")                   |
| [refFrame](#refframe)                         | `string` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refFrame")       |
| [refTask](#reftask)                           | `string` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-reftask.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refTask")         |
| [refTeacher](#refteacher)                     | `string` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-refteacher.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refTeacher")   |
| [distribution](#distribution)                 | `object` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/distribution")                                               |
| [frameTemplate](#frametemplate)               | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/frameTemplate")                                      |
| [refClassRoomToAssign](#refclassroomtoassign) | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refClassRoomToAssign")                               |
| [refBuilding](#refbuilding)                   | `string` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-refbuilding.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refBuilding") |
| [settings](#settings)                         | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/settings")                                        |

## id

Session identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/id")

### id Type

`string`

## refFrame

Session's frame identifier.

`refFrame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refFrame")

### refFrame Type

`string`

## refTask

Task identifier.

`refTask`

*   is required

*   Type: `string` ([RefTask](enginespecification-properties-complementaryactivities-complementary-properties-reftask.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-reftask.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refTask")

### refTask Type

`string` ([RefTask](enginespecification-properties-complementaryactivities-complementary-properties-reftask.md))

## refTeacher

Teacher identifier.

`refTeacher`

*   is required

*   Type: `string` ([RefTeacher](enginespecification-properties-complementaryactivities-complementary-properties-refteacher.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-refteacher.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refTeacher")

### refTeacher Type

`string` ([RefTeacher](enginespecification-properties-complementaryactivities-complementary-properties-refteacher.md))

## distribution

It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

> The 'periods' property is required if there is more than one period in the timetable. The 'stablePeriods' and 'variablePeriods' properties are mutually exclusive.

`distribution`

*   is required

*   Type: `object` ([Distribution](enginespecification-definitions-distribution.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/distribution")

### distribution Type

`object` ([Distribution](enginespecification-definitions-distribution.md))

## frameTemplate

Complete template of preferences.

> It have non-preferred sections.

`frameTemplate`

*   is optional

*   Type: `object[]` ([SessionSectionPreference](enginespecification-definitions-sessionframetemplate-sessionsectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SessionSectionPreference](enginespecification-definitions-sessionframetemplate-sessionsectionpreference.md))

## refClassRoomToAssign

Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

`refClassRoomToAssign`

*   is optional

*   Type: `object` ([RefClassRoomToAssign](enginespecification-definitions-refclassroomtoassign.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refClassRoomToAssign")

### refClassRoomToAssign Type

`object` ([RefClassRoomToAssign](enginespecification-definitions-refclassroomtoassign.md))

## refBuilding

Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.

> It is incompatible with the other properties of 'sessionClassRooms' object.

`refBuilding`

*   is optional

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-complementaryactivities-complementary-properties-refbuilding.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/refBuilding")

### refBuilding Type

`string`

## settings

Settings of the meeting.

`settings`

*   is optional

*   Type: `object` ([NonClassSessionSettings](enginespecification-definitions-nonclasssessionsettings.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities/items/properties/settings")

### settings Type

`object` ([NonClassSessionSettings](enginespecification-definitions-nonclasssessionsettings.md))
