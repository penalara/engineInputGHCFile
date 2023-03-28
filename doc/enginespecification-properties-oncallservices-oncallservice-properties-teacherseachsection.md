# TeachersEachSection Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection
```

Information about number of teacher in all sections.

> The value 'byDefault' shall be used for all sections, if the field 'bySection' is not informed. This value is also used when a section is not informed in 'bySection'.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## teachersEachSection Type

`object` ([TeachersEachSection](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection.md))

# teachersEachSection Properties

| Property                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                     |
| :---------------------- | :-------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [byDefault](#bydefault) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-bydefault.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/byDefault")          |
| [bySection](#bysection) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/bySection") |

## byDefault

Default value for number of teacher in all sections.

`byDefault`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-bydefault.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/byDefault")

### byDefault Type

`integer`

## bySection

Custom number of teachers in each section.

`bySection`

*   is optional

*   Type: `object[]` ([TeachersBySection](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/bySection")

### bySection Type

`object[]` ([TeachersBySection](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection.md))
