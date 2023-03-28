# TeachersBySection Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items
```

Custom number of teachers in one timetable section.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([TeachersBySection](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection.md))

# items Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                                                                           |
| :-------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)                 | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/day")                 |
| [index](#index)             | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/index")             |
| [numTeachers](#numteachers) | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-numteachers.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/numTeachers") |

## day

Day of the week.

`day`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/day")

### day Type

`integer`

## index

Index of the section.

`index`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/index")

### index Type

`integer`

## numTeachers

Custom number of teachers to be assigned in the section.

`numTeachers`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-teacherseachsection-properties-teachersbysections-teachersbysection-properties-numteachers.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/teachersEachSection/properties/bySection/items/properties/numTeachers")

### numTeachers Type

`integer`
