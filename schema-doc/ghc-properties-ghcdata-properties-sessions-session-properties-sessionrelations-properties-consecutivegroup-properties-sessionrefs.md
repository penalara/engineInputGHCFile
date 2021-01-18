# SessionRefs Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup/properties/refSessions
```

Contains the references of a continuous sessions group. Must contain the sesion itself. And the proper order of continuity (for 'order' property).


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## refSessions Type

`integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-sessionrefs-sessionref.md))

## refSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`
