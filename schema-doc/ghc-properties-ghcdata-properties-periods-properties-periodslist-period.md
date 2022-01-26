# Period Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/periods/properties/periodsList/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Period](ghc-properties-ghcdata-properties-periods-properties-periodslist-period.md))

# items Properties

| Property            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                          |
| :------------------ | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)           | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods-properties-periodslist-period-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/periods/properties/periodsList/items/properties/id")           |
| [lastDay](#lastday) | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods-properties-periodslist-period-properties-lastday.md "engineInputGHCSchema#/properties/ghcData/properties/periods/properties/periodsList/items/properties/lastDay") |

## id

Period identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods-properties-periodslist-period-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/periods/properties/periodsList/items/properties/id")

### id Type

`string`

## lastDay

The end day of the period (included).

`lastDay`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods-properties-periodslist-period-properties-lastday.md "engineInputGHCSchema#/properties/ghcData/properties/periods/properties/periodsList/items/properties/lastDay")

### lastDay Type

`integer`
