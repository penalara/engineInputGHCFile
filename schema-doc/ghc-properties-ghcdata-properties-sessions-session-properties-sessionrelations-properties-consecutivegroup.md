# ConsecutiveGroup Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup
```

Contains the references of a continuous sessions group.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## consecutiveGroup Type

`object` ([ConsecutiveGroup](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup.md))

# ConsecutiveGroup Properties

| Property                                                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                   |
| :------------------------------------------------------ | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                               | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup/properties/id")                                               |
| [refSessions](#refsessions)                             | `array`       | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup/properties/refSessions")                             |
| [order](#order)                                         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-order.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup/properties/order")                                         |
| [allowBreakBetweenSessions](#allowbreakbetweensessions) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-allowbreakbetweensessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup/properties/allowBreakBetweenSessions") |

## id

Identifier of continuous sessions group.


`id`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup/properties/id")

### id Type

`integer`

## refSessions

Contains the references of a continuous sessions group. Must contain the sesion itself. And the proper order of continuity (for 'order' property).


`refSessions`

-   is required
-   Type: `integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-sessionrefs-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-sessionrefs.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup/properties/refSessions")

### refSessions Type

`integer[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-sessionrefs-sessionref.md))

### refSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## order

Indicates if the sessions must be 'ordered', 'disordered' or 'sameDay' (it does not matter as long as they are assigned on the same day.


`order`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-order.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup/properties/order")

### order Type

unknown

### order Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value          | Explanation |
| :------------- | ----------- |
| `"disordered"` |             |
| `"ordered"`    |             |
| `"sameDay"`    |             |

### order Default Value

The default value is:

```json
"disordered"
```

## allowBreakBetweenSessions

Indicates if break between sessions is allowed to keep the relation .


`allowBreakBetweenSessions`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-consecutivegroup-properties-allowbreakbetweensessions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/consecutiveGroup/properties/allowBreakBetweenSessions")

### allowBreakBetweenSessions Type

`boolean`
