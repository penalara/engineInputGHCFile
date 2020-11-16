# DailyOcupation Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation
```

Maximum and minimum values for teaching or activity time for teachers. This object indicates the kind of condition (estrict or ponderable) and if it should be adjusted the automatic calcultation in minutes at engine.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## dailyOcupation Type

`object` ([DailyOcupation](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation.md))

# DailyOcupation Properties

| Property                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                 |
| :------------------------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [allowFreeDays](#allowfreedays)       | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-allowfreedays.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/allowFreeDays")       |
| [minimumTeaching](#minimumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-minimumteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/minimumTeaching")   |
| [maximumTeaching](#maximumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-maximumteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/maximumTeaching")   |
| [minimumOccupancy](#minimumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-minimumoccupancy.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/minimumOccupancy") |
| [maximumOccupancy](#maximumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-maximumoccupancy.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/maximumOccupancy") |

## allowFreeDays

Indicates whether the check of the minimums is omitted in case of days without allocation. Prohibited days never are not checked.


`allowFreeDays`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-allowfreedays.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/allowFreeDays")

### allowFreeDays Type

`boolean`

## minimumTeaching

Teacher's minimum time of teaching with students.


`minimumTeaching`

-   is optional
-   Type: `object` ([MinimumTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-minimumteaching.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-minimumteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/minimumTeaching")

### minimumTeaching Type

`object` ([MinimumTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-minimumteaching.md))

## maximumTeaching

Teacher's maximum time of teaching with students.


`maximumTeaching`

-   is optional
-   Type: `object` ([MaximumTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-maximumteaching.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-maximumteaching.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/maximumTeaching")

### maximumTeaching Type

`object` ([MaximumTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-maximumteaching.md))

## minimumOccupancy

Teacher's minimum time of teaching with students and other non-teaching activities indicated as computable.


`minimumOccupancy`

-   is optional
-   Type: `object` ([MinimumOccupancy](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-minimumoccupancy.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-minimumoccupancy.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/minimumOccupancy")

### minimumOccupancy Type

`object` ([MinimumOccupancy](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-minimumoccupancy.md))

## maximumOccupancy

Teacher's maximum time of teaching with students and other non-teaching activities indicated as computable.


`maximumOccupancy`

-   is optional
-   Type: `object` ([MaximumOccupancy](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-maximumoccupancy.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-maximumoccupancy.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/dailyOcupation/properties/maximumOccupancy")

### maximumOccupancy Type

`object` ([MaximumOccupancy](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-dailyocupation-properties-maximumoccupancy.md))
