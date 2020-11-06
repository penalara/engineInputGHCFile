# Distance Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Distance](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance.md))

# Distance Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                          |
| :-------------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refBuilding](#refbuilding) | `string`  | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance-properties-refbuilding.md "GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items/properties/refBuilding") |
| [minutes](#minutes)         | `integer` | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance-properties-minutes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items/properties/minutes")         |

## refBuilding

Abbreviated name of the other building that refer the distance.


`refBuilding`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance-properties-refbuilding.md "GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items/properties/refBuilding")

### refBuilding Type

`string`

## minutes

Distance minutes from the building from the referred building.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance-properties-minutes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances/items/properties/minutes")

### minutes Type

`integer`
