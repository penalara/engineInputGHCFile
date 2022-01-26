# DailyBuildingTransfers Schema

```txt
engineInputGHCSchema#/definitions/dailyBuildingTransfers
```

Maximum number of movements between buildings that the teacher can make per day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## dailyBuildingTransfers Type

`object` ([DailyBuildingTransfers](ghc-definitions-dailybuildingtransfers.md))

# dailyBuildingTransfers Properties

| Property                  | Type      | Required | Nullable       | Defined by                                                                                                                                                               |
| :------------------------ | :-------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers-properties-strict.md "engineInputGHCSchema#/definitions/dailyBuildingTransfers/properties/strict")         |
| [preferable](#preferable) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers-properties-preferable.md "engineInputGHCSchema#/definitions/dailyBuildingTransfers/properties/preferable") |

## strict

Strict maximum number of movements per day.

`strict`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers-properties-strict.md "engineInputGHCSchema#/definitions/dailyBuildingTransfers/properties/strict")

### strict Type

`integer`

## preferable

Maximum number of movements per day that can be weighted/preferred.

`preferable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers-properties-preferable.md "engineInputGHCSchema#/definitions/dailyBuildingTransfers/properties/preferable")

### preferable Type

`integer`
