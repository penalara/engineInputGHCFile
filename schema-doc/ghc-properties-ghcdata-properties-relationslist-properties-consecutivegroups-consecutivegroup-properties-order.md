# Untitled undefined type in EngineInputGHCSchema Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups/items/properties/order
```

Indicates if the sessions must be followed, separated, or it does not matter as long as they are assigned on the same day.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## order Type

unknown

## order Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value          | Explanation |
| :------------- | ----------- |
| `"disordered"` |             |
| `"followed"`   |             |
| `"separated"`  |             |

## order Default Value

The default value is:

```json
"disordered"
```
