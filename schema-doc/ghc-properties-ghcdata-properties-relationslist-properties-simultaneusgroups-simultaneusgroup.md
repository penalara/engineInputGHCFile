# SimultaneusGroup Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/simultaneusGroups/items
```

Contains the references of a simultaneous sessions group.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([SimultaneusGroup](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups-simultaneusgroup.md))

# SimultaneusGroup Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                    |
| :-------------------------- | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                   | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups-simultaneusgroup-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/simultaneusGroups/items/properties/id")                   |
| [refSessions](#refsessions) | `array`   | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups-simultaneusgroup-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/simultaneusGroups/items/properties/refSessions") |

## id

Identifier of simultaneous group.


`id`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups-simultaneusgroup-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/simultaneusGroups/items/properties/id")

### id Type

`integer`

## refSessions

List of sessions references which must be simultaneus.


`refSessions`

-   is required
-   Type: `integer[]` ([SessionRef](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups-simultaneusgroup-properties-sessionrefs-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups-simultaneusgroup-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/simultaneusGroups/items/properties/refSessions")

### refSessions Type

`integer[]` ([SessionRef](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups-simultaneusgroup-properties-sessionrefs-sessionref.md))

### refSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`
