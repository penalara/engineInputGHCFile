# VariablePeriods Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods
```

The total of the classes of the distribution, are divided among the periods.


> Propeties 'weeklyStable' and 'weeklyVariable' are mutually exclusive (Schema tag 'One Of' is not specified because POJO automatic generation incompatibility).
>

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## variablePeriods Type

`object` ([VariablePeriods](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods.md))

# VariablePeriods Properties

| Property                                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                       |
| :---------------------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [weeklyStable](#weeklystable)                         | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/weeklyStable")                                                                                                                          |
| [weeklyVariable](#weeklyvariable)                     | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/weeklyVariable")                                                                                                                      |
| [maximunSectionsInPeriod](#maximunsectionsinperiod)   | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods-properties-maximunsectionsinperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/maximunSectionsInPeriod")   |
| [minimnunSectionsInPeriod](#minimnunsectionsinperiod) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods-properties-minimnunsectionsinperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/minimnunSectionsInPeriod") |

## weeklyStable

Contains a single possible weekly distribution.


> It indicates a stable distribution (numbers of days and number of sections per asignation day), among all the periods between which it is distributed. It is not the distribution of each period, but the total of this session.
>

`weeklyStable`

-   is optional
-   Type: `integer[]` ([DailySections](ghc-definitions-weeklystable-dailysections.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/weeklyStable")

### weeklyStable Type

`integer[]` ([DailySections](ghc-definitions-weeklystable-dailysections.md))

## weeklyVariable

Define the distribution as a number of sections per week and a maximum range of sections per day.


> It indicates a variable distribution, among all the periods between which it is distributed. It is not the distribution of each period, but the total of this session.
>

`weeklyVariable`

-   is optional
-   Type: `object` ([WeeklyVariable](ghc-definitions-weeklyvariable.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/weeklyVariable")

### weeklyVariable Type

`object` ([WeeklyVariable](ghc-definitions-weeklyvariable.md))

## maximunSectionsInPeriod

Maximum number of sections to assign in each Period. If not defined, it is considered that there is no maximum limit.


`maximunSectionsInPeriod`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods-properties-maximunsectionsinperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/maximunSectionsInPeriod")

### maximunSectionsInPeriod Type

`integer`

## minimnunSectionsInPeriod

Minimum number of sections to assign in each Period.


`minimnunSectionsInPeriod`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods-properties-minimnunsectionsinperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/minimnunSectionsInPeriod")

### minimnunSectionsInPeriod Type

`integer`
