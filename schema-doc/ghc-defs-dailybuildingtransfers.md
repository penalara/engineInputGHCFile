# DailyBuildingTransfers Schema

```txt
engineInputGHCSchema#/$defs/dailyBuildingTransfers
```

Maximum number of movements between buildings that the teacher can make per day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## dailyBuildingTransfers Type

`object` ([DailyBuildingTransfers](ghc-defs-dailybuildingtransfers.md))

# dailyBuildingTransfers Properties

| Property                  | Type      | Required | Nullable       | Defined by                                                                                                                                                  |
| :------------------------ | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-dailybuildingtransfers-properties-strict.md "engineInputGHCSchema#/$defs/dailyBuildingTransfers/properties/strict")         |
| [preferable](#preferable) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-dailybuildingtransfers-properties-preferable.md "engineInputGHCSchema#/$defs/dailyBuildingTransfers/properties/preferable") |

## strict

Strict maximum number of movements per day.

`strict`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-dailybuildingtransfers-properties-strict.md "engineInputGHCSchema#/$defs/dailyBuildingTransfers/properties/strict")

### strict Type

`integer`

## preferable

Maximum number of movements per day that can be weighted/preferred.

`preferable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-dailybuildingtransfers-properties-preferable.md "engineInputGHCSchema#/$defs/dailyBuildingTransfers/properties/preferable")

### preferable Type

`integer`
