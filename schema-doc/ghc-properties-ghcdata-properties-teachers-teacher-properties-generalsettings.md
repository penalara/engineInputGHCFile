# GeneralSettings Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings
```

Teacher's strict and ponderable conditions for the timetable. If there is not unique periods, these conditios are the default value, but they can be custom specified for each period in the 'periodSettings' tag.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## generalSettings Type

`object` ([GeneralSettings](ghc-properties-ghcdata-properties-teachers-teacher-properties-generalsettings.md))

# GeneralSettings Properties

| Property                                            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                     |
| :-------------------------------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [weeklyStay](#weeklystay)                           | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/weeklyStay")                                                                                                    |
| [dailyStay](#dailystay)                             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/dailyStay")                                                                                                      |
| [avoidGapsBetweenSesions](#avoidgapsbetweensesions) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-generalsettings-properties-avoidgapsbetweensesions.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/avoidGapsBetweenSesions") |
| [maxContinuousTeaching](#maxcontinuousteaching)     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/maxContinuousTeaching")                                                                              |
| [avoidClassesAroundBreak](#avoidclassesaroundbreak) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-generalsettings-properties-avoidclassesaroundbreak.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/avoidClassesAroundBreak") |
| [freeTimes](#freetimes)                             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/freeTimes")                                                                                                      |
| [freePartTimes](#freeparttimes)                     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/freePartTimes")                                                                                               |
| [incompatibilities](#incompatibilities)             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/incompatibilities")                                                                                      |
| [dailyOcupation](#dailyocupation)                   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/dailyOcupation")                                                                                            |
| [middayReference](#middayreference)                 | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-middayreference.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/middayReference")                                                                                          |
| [dailyBuildingTransfers](#dailybuildingtransfers)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/dailyBuildingTransfers")                                                                            |

## weeklyStay

Indicates the maximum teacher´s permanence time,  preferred  and strict , for the weekly stay that the teacher can be in the school.


`weeklyStay`

-   is optional
-   Type: `object` ([WeeklyStay](ghc-definitions-weeklystay.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/weeklyStay")

### weeklyStay Type

`object` ([WeeklyStay](ghc-definitions-weeklystay.md))

## dailyStay

Indicates the maximum teacher´s permanence time,  preferred  and strict , for the daily stay that the teacher can be in the school.


`dailyStay`

-   is optional
-   Type: `object` ([DailyStay](ghc-definitions-dailystay.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailystay.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/dailyStay")

### dailyStay Type

`object` ([DailyStay](ghc-definitions-dailystay.md))

## avoidGapsBetweenSesions

Indicates if it should avoid free gaps between sessions for the teacher. It is a ponderable condition.


> If did not specify, the motor will assign a true value.
>

`avoidGapsBetweenSesions`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-generalsettings-properties-avoidgapsbetweensesions.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/avoidGapsBetweenSesions")

### avoidGapsBetweenSesions Type

`boolean`

## maxContinuousTeaching

Indicates the continuous maximum time teaching sessions, that are allowed without have a free gap or a non teaching session in between.


`maxContinuousTeaching`

-   is optional
-   Type: `object` ([MaxContinuousTeaching](ghc-definitions-maxcontinuousteaching.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/maxContinuousTeaching")

### maxContinuousTeaching Type

`object` ([MaxContinuousTeaching](ghc-definitions-maxcontinuousteaching.md))

## avoidClassesAroundBreak

Indicate if will penalize the existence of sessions on both sides of a recess guard taught by this teacher.


`avoidClassesAroundBreak`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-generalsettings-properties-avoidclassesaroundbreak.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/avoidClassesAroundBreak")

### avoidClassesAroundBreak Type

`boolean`

## freeTimes

Contains the free spaces of time that the teacher should have.


`freeTimes`

-   is optional
-   Type: `object` ([FreeTimes](ghc-definitions-freetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/freeTimes")

### freeTimes Type

`object` ([FreeTimes](ghc-definitions-freetimes.md))

## freePartTimes

Half day off periods.


`freePartTimes`

-   is optional
-   Type: `object` ([FreePartTime](ghc-definitions-freeparttime.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/freePartTimes")

### freePartTimes Type

`object` ([FreePartTime](ghc-definitions-freeparttime.md))

## incompatibilities

Contains teacher's incompatibilities about sessions assignation and rests times.


`incompatibilities`

-   is optional
-   Type: `object` ([Incompatibilities](ghc-definitions-incompatibilities.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/incompatibilities")

### incompatibilities Type

`object` ([Incompatibilities](ghc-definitions-incompatibilities.md))

## dailyOcupation

Maximum and minimum values for teaching or activity time for teachers. This object indicates the kind of condition (estrict or ponderable) and if it should be adjusted the automatic calcultation in minutes at engine.


`dailyOcupation`

-   is optional
-   Type: `object` ([DailyOcupation](ghc-definitions-dailyocupation.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/dailyOcupation")

### dailyOcupation Type

`object` ([DailyOcupation](ghc-definitions-dailyocupation.md))

## middayReference

.


`middayReference`

-   is optional
-   Type: `object` ([MiddayReference](ghc-definitions-middayreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-middayreference.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/middayReference")

### middayReference Type

`object` ([MiddayReference](ghc-definitions-middayreference.md))

## dailyBuildingTransfers

.


`dailyBuildingTransfers`

-   is optional
-   Type: `object` ([DailyBuildingTransfers](ghc-definitions-dailybuildingtransfers.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings/properties/dailyBuildingTransfers")

### dailyBuildingTransfers Type

`object` ([DailyBuildingTransfers](ghc-definitions-dailybuildingtransfers.md))
