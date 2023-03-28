# IndistinctlyFreePartTimes Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/indistinctly
```

Free mornings or evenings indistinctly.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## indistinctly Type

`object` ([IndistinctlyFreePartTimes](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))

# indistinctly Properties

| Property                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                        |
| :------------------------ | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/indistinctly/properties/strict")         |
| [preferable](#preferable) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/indistinctly/properties/preferable") |

## strict

Strict number of mornings or afternoons indistinctly off.

`strict`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/indistinctly/properties/strict")

### strict Type

`integer`

## preferable

Preferable number of mornings or afternoons indistinctly off.

`preferable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/indistinctly/properties/preferable")

### preferable Type

`integer`
