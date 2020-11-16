# ConsecutiveGroup Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups/items
```

Contains the references of a continuous sessions group.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([ConsecutiveGroup](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup.md))

# ConsecutiveGroup Properties

| Property                    | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                    |
| :-------------------------- | ------------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                   | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups/items/properties/id")                   |
| [refSessions](#refsessions) | `array`       | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups/items/properties/refSessions") |
| [order](#order)             | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup-properties-order.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups/items/properties/order")             |

## id

Identifier of continuous sessions group.


`id`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups/items/properties/id")

### id Type

`integer`

## refSessions

List of sessions references which must be consecutive.


`refSessions`

-   is required
-   Type: `string[]` ([SessionRef](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup-properties-sessionrefs-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups/items/properties/refSessions")

### refSessions Type

`string[]` ([SessionRef](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup-properties-sessionrefs-sessionref.md))

### refSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## order

Indicates if the sessions must be followed, separated, or it does not matter as long as they are assigned on the same day.


`order`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup-properties-order.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups/items/properties/order")

### order Type

unknown

### order Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value          | Explanation |
| :------------- | ----------- |
| `"disordered"` |             |
| `"followed"`   |             |
| `"separated"`  |             |

### order Default Value

The default value is:

```json
"disordered"
```
