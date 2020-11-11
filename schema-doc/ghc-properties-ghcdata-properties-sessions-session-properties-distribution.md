# Distribution Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution
```

Contains information on how the classes of the session are distributed throughout the week


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## distribution Type

`object` ([Distribution](ghc-properties-ghcdata-properties-sessions-session-properties-distribution.md))

one (and only one) of

-   [Untitled undefined type in EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-0.md "check type definition")
-   [Untitled undefined type in EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-oneof-1.md "check type definition")

# Distribution Properties

| Property            | Type    | Required | Nullable       | Defined by                                                                                                                                                                                                                                  |
| :------------------ | ------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [periods](#periods) | `array` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-refperiods.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/periods") |

## periods

List of periods or weeks when the session must be.


`periods`

-   is optional
-   Type: `string[]` ([RefPeriod](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-refperiods-refperiod.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-refperiods.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/periods")

### periods Type

`string[]` ([RefPeriod](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-refperiods-refperiod.md))
