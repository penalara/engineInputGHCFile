# MaxContinuousTeaching Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching
```

It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## maxContinuousTeaching Type

`object` ([MaxContinuousTeaching](enginespecification-definitions-maxcontinuousteaching.md))

# maxContinuousTeaching Properties

| Property              | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                        |
| :-------------------- | :------------ | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/type")                                 |
| [minutes](#minutes)   | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/minutes")   |
| [minBreak](#minbreak) | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-minbreak.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/minBreak") |

## type

Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

`type`

*   is optional

*   Type: unknown ([ConditionType](enginespecification-definitions-conditiontype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/type")

### type Type

unknown ([ConditionType](enginespecification-definitions-conditiontype.md))

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

## minutes

Maximum continuous teaching time in minutes.

`minutes`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/minutes")

### minutes Type

`integer`

## minBreak

Minimum time period to be considered as break time

> If not specified, the engine will assign the general value or the default time of 30 minutes.

`minBreak`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-minbreak.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/minBreak")

### minBreak Type

`integer`
