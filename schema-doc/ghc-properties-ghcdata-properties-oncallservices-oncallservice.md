# OnCallService Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items
```

On-call service of teachers who supervise the free time of students.


> Property 'refPeriods' is required if there are more than one period in the timetable.
>

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([OnCallService](ghc-properties-ghcdata-properties-oncallservices-oncallservice.md))

# OnCallService Properties

| Property                                                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                     |
| :------------------------------------------------------ | --------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                               | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/id")                                               |
| [refFrame](#refframe)                                   | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refFrame")                                   |
| [refPeriods](#refperiods)                               | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refPeriods")                        |
| [refTask](#reftask)                                     | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-reftask.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTask")                                     |
| [inBreak](#inbreak)                                     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-inbreak.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/inBreak")                                     |
| [teachersEachSection](#teacherseachsection)             | `object`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection")             |
| [refTeachers](#refteachers)                             | `array`   | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers")                             |
| [frameTemplate](#frametemplate)                         | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-oncalltemplate.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/frameTemplate")                                                                                  |
| [refBuilding](#refbuilding)                             | `string`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refBuilding")                             |
| [computeForMaxMinOccupancy](#computeformaxminoccupancy) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-computeformaxminoccupancy.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/computeForMaxMinOccupancy") |

## id

On-Call service identifier.


> This identifier can not be equals to any session identifier.
>

`id`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/id")

### id Type

`integer`

## refFrame

Identifier of the frame where the service will be set.


`refFrame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refFrame")

### refFrame Type

`string`

## refPeriods

It contains the periods when the service must be set and mirror placement in periods condition (same placement in periods).


`refPeriods`

-   is optional
-   Type: `object` ([OnCallPeriodsInfo](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refPeriods")

### refPeriods Type

`object` ([OnCallPeriodsInfo](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo.md))

## refTask

Task identifier.


`refTask`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-reftask.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTask")

### refTask Type

`string`

## inBreak

It indicates whether it is a break supervision.


`inBreak`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-inbreak.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/inBreak")

### inBreak Type

`boolean`

## teachersEachSection

Information about number of teacher in all sections.


> The value 'byDefault' shall be used for all sections, if the field 'bySection' is not informed. This value is also used when a section is not informed in 'bySection'.
>

`teachersEachSection`

-   is required
-   Type: `object` ([TeachersEachSection](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection")

### teachersEachSection Type

`object` ([TeachersEachSection](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection.md))

## refTeachers

List of teachers who in the service.


`refTeachers`

-   is required
-   Type: `object[]` ([RefTeacher](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers")

### refTeachers Type

`object[]` ([RefTeacher](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher.md))

## frameTemplate

Template with teacher's preferences in the on-call service.


`frameTemplate`

-   is optional
-   Type: `object[]` ([OnCallSectionPreference](ghc-definitions-oncalltemplate-oncallsectionpreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-oncalltemplate.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([OnCallSectionPreference](ghc-definitions-oncalltemplate-oncallsectionpreference.md))

## refBuilding

Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.


`refBuilding`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refBuilding")

### refBuilding Type

`string`

## computeForMaxMinOccupancy

It indicates whether the service calculates the maximum and minimum daily occupancy of the teacher.


`computeForMaxMinOccupancy`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-computeformaxminoccupancy.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/computeForMaxMinOccupancy")

### computeForMaxMinOccupancy Type

`boolean`
