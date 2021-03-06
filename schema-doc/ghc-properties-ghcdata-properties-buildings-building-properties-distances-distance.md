# Distance Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Distance](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance.md))

# Distance Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                   |
| :-------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refBuilding](#refbuilding) | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items/properties/refBuilding") |
| [minutes](#minutes)         | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance-properties-minutes.md "engineInputGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items/properties/minutes")         |

## refBuilding

Identifier of the other building that refers to the distance.


`refBuilding`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items/properties/refBuilding")

### refBuilding Type

`string`

## minutes

Distance in minutes from the building of the referred building.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance-properties-minutes.md "engineInputGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items/properties/minutes")

### minutes Type

`integer`
