# Building Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Building](ghc-properties-ghcdata-properties-buildings-building.md))

# Building Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                             |
| :---------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)               | `string` | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-buildings-building-properties-id.md "GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items/properties/id")               |
| [distances](#distances) | `array`  | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-buildings-building-properties-distances.md "GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances") |

## id

Identifier name of the building.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-buildings-building-properties-id.md "GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items/properties/id")

### id Type

`string`

## distances

Distances in minutes to another building of the school.


`distances`

-   is optional
-   Type: `object[]` ([Distance](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-buildings-building-properties-distances.md "GeneralJsonGHCSchema#/properties/ghcData/properties/buildings/items/properties/distances")

### distances Type

`object[]` ([Distance](ghc-properties-ghcdata-properties-buildings-building-properties-distances-distance.md))
