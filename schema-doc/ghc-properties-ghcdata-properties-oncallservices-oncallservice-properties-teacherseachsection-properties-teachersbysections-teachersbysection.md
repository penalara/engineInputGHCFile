# TeachersBySection Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items
```

Custom number of teachers in one timetable section.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([TeachersBySection](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection.md))

# TeachersBySection Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                  |
| :-------------------------- | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)                 | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/day")                 |
| [index](#index)             | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/index")             |
| [numTeachers](#numteachers) | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-numteachers.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/numTeachers") |

## day

Day of the week.


`day`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/day")

### day Type

`integer`

## index

Index of the section.


`index`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/index")

### index Type

`integer`

## numTeachers

Custom number of tachers for the section.


`numTeachers`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-numteachers.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/numTeachers")

### numTeachers Type

`integer`
