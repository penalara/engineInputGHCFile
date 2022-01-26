# FreeTimeBetweenDays Schema

```txt
engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent
```

Minutes between departure and arrival of the following day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## freeTimeBetweenDayBeforeAndCurrent Type

`object` ([FreeTimeBetweenDays](ghc-definitions-incompatibilities-properties-freetimebetweendays.md))

# freeTimeBetweenDayBeforeAndCurrent Properties

| Property            | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                            |
| :------------------ | :------------ | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [type](#type)       | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-conditiontype.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent/properties/type")                                                          |
| [minutes](#minutes) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweendays-properties-minutes.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent/properties/minutes") |

## type

Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

`type`

*   is optional

*   Type: unknown ([ConditionType](ghc-definitions-conditiontype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-conditiontype.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent/properties/type")

### type Type

unknown ([ConditionType](ghc-definitions-conditiontype.md))

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

*   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweendays-properties-minutes.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent/properties/minutes")

### minutes Type

`integer`
