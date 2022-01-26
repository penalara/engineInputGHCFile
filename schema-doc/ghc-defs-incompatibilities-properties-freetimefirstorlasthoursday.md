# FreeTimeFirstOrLastHoursDay Schema

```txt
engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeFirstOrLastHoursDay
```

Minutes of free time at first or last hours of the day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## freeTimeFirstOrLastHoursDay Type

`object` ([FreeTimeFirstOrLastHoursDay](ghc-defs-incompatibilities-properties-freetimefirstorlasthoursday.md))

# freeTimeFirstOrLastHoursDay Properties

| Property            | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                |
| :------------------ | :------------ | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [type](#type)       | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-conditiontype.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/type")                                                                  |
| [minutes](#minutes) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimefirstorlasthoursday-properties-minutes.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/minutes") |

## type

Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

`type`

*   is optional

*   Type: unknown ([ConditionType](ghc-defs-conditiontype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-conditiontype.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/type")

### type Type

unknown ([ConditionType](ghc-defs-conditiontype.md))

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## minutes

Custom time in minutes for incompatibility.

`minutes`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-incompatibilities-properties-freetimefirstorlasthoursday-properties-minutes.md "engineInputGHCSchema#/$defs/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/minutes")

### minutes Type

`integer`
