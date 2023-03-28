# VariablePeriods Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods
```

The total of the class units of the distribution are divided between the periods.

> Properties 'weeklyStable' and 'weeklyVariable' are mutually exclusive.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## variablePeriods Type

`object` ([VariablePeriods](enginespecification-definitions-distribution-properties-variableperiods.md))

# variablePeriods Properties

| Property                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                    |
| :-------------------------------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [weeklyStable](#weeklystable)                 | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklystable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods/properties/weeklyStable")                                                                    |
| [weeklyVariable](#weeklyvariable)             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods/properties/weeklyVariable")                                                                |
| [maximunTimeInPeriod](#maximuntimeinperiod)   | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-variableperiods-properties-maximuntimeinperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods/properties/maximunTimeInPeriod")   |
| [minimnunTimeInPeriod](#minimnuntimeinperiod) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-variableperiods-properties-minimnuntimeinperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods/properties/minimnunTimeInPeriod") |

## weeklyStable

It contains only one possible weekly distribution. Each value is a assignation day.

> It indicates a stable distribution (number of days and number of sections per day of allocation), among all the periods over which it is distributed. It is not the distribution of each period, but the total of this class unit.

`weeklyStable`

*   is optional

*   Type: `integer[]` ([DailyMinutes](enginespecification-definitions-weeklystable-dailyminutes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklystable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods/properties/weeklyStable")

### weeklyStable Type

`integer[]` ([DailyMinutes](enginespecification-definitions-weeklystable-dailyminutes.md))

## weeklyVariable

It defines the distribution as a number of sections per week and a maximum range of sections per day.

> It indicates a variable distribution among all the periods over which it is distributed. It is not the distribution of each period, but the total of this class unit.

`weeklyVariable`

*   is optional

*   Type: `object` ([WeeklyVariable](enginespecification-definitions-weeklyvariable.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods/properties/weeklyVariable")

### weeklyVariable Type

`object` ([WeeklyVariable](enginespecification-definitions-weeklyvariable.md))

## maximunTimeInPeriod

Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.

`maximunTimeInPeriod`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-variableperiods-properties-maximuntimeinperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods/properties/maximunTimeInPeriod")

### maximunTimeInPeriod Type

`integer`

## minimnunTimeInPeriod

Minimum number of minutes to be allocated in each Period.

`minimnunTimeInPeriod`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-variableperiods-properties-minimnuntimeinperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods/properties/minimnunTimeInPeriod")

### minimnunTimeInPeriod Type

`integer`
