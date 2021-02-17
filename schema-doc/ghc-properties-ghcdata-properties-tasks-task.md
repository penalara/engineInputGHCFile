# Task Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/tasks/items
```

Teacher activity type.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Task](ghc-properties-ghcdata-properties-tasks-task.md))

# Task Properties

| Property                        | Type     | Required | Nullable       | Defined by                                                                                                                                                            |
| :------------------------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                       | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-task-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/items/properties/id") |
| [frameTemplate](#frametemplate) | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/items/properties/frameTemplate")                   |

## id

Task identifier.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-task-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/items/properties/id")

### id Type

`string`

## frameTemplate

Templates with frame sections assignment preferences.


`frameTemplate`

-   is optional
-   Type: `object[]` ([SectionPreference](ghc-definitions-frametemplate-sectionpreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SectionPreference](ghc-definitions-frametemplate-sectionpreference.md))
