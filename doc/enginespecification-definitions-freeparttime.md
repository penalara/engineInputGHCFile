# FreePartTime Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes
```

Free half-time periods .

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## freePartTimes Type

`object` ([FreePartTime](enginespecification-definitions-freeparttime.md))

# freePartTimes Properties

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                            |
| :---------------------------- | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [mornings](#mornings)         | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-morningsfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/mornings")         |
| [afternoons](#afternoons)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-afternoonfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/afternoons")      |
| [indistinctly](#indistinctly) | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/indistinctly") |

## mornings

Mornings off.

`mornings`

*   is optional

*   Type: `object` ([MorningsFreePartTimes](enginespecification-definitions-freeparttime-properties-morningsfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-morningsfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/mornings")

### mornings Type

`object` ([MorningsFreePartTimes](enginespecification-definitions-freeparttime-properties-morningsfreeparttimes.md))

## afternoons

Afternoons off.

`afternoons`

*   is optional

*   Type: `object` ([AfternoonFreePartTimes](enginespecification-definitions-freeparttime-properties-afternoonfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-afternoonfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/afternoons")

### afternoons Type

`object` ([AfternoonFreePartTimes](enginespecification-definitions-freeparttime-properties-afternoonfreeparttimes.md))

## indistinctly

Free mornings or evenings indistinctly.

`indistinctly`

*   is optional

*   Type: `object` ([IndistinctlyFreePartTimes](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/indistinctly")

### indistinctly Type

`object` ([IndistinctlyFreePartTimes](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))
