# PeriodSetting Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([PeriodSetting](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting.md))

# PeriodSetting Properties

| Property                                            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                           |
| :-------------------------------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [context](#context)                                 | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-context.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/context")                                 |
| [weeklyStay](#weeklystay)                           | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/weeklyStay")                           |
| [dailyStay](#dailystay)                             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyStay")                             |
| [avoidGapsBetweenSesions](#avoidgapsbetweensesions) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-avoidgapsbetweensesions.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/avoidGapsBetweenSesions") |
| [maxContinuousTeaching](#maxcontinuousteaching)     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/maxContinuousTeaching")     |
| [avoidClassesAroundBreak](#avoidclassesaroundbreak) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-avoidclassesaroundbreak.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/avoidClassesAroundBreak") |
| [freeTimes](#freetimes)                             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes")                             |
| [freePartTimes](#freeparttimes)                     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freePartTimes")                      |
| [incompatibilities](#incompatibilities)             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities")             |
| [dailyOcupation](#dailyocupation)                   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation")                   |
| [middayReference](#middayreference)                 | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-middayreference.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/middayReference")                 |
| [dailyBuildingTransfers](#dailybuildingtransfers)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailybuildingtransfers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyBuildingTransfers")   |

## context

Defines the period in the timetable when the settings take effect. By default it is 'whole', which indicates that it affects the entire timetable, that is, all its periods.


`context`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-context.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/context")

### context Type

`string`

### context Default Value

The default value is:

```json
"whole"
```

## weeklyStay

Indicates the maximum teacher´s permanence time,  preferred  and strict , for the weekly stay that the teacher can be in the school.


`weeklyStay`

-   is optional
-   Type: `object` ([WeeklyStay](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/weeklyStay")

### weeklyStay Type

`object` ([WeeklyStay](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay.md))

## dailyStay

Indicates the maximum teacher´s permanence time,  preferred  and strict , for the daily stay that the teacher can be in the school.


`dailyStay`

-   is optional
-   Type: `object` ([DailyStay](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailystay.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyStay")

### dailyStay Type

`object` ([DailyStay](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailystay.md))

## avoidGapsBetweenSesions

Indicates if it should avoid free gaps between sessions for the teacher. It is a ponderable condition.


`avoidGapsBetweenSesions`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-avoidgapsbetweensesions.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/avoidGapsBetweenSesions")

### avoidGapsBetweenSesions Type

`boolean`

## maxContinuousTeaching

Indicates the continuous maximum time teaching sessions, that are allowed without have a free gap or a non teaching session in between.


`maxContinuousTeaching`

-   is optional
-   Type: `object` ([MaxContinuousTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/maxContinuousTeaching")

### maxContinuousTeaching Type

`object` ([MaxContinuousTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching.md))

## avoidClassesAroundBreak

Indicate if will penalize the existence of sessions on both sides of a recess guard taught by this teacher.


`avoidClassesAroundBreak`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-avoidclassesaroundbreak.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/avoidClassesAroundBreak")

### avoidClassesAroundBreak Type

`boolean`

## freeTimes

Contains the free spaces of time that the teacher should have.


`freeTimes`

-   is optional
-   Type: `object` ([FreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes")

### freeTimes Type

`object` ([FreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes.md))

## freePartTimes

Half day off periods.


`freePartTimes`

-   is optional
-   Type: `object` ([FreePartTime](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freePartTimes")

### freePartTimes Type

`object` ([FreePartTime](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime.md))

## incompatibilities

Contains teacher's incompatibilities about sessions assignation and rests times.


`incompatibilities`

-   is optional
-   Type: `object` ([Incompatibilities](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities")

### incompatibilities Type

`object` ([Incompatibilities](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities.md))

## dailyOcupation

Maximum and minimum values for teaching or activity time for teachers. This object indicates the kind of condition (estrict or ponderable) and if it should be adjusted the automatic calcultation in minutes at engine.


`dailyOcupation`

-   is optional
-   Type: `object` ([DailyOcupation](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation")

### dailyOcupation Type

`object` ([DailyOcupation](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation.md))

## middayReference

.


`middayReference`

-   is optional
-   Type: `object` ([MiddayReference](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-middayreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-middayreference.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/middayReference")

### middayReference Type

`object` ([MiddayReference](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-middayreference.md))

## dailyBuildingTransfers

.


`dailyBuildingTransfers`

-   is optional
-   Type: `object` ([DailyBuildingTransfers](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailybuildingtransfers.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailybuildingtransfers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyBuildingTransfers")

### dailyBuildingTransfers Type

`object` ([DailyBuildingTransfers](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailybuildingtransfers.md))
