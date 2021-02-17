# WeeklyStay Schema

```txt
engineInputGHCSchema#/definitions/weeklyStay
```

It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## weeklyStay Type

`object` ([WeeklyStay](ghc-definitions-weeklystay.md))

# WeeklyStay Properties

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                     |
| :-------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-strict.md "engineInputGHCSchema#/definitions/weeklyStay/properties/strict")                       |
| [preferable](#preferable)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-preferable.md "engineInputGHCSchema#/definitions/weeklyStay/properties/preferable")               |
| [countAroundMidday](#countaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-countaroundmidday.md "engineInputGHCSchema#/definitions/weeklyStay/properties/countAroundMidday") |

## strict

Strict time in minutes of maximum weekly stay.


`strict`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-strict.md "engineInputGHCSchema#/definitions/weeklyStay/properties/strict")

### strict Type

`integer`

## preferable

Ponderable Time in minutes of maximum weeekly stay.


`preferable`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-preferable.md "engineInputGHCSchema#/definitions/weeklyStay/properties/preferable")

### preferable Type

`integer`

## countAroundMidday

It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.


`countAroundMidday`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklystay-properties-countaroundmidday.md "engineInputGHCSchema#/definitions/weeklyStay/properties/countAroundMidday")

### countAroundMidday Type

`boolean`

### countAroundMidday Default Value

The default value is:

```json
true
```
