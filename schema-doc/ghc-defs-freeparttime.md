# FreePartTime Schema

```txt
engineInputGHCSchema#/$defs/freePartTimes
```

Free half-time periods .

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## freePartTimes Type

`object` ([FreePartTime](ghc-defs-freeparttime.md))

# freePartTimes Properties

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                |
| :---------------------------- | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [mornings](#mornings)         | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freeparttime-properties-morningsfreeparttimes.md "engineInputGHCSchema#/$defs/freePartTimes/properties/mornings")         |
| [afternoons](#afternoons)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freeparttime-properties-afternoonfreeparttimes.md "engineInputGHCSchema#/$defs/freePartTimes/properties/afternoons")      |
| [indistinctly](#indistinctly) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freeparttime-properties-indistinctlyfreeparttimes.md "engineInputGHCSchema#/$defs/freePartTimes/properties/indistinctly") |

## mornings

Mornings off.

`mornings`

*   is optional

*   Type: `object` ([MorningsFreePartTimes](ghc-defs-freeparttime-properties-morningsfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freeparttime-properties-morningsfreeparttimes.md "engineInputGHCSchema#/$defs/freePartTimes/properties/mornings")

### mornings Type

`object` ([MorningsFreePartTimes](ghc-defs-freeparttime-properties-morningsfreeparttimes.md))

## afternoons

Afternoons off.

`afternoons`

*   is optional

*   Type: `object` ([AfternoonFreePartTimes](ghc-defs-freeparttime-properties-afternoonfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freeparttime-properties-afternoonfreeparttimes.md "engineInputGHCSchema#/$defs/freePartTimes/properties/afternoons")

### afternoons Type

`object` ([AfternoonFreePartTimes](ghc-defs-freeparttime-properties-afternoonfreeparttimes.md))

## indistinctly

Free mornings or evenings indistinctly.

`indistinctly`

*   is optional

*   Type: `object` ([IndistinctlyFreePartTimes](ghc-defs-freeparttime-properties-indistinctlyfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freeparttime-properties-indistinctlyfreeparttimes.md "engineInputGHCSchema#/$defs/freePartTimes/properties/indistinctly")

### indistinctly Type

`object` ([IndistinctlyFreePartTimes](ghc-defs-freeparttime-properties-indistinctlyfreeparttimes.md))
