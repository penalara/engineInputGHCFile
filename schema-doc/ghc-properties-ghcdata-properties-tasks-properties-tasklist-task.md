# Task Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/taskList/items
```

Teacher's activity type.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Task](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task.md))

# Task Properties

| Property                        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                          |
| :------------------------------ | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                       | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/taskList/items/properties/id")                       |
| [frameTemplate](#frametemplate) | Merged   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task-properties-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/taskList/items/properties/frameTemplate") |

## id

Task's identifier name.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/taskList/items/properties/id")

### id Type

`string`

## frameTemplate




`frameTemplate`

-   is optional
-   Type: merged type ([Details](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task-properties-frametemplate.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task-properties-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/taskList/items/properties/frameTemplate")

### frameTemplate Type

merged type ([Details](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task-properties-frametemplate.md))

all of

-   [FrameTemplate](ghc-definitions-frametemplate.md "check type definition")
-   [Untitled undefined type in EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task-properties-frametemplate-allof-1.md "check type definition")
