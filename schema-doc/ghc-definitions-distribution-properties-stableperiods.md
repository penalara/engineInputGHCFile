# StablePeriods Schema

```txt
engineInputGHCSchema#/definitions/distribution/properties/stablePeriods
```

The distribution of the class unit of the session is the same in each period.

> Only one property must be specified.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## stablePeriods Type

`object` ([StablePeriods](ghc-definitions-distribution-properties-stableperiods.md))

# stablePeriods Properties

| Property                          | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                 |
| :-------------------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [weeklyStable](#weeklystable)     | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystable.md "engineInputGHCSchema#/definitions/distribution/properties/stablePeriods/properties/weeklyStable")                                                  |
| [weeklyVariable](#weeklyvariable) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable.md "engineInputGHCSchema#/definitions/distribution/properties/stablePeriods/properties/weeklyVariable")                                              |
| [weeklyCustom](#weeklycustom)     | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-distribution-properties-stableperiods-properties-weeklycustom.md "engineInputGHCSchema#/definitions/distribution/properties/stablePeriods/properties/weeklyCustom") |

## weeklyStable

It contains only one possible weekly distribution. Each value is a assignation day.

`weeklyStable`

*   is optional

*   Type: `integer[]` ([DailyMinutes](ghc-definitions-weeklystable-dailyminutes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystable.md "engineInputGHCSchema#/definitions/distribution/properties/stablePeriods/properties/weeklyStable")

### weeklyStable Type

`integer[]` ([DailyMinutes](ghc-definitions-weeklystable-dailyminutes.md))

## weeklyVariable

It defines the distribution as a number of sections per week and a maximum range of sections per day.

`weeklyVariable`

*   is optional

*   Type: `object` ([WeeklyVariable](ghc-definitions-weeklyvariable.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable.md "engineInputGHCSchema#/definitions/distribution/properties/stablePeriods/properties/weeklyVariable")

### weeklyVariable Type

`object` ([WeeklyVariable](ghc-definitions-weeklyvariable.md))

## weeklyCustom

It contains an array of 'WeeklyStable' distributions.

`weeklyCustom`

*   is optional

*   Type: `integer[][]` ([DailyMinutes](ghc-definitions-distribution-properties-stableperiods-properties-weeklycustom-customweeklystable-dailyminutes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-distribution-properties-stableperiods-properties-weeklycustom.md "engineInputGHCSchema#/definitions/distribution/properties/stablePeriods/properties/weeklyCustom")

### weeklyCustom Type

`integer[][]` ([DailyMinutes](ghc-definitions-distribution-properties-stableperiods-properties-weeklycustom-customweeklystable-dailyminutes.md))
