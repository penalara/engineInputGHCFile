# PeriodSetting Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([PeriodSetting](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings-periodsetting.md))

# PeriodSetting Properties

| Property                                            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                        |
| :-------------------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [refPeriod](#refperiod)                             | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-refperiod.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/refPeriod")                             |
| [weeklyStay](#weeklystay)                           | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/weeklyStay")                                                                                                                  |
| [dailyStay](#dailystay)                             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/dailyStay")                                                                                                                    |
| [avoidGapsBetweenSesions](#avoidgapsbetweensesions) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-avoidgapsbetweensesions.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/avoidGapsBetweenSesions") |
| [maxContinuousTeaching](#maxcontinuousteaching)     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/maxContinuousTeaching")                                                                                            |
| [avoidClassesAroundBreak](#avoidclassesaroundbreak) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-avoidclassesaroundbreak.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/avoidClassesAroundBreak") |
| [freeTimes](#freetimes)                             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/freeTimes")                                                                                                                    |
| [freePartTimes](#freeparttimes)                     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/freePartTimes")                                                                                                             |
| [incompatibilities](#incompatibilities)             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/incompatibilities")                                                                                                    |
| [dailyOcupation](#dailyocupation)                   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/dailyOcupation")                                                                                                          |
| [middayReference](#middayreference)                 | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-middayreference.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/middayReference")                                                                                                        |
| [dailyBuildingTransfers](#dailybuildingtransfers)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/dailyBuildingTransfers")                                                                                          |

## refPeriod

Identifier of the period to which the settings affect.


`refPeriod`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-refperiod.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/refPeriod")

### refPeriod Type

`string`

## weeklyStay

It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.


`weeklyStay`

-   is optional
-   Type: `object` ([WeeklyStay](ghc-definitions-weeklystay.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/weeklyStay")

### weeklyStay Type

`object` ([WeeklyStay](ghc-definitions-weeklystay.md))

## dailyStay

This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.


`dailyStay`

-   is optional
-   Type: `object` ([DailyStay](ghc-definitions-dailystay.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/dailyStay")

### dailyStay Type

`object` ([DailyStay](ghc-definitions-dailystay.md))

## avoidGapsBetweenSesions

It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.


> If did not specify, the engine will assign a true value.
>

`avoidGapsBetweenSesions`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-avoidgapsbetweensesions.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/avoidGapsBetweenSesions")

### avoidGapsBetweenSesions Type

`boolean`

## maxContinuousTeaching

It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.


`maxContinuousTeaching`

-   is optional
-   Type: `object` ([MaxContinuousTeaching](ghc-definitions-maxcontinuousteaching.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/maxContinuousTeaching")

### maxContinuousTeaching Type

`object` ([MaxContinuousTeaching](ghc-definitions-maxcontinuousteaching.md))

## avoidClassesAroundBreak

It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised.


`avoidClassesAroundBreak`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-avoidclassesaroundbreak.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/avoidClassesAroundBreak")

### avoidClassesAroundBreak Type

`boolean`

## freeTimes

It contains the free time spaces that the teacher must have.


`freeTimes`

-   is optional
-   Type: `object` ([FreeTimes](ghc-definitions-freetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/freeTimes")

### freeTimes Type

`object` ([FreeTimes](ghc-definitions-freetimes.md))

## freePartTimes

Free half-time periods .


`freePartTimes`

-   is optional
-   Type: `object` ([FreePartTime](ghc-definitions-freeparttime.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/freePartTimes")

### freePartTimes Type

`object` ([FreePartTime](ghc-definitions-freeparttime.md))

## incompatibilities

It contains the teacher's incompatibilities on the allocation of class units and rest periods.


`incompatibilities`

-   is optional
-   Type: `object` ([Incompatibilities](ghc-definitions-incompatibilities.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/incompatibilities")

### incompatibilities Type

`object` ([Incompatibilities](ghc-definitions-incompatibilities.md))

## dailyOcupation

Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.


`dailyOcupation`

-   is optional
-   Type: `object` ([DailyOcupation](ghc-definitions-dailyocupation.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/dailyOcupation")

### dailyOcupation Type

`object` ([DailyOcupation](ghc-definitions-dailyocupation.md))

## middayReference

It indicate the frame where the teacher takes noon pause.


`middayReference`

-   is optional
-   Type: `object` ([MiddayReference](ghc-definitions-middayreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-middayreference.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/middayReference")

### middayReference Type

`object` ([MiddayReference](ghc-definitions-middayreference.md))

## dailyBuildingTransfers

Maximum number of movements between buildings that the teacher can make per day.


`dailyBuildingTransfers`

-   is optional
-   Type: `object` ([DailyBuildingTransfers](ghc-definitions-dailybuildingtransfers.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings/items/properties/dailyBuildingTransfers")

### dailyBuildingTransfers Type

`object` ([DailyBuildingTransfers](ghc-definitions-dailybuildingtransfers.md))
