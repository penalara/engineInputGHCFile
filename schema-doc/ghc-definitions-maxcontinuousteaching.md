# MaxContinuousTeaching Schema

```txt
engineInputGHCSchema#/definitions/maxContinuousTeaching
```

Indicates the continuous maximum time teaching sessions, that are allowed without have a free gap or a non teaching session in between.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## maxContinuousTeaching Type

`object` ([MaxContinuousTeaching](ghc-definitions-maxcontinuousteaching.md))

# MaxContinuousTeaching Properties

| Property              | Type          | Required | Nullable       | Defined by                                                                                                                                                         |
| :-------------------- | ------------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-conditiontype.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/type")                                 |
| [minutes](#minutes)   | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minutes.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minutes")   |
| [minBreak](#minbreak) | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minbreak.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minBreak") |

## type

Indicate if the incompatibility is a strict, avoid (ponderable for optimization) or ignore.


`type`

-   is optional
-   Type: unknown ([ConditionType](ghc-definitions-conditiontype.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-conditiontype.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/type")

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

Maximum continuous teaching time in minutes.


`minutes`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minutes.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minutes")

### minutes Type

`integer`

## minBreak

Minimum time gap to considered it as a break.


> If did not specify, the engine will assign the general value or default time of 30 minutes.
>

`minBreak`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minbreak.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minBreak")

### minBreak Type

`integer`
