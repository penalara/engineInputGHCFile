# MinimumSeparationToSession Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items
```

It contains session identifier of the class unit to be taught with a number of days apart, and the minimum days.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([MinimumSeparationToSession](enginespecification-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession.md))

# items Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                                                                       |
| :-------------------------- | :-------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refSessions](#refsessions) | `array`   | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/refSessions") |
| [days](#days)               | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-days.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/days")               |

## refSessions

List of sessions references.

`refSessions`

*   is required

*   Type: `integer[]` ([SessionRef](enginespecification-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs-sessionref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/refSessions")

### refSessions Type

`integer[]` ([SessionRef](enginespecification-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-sessionrefs-sessionref.md))

### refSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## days

Days of separation condition. If the value is 0 or 1 it is equivalent to the condition 'DifferentDays'.

`days`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations-properties-minimumseparationto-minimumseparationtosession-properties-days.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/minimumSeparationTo/items/properties/days")

### days Type

`integer`
