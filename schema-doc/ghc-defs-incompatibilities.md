# Incompatibilities Schema

```txt
engineInputGHCSchema#/$defs/incompatibilities
```

It contains the teacher's incompatibilities on the allocation of class units and rest periods.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## incompatibilities Type

`object` ([Incompatibilities](ghc-defs-incompatibilities.md))

# incompatibilities Properties

| Property                                                                                                                                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                       |
| :-------------------------------------------------------------------------------------------------------------------------------------- | :------------ | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [freeTimeBetweenDayBeforeAndCurrent](#freetimebetweendaybeforeandcurrent)                                                               | `object`      | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimebetweendays.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")                                                               |
| [freeTimeBetweenEndWeekAndStartWeekDays](#freetimebetweenendweekandstartweekdays)                                                       | `object`      | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimebetweenweeksborders.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")                                                   |
| [freeTimeFirstOrLastHoursDay](#freetimefirstorlasthoursday)                                                                             | `object`      | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimefirstorlasthoursday.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeFirstOrLastHoursDay")                                                              |
| [doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection](#donotfinishatlastafternoonsectionifstartedatfirstafternoonsection) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotfinishatlastafternoonsection.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")                  |
| [doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection](#donotfinishatlastmorningsectionifstartedatfirstmorningsection)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsection.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")                        |
| [doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection](#donotfinishatlastmorningsectionifstartatfirstafternoonsection)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection") |
| [doNotFinishAtLastMorningSectionIfHasAfternoonAssignment](#donotfinishatlastmorningsectionifhasafternoonassignment)                     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")                |
| [doNotStartAtFirstMorningSectionIfHasAfternoonAssignment](#donotstartatfirstmorningsectionifhasafternoonassignment)                     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotstartatfirstmorningsection.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")                              |
| [freeTimeAroundMidday](#freetimearoundmidday)                                                                                           | `object`      | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimearoundmidday.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeAroundMidday")                                                                            |

## freeTimeBetweenDayBeforeAndCurrent

Minutes between departure and arrival of the following day.

`freeTimeBetweenDayBeforeAndCurrent`

*   is optional

*   Type: `object` ([FreeTimeBetweenDays](ghc-defs-incompatibilities-properties-freetimebetweendays.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimebetweendays.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")

### freeTimeBetweenDayBeforeAndCurrent Type

`object` ([FreeTimeBetweenDays](ghc-defs-incompatibilities-properties-freetimebetweendays.md))

## freeTimeBetweenEndWeekAndStartWeekDays

Minutes between the end time of the last day of the week and the start time of the following week.

`freeTimeBetweenEndWeekAndStartWeekDays`

*   is optional

*   Type: `object` ([FreeTimeBetweenWeeksBorders](ghc-defs-incompatibilities-properties-freetimebetweenweeksborders.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimebetweenweeksborders.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")

### freeTimeBetweenEndWeekAndStartWeekDays Type

`object` ([FreeTimeBetweenWeeksBorders](ghc-defs-incompatibilities-properties-freetimebetweenweeksborders.md))

## freeTimeFirstOrLastHoursDay

Minutes of free time at first or last hours of the day.

`freeTimeFirstOrLastHoursDay`

*   is optional

*   Type: `object` ([FreeTimeFirstOrLastHoursDay](ghc-defs-incompatibilities-properties-freetimefirstorlasthoursday.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimefirstorlasthoursday.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeFirstOrLastHoursDay")

### freeTimeFirstOrLastHoursDay Type

`object` ([FreeTimeFirstOrLastHoursDay](ghc-defs-incompatibilities-properties-freetimefirstorlasthoursday.md))

## doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection

o not finish at the last hour of the evening and start at the first.

`doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`

*   is optional

*   Type: unknown ([DoNotFinishAtLastAfternoonSection](ghc-defs-incompatibilities-properties-donotfinishatlastafternoonsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotfinishatlastafternoonsection.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")

### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastAfternoonSection](ghc-defs-incompatibilities-properties-donotfinishatlastafternoonsection.md))

### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection

Do not start at the first hour and finish at the last hour of the morning.

`doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`

*   is optional

*   Type: unknown ([DoNotFinishAtLastMorningSection](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsection.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")

### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Type

unknown ([DoNotFinishAtLastMorningSection](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsection.md))

### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection

Do not finish at the last hour of the morning and start at the first hour of the evening.

`doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`

*   is optional

*   Type: unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection")

### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))

### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## doNotFinishAtLastMorningSectionIfHasAfternoonAssignment

Do not finish at the last hour in the morning and have the evening busy.

`doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`

*   is optional

*   Type: unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")

### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](ghc-defs-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))

### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## doNotStartAtFirstMorningSectionIfHasAfternoonAssignment

Do not start at the first hour and keep the evening busy.

`doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`

*   is optional

*   Type: unknown ([DoNotStartAtFirstMorningSection](ghc-defs-incompatibilities-properties-donotstartatfirstmorningsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-donotstartatfirstmorningsection.md "engineInputGHCSchema#/$defs/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")

### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotStartAtFirstMorningSection](ghc-defs-incompatibilities-properties-donotstartatfirstmorningsection.md))

### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## freeTimeAroundMidday

Do not have less than a custom free time around noon pause.

`freeTimeAroundMidday`

*   is optional

*   Type: `object` ([FreeTimeAroundMidday](ghc-defs-incompatibilities-properties-freetimearoundmidday.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimearoundmidday.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeAroundMidday")

### freeTimeAroundMidday Type

`object` ([FreeTimeAroundMidday](ghc-defs-incompatibilities-properties-freetimearoundmidday.md))
