# VariablePeriods Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods
```

The total of the classes of the distribution, are divided among the periods.


> Properties 'weeklyStable' and 'weeklyVariable' are mutually exclusive.
>

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## variablePeriods Type

`object` ([VariablePeriods](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods.md))

# VariablePeriods Properties

| Property                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                               |
| :-------------------------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [weeklyStable](#weeklystable)                 | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/weeklyStable")                                                                                                                  |
| [weeklyVariable](#weeklyvariable)             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/weeklyVariable")                                                                                                              |
| [maximunTimeInPeriod](#maximuntimeinperiod)   | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods-properties-maximuntimeinperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/maximunTimeInPeriod")   |
| [minimnunTimeInPeriod](#minimnuntimeinperiod) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods-properties-minimnuntimeinperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/minimnunTimeInPeriod") |

## weeklyStable

Contains a single possible weekly distribution.


> It indicates a stable distribution (numbers of days and number of sections per asignation day), among all the periods between which it is distributed. It is not the distribution of each period, but the total of this session.
>

`weeklyStable`

-   is optional
-   Type: `integer[]` ([DailyMinutes](ghc-definitions-weeklystable-dailyminutes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystable.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/weeklyStable")

### weeklyStable Type

`integer[]` ([DailyMinutes](ghc-definitions-weeklystable-dailyminutes.md))

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

## maximunTimeInPeriod

Maximum of minutes to assign in each Period. If not defined, it is considered that there is no maximum limit.


`maximunTimeInPeriod`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods-properties-maximuntimeinperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/maximunTimeInPeriod")

### maximunTimeInPeriod Type

`integer`

## minimnunTimeInPeriod

Minimum of minutes to assign in each Period.


`minimnunTimeInPeriod`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-distribution-properties-variableperiods-properties-minimnuntimeinperiod.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/distribution/properties/variablePeriods/properties/minimnunTimeInPeriod")

### minimnunTimeInPeriod Type

`integer`
