# DaylyOcupation Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation
```

Maximum and minimum values for teaching or activity time for teachers. This object indicates the kind of condition (estrict or ponderable) and if it should be adjusted the automatic calcultation in minutes at engine.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## daylyOcupation Type

`object` ([DaylyOcupation](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation.md))

# DaylyOcupation Properties

| Property                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                        |
| :------------------------------------ | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [allowFreeDays](#allowfreedays)       | `boolean` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-allowfreedays.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/allowFreeDays")       |
| [minimumTeaching](#minimumteaching)   | `object`  | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-minimumteaching.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/minimumTeaching")   |
| [maximumTeaching](#maximumteaching)   | `object`  | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-maximumteaching.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/maximumTeaching")   |
| [minimumOccupancy](#minimumoccupancy) | `object`  | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-minimumoccupancy.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/minimumOccupancy") |
| [maximumOccupancy](#maximumoccupancy) | `object`  | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-maximumoccupancy.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/maximumOccupancy") |

## allowFreeDays

Indicates whether the check of the minimums is omitted in case of days without allocation. Prohibited days never are not checked.


`allowFreeDays`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-allowfreedays.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/allowFreeDays")

### allowFreeDays Type

`boolean`

## minimumTeaching

Teacher's minimum time of teaching with students.


`minimumTeaching`

-   is optional
-   Type: `object` ([MinimumTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-minimumteaching.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-minimumteaching.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/minimumTeaching")

### minimumTeaching Type

`object` ([MinimumTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-minimumteaching.md))

## maximumTeaching

Teacher's maximun time of teaching with students.


`maximumTeaching`

-   is optional
-   Type: `object` ([MaximumTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-maximumteaching.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-maximumteaching.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/maximumTeaching")

### maximumTeaching Type

`object` ([MaximumTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-maximumteaching.md))

## minimumOccupancy

Teacher's minimum time of teaching with students and other non-teaching activities indicated as computable.


`minimumOccupancy`

-   is optional
-   Type: `object` ([MinimumOccupancy](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-minimumoccupancy.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-minimumoccupancy.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/minimumOccupancy")

### minimumOccupancy Type

`object` ([MinimumOccupancy](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-minimumoccupancy.md))

## maximumOccupancy

Teacher's maximun time of teaching with students and other non-teaching activities indicated as computable.


`maximumOccupancy`

-   is optional
-   Type: `object` ([MaximumOccupancy](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-maximumoccupancy.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-maximumoccupancy.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyOcupation/properties/maximumOccupancy")

### maximumOccupancy Type

`object` ([MaximumOccupancy](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylyocupation-properties-maximumoccupancy.md))
