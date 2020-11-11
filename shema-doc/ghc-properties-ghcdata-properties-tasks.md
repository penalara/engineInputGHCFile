# Tasks Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/tasks
```

Types of tasks or activities for the teachers.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## tasks Type

`object` ([Tasks](ghc-properties-ghcdata-properties-tasks.md))

# Tasks Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                               |
| :---------------------- | -------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [taskList](#tasklist)   | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-tasklist.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/taskList")   |
| [byDefault](#bydefault) | `object` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault") |

## taskList

List of the task types for the teachers.


`taskList`

-   is required
-   Type: `object[]` ([Task](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-tasklist.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/taskList")

### taskList Type

`object[]` ([Task](ghc-properties-ghcdata-properties-tasks-properties-tasklist-task.md))

## byDefault

Default type of task for all types of sessions.


`byDefault`

-   is required
-   Type: `object` ([ByDefault](ghc-properties-ghcdata-properties-tasks-properties-bydefault.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault")

### byDefault Type

`object` ([ByDefault](ghc-properties-ghcdata-properties-tasks-properties-bydefault.md))
