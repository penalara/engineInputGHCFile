# DailyOcupation Schema

```txt
engineInputGHCSchema#/$defs/dailyOcupation
```

Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## dailyOcupation Type

`object` ([DailyOcupation](ghc-defs-dailyocupation.md))

# dailyOcupation Properties

| Property                              | Type      | Required | Nullable       | Defined by                                                                                                                                              |
| :------------------------------------ | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [allowFreeDays](#allowfreedays)       | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-allowfreedays.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/allowFreeDays")       |
| [minimumTeaching](#minimumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-minimumteaching.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/minimumTeaching")   |
| [maximumTeaching](#maximumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-maximumteaching.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/maximumTeaching")   |
| [minimumOccupancy](#minimumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-minimumoccupancy.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/minimumOccupancy") |
| [maximumOccupancy](#maximumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-maximumoccupancy.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/maximumOccupancy") |

## allowFreeDays

It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.

`allowFreeDays`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-allowfreedays.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/allowFreeDays")

### allowFreeDays Type

`boolean`

## minimumTeaching

Minimum teaching time of the teacher with students.

`minimumTeaching`

*   is optional

*   Type: `object` ([MinimumTeaching](ghc-defs-dailyocupation-properties-minimumteaching.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-minimumteaching.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/minimumTeaching")

### minimumTeaching Type

`object` ([MinimumTeaching](ghc-defs-dailyocupation-properties-minimumteaching.md))

## maximumTeaching

Minimum teaching time of the teacher with students.

`maximumTeaching`

*   is optional

*   Type: `object` ([MaximumTeaching](ghc-defs-dailyocupation-properties-maximumteaching.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-maximumteaching.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/maximumTeaching")

### maximumTeaching Type

`object` ([MaximumTeaching](ghc-defs-dailyocupation-properties-maximumteaching.md))

## minimumOccupancy

Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

`minimumOccupancy`

*   is optional

*   Type: `object` ([MinimumOccupancy](ghc-defs-dailyocupation-properties-minimumoccupancy.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-minimumoccupancy.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/minimumOccupancy")

### minimumOccupancy Type

`object` ([MinimumOccupancy](ghc-defs-dailyocupation-properties-minimumoccupancy.md))

## maximumOccupancy

Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

`maximumOccupancy`

*   is optional

*   Type: `object` ([MaximumOccupancy](ghc-defs-dailyocupation-properties-maximumoccupancy.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-dailyocupation-properties-maximumoccupancy.md "engineInputGHCSchema#/$defs/dailyOcupation/properties/maximumOccupancy")

### maximumOccupancy Type

`object` ([MaximumOccupancy](ghc-defs-dailyocupation-properties-maximumoccupancy.md))
