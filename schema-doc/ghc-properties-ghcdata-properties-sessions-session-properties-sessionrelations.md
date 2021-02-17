# SessionRelations Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations
```

It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## sessionRelations Type

`object` ([SessionRelations](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations.md))

# SessionRelations Properties

| Property                                          | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                     |
| :------------------------------------------------ | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refSimultaneusGroup](#refsimultaneusgroup)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-refsimultaneusgroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/refSimultaneusGroup")       |
| [differentDays](#differentdays)                   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays")                   |
| [consecutiveGroup](#consecutivegroup)             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup")             |
| [nonConsecutiveSessions](#nonconsecutivesessions) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/nonConsecutiveSessions") |
| [nonSimultaneus](#nonsimultaneus)                 | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonsimultaneus.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/nonSimultaneus")                 |
| [previousTo](#previousto)                         | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-previousto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/previousTo")                         |
| [afterTo](#afterto)                               | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-afterto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/afterTo")                               |
| [maximumSeparationTo](#maximumseparationto)       | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-maximumseparationto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/maximumSeparationTo")       |
| [minimumSeparationTo](#minimumseparationto)       | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo")       |

## refSimultaneusGroup

Identifier of the group of simultaneous class units of the subject. Indicates that the class units are to be taught at the same time as the group class units. 


`refSimultaneusGroup`

-   is optional
-   Type: `integer` ([RefSimultaneusGroup](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-refsimultaneusgroup.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-refsimultaneusgroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/refSimultaneusGroup")

### refSimultaneusGroup Type

`integer` ([RefSimultaneusGroup](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-refsimultaneusgroup.md))

## differentDays

Conditions on this and another class unit cannot coincide on the same day.


`differentDays`

-   is optional
-   Type: `object` ([DifferentDays](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays")

### differentDays Type

`object` ([DifferentDays](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays.md))

## consecutiveGroup

Contains the references of a continuous sessions group.


`consecutiveGroup`

-   is optional
-   Type: `object` ([ConsecutiveGroup](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup")

### consecutiveGroup Type

`object` ([ConsecutiveGroup](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup.md))

## nonConsecutiveSessions

Identifiers of the sessions which class units must not be consecutive. This is a strict condition.


`nonConsecutiveSessions`

-   is optional
-   Type: `integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/nonConsecutiveSessions")

### nonConsecutiveSessions Type

`integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions-sessionref.md))

### nonConsecutiveSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## nonSimultaneus

Identifiers of the sessions that they should not be assigned at the same time. It is a strict condition.


`nonSimultaneus`

-   is optional
-   Type: `integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonsimultaneus-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonsimultaneus.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/nonSimultaneus")

### nonSimultaneus Type

`integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-nonsimultaneus-sessionref.md))

### nonSimultaneus Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## previousTo

This indicates that this class unit must be allocated on a previous day to the class units in the list. This is a strict condition.


`previousTo`

-   is optional
-   Type: `integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-previousto-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-previousto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/previousTo")

### previousTo Type

`integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-previousto-sessionref.md))

### previousTo Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## afterTo

This indicates that this class unit must be allocated on a subsequent day to the class units in the list. This is a strict condition.


`afterTo`

-   is optional
-   Type: `integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-afterto-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-afterto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/afterTo")

### afterTo Type

`integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-afterto-sessionref.md))

### afterTo Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## maximumSeparationTo

It contains class units to be taught within a maximum number of days of the current class units.


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

It contains class units that must be taught at least a minimum number of days apart from the current class unit. .


`minimumSeparationTo`

-   is optional
-   Type: `object[]` ([MinimumSeparationToSession](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo")

### minimumSeparationTo Type

`object[]` ([MinimumSeparationToSession](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession.md))

### minimumSeparationTo Constraints

**minimum number of items**: the minimum number of items for this array is: `1`
