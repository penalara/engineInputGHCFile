# Incompatibilities Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities
```

It contains the teacher's incompatibilities on the allocation of class units and rest periods.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## incompatibilities Type

`object` ([Incompatibilities](enginespecification-definitions-incompatibilities.md))

# incompatibilities Properties

| Property                                                                                                                                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                   |
| :-------------------------------------------------------------------------------------------------------------------------------------- | :------------ | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [freeTimeBetweenDayBeforeAndCurrent](#freetimebetweendaybeforeandcurrent)                                                               | `object`      | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")                                                                                          |
| [freeTimeBetweenEndWeekAndStartWeekDays](#freetimebetweenendweekandstartweekdays)                                                       | `object`      | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")                                                                                      |
| [freeTimeFirstOrLastHoursDay](#freetimefirstorlasthoursday)                                                                             | `object`      | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay")                                                                                                 |
| [doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection](#donotfinishatlastafternoonsectionifstartedatfirstafternoonsection) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")                  |
| [doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection](#donotfinishatlastmorningsectionifstartedatfirstmorningsection)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")                        |
| [doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection](#donotfinishatlastmorningsectionifstartatfirstafternoonsection)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection") |
| [doNotFinishAtLastMorningSectionIfHasAfternoonAssignment](#donotfinishatlastmorningsectionifhasafternoonassignment)                     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")                |
| [doNotStartAtFirstMorningSectionIfHasAfternoonAssignment](#donotstartatfirstmorningsectionifhasafternoonassignment)                     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")                              |
| [freeTimeAroundMidday](#freetimearoundmidday)                                                                                           | `object`      | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeAroundMidday")                                                                                                        |

## freeTimeBetweenDayBeforeAndCurrent

Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.

`freeTimeBetweenDayBeforeAndCurrent`

*   is optional

*   Type: `object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")

### freeTimeBetweenDayBeforeAndCurrent Type

`object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

## freeTimeBetweenEndWeekAndStartWeekDays

Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.

`freeTimeBetweenEndWeekAndStartWeekDays`

*   is optional

*   Type: `object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")

### freeTimeBetweenEndWeekAndStartWeekDays Type

`object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

## freeTimeFirstOrLastHoursDay

Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.

`freeTimeFirstOrLastHoursDay`

*   is optional

*   Type: `object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay")

### freeTimeFirstOrLastHoursDay Type

`object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

## doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection

o not finish at the last hour of the evening and start at the first.

`doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`

*   is optional

*   Type: unknown ([DoNotFinishAtLastAfternoonSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")

### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastAfternoonSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md))

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

*   Type: unknown ([DoNotFinishAtLastMorningSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")

### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Type

unknown ([DoNotFinishAtLastMorningSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md))

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

*   Type: unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection")

### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))

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

*   Type: unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")

### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))

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

*   Type: unknown ([DoNotStartAtFirstMorningSection](enginespecification-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")

### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotStartAtFirstMorningSection](enginespecification-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md))

### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## freeTimeAroundMidday

Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.

`freeTimeAroundMidday`

*   is optional

*   Type: `object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeAroundMidday")

### freeTimeAroundMidday Type

`object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))
