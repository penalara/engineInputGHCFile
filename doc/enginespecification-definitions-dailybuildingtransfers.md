# DailyBuildingTransfers Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers
```

Maximum number of movements between buildings that the teacher can make per day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## dailyBuildingTransfers Type

`object` ([DailyBuildingTransfers](enginespecification-definitions-dailybuildingtransfers.md))

# dailyBuildingTransfers Properties

| Property                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                              |
| :------------------------ | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers/properties/strict")         |
| [preferable](#preferable) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers/properties/preferable") |

## strict

Strict maximum number of movements per day.

`strict`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers/properties/strict")

### strict Type

`integer`

## preferable

Maximum number of movements per day that can be weighted/preferred.

`preferable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers/properties/preferable")

### preferable Type

`integer`
