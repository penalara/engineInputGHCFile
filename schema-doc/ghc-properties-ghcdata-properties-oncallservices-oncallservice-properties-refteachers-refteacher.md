# RefTeacher Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items
```

It contains a teacher reference and the number of section oversight .


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([RefTeacher](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher.md))

# RefTeacher Properties

| Property                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                            |
| :-------------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [teacherId](#teacherid)                       | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-teacherid.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/teacherId")         |
| [numOfSections](#numofsections)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-numofsections.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/numOfSections") |
| [teacherFrameTemplate](#teacherframetemplate) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-oncalltemplate.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/teacherFrameTemplate")                                                                                     |

## teacherId

Teacher identifier.


`teacherId`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-teacherid.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/teacherId")

### teacherId Type

`string`

## numOfSections

Number of on-call services to be done weekly by the teacher.


`numOfSections`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-numofsections.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/numOfSections")

### numOfSections Type

`integer`

### numOfSections Default Value

The default value is:

```json
1
```

## teacherFrameTemplate

Templates with teacher on-call assignment preferences.


`teacherFrameTemplate`

-   is optional
-   Type: `object[]` ([OnCallSectionPreference](ghc-definitions-oncalltemplate-oncallsectionpreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-oncalltemplate.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/teacherFrameTemplate")

### teacherFrameTemplate Type

`object[]` ([OnCallSectionPreference](ghc-definitions-oncalltemplate-oncallsectionpreference.md))
