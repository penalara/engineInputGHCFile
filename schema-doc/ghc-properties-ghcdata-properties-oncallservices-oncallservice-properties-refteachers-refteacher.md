# RefTeacher Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items
```

Contains a teacher reference, the number of break oversight.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([RefTeacher](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher.md))

# RefTeacher Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                             |
| :------------------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [teacherId](#teacherid)         | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-teacherid.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/teacherId")          |
| [numOfSections](#numofsections) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-numofsections.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/numOfSections")  |
| [frameTemplate](#frametemplate) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate") |

## teacherId

Identifier name of the teacher.


`teacherId`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-teacherid.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/teacherId")

### teacherId Type

`string`

## numOfSections

Number of sections of on-call service that the teacher must do weekly.


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

## frameTemplate

Templates with teacher on-call assignment preferences.


`frameTemplate`

-   is optional
-   Type: `object[]` ([OnCallSectionPreference](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([OnCallSectionPreference](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference.md))
