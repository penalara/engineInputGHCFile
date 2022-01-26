# Building Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/buildings/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Building](ghc-properties-ghcdata-properties-buildings-building.md))

# items Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                      |
| :---------------------- | :------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)               | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings-building-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/buildings/items/properties/id")               |
| [distances](#distances) | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings-building-properties-distances.md "engineInputGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances") |

## id

Building identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings-building-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/buildings/items/properties/id")

### id Type

`string`

## distances

Distance in minutes to another school building.

`distances`

*   is optional

*   Type: `object[]` ([Distance](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings-building-properties-distances.md "engineInputGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances")

### distances Type

`object[]` ([Distance](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance.md))
