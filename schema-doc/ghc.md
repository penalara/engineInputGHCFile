# EngineInputGHCSchema Schema

```txt
engineInputGHCSchema
```

Schema document to keep the timetable information that will be created by the PenalaraGHC.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                       |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ---------------------------------------------------------------- |
| Can be instantiated | Yes        | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json](../out/ghc.schema.json "open original schema") |

## EngineInputGHCSchema Type

`object` ([EngineInputGHCSchema](ghc.md))

# EngineInputGHCSchema Properties

| Property                              | Type     | Required | Nullable       | Defined by                                                                                                       |
| :------------------------------------ | -------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------- |
| [versionJson](#versionjson)           | `string` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-schemaversion.md "engineInputGHCSchema#/properties/versionJson")           |
| [createdDate](#createddate)           | `string` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-jsoncreateddate.md "engineInputGHCSchema#/properties/createdDate")         |
| [lastModifiedDate](#lastmodifieddate) | `string` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-jsongenerationdate.md "engineInputGHCSchema#/properties/lastModifiedDate") |
| [ghcData](#ghcdata)                   | `object` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata.md "engineInputGHCSchema#/properties/ghcData")                     |

## versionJson

Version of EngineInputGHCSchema used


`versionJson`

-   is optional
-   Type: `string` ([SchemaVersion](ghc-properties-schemaversion.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-schemaversion.md "engineInputGHCSchema#/properties/versionJson")

### versionJson Type

`string` ([SchemaVersion](ghc-properties-schemaversion.md))

## createdDate

Json generation date.


`createdDate`

-   is optional
-   Type: `string` ([JsonCreatedDate](ghc-properties-jsoncreateddate.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-jsoncreateddate.md "engineInputGHCSchema#/properties/createdDate")

### createdDate Type

`string` ([JsonCreatedDate](ghc-properties-jsoncreateddate.md))

### createdDate Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## lastModifiedDate

Json last modification date.


`lastModifiedDate`

-   is optional
-   Type: `string` ([JsonGenerationDate](ghc-properties-jsongenerationdate.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-jsongenerationdate.md "engineInputGHCSchema#/properties/lastModifiedDate")

### lastModifiedDate Type

`string` ([JsonGenerationDate](ghc-properties-jsongenerationdate.md))

### lastModifiedDate Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## ghcData

Schema of the object that contains the timetable planning data.


`ghcData`

-   is required
-   Type: `object` ([GhcData](ghc-properties-ghcdata.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata.md "engineInputGHCSchema#/properties/ghcData")

### ghcData Type

`object` ([GhcData](ghc-properties-ghcdata.md))

# EngineInputGHCSchema Definitions

## Definitions group conditionType

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/conditionType"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group restrictionType

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/restrictionType"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group ocupationSetting

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/ocupationSetting"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group frameTemplate

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/frameTemplate"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group onCallServiceframeTemplate

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/onCallServiceframeTemplate"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group weeklyStay

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/weeklyStay"}
```

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                     |
| :-------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-strict.md "engineInputGHCSchema#/definitions/weeklyStay/properties/strict")                       |
| [preferable](#preferable)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-preferable.md "engineInputGHCSchema#/definitions/weeklyStay/properties/preferable")               |
| [countAroundMidday](#countaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-countaroundmidday.md "engineInputGHCSchema#/definitions/weeklyStay/properties/countAroundMidday") |

### strict

Strict time in minutes of maximum weekly stay.


`strict`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-strict.md "engineInputGHCSchema#/definitions/weeklyStay/properties/strict")

#### strict Type

`integer`

### preferable

Ponderable Time in minutes of maximum weeekly stay.


`preferable`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-preferable.md "engineInputGHCSchema#/definitions/weeklyStay/properties/preferable")

#### preferable Type

`integer`

### countAroundMidday

It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.


`countAroundMidday`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-countaroundmidday.md "engineInputGHCSchema#/definitions/weeklyStay/properties/countAroundMidday")

#### countAroundMidday Type

`boolean`

#### countAroundMidday Default Value

The default value is:

```json
true
```

## Definitions group dailyStay

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/dailyStay"}
```

| Property                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                   |
| :---------------------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict-1)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailystay-properties-strict.md "engineInputGHCSchema#/definitions/dailyStay/properties/strict")                       |
| [preferable](#preferable-1)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailystay-properties-preferable.md "engineInputGHCSchema#/definitions/dailyStay/properties/preferable")               |
| [countAroundMidday](#countaroundmidday-1) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailystay-properties-countaroundmidday.md "engineInputGHCSchema#/definitions/dailyStay/properties/countAroundMidday") |

### strict

Strict time in minutes of maximum daily stay.


`strict`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailystay-properties-strict.md "engineInputGHCSchema#/definitions/dailyStay/properties/strict")

#### strict Type

`integer`

### preferable

Ponderable Time in minutes of maximum daily stay.


`preferable`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailystay-properties-preferable.md "engineInputGHCSchema#/definitions/dailyStay/properties/preferable")

#### preferable Type

`integer`

### countAroundMidday

It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.


`countAroundMidday`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailystay-properties-countaroundmidday.md "engineInputGHCSchema#/definitions/dailyStay/properties/countAroundMidday")

#### countAroundMidday Type

`boolean`

#### countAroundMidday Default Value

The default value is:

```json
true
```

## Definitions group avoidGapsBetweenSesions

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/avoidGapsBetweenSesions"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group maxContinuousTeaching

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/maxContinuousTeaching"}
```

| Property              | Type          | Required | Nullable       | Defined by                                                                                                                                                          |
| :-------------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [type](#type)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-conditiontype.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/type") |
| [minutes](#minutes)   | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minutes.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minutes")    |
| [minBreak](#minbreak) | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minbreak.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minBreak")  |

### type

Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.


`type`

-   is optional
-   Type: unknown ([ConditionType](ghc-definitions-maxcontinuousteaching-properties-conditiontype.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-conditiontype.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/type")

#### type Type

unknown ([ConditionType](ghc-definitions-maxcontinuousteaching-properties-conditiontype.md))

#### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### minutes

Maximum continuous teaching time in minutes.


`minutes`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minutes.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minutes")

#### minutes Type

`integer`

### minBreak

Minimum time period to be considered as break time


> If not specified, the engine will assign the general value or the default time of 30 minutes.
>

`minBreak`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minbreak.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minBreak")

#### minBreak Type

`integer`

## Definitions group avoidClassesAroundBreak

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/avoidClassesAroundBreak"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group freeTimes

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/freeTimes"}
```

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                              |
| :---------------------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [fullDay](#fullday)                       | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-fulldaysfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/fullDay")                      |
| [firstMinutes](#firstminutes)             | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes")             |
| [lastMinutes](#lastminutes)               | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-lastminutesfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/lastMinutes")               |
| [consecutiveAnyTime](#consecutiveanytime) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-consecutiveanytimefreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/consecutiveAnyTime") |

### fullDay

Teacher's full days of free time.


`fullDay`

-   is optional
-   Type: `object` ([FullDaysFreeTimes](ghc-definitions-freetimes-properties-fulldaysfreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-fulldaysfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/fullDay")

#### fullDay Type

`object` ([FullDaysFreeTimes](ghc-definitions-freetimes-properties-fulldaysfreetimes.md))

### firstMinutes

Teacher's free intervals at the beginning of the day.


`firstMinutes`

-   is optional
-   Type: `object` ([FirstMinutesFreeTimes](ghc-definitions-freetimes-properties-firstminutesfreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes")

#### firstMinutes Type

`object` ([FirstMinutesFreeTimes](ghc-definitions-freetimes-properties-firstminutesfreetimes.md))

### lastMinutes

Teacher's free intervals at the end of the day.


`lastMinutes`

-   is optional
-   Type: `object` ([LastMinutesFreeTimes](ghc-definitions-freetimes-properties-lastminutesfreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-lastminutesfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/lastMinutes")

#### lastMinutes Type

`object` ([LastMinutesFreeTimes](ghc-definitions-freetimes-properties-lastminutesfreetimes.md))

### consecutiveAnyTime

Teacher's free intervals at any time of the day.


`consecutiveAnyTime`

-   is optional
-   Type: `object` ([ConsecutiveAnyTimeFreeTimes](ghc-definitions-freetimes-properties-consecutiveanytimefreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-consecutiveanytimefreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/consecutiveAnyTime")

#### consecutiveAnyTime Type

`object` ([ConsecutiveAnyTimeFreeTimes](ghc-definitions-freetimes-properties-consecutiveanytimefreetimes.md))

## Definitions group freePartTimes

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/freePartTimes"}
```

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                             |
| :---------------------------- | -------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [mornings](#mornings)         | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/mornings")         |
| [afternoons](#afternoons)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/afternoons")      |
| [indistinctly](#indistinctly) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/indistinctly") |

### mornings

Mornings off.


`mornings`

-   is optional
-   Type: `object` ([MorningsFreePartTimes](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/mornings")

#### mornings Type

`object` ([MorningsFreePartTimes](ghc-definitions-freeparttime-properties-morningsfreeparttimes.md))

### afternoons

Afternoons off.


`afternoons`

-   is optional
-   Type: `object` ([AfternoonFreePartTimes](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/afternoons")

#### afternoons Type

`object` ([AfternoonFreePartTimes](ghc-definitions-freeparttime-properties-afternoonfreeparttimes.md))

### indistinctly

Free mornings or evenings indistinctly.


`indistinctly`

-   is optional
-   Type: `object` ([IndistinctlyFreePartTimes](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "engineInputGHCSchema#/definitions/freePartTimes/properties/indistinctly")

#### indistinctly Type

`object` ([IndistinctlyFreePartTimes](ghc-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))

## Definitions group incompatibilities

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/incompatibilities"}
```

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

### freeTimeBetweenDayBeforeAndCurrent

Minutes between departure and arrival of the following day.


`freeTimeBetweenDayBeforeAndCurrent`

-   is optional
-   Type: `object` ([FreeTimeBetweenDays](ghc-definitions-incompatibilities-properties-freetimebetweendays.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweendays.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")

#### freeTimeBetweenDayBeforeAndCurrent Type

`object` ([FreeTimeBetweenDays](ghc-definitions-incompatibilities-properties-freetimebetweendays.md))

### freeTimeBetweenEndWeekAndStartWeekDays

Minutes between the end time of the last day of the week and the start time of the following week.


`freeTimeBetweenEndWeekAndStartWeekDays`

-   is optional
-   Type: `object` ([FreeTimeBetweenWeeksBorders](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")

#### freeTimeBetweenEndWeekAndStartWeekDays Type

`object` ([FreeTimeBetweenWeeksBorders](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders.md))

### freeTimeFirstOrLastHoursDay

Minutes of free time at first or last hours of the day.


`freeTimeFirstOrLastHoursDay`

-   is optional
-   Type: `object` ([FreeTimeFirstOrLastHoursDay](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay")

#### freeTimeFirstOrLastHoursDay Type

`object` ([FreeTimeFirstOrLastHoursDay](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday.md))

### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection

o not finish at the last hour of the evening and start at the first.


`doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`

-   is optional
-   Type: unknown ([DoNotFinishAtLastAfternoonSection](ghc-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")

#### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastAfternoonSection](ghc-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md))

#### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection

Do not start at the first hour and finish at the last hour of the morning.


`doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`

-   is optional
-   Type: unknown ([DoNotFinishAtLastMorningSection](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")

#### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Type

unknown ([DoNotFinishAtLastMorningSection](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md))

#### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection

Do not finish at the last hour of the morning and start at the first hour of the evening.


`doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`

-   is optional
-   Type: unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection")

#### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))

#### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment

Do not finish at the last hour in the morning and have the evening busy.


`doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`

-   is optional
-   Type: unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")

#### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](ghc-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))

#### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment

Do not start at the first hour and keep the evening busy.


`doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`

-   is optional
-   Type: unknown ([DoNotStartAtFirstMorningSection](ghc-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md "engineInputGHCSchema#/definitions/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")

#### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotStartAtFirstMorningSection](ghc-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md))

#### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### freeTimeAroundMidday

Do not have less than a custom free time around noon pause.


`freeTimeAroundMidday`

-   is optional
-   Type: `object` ([FreeTimeAroundMidday](ghc-definitions-incompatibilities-properties-freetimearoundmidday.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimearoundmidday.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeAroundMidday")

#### freeTimeAroundMidday Type

`object` ([FreeTimeAroundMidday](ghc-definitions-incompatibilities-properties-freetimearoundmidday.md))

## Definitions group dailyOcupation

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/dailyOcupation"}
```

| Property                              | Type      | Required | Nullable       | Defined by                                                                                                                                                           |
| :------------------------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [allowFreeDays](#allowfreedays)       | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-allowfreedays.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/allowFreeDays")       |
| [minimumTeaching](#minimumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumteaching.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching")   |
| [maximumTeaching](#maximumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumteaching.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumTeaching")   |
| [minimumOccupancy](#minimumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumoccupancy.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumOccupancy") |
| [maximumOccupancy](#maximumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumoccupancy.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy") |

### allowFreeDays

It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.


`allowFreeDays`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-allowfreedays.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/allowFreeDays")

#### allowFreeDays Type

`boolean`

### minimumTeaching

Minimum teaching time of the teacher with students.


`minimumTeaching`

-   is optional
-   Type: `object` ([MinimumTeaching](ghc-definitions-dailyocupation-properties-minimumteaching.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumteaching.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching")

#### minimumTeaching Type

`object` ([MinimumTeaching](ghc-definitions-dailyocupation-properties-minimumteaching.md))

### maximumTeaching

Minimum teaching time of the teacher with students.


`maximumTeaching`

-   is optional
-   Type: `object` ([MaximumTeaching](ghc-definitions-dailyocupation-properties-maximumteaching.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumteaching.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumTeaching")

#### maximumTeaching Type

`object` ([MaximumTeaching](ghc-definitions-dailyocupation-properties-maximumteaching.md))

### minimumOccupancy

Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.


`minimumOccupancy`

-   is optional
-   Type: `object` ([MinimumOccupancy](ghc-definitions-dailyocupation-properties-minimumoccupancy.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumoccupancy.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumOccupancy")

#### minimumOccupancy Type

`object` ([MinimumOccupancy](ghc-definitions-dailyocupation-properties-minimumoccupancy.md))

### maximumOccupancy

Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.


`maximumOccupancy`

-   is optional
-   Type: `object` ([MaximumOccupancy](ghc-definitions-dailyocupation-properties-maximumoccupancy.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumoccupancy.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy")

#### maximumOccupancy Type

`object` ([MaximumOccupancy](ghc-definitions-dailyocupation-properties-maximumoccupancy.md))

## Definitions group middayReference

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/middayReference"}
```

| Property              | Type      | Required | Nullable       | Defined by                                                                                                                                             |
| :-------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refFrame](#refframe) | `string`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-middayreference-properties-refframe.md "engineInputGHCSchema#/definitions/middayReference/properties/refFrame") |
| [strict](#strict-2)   | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-middayreference-properties-strict.md "engineInputGHCSchema#/definitions/middayReference/properties/strict")     |

### refFrame

Identifier of a frame where the teacher takes noon pause. If not specified, the engine shall take the noon pause of the frame with the highest allocation.


`refFrame`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-middayreference-properties-refframe.md "engineInputGHCSchema#/definitions/middayReference/properties/refFrame")

#### refFrame Type

`string`

### strict

It indicates whether the teacher's noon pause should be respected without placing his or her class units in sections of other frameworks that overlap with his or her noon pause.


`strict`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-middayreference-properties-strict.md "engineInputGHCSchema#/definitions/middayReference/properties/strict")

#### strict Type

`boolean`

#### strict Default Value

The default value is:

```json
true
```

## Definitions group dailyBuildingTransfers

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/dailyBuildingTransfers"}
```

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                               |
| :-------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict-3)         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers-properties-strict.md "engineInputGHCSchema#/definitions/dailyBuildingTransfers/properties/strict")         |
| [preferable](#preferable-2) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers-properties-preferable.md "engineInputGHCSchema#/definitions/dailyBuildingTransfers/properties/preferable") |

### strict

Strict maximum number of movements per day.


`strict`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers-properties-strict.md "engineInputGHCSchema#/definitions/dailyBuildingTransfers/properties/strict")

#### strict Type

`integer`

### preferable

Maximum number of movements per day that can be weighted/preferred.


`preferable`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailybuildingtransfers-properties-preferable.md "engineInputGHCSchema#/definitions/dailyBuildingTransfers/properties/preferable")

#### preferable Type

`integer`

## Definitions group weeklyStable

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/weeklyStable"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group weeklyVariable

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/weeklyVariable"}
```

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                               |
| :---------------------------------------- | ------------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [minutesAmount](#minutesamount)           | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minutesamount.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minutesAmount")           |
| [maxMinutesDaily](#maxminutesdaily)       | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxminutesdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxMinutesDaily")       |
| [minDurationDaily](#mindurationdaily)     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-mindurationdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minDurationDaily")     |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity") |

### minutesAmount

Total of session's weekly minutes.


`minutesAmount`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minutesamount.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minutesAmount")

#### minutesAmount Type

`integer`

### maxMinutesDaily

Maximum of minutes per day.


`maxMinutesDaily`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxminutesdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxMinutesDaily")

#### maxMinutesDaily Type

`integer`

### minDurationDaily

It indicates the preference for class units of minimum duration.


`minDurationDaily`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-mindurationdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minDurationDaily")

#### minDurationDaily Type

unknown

#### minDurationDaily Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"allow"`     |             |
| `"avoid"`     |             |
| `"forbidden"` |             |

#### minDurationDaily Default Value

The default value is:

```json
"allow"
```

### avoidMaxDuration

It indicates the preference for class units of maximum duration.


`avoidMaxDuration`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")

#### avoidMaxDuration Type

`boolean`

### allowDiscontinuity

It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.


`allowDiscontinuity`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity")

#### allowDiscontinuity Type

`boolean`
