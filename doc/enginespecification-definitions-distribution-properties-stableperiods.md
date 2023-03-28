# StablePeriods Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods
```

The distribution of the class unit of the session is the same in each period.

> Only one property must be specified.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## stablePeriods Type

`object` ([StablePeriods](enginespecification-definitions-distribution-properties-stableperiods.md))

# stablePeriods Properties

| Property                          | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                |
| :-------------------------------- | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [weeklyStable](#weeklystable)     | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklystable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods/properties/weeklyStable")                                                  |
| [weeklyVariable](#weeklyvariable) | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods/properties/weeklyVariable")                                              |
| [weeklyCustom](#weeklycustom)     | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-stableperiods-properties-weeklycustom.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods/properties/weeklyCustom") |

## weeklyStable

It contains only one possible weekly distribution. Each value is a assignation day.

`weeklyStable`

*   is optional

*   Type: `integer[]` ([DailyMinutes](enginespecification-definitions-weeklystable-dailyminutes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklystable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods/properties/weeklyStable")

### weeklyStable Type

`integer[]` ([DailyMinutes](enginespecification-definitions-weeklystable-dailyminutes.md))

## weeklyVariable

It defines the distribution as a number of sections per week and a maximum range of sections per day.

`weeklyVariable`

*   is optional

*   Type: `object` ([WeeklyVariable](enginespecification-definitions-weeklyvariable.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods/properties/weeklyVariable")

### weeklyVariable Type

`object` ([WeeklyVariable](enginespecification-definitions-weeklyvariable.md))

## weeklyCustom

It contains an array of 'WeeklyStable' distributions.

`weeklyCustom`

*   is optional

*   Type: `integer[][]` ([DailyMinutes](enginespecification-definitions-distribution-properties-stableperiods-properties-weeklycustom-customweeklystable-dailyminutes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-stableperiods-properties-weeklycustom.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods/properties/weeklyCustom")

### weeklyCustom Type

`integer[][]` ([DailyMinutes](enginespecification-definitions-distribution-properties-stableperiods-properties-weeklycustom-customweeklystable-dailyminutes.md))
