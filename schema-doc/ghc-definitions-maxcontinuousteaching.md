# MaxContinuousTeaching Schema

```txt
engineInputGHCSchema#/definitions/maxContinuousTeaching
```

Indicates the continuous maximum time teaching sessions, that are allowed without have a free gap or a non teaching session in between.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## maxContinuousTeaching Type

`object` ([MaxContinuousTeaching](ghc-definitions-maxcontinuousteaching.md))

# MaxContinuousTeaching Properties

| Property              | Type      | Required | Nullable       | Defined by                                                                                                                                                         |
| :-------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-strict.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/strict")     |
| [minutes](#minutes)   | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minutes.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minutes")   |
| [minBreak](#minbreak) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minbreak.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minBreak") |

## strict

Indicate if it is a strict condition.


> If did not specify, the motor will assign the general value or false as default value.
>

`strict`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-strict.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/strict")

### strict Type

`boolean`

## minutes

Maximum continuous teaching time in minutes.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minutes.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minutes")

### minutes Type

`integer`

## minBreak

Minimum time gap to considered it as a break.


> If did not specify, the motor will assign the general value or default time of 30 minutes.
>

`minBreak`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-maxcontinuousteaching-properties-minbreak.md "engineInputGHCSchema#/definitions/maxContinuousTeaching/properties/minBreak")

### minBreak Type

`integer`
