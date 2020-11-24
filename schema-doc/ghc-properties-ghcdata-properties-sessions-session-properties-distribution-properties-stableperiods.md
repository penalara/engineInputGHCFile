# StablePeriods Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/stablePeriods
```

The session's distribution is equals in each period.


> Only one property can be applied (Schema tag 'One Of' is not specified because POJO automatic generation incompatibility).
>

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## stablePeriods Type

`object` ([StablePeriods](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-stableperiods.md))

# StablePeriods Properties

| Property                          | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                           |
| :-------------------------------- | -------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [weeklyStable](#weeklystable)     | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/stablePeriods/properties/weeklyStable")                                                                                                |
| [weeklyVariable](#weeklyvariable) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/stablePeriods/properties/weeklyVariable")                                                                                            |
| [weeklyCustom](#weeklycustom)     | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-stableperiods-properties-weeklycustom.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/stablePeriods/properties/weeklyCustom") |

## weeklyStable

Contains a single possible weekly distribution.


`weeklyStable`

-   is optional
-   Type: `integer[]` ([DailyMinutes](ghc-definitions-weeklystable-dailyminutes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/stablePeriods/properties/weeklyStable")

### weeklyStable Type

`integer[]` ([DailyMinutes](ghc-definitions-weeklystable-dailyminutes.md))

## weeklyVariable

Define the distribution as a number of sections per week and a maximum range of sections per day.


`weeklyVariable`

-   is optional
-   Type: `object` ([WeeklyVariable](ghc-definitions-weeklyvariable.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/stablePeriods/properties/weeklyVariable")

### weeklyVariable Type

`object` ([WeeklyVariable](ghc-definitions-weeklyvariable.md))

## weeklyCustom

Contains an array of 'WeeklyStable' distributions.


`weeklyCustom`

-   is optional
-   Type: `integer[][]` ([DailyMinutes](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-stableperiods-properties-weeklycustom-customweeklystable-dailyminutes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-stableperiods-properties-weeklycustom.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/stablePeriods/properties/weeklyCustom")

### weeklyCustom Type

`integer[][]` ([DailyMinutes](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-stableperiods-properties-weeklycustom-customweeklystable-dailyminutes.md))
