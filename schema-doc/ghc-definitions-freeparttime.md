# FreePartTime Schema

```txt
engineInputGHCSchema#/definitions/freePartTimes
```

Half day off periods.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freePartTimes Type

`object` ([FreePartTime](ghc-definitions-freeparttime.md))

# FreePartTime Properties

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                             |
| :---------------------------- | -------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [mornings](#mornings)         | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/mornings")         |
| [afternoons](#afternoons)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/afternoons")      |
| [indistinctly](#indistinctly) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/indistinctly") |

## mornings

Mornings off periods.


`mornings`

-   is optional
-   Type: `object` ([MorningsFreePartTimes](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/mornings")

### mornings Type

`object` ([MorningsFreePartTimes](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md))

## afternoons

Afternoons off periods.


`afternoons`

-   is optional
-   Type: `object` ([AfternoonFreePartTimes](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/afternoons")

### afternoons Type

`object` ([AfternoonFreePartTimes](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md))

## indistinctly

Indistinctly, mornings or afternoons, off periods.


`indistinctly`

-   is optional
-   Type: `object` ([IndistinctlyFreePartTimes](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/indistinctly")

### indistinctly Type

`object` ([IndistinctlyFreePartTimes](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))