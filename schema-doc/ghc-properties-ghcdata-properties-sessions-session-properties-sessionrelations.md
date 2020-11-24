# SessionRelations Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations
```

It contains the information on relationships between this and other sessions. These conditions only can apply for teaching sessions with students.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## sessionRelations Type

`object` ([SessionRelations](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations.md))

# SessionRelations Properties

| Property                                          | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                     |
| :------------------------------------------------ | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [simultaneusGroup](#simultaneusgroup)             | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-simultaneusgroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/simultaneusGroup")             |
| [differentDays](#differentdays)                   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays")                   |
| [consecutiveGroup](#consecutivegroup)             | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup")             |
| [nonConsecutiveSessions](#nonconsecutivesessions) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/nonConsecutiveSessions") |
| [previousTo](#previousto)                         | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-previousto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/previousTo")                         |
| [afterTo](#afterto)                               | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-afterto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/afterTo")                               |
| [maximumSeparationTo](#maximumseparationto)       | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-maximumseparationto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/maximumSeparationTo")       |
| [minimumSeparationTo](#minimumseparationto)       | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo")       |

## simultaneusGroup

Identifier of the simultaneous sessions group of the session. Indicates that the sessions must be taught at same time as the sessions of the group.


`simultaneusGroup`

-   is optional
-   Type: `integer` ([SimultaneusGroup](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-simultaneusgroup.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-simultaneusgroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/simultaneusGroup")

### simultaneusGroup Type

`integer` ([SimultaneusGroup](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-simultaneusgroup.md))

## differentDays

Conditions about this and other session can not coincide in the same day.


`differentDays`

-   is optional
-   Type: `object` ([DifferentDays](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays")

### differentDays Type

`object` ([DifferentDays](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays.md))

## consecutiveGroup

Identifier of the consecutive sessions group of the session. Indicates that the sessions must be taught consecutive to the sessions of the group.


`consecutiveGroup`

-   is optional
-   Type: `integer` ([ConsecutiveGroup](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup")

### consecutiveGroup Type

`integer` ([ConsecutiveGroup](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup.md))

## nonConsecutiveSessions

Identifiers of the sessions that they should not be consecutive. It is a strict condition.


`nonConsecutiveSessions`

-   is optional
-   Type: `string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/nonConsecutiveSessions")

### nonConsecutiveSessions Type

`string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions-sessionref.md))

### nonConsecutiveSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## previousTo

Indicates that this session should be assigned in a previous day to the sessions of the list. It is a strict condition.


`previousTo`

-   is optional
-   Type: `string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-previousto-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-previousto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/previousTo")

### previousTo Type

`string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-previousto-sessionref.md))

### previousTo Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## afterTo

Indicates that this session should be assigned in a later day to the sessions of the list. It is a strict condition.


`afterTo`

-   is optional
-   Type: `string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-afterto-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-afterto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/afterTo")

### afterTo Type

`string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-afterto-sessionref.md))

### afterTo Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## maximumSeparationTo

Contains sessions that must be taught a maximum number of days apart from the current session classes.


`maximumSeparationTo`

-   is optional
-   Type: `object[]` ([MaximumSeparationToSession](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-maximumseparationto-maximumseparationtosession.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-maximumseparationto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/maximumSeparationTo")

### maximumSeparationTo Type

`object[]` ([MaximumSeparationToSession](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-maximumseparationto-maximumseparationtosession.md))

### maximumSeparationTo Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## minimumSeparationTo

Contains sessions that must be taught a minimun number of days apart from the current session classes.


`minimumSeparationTo`

-   is optional
-   Type: `object[]` ([MinimumSeparationToSession](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo")

### minimumSeparationTo Type

`object[]` ([MinimumSeparationToSession](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession.md))

### minimumSeparationTo Constraints

**minimum number of items**: the minimum number of items for this array is: `1`
