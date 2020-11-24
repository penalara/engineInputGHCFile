# TeachersEachSection Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection
```

Information about number of teacher in all sections.


> Propeties 'amount' and 'bySection' are mutually exclusive (Schema tag 'One Of' is not specified because POJO automatic generation incompatibility)
>

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## teachersEachSection Type

`object` ([TeachersEachSection](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection.md))

# TeachersEachSection Properties

| Property                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                        |
| :---------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [amount](#amount)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-amount.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/amount")            |
| [bySection](#bysection) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-oncallservices.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection") |

## amount

General value for number of teacher in all sections.


`amount`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-amount.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/amount")

### amount Type

`integer`

## bySection

Custom number of teachers in each section.


`bySection`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-oncallservices.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/teachersEachSection/properties/bySection")

### bySection Type

unknown\[]
