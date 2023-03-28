# Building Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/buildings/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Building](enginespecification-properties-buildings-building.md))

# items Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                               |
| :---------------------- | :------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)               | `string` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-buildings-building-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/buildings/items/properties/id")               |
| [distances](#distances) | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-buildings-building-properties-distances.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/buildings/items/properties/distances") |

## id

Building identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-buildings-building-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/buildings/items/properties/id")

### id Type

`string`

## distances

Distance in minutes to another school building.

`distances`

*   is optional

*   Type: `object[]` ([Distance](enginespecification-properties-buildings-building-properties-distances-distance.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-buildings-building-properties-distances.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/buildings/items/properties/distances")

### distances Type

`object[]` ([Distance](enginespecification-properties-buildings-building-properties-distances-distance.md))
