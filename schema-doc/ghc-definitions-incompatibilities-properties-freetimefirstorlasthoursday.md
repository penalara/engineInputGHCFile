# FreeTimeFirstOrLastHoursDay Schema

```txt
engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay
```

Minutes of free time at first or last hours of the day.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freeTimeFirstOrLastHoursDay Type

`object` ([FreeTimeFirstOrLastHoursDay](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday.md))

# FreeTimeFirstOrLastHoursDay Properties

| Property            | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                             |
| :------------------ | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)       | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday-properties-type.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/type")       |
| [minutes](#minutes) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday-properties-minutes.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/minutes") |

## type

Indicate if the incompatibility is a strict, avoid (ponderable for optimization) or ignore.


`type`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday-properties-type.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/type")

### type Type

unknown

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## minutes

Custom time in minutes for incompatibility.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday-properties-minutes.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/minutes")

### minutes Type

`integer`
