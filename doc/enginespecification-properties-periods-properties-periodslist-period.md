# Period Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods/properties/periodsList/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Period](enginespecification-properties-periods-properties-periodslist-period.md))

# items Properties

| Property            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                   |
| :------------------ | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)           | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-periods-properties-periodslist-period-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods/properties/periodsList/items/properties/id")           |
| [lastDay](#lastday) | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-periods-properties-periodslist-period-properties-lastday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods/properties/periodsList/items/properties/lastDay") |

## id

Period identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-periods-properties-periodslist-period-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods/properties/periodsList/items/properties/id")

### id Type

`string`

## lastDay

The end day of the period (included).

`lastDay`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-periods-properties-periodslist-period-properties-lastday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods/properties/periodsList/items/properties/lastDay")

### lastDay Type

`integer`
