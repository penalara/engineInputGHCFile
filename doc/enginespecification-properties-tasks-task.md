# Task Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/tasks/items
```

Teacher activity type.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Task](enginespecification-properties-tasks-task.md))

# items Properties

| Property                        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                      |
| :------------------------------ | :------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [id](#id)                       | `string` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-tasks-task-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/tasks/items/properties/id")  |
| [frameTemplate](#frametemplate) | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-frametemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/tasks/items/properties/frameTemplate") |

## id

Task identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-tasks-task-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/tasks/items/properties/id")

### id Type

`string`

## frameTemplate

Templates with frame sections assignment preferences.

`frameTemplate`

*   is optional

*   Type: `object[]` ([SectionPreference](enginespecification-definitions-frametemplate-sectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-frametemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/tasks/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SectionPreference](enginespecification-definitions-frametemplate-sectionpreference.md))
