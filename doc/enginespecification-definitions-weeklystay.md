# WeeklyStay Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay
```

It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## weeklyStay Type

`object` ([WeeklyStay](enginespecification-definitions-weeklystay.md))

# weeklyStay Properties

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                    |
| :-------------------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [strict](#strict)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/strict")                       |
| [preferable](#preferable)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/preferable")               |
| [countAroundMidday](#countaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-countaroundmidday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/countAroundMidday") |

## strict

Strict time in minutes of maximum weekly stay.

`strict`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/strict")

### strict Type

`integer`

## preferable

Ponderable Time in minutes of maximum weeekly stay.

`preferable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/preferable")

### preferable Type

`integer`

## countAroundMidday

It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

`countAroundMidday`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-countaroundmidday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/countAroundMidday")

### countAroundMidday Type

`boolean`

### countAroundMidday Default Value

The default value is:

```json
true
```
