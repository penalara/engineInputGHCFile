# Distribution Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution
```

Contains information on how the classes of the session are distributed throughout the week. Only should contain one element between 'stablePeriods' and 'variablePeriods'.


> Property 'periods' is required if there are more than one period in the timetable. Propeties 'stablePeriods' and 'variablePeriods' are mutually exclusive (Schema tag 'One Of' is not specified because POJO automatic generation incompatibility).
>

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## distribution Type

`object` ([Distribution](ghc-properties-ghcdata-properties-sessions-session-properties-distribution.md))

# Distribution Properties

| Property                            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                               |
| :---------------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [periods](#periods)                 | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-refperiods.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/periods")              |
| [stablePeriods](#stableperiods)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-stableperiods.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/stablePeriods")     |
| [variablePeriods](#variableperiods) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods") |

## periods

List of periods or weeks when the session must be assigned.


`periods`

-   is optional
-   Type: `string[]` ([RefPeriod](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-refperiods-refperiod.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-refperiods.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/periods")

### periods Type

`string[]` ([RefPeriod](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-refperiods-refperiod.md))

## stablePeriods

The session's distribution is equals in each period.


> Only one property can be applied (Schema tag 'One Of' is not specified because POJO automatic generation incompatibility).
>

`stablePeriods`

-   is optional
-   Type: `object` ([StablePeriods](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-stableperiods.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-stableperiods.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/stablePeriods")

### stablePeriods Type

`object` ([StablePeriods](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-stableperiods.md))

## variablePeriods

The total of the classes of the distribution, are divided among the periods.


> Propeties 'weeklyStable' and 'weeklyVariable' are mutually exclusive (Schema tag 'One Of' is not specified because POJO automatic generation incompatibility).
>

`variablePeriods`

-   is optional
-   Type: `object` ([VariablePeriods](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods")

### variablePeriods Type

`object` ([VariablePeriods](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods.md))
