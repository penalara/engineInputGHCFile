# ByDefault Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault
```

Default type of task for all types of sessions.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## byDefault Type

`object` ([ByDefault](ghc-properties-ghcdata-properties-tasks-properties-bydefault.md))

# ByDefault Properties

| Property                                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                               |
| :-------------------------------------------- | -------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [teachingDefault](#teachingdefault)           | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault-properties-teachingdefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault/properties/teachingDefault")           |
| [meetingsDefault](#meetingsdefault)           | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault-properties-meetingsdefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault/properties/meetingsDefault")           |
| [complementaryDefault](#complementarydefault) | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault-properties-complementarydefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault/properties/complementaryDefault") |
| [onCallHoursDefault](#oncallhoursdefault)     | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault-properties-oncallhoursdefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault/properties/onCallHoursDefault")     |

## teachingDefault

 Default task for teaching sessions.


`teachingDefault`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault-properties-teachingdefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault/properties/teachingDefault")

### teachingDefault Type

`string`

## meetingsDefault

Default task for meeting sessions.


`meetingsDefault`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault-properties-meetingsdefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault/properties/meetingsDefault")

### meetingsDefault Type

`string`

## complementaryDefault

Default task for complementary sessions.


`complementaryDefault`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault-properties-complementarydefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault/properties/complementaryDefault")

### complementaryDefault Type

`string`

## onCallHoursDefault

Default task for on call sessions.


`onCallHoursDefault`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-tasks-properties-bydefault-properties-oncallhoursdefault.md "engineInputGHCSchema#/properties/ghcData/properties/tasks/properties/byDefault/properties/onCallHoursDefault")

### onCallHoursDefault Type

`string`
