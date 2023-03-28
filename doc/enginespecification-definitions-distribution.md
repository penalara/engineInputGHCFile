# Distribution Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution
```

It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

> The 'periods' property is required if there is more than one period in the timetable. The 'stablePeriods' and 'variablePeriods' properties are mutually exclusive.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## distribution Type

`object` ([Distribution](enginespecification-definitions-distribution.md))

# distribution Properties

| Property                            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                    |
| :---------------------------------- | :------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [periods](#periods)                 | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-refperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/periods")              |
| [stablePeriods](#stableperiods)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-stableperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods")     |
| [variablePeriods](#variableperiods) | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-variableperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods") |

## periods

List of periods or weeks in which the class unit must be assigned.

`periods`

*   is optional

*   Type: `string[]` ([RefPeriod](enginespecification-definitions-distribution-properties-refperiods-refperiod.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-refperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/periods")

### periods Type

`string[]` ([RefPeriod](enginespecification-definitions-distribution-properties-refperiods-refperiod.md))

## stablePeriods

The distribution of the class unit of the session is the same in each period.

> Only one property must be specified.

`stablePeriods`

*   is optional

*   Type: `object` ([StablePeriods](enginespecification-definitions-distribution-properties-stableperiods.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-stableperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods")

### stablePeriods Type

`object` ([StablePeriods](enginespecification-definitions-distribution-properties-stableperiods.md))

## variablePeriods

The total of the class units of the distribution are divided between the periods.

> Properties 'weeklyStable' and 'weeklyVariable' are mutually exclusive.

`variablePeriods`

*   is optional

*   Type: `object` ([VariablePeriods](enginespecification-definitions-distribution-properties-variableperiods.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-variableperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods")

### variablePeriods Type

`object` ([VariablePeriods](enginespecification-definitions-distribution-properties-variableperiods.md))
