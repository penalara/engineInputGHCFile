# PeriodSetting Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([PeriodSetting](enginespecification-properties-teachers-teacher-properties-periodssettings-periodsetting.md))

# items Properties

| Property                                            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                 |
| :-------------------------------------------------- | :-------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refPeriod](#refperiod)                             | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-refperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/refPeriod")                             |
| [weeklyStay](#weeklystay)                           | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklystay.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/weeklyStay")                                                                                               |
| [dailyStay](#dailystay)                             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailystay.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/dailyStay")                                                                                                 |
| [avoidGapsBetweenSesions](#avoidgapsbetweensesions) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-avoidgapsbetweensesions.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/avoidGapsBetweenSesions") |
| [maxContinuousTeaching](#maxcontinuousteaching)     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/maxContinuousTeaching")                                                                         |
| [avoidClassesAroundBreak](#avoidclassesaroundbreak) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-avoidclassesaroundbreak.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/avoidClassesAroundBreak") |
| [freeTimes](#freetimes)                             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/freeTimes")                                                                                                 |
| [freePartTimes](#freeparttimes)                     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freeparttime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/freePartTimes")                                                                                          |
| [incompatibilities](#incompatibilities)             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/incompatibilities")                                                                                 |
| [dailyOcupation](#dailyocupation)                   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/dailyOcupation")                                                                                       |
| [middayReference](#middayreference)                 | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-middayreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/middayReference")                                                                                     |
| [dailyBuildingTransfers](#dailybuildingtransfers)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/dailyBuildingTransfers")                                                                       |

## refPeriod

Identifier of the period to which the settings affect.

`refPeriod`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-refperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/refPeriod")

### refPeriod Type

`string`

## weeklyStay

It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.

`weeklyStay`

*   is optional

*   Type: `object` ([WeeklyStay](enginespecification-definitions-weeklystay.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklystay.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/weeklyStay")

### weeklyStay Type

`object` ([WeeklyStay](enginespecification-definitions-weeklystay.md))

## dailyStay

This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.

`dailyStay`

*   is optional

*   Type: `object` ([DailyStay](enginespecification-definitions-dailystay.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailystay.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/dailyStay")

### dailyStay Type

`object` ([DailyStay](enginespecification-definitions-dailystay.md))

## avoidGapsBetweenSesions

It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.

> If did not specify, the engine will assign a true value.

`avoidGapsBetweenSesions`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-avoidgapsbetweensesions.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/avoidGapsBetweenSesions")

### avoidGapsBetweenSesions Type

`boolean`

## maxContinuousTeaching

It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.

`maxContinuousTeaching`

*   is optional

*   Type: `object` ([MaxContinuousTeaching](enginespecification-definitions-maxcontinuousteaching.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/maxContinuousTeaching")

### maxContinuousTeaching Type

`object` ([MaxContinuousTeaching](enginespecification-definitions-maxcontinuousteaching.md))

## avoidClassesAroundBreak

It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised.

`avoidClassesAroundBreak`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-periodssettings-periodsetting-properties-avoidclassesaroundbreak.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/avoidClassesAroundBreak")

### avoidClassesAroundBreak Type

`boolean`

## freeTimes

It contains the free time spaces that the teacher must have.

`freeTimes`

*   is optional

*   Type: `object` ([FreeTimes](enginespecification-definitions-freetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/freeTimes")

### freeTimes Type

`object` ([FreeTimes](enginespecification-definitions-freetimes.md))

## freePartTimes

Free half-time periods .

`freePartTimes`

*   is optional

*   Type: `object` ([FreePartTime](enginespecification-definitions-freeparttime.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freeparttime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/freePartTimes")

### freePartTimes Type

`object` ([FreePartTime](enginespecification-definitions-freeparttime.md))

## incompatibilities

It contains the teacher's incompatibilities on the allocation of class units and rest periods.

`incompatibilities`

*   is optional

*   Type: `object` ([Incompatibilities](enginespecification-definitions-incompatibilities.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/incompatibilities")

### incompatibilities Type

`object` ([Incompatibilities](enginespecification-definitions-incompatibilities.md))

## dailyOcupation

Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.

`dailyOcupation`

*   is optional

*   Type: `object` ([DailyOcupation](enginespecification-definitions-dailyocupation.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/dailyOcupation")

### dailyOcupation Type

`object` ([DailyOcupation](enginespecification-definitions-dailyocupation.md))

## middayReference

It indicate the frame where the teacher takes noon pause.

`middayReference`

*   is optional

*   Type: `object` ([MiddayReference](enginespecification-definitions-middayreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-middayreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/middayReference")

### middayReference Type

`object` ([MiddayReference](enginespecification-definitions-middayreference.md))

## dailyBuildingTransfers

Maximum number of movements between buildings that the teacher can make per day.

`dailyBuildingTransfers`

*   is optional

*   Type: `object` ([DailyBuildingTransfers](enginespecification-definitions-dailybuildingtransfers.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings/items/properties/dailyBuildingTransfers")

### dailyBuildingTransfers Type

`object` ([DailyBuildingTransfers](enginespecification-definitions-dailybuildingtransfers.md))
