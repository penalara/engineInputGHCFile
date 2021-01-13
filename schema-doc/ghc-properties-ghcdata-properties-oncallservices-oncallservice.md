# OnCallService Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items
```

On call service of teachers who supervise the free time of students.


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
| [id](#id)                                               | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/id")                                               |
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

Identifier name of the On-Call service.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/id")

### id Type

`string`

## refFrame

Identifier name of the frame where will be set the service.


`refFrame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refFrame")

### refFrame Type

`string`

## refPeriods

Information about the periods that have the service and mirror placement in periods condition (same placement in periods).


`refPeriods`

-   is optional
-   Type: `object` ([OnCallPeriodsInfo](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refPeriods")

### refPeriods Type

`object` ([OnCallPeriodsInfo](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo.md))

## refTask

Identifier name of the service's task.


`refTask`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-reftask.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTask")

### refTask Type

`string`

## inBreak

Indicates if it will be a break oversight service.


`inBreak`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-inbreak.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/inBreak")

### inBreak Type

`boolean`

## teachersEachSection

Information about number of teacher in all sections.


> 'byDefault' value will be used for all sections, if 'bySection' field is not informed. Also it value is used when one section is not informed at 'bySection'.
>

`teachersEachSection`

-   is required
-   Type: `object` ([TeachersEachSection](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection")

### teachersEachSection Type

`object` ([TeachersEachSection](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection.md))

## refTeachers

List of teachers who make the service.


`refTeachers`

-   is required
-   Type: `object[]` ([RefTeacher](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers")

### refTeachers Type

`object[]` ([RefTeacher](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher.md))

## frameTemplate

Templates with teacher on-call assignment preferences.


`frameTemplate`

-   is optional
-   Type: `object[]` ([OnCallSectionPreference](ghc-definitions-oncalltemplate-oncallsectionpreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-oncalltemplate.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([OnCallSectionPreference](ghc-definitions-oncalltemplate-oncallsectionpreference.md))

## refBuilding

Identifier name of the building where is the service. It is used to know transfer time and number of transfers between buildings for teachers.


`refBuilding`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refBuilding")

### refBuilding Type

`string`

## computeForMaxMinOccupancy

Indicates if the service computes for teacher's daily maximum and minimum of occupancy.


`computeForMaxMinOccupancy`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-computeformaxminoccupancy.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/computeForMaxMinOccupancy")

### computeForMaxMinOccupancy Type

`boolean`
