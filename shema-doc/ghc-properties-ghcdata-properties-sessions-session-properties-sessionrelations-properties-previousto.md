# PreviousTo Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/previousTo
```

Indicates that this session should be assigned in a previous day to the sessions of the list. It is a strict condition.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## previousTo Type

`string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-previousto-sessionref.md))

## previousTo Constraints

**minimum number of items**: the minimum number of items for this array is: `1`
