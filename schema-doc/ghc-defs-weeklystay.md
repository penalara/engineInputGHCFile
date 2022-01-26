# WeeklyStay Schema

```txt
engineInputGHCSchema#/$defs/weeklyStay
```

It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## weeklyStay Type

`object` ([WeeklyStay](ghc-defs-weeklystay.md))

# weeklyStay Properties

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                        |
| :-------------------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------ |
| [strict](#strict)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-weeklystay-properties-strict.md "engineInputGHCSchema#/$defs/weeklyStay/properties/strict")                       |
| [preferable](#preferable)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-weeklystay-properties-preferable.md "engineInputGHCSchema#/$defs/weeklyStay/properties/preferable")               |
| [countAroundMidday](#countaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-weeklystay-properties-countaroundmidday.md "engineInputGHCSchema#/$defs/weeklyStay/properties/countAroundMidday") |

## strict

Strict time in minutes of maximum weekly stay.

`strict`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-weeklystay-properties-strict.md "engineInputGHCSchema#/$defs/weeklyStay/properties/strict")

### strict Type

`integer`

## preferable

Ponderable Time in minutes of maximum weeekly stay.

`preferable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-weeklystay-properties-preferable.md "engineInputGHCSchema#/$defs/weeklyStay/properties/preferable")

### preferable Type

`integer`

## countAroundMidday

It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

`countAroundMidday`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-weeklystay-properties-countaroundmidday.md "engineInputGHCSchema#/$defs/weeklyStay/properties/countAroundMidday")

### countAroundMidday Type

`boolean`

### countAroundMidday Default Value

The default value is:

```json
true
```
