# DailyOcupation Schema

```txt
engineInputGHCSchema#/definitions/dailyOcupation
```

Maximum and minimum values for teaching or activity time for teachers. This object indicates the kind of condition (estrict or ponderable) and if it should be adjusted the automatic calcultation in minutes at engine.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## dailyOcupation Type

`object` ([DailyOcupation](ghc-definitions-dailyocupation.md))

# DailyOcupation Properties

| Property                              | Type      | Required | Nullable       | Defined by                                                                                                                                                           |
| :------------------------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [allowFreeDays](#allowfreedays)       | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-allowfreedays.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/allowFreeDays")       |
| [minimumTeaching](#minimumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumteaching.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching")   |
| [maximumTeaching](#maximumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumteaching.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumTeaching")   |
| [minimumOccupancy](#minimumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumoccupancy.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumOccupancy") |
| [maximumOccupancy](#maximumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumoccupancy.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy") |

## allowFreeDays

Indicates whether the check of the minimums is omitted in case of days without allocation. Prohibited days never are checked.


`allowFreeDays`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-allowfreedays.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/allowFreeDays")

### allowFreeDays Type

`boolean`

## minimumTeaching

Teacher's minimum time of teaching with students.


`minimumTeaching`

-   is optional
-   Type: `object` ([MinimumTeaching](ghc-definitions-dailyocupation-properties-minimumteaching.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumteaching.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching")

### minimumTeaching Type

`object` ([MinimumTeaching](ghc-definitions-dailyocupation-properties-minimumteaching.md))

## maximumTeaching

Teacher's maximum time of teaching with students.


`maximumTeaching`

-   is optional
-   Type: `object` ([MaximumTeaching](ghc-definitions-dailyocupation-properties-maximumteaching.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumteaching.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumTeaching")

### maximumTeaching Type

`object` ([MaximumTeaching](ghc-definitions-dailyocupation-properties-maximumteaching.md))

## minimumOccupancy

Teacher's minimum time of teaching with students and other non-teaching activities indicated as computable.


`minimumOccupancy`

-   is optional
-   Type: `object` ([MinimumOccupancy](ghc-definitions-dailyocupation-properties-minimumoccupancy.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumoccupancy.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumOccupancy")

### minimumOccupancy Type

`object` ([MinimumOccupancy](ghc-definitions-dailyocupation-properties-minimumoccupancy.md))

## maximumOccupancy

Teacher's maximum time of teaching with students and other non-teaching activities indicated as computable.


`maximumOccupancy`

-   is optional
-   Type: `object` ([MaximumOccupancy](ghc-definitions-dailyocupation-properties-maximumoccupancy.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumoccupancy.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy")

### maximumOccupancy Type

`object` ([MaximumOccupancy](ghc-definitions-dailyocupation-properties-maximumoccupancy.md))
