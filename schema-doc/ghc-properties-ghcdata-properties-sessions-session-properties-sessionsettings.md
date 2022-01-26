# SessionSettings Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings
```

Conditions on the position of the class unit.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## sessionSettings Type

`object` ([SessionSettings](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings.md))

# sessionSettings Properties

| Property                                                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                           |
| :------------------------------------------------------------------------ | :------------ | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
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

## avoidFirstHourSessions

It penalises the position of the class units if more than 50% of the class units are at first hour.

`avoidFirstHourSessions`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidfirsthoursessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidFirstHourSessions")

### avoidFirstHourSessions Type

`boolean`

### avoidFirstHourSessions Default Value

The default value is:

```json
true
```

## avoidLastHourSessions

It penalises the position of the class units if more than 50% of the class units are at last hour.

`avoidLastHourSessions`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidlasthoursessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidLastHourSessions")

### avoidLastHourSessions Type

`boolean`

### avoidLastHourSessions Default Value

The default value is:

```json
true
```

## avoidAssingLastHourAndFirstNextDay

It penalises if the last hour and the first hour of the following day match.

`avoidAssingLastHourAndFirstNextDay`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidassinglasthourandfirstnextday.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidAssingLastHourAndFirstNextDay")

### avoidAssingLastHourAndFirstNextDay Type

`boolean`

### avoidAssingLastHourAndFirstNextDay Default Value

The default value is:

```json
true
```

## sameHourPreference

Preference over class units that coincide in the same time slot.

`sameHourPreference`

*   is optional

*   Type: unknown

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-samehourpreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/sameHourPreference")

### sameHourPreference Type

unknown

### sameHourPreference Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"same"`   |             |

### sameHourPreference Default Value

The default value is:

```json
"ignore"
```

## avoidAfternoonSessions

It penalises if there is more than one class unit after noon stop..

`avoidAfternoonSessions`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidafternoonsessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidAfternoonSessions")

### avoidAfternoonSessions Type

`boolean`

### avoidAfternoonSessions Default Value

The default value is:

```json
true
```

## avoidSectionsAfterBreak

It penalises if more than 50% of the class unit are after the last break of the day.

`avoidSectionsAfterBreak`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-avoidsectionsafterbreak.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/avoidSectionsAfterBreak")

### avoidSectionsAfterBreak Type

`boolean`

### avoidSectionsAfterBreak Default Value

The default value is:

```json
true
```

## nonBreakInTheMiddleOfSession

Do not allow breaks between class units of multiple duration (class duration of more than one section).

`nonBreakInTheMiddleOfSession`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-nonbreakinthemiddleofsession.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/nonBreakInTheMiddleOfSession")

### nonBreakInTheMiddleOfSession Type

`boolean`

## followedDaysPreference

If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.

`followedDaysPreference`

*   is optional

*   Type: unknown

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-followeddayspreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/followedDaysPreference")

### followedDaysPreference Type

unknown

### followedDaysPreference Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | :---------- |
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

It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'.

`consecutiveWeeksBorders`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-consecutiveweeksborders.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/consecutiveWeeksBorders")

### consecutiveWeeksBorders Type

`boolean`

## samePositionEveryPeriod

Keep the same position every week or period for the class units.

`samePositionEveryPeriod`

*   is optional

*   Type: unknown ([SamePositionEveryPeriod](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-samepositioneveryperiod.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-samepositioneveryperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/samePositionEveryPeriod")

### samePositionEveryPeriod Type

unknown ([SamePositionEveryPeriod](ghc-properties-ghcdata-properties-sessions-session-properties-sessionsettings-properties-samepositioneveryperiod.md))

### samePositionEveryPeriod Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | :---------- |
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
