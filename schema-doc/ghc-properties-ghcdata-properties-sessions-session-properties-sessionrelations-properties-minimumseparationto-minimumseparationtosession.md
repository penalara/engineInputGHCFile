# MinimumSeparationToSession Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items
```

It contains session identifier of the class unit to be taught with a number of days apart, and the minimum days.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([MinimumSeparationToSession](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession.md))

# items Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                              |
| :-------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [refSessions](#refsessions) | `array`   | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/refSessions") |
| [days](#days)               | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-days.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/days")               |

## refSessions

List of sessions references.

`refSessions`

*   is required

*   Type: `integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs-sessionref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/refSessions")

### refSessions Type

`integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs-sessionref.md))

### refSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## days

Days of separation condition. If the value is 0 or 1 it is equivalent to the condition 'DifferentDays'.

`days`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-days.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/days")

### days Type

`integer`
