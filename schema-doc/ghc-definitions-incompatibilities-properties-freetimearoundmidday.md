# FreeTimeAroundMidday Schema

```txt
engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeAroundMidday
```

Do not have less than a custom free time around noon pause.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freeTimeAroundMidday Type

`object` ([FreeTimeAroundMidday](ghc-definitions-incompatibilities-properties-freetimearoundmidday.md))

# FreeTimeAroundMidday Properties

| Property            | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                               |
| :------------------ | ------------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)       | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-conditiontype.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeAroundMidday/properties/type")                                                           |
| [minutes](#minutes) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimearoundmidday-properties-minutes.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeAroundMidday/properties/minutes") |

## type

Indicate if the incompatibility is a strict, avoid (ponderable for optimization) or ignore.


`type`

-   is optional
-   Type: unknown ([ConditionType](ghc-definitions-conditiontype.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-conditiontype.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeAroundMidday/properties/type")

### type Type

unknown ([ConditionType](ghc-definitions-conditiontype.md))

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
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimearoundmidday-properties-minutes.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeAroundMidday/properties/minutes")

### minutes Type

`integer`
