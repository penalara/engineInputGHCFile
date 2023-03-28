# RefTeacher Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTeachers/items
```

It contains a teacher reference and the number of section oversight .

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([RefTeacher](enginespecification-properties-oncallservices-oncallservice-properties-refteachersoncall-refteacher.md))

# items Properties

| Property                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                           |
| :-------------------------------------------- | :-------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [teacherId](#teacherid)                       | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refteachersoncall-refteacher-properties-teacherid.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTeachers/items/properties/teacherId")         |
| [numOfSections](#numofsections)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refteachersoncall-refteacher-properties-numofsections.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTeachers/items/properties/numOfSections") |
| [teacherFrameTemplate](#teacherframetemplate) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTeachers/items/properties/teacherFrameTemplate")                                                                        |

## teacherId

Teacher identifier.

`teacherId`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refteachersoncall-refteacher-properties-teacherid.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTeachers/items/properties/teacherId")

### teacherId Type

`string`

## numOfSections

Number of on-call services to be done weekly by the teacher.

`numOfSections`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices-oncallservice-properties-refteachersoncall-refteacher-properties-numofsections.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTeachers/items/properties/numOfSections")

### numOfSections Type

`integer`

### numOfSections Default Value

The default value is:

```json
1
```

## teacherFrameTemplate

Template with teacher's preferences in the on-call service.

`teacherFrameTemplate`

*   is optional

*   Type: `object[]` ([OnCallSectionPreference](enginespecification-definitions-oncalltemplate-oncallsectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices/items/properties/refTeachers/items/properties/teacherFrameTemplate")

### teacherFrameTemplate Type

`object[]` ([OnCallSectionPreference](enginespecification-definitions-oncalltemplate-oncallsectionpreference.md))
