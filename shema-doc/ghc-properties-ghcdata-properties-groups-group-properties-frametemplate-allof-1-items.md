# Untitled undefined type in JsonGHCFile Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/frameTemplate/allOf/1/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

unknown

# undefined Properties

| Property      | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                        |
| :------------ | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [type](#type) | Not specified | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-frametemplate-allof-1-items-properties-type.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/frameTemplate/allOf/1/items/properties/type") |

## type

Group availability to be assigned to the section.


`type`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-frametemplate-allof-1-items-properties-type.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/frameTemplate/allOf/1/items/properties/type")

### type Type

unknown

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                    | Explanation |
| :----------------------- | ----------- |
| `"banned"`               |             |
| `"available"`            |             |
| `"strong-non-preferred"` |             |
| `"weak-non-preferred"`   |             |
