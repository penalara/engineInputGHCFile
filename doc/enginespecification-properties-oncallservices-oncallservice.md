# OnCallService Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items
```

On-call service of teachers who supervise the free time of students.

> Property 'refPeriods' is required if there are more than one period in the timetable.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([OnCallService](enginespecification-properties-oncallservices-oncallservice.md))

# items Properties

| Property                                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                  |
| :------------------------------------------ | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [id](#id)                                   | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/id")                                   |
| [refFrame](#refframe)                       | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refFrame")                       |
| [refPeriods](#refperiods)                   | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refPeriods")                   |
| [refTask](#reftask)                         | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-reftask.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTask")                         |
| [inBreak](#inbreak)                         | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-inbreak.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/inBreak")                         |
| [teachersEachSection](#teacherseachsection) | `object`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection") |
| [refTeachers](#refteachers)                 | `array`   | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refteachersoncall.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTeachers")           |
| [frameTemplate](#frametemplate)             | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/frameTemplate")                                                   |
| [refBuilding](#refbuilding)                 | `string`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refbuilding.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refBuilding")                 |
| [settings](#settings)                       | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/settings")                                               |

## id

On-Call service identifier.

> This identifier can not be equals to any session identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/id")

### id Type

`string`

## refFrame

Identifier of the frame where the service will be set.

`refFrame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refFrame")

### refFrame Type

`string`

## refPeriods

List of Periods when the service must be set.

`refPeriods`

*   is optional

*   Type: `string[]` ([RefPeriod](enginespecification-properties-oncallservices-oncallservice-properties-refperiods-refperiod.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refPeriods")

### refPeriods Type

`string[]` ([RefPeriod](enginespecification-properties-oncallservices-oncallservice-properties-refperiods-refperiod.md))

## refTask

Task identifier.

`refTask`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-reftask.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTask")

### refTask Type

`string`

## inBreak

It indicates whether it is a break supervision.

`inBreak`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-inbreak.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/inBreak")

### inBreak Type

`boolean`

## teachersEachSection

Information about number of teacher in all sections.

> The value 'byDefault' shall be used for all sections, if the field 'bySection' is not informed. This value is also used when a section is not informed in 'bySection'.

`teachersEachSection`

*   is required

*   Type: `object` ([TeachersEachSection](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection")

### teachersEachSection Type

`object` ([TeachersEachSection](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection.md))

## refTeachers

List of teachers who in the service.

`refTeachers`

*   is required

*   Type: `object[]` ([RefTeacher](enginespecification-properties-oncallservices-oncallservice-properties-refteachersoncall-refteacher.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refteachersoncall.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTeachers")

### refTeachers Type

`object[]` ([RefTeacher](enginespecification-properties-oncallservices-oncallservice-properties-refteachersoncall-refteacher.md))

## frameTemplate

Template with teacher's preferences in the on-call service.

`frameTemplate`

*   is optional

*   Type: `object[]` ([OnCallSectionPreference](enginespecification-definitions-oncalltemplate-oncallsectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([OnCallSectionPreference](enginespecification-definitions-oncalltemplate-oncallsectionpreference.md))

## refBuilding

Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.

`refBuilding`

*   is optional

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refbuilding.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refBuilding")

### refBuilding Type

`string`

## settings

Settings of the meeting.

`settings`

*   is optional

*   Type: `object` ([NonClassSessionSettings](enginespecification-definitions-nonclasssessionsettings.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/settings")

### settings Type

`object` ([NonClassSessionSettings](enginespecification-definitions-nonclasssessionsettings.md))
