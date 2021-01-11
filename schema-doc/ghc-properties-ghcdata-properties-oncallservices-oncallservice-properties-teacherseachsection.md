# TeachersEachSection Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection
```

Information about number of teacher in all sections.


> 'byDefault' value will be used for all sections, if 'bySection' field is not informed. Also it value is used when one section is not informed at 'bySection'.
>

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## teachersEachSection Type

`object` ([TeachersEachSection](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection.md))

# TeachersEachSection Properties

| Property                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                            |
| :---------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [byDefault](#bydefault) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-bydefault.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/byDefault")          |
| [bySection](#bysection) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection") |

## byDefault

Default value for number of teacher in all sections.


`byDefault`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-bydefault.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/byDefault")

### byDefault Type

`integer`

## bySection

Custom number of teachers in each section.


`bySection`

-   is optional
-   Type: `object[]` ([TeachersBySection](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection")

### bySection Type

`object[]` ([TeachersBySection](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection.md))
