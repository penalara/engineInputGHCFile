# ConditionTypeWithTime Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime
```

Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## conditionTypeWithTime Type

`object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

# conditionTypeWithTime Properties

| Property            | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                      |
| :------------------ | :------------ | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)       | Not specified | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime/properties/type")                               |
| [minutes](#minutes) | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime/properties/minutes") |

## type

Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

`type`

*   is required

*   Type: unknown ([ConditionType](enginespecification-definitions-conditiontype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime/properties/type")

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

Custom time in minutes for condition.

`minutes`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime/properties/minutes")

### minutes Type

`integer`
