# MinimumSeparationToSession Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items
```

Contains the identifier of the session that must be taught a number of days apart, and the minimun days.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([MinimumSeparationToSession](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession.md))

# MinimumSeparationToSession Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                              |
| :-------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [refSessions](#refsessions) | `array`   | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/refSessions") |
| [days](#days)               | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-days.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/days")               |

## refSessions

.


`refSessions`

-   is required
-   Type: `string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/refSessions")

### refSessions Type

`string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs-sessionref.md))

### refSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## days

Condition's Days of separation. If value is 0 or 1 is equivalent to 'DifferentDays' condition.


`days`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-days.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/days")

### days Type

`integer`
