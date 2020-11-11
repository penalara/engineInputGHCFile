# NonConsecutiveSessions Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/nonConsecutiveSessions
```

Identifiers of the sessions that they should not be consecutive. It is a strict condition.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## nonConsecutiveSessions Type

`string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions-sessionref.md))

## nonConsecutiveSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`
