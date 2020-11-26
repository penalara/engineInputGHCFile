# Incompatibilities Schema

```txt
engineInputGHCSchema#/definitions/incompatibilities
```

Contains teacher's incompatibilities about sessions assignation and rests times.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## incompatibilities Type

`object` ([Incompatibilities](ghc-definitions-incompatibilities.md))

# Incompatibilities Properties

| Property                                                                                                                                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                    |
| :-------------------------------------------------------------------------------------------------------------------------------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [freeTimeBetweenDayBeforeAndCurrent](#freetimebetweendaybeforeandcurrent)                                                               | `object`      | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweendays.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")                                                               |
| [freeTimeBetweenEndWeekAndStartWeekDays](#freetimebetweenendweekandstartweekdays)                                                       | `object`      | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")                                                   |
| [freeTimeFirstOrLastHoursDay](#freetimefirstorlasthoursday)                                                                             | `object`      | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay")                                                              |
| [doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection](#donotfinishatlastafternoonsectionifstartedatfirstafternoonsection) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")                  |
| [doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection](#donotfinishatlastmorningsectionifstartedatfirstmorningsection)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")                        |
| [doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection](#donotfinishatlastmorningsectionifstartatfirstafternoonsection)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection") |
| [doNotFinishAtLastMorningSectionIfHasAfternoonAssignment](#donotfinishatlastmorningsectionifhasafternoonassignment)                     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")                |
| [doNotStartAtFirstMorningSectionIfHasAfternoonAssignment](#donotstartatfirstmorningsectionifhasafternoonassignment)                     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")                              |
| [freeTimeAroundMidday](#freetimearoundmidday)                                                                                           | `object`      | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimearoundmidday.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeAroundMidday")                                                                            |

## freeTimeBetweenDayBeforeAndCurrent

Minutes between the departure and the next day's entry.


`freeTimeBetweenDayBeforeAndCurrent`

-   is optional
-   Type: `object` ([FreeTimeBetweenDays](ghc-definitions-incompatibilities-properties-freetimebetweendays.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweendays.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")

### freeTimeBetweenDayBeforeAndCurrent Type

`object` ([FreeTimeBetweenDays](ghc-definitions-incompatibilities-properties-freetimebetweendays.md))

## freeTimeBetweenEndWeekAndStartWeekDays

Minutes between finishing time on week's last day, and starting time the next week.


`freeTimeBetweenEndWeekAndStartWeekDays`

-   is optional
-   Type: `object` ([FreeTimeBetweenWeeksBorders](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")

### freeTimeBetweenEndWeekAndStartWeekDays Type

`object` ([FreeTimeBetweenWeeksBorders](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders.md))

## freeTimeFirstOrLastHoursDay

Minutes of free time at first or last hours of the day.


`freeTimeFirstOrLastHoursDay`

-   is optional
-   Type: `object` ([FreeTimeFirstOrLastHoursDay](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay")

### freeTimeFirstOrLastHoursDay Type

`object` ([FreeTimeFirstOrLastHoursDay](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday.md))

## doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection

Do not finish at last hour in the afternoon and start at the first one.


`doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`

-   is optional
-   Type: unknown ([DoNotFinishAtLastAfternoonSection](ghc-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")

### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastAfternoonSection](ghc-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md))

### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection

Do not start at first hour and and finish at the last hour of the morning.


`doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`

-   is optional
-   Type: unknown ([DoNotFinishAtLastMorningSection](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")

### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Type

unknown ([DoNotFinishAtLastMorningSection](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md))

### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection

Do not finish at the last hour in the morning and start at the first one in the afternoon.


`doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`

-   is optional
-   Type: unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection")

### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))

### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## doNotFinishAtLastMorningSectionIfHasAfternoonAssignment

Do not finish at the last hour in the morning and have the afternoon occupied.


`doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`

-   is optional
-   Type: unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")

### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))

### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## doNotStartAtFirstMorningSectionIfHasAfternoonAssignment

Do not start at the first hour and have occupation in the afternoon.


`doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`

-   is optional
-   Type: unknown ([DoNotStartAtFirstMorningSection](ghc-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")

### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotStartAtFirstMorningSection](ghc-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md))

### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## freeTimeAroundMidday

Do not have less than a custom free time around noon pause.


`freeTimeAroundMidday`

-   is optional
-   Type: `object` ([FreeTimeAroundMidday](ghc-definitions-incompatibilities-properties-freetimearoundmidday.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimearoundmidday.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeAroundMidday")

### freeTimeAroundMidday Type

`object` ([FreeTimeAroundMidday](ghc-definitions-incompatibilities-properties-freetimearoundmidday.md))
