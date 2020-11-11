# Incompatibilities Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities
```

Contains teacher's incompatibilities about sessions assignation and rests times.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## incompatibilities Type

`object` ([Incompatibilities](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities.md))

# Incompatibilities Properties

| Property                                                                                                                                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                                                                          |
| :-------------------------------------------------------------------------------------------------------------------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [freeTimeBetweenDayBeforeAndCurrent](#freetimebetweendaybeforeandcurrent)                                                               | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweendays.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")                                                               |
| [freeTimeBetweenEndWeekAndStartWeekDays](#freetimebetweenendweekandstartweekdays)                                                       | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweenweeksborders.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")                                                   |
| [freeTimeFirstOrLastHoursDay](#freetimefirstorlasthoursday)                                                                             | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimefirstorlasthoursday.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeFirstOrLastHoursDay")                                                              |
| [doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection](#donotfinishatlastafternoonsectionifstartedatfirstafternoonsection) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastafternoonsection.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")                  |
| [doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection](#donotfinishatlastmorningsectionifstartedatfirstmorningsection)         | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsection.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")                        |
| [doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection](#donotfinishatlastmorningsectionifstartatfirstafternoonsection)         | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection") |
| [doNotFinishAtLastMorningSectionIfHasAfternoonAssignment](#donotfinishatlastmorningsectionifhasafternoonassignment)                     | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")                |
| [doNotStartAtFirstMorningSectionIfHasAfternoonAssignment](#donotstartatfirstmorningsectionifhasafternoonassignment)                     | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotstartatfirstmorningsection.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")                              |
| [freeTimeAroundMidday](#freetimearoundmidday)                                                                                           | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimearoundmidday.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeAroundMidday")                                                                            |

## freeTimeBetweenDayBeforeAndCurrent

Minutes between the departure and the next day's entry.


`freeTimeBetweenDayBeforeAndCurrent`

-   is optional
-   Type: `object` ([FreeTimeBetweenDays](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweendays.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweendays.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")

### freeTimeBetweenDayBeforeAndCurrent Type

`object` ([FreeTimeBetweenDays](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweendays.md))

## freeTimeBetweenEndWeekAndStartWeekDays

Minutes between finishing time on week's last day, and starting time the next week.


`freeTimeBetweenEndWeekAndStartWeekDays`

-   is optional
-   Type: `object` ([FreeTimeBetweenWeeksBorders](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweenweeksborders.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweenweeksborders.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")

### freeTimeBetweenEndWeekAndStartWeekDays Type

`object` ([FreeTimeBetweenWeeksBorders](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweenweeksborders.md))

## freeTimeFirstOrLastHoursDay

Minutes of free time at first or last hours of the day.


`freeTimeFirstOrLastHoursDay`

-   is optional
-   Type: `object` ([FreeTimeFirstOrLastHoursDay](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimefirstorlasthoursday.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimefirstorlasthoursday.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeFirstOrLastHoursDay")

### freeTimeFirstOrLastHoursDay Type

`object` ([FreeTimeFirstOrLastHoursDay](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimefirstorlasthoursday.md))

## doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection

Do not finish at last hour in the afternoon and start at the first one.


`doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`

-   is optional
-   Type: `object` ([DoNotFinishAtLastAfternoonSection](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastafternoonsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastafternoonsection.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")

### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Type

`object` ([DoNotFinishAtLastAfternoonSection](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastafternoonsection.md))

## doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection

Do not start at first hour and and finish at the last hour of the morning.


`doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`

-   is optional
-   Type: `object` ([DoNotFinishAtLastMorningSection](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsection.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")

### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Type

`object` ([DoNotFinishAtLastMorningSection](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsection.md))

## doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection

Do not finish at the last hour in the morning and start at the first one in the afternoon.


`doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`

-   is optional
-   Type: `object` ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection")

### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Type

`object` ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))

## doNotFinishAtLastMorningSectionIfHasAfternoonAssignment

Do not finish at the last hour in the morning and have the afternoon occupied.


`doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`

-   is optional
-   Type: `object` ([DoNotFinishAtLastMorningSectionIfHasAfternoon](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")

### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Type

`object` ([DoNotFinishAtLastMorningSectionIfHasAfternoon](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))

## doNotStartAtFirstMorningSectionIfHasAfternoonAssignment

Do not start at the first hour and have occupation in the afternoon.


`doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`

-   is optional
-   Type: `object` ([DoNotStartAtFirstMorningSection](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotstartatfirstmorningsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotstartatfirstmorningsection.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")

### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Type

`object` ([DoNotStartAtFirstMorningSection](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-donotstartatfirstmorningsection.md))

## freeTimeAroundMidday

Do not have less than a custom free time around noon pause.


`freeTimeAroundMidday`

-   is optional
-   Type: `object` ([FreeTimeAroundMidday](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimearoundmidday.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimearoundmidday.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeAroundMidday")

### freeTimeAroundMidday Type

`object` ([FreeTimeAroundMidday](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimearoundmidday.md))
