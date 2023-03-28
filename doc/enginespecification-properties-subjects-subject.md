# Subject Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/subjects/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Subject](enginespecification-properties-subjects-subject.md))

# items Properties

| Property                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                              |
| :---------------------------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                 | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-subjects-subject-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/subjects/items/properties/id")                                 |
| [isStudentMentoring](#isstudentmentoring) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-subjects-subject-properties-isstudentmentoring.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/subjects/items/properties/isStudentMentoring") |
| [frameTemplate](#frametemplate)           | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-frametemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/subjects/items/properties/frameTemplate")                                      |

## id

Subject identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-subjects-subject-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/subjects/items/properties/id")

### id Type

`string`

## isStudentMentoring

It indicates whether the subject is a tutorial.

`isStudentMentoring`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-subjects-subject-properties-isstudentmentoring.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/subjects/items/properties/isStudentMentoring")

### isStudentMentoring Type

`boolean`

## frameTemplate

Templates with frame sections assignment preferences.

`frameTemplate`

*   is optional

*   Type: `object[]` ([SectionPreference](enginespecification-definitions-frametemplate-sectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-frametemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/subjects/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SectionPreference](enginespecification-definitions-frametemplate-sectionpreference.md))
