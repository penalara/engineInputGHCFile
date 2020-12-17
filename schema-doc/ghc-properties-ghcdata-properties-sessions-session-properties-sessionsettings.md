# SessionSettings Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings
```

Conditions about the position of the session units.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## sessionSettings Type

`object` ([SessionSettings](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings.md))

# SessionSettings Properties

| Property                                                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                           |
| :------------------------------------------------------------------------ | ------------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [computeForMaxMinOccupancy](#computeformaxminoccupancy)                   | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-computeformaxminoccupancy.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/computeForMaxMinOccupancy")                   |
| [avoidFirstHourSessions](#avoidfirsthoursessions)                         | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidfirsthoursessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidFirstHourSessions")                         |
| [avoidLastHourSessions](#avoidlasthoursessions)                           | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidlasthoursessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidLastHourSessions")                           |
| [avoidAssingLastHourAndFirstNextDay](#avoidassinglasthourandfirstnextday) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidassinglasthourandfirstnextday.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidAssingLastHourAndFirstNextDay") |
| [sameHourPreference](#samehourpreference)                                 | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-samehourpreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/sameHourPreference")                                 |
| [avoidAfternoonSessions](#avoidafternoonsessions)                         | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidafternoonsessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidAfternoonSessions")                         |
| [avoidSectionsAfterBreak](#avoidsectionsafterbreak)                       | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidsectionsafterbreak.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidSectionsAfterBreak")                       |
| [nonBreakInTheMiddleOfSession](#nonbreakinthemiddleofsession)             | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-nonbreakinthemiddleofsession.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/nonBreakInTheMiddleOfSession")             |
| [followedDaysPreference](#followeddayspreference)                         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-followeddayspreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/followedDaysPreference")                         |
| [consecutiveWeeksBorders](#consecutiveweeksborders)                       | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-consecutiveweeksborders.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/consecutiveWeeksBorders")                       |
| [samePositionEveryPeriod](#samepositioneveryperiod)                       | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-samepositioneveryperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/samePositionEveryPeriod")                       |

## computeForMaxMinOccupancy

Indicates if the session computes for teacher's daily maximum and minimum of occupancy. By default the engine computes sessions with students.


> If session with students indicate false in this field, is ignored.
>

`computeForMaxMinOccupancy`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-computeformaxminoccupancy.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/computeForMaxMinOccupancy")

### computeForMaxMinOccupancy Type

`boolean`

## avoidFirstHourSessions

Penalize the position of the session if more than 50% of the classes are at first hour.


`avoidFirstHourSessions`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidfirsthoursessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidFirstHourSessions")

### avoidFirstHourSessions Type

`boolean`

### avoidFirstHourSessions Default Value

The default value is:

```json
true
```

## avoidLastHourSessions

Penalize the position of the session if more than 50% of the classes are at last hour.


`avoidLastHourSessions`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidlasthoursessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidLastHourSessions")

### avoidLastHourSessions Type

`boolean`

### avoidLastHourSessions Default Value

The default value is:

```json
true
```

## avoidAssingLastHourAndFirstNextDay

Penalize that the last hour ande the first one of the following day coincide.


`avoidAssingLastHourAndFirstNextDay`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidassinglasthourandfirstnextday.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidAssingLastHourAndFirstNextDay")

### avoidAssingLastHourAndFirstNextDay Type

`boolean`

### avoidAssingLastHourAndFirstNextDay Default Value

The default value is:

```json
true
```

## sameHourPreference

Preference about the session classes coincide in the same time slot.


`sameHourPreference`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-samehourpreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/sameHourPreference")

### sameHourPreference Type

unknown

### sameHourPreference Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"avoid"`     |             |
| `"same"`      |             |
| `"different"` |             |

### sameHourPreference Default Value

The default value is:

```json
"ignore"
```

## avoidAfternoonSessions

Penalize if there are more than one session class after the midday.


`avoidAfternoonSessions`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidafternoonsessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidAfternoonSessions")

### avoidAfternoonSessions Type

`boolean`

### avoidAfternoonSessions Default Value

The default value is:

```json
true
```

## avoidSectionsAfterBreak

Penalize if more than 50% of the classes are after the last break of the day.


`avoidSectionsAfterBreak`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidsectionsafterbreak.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidSectionsAfterBreak")

### avoidSectionsAfterBreak Type

`boolean`

### avoidSectionsAfterBreak Default Value

The default value is:

```json
true
```

## nonBreakInTheMiddleOfSession

Do not allow breaks between classes of multiple duration (classes duration of more than one section).


`nonBreakInTheMiddleOfSession`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-nonbreakinthemiddleofsession.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/nonBreakInTheMiddleOfSession")

### nonBreakInTheMiddleOfSession Type

`boolean`

## followedDaysPreference

If the session has more than one class, it indicates the preference about assign them in consecutive days.


`followedDaysPreference`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-followeddayspreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/followedDaysPreference")

### followedDaysPreference Type

unknown

### followedDaysPreference Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"ignore"`    |             |
| `"attempt"`   |             |
| `"avoid"`     |             |
| `"strict"`    |             |
| `"forbidden"` |             |

### followedDaysPreference Default Value

The default value is:

```json
"ignore"
```

## consecutiveWeeksBorders

Consider the end week day, and start week day, as consecutive days for 'followedDaysPreference'.


`consecutiveWeeksBorders`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-consecutiveweeksborders.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/consecutiveWeeksBorders")

### consecutiveWeeksBorders Type

`boolean`

## samePositionEveryPeriod

Keep the same position each week or period for the classes of the session.


`samePositionEveryPeriod`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-samepositioneveryperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/samePositionEveryPeriod")

### samePositionEveryPeriod Type

unknown

### samePositionEveryPeriod Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"ignore"`    |             |
| `"attempt"`   |             |
| `"avoid"`     |             |
| `"strict"`    |             |
| `"forbidden"` |             |

### samePositionEveryPeriod Default Value

The default value is:

```json
"ignore"
```
