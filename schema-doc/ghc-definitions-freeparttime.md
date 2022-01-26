# FreePartTime Schema

```txt
engineInputGHCSchema#/definitions/freePartTimes
```

Free half-time periods .

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## freePartTimes Type

`object` ([FreePartTime](ghc-definitions-freeparttime.md))

# freePartTimes Properties

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                             |
| :---------------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [mornings](#mornings)         | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/mornings")         |
| [afternoons](#afternoons)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/afternoons")      |
| [indistinctly](#indistinctly) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/indistinctly") |

## mornings

Mornings off.

`mornings`

*   is optional

*   Type: `object` ([MorningsFreePartTimes](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/mornings")

### mornings Type

`object` ([MorningsFreePartTimes](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md))

## afternoons

Afternoons off.

`afternoons`

*   is optional

*   Type: `object` ([AfternoonFreePartTimes](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/afternoons")

### afternoons Type

`object` ([AfternoonFreePartTimes](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md))

## indistinctly

Free mornings or evenings indistinctly.

`indistinctly`

*   is optional

*   Type: `object` ([IndistinctlyFreePartTimes](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/indistinctly")

### indistinctly Type

`object` ([IndistinctlyFreePartTimes](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))
