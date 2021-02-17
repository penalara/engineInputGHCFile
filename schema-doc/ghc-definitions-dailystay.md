# DailyStay Schema

```txt
engineInputGHCSchema#/definitions/dailyStay
```

This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## dailyStay Type

`object` ([DailyStay](ghc-definitions-dailystay.md))

# DailyStay Properties

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                   |
| :-------------------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailystay-properties-strict.md "engineInputGHCSchema#/definitions/dailyStay/properties/strict")                       |
| [preferable](#preferable)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailystay-properties-preferable.md "engineInputGHCSchema#/definitions/dailyStay/properties/preferable")               |
| [countAroundMidday](#countaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailystay-properties-countaroundmidday.md "engineInputGHCSchema#/definitions/dailyStay/properties/countAroundMidday") |

## strict

Strict time in minutes of maximum daily stay.


`strict`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailystay-properties-strict.md "engineInputGHCSchema#/definitions/dailyStay/properties/strict")

### strict Type

`integer`

## preferable

Ponderable Time in minutes of maximum daily stay.


`preferable`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailystay-properties-preferable.md "engineInputGHCSchema#/definitions/dailyStay/properties/preferable")

### preferable Type

`integer`

## countAroundMidday

It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.


`countAroundMidday`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailystay-properties-countaroundmidday.md "engineInputGHCSchema#/definitions/dailyStay/properties/countAroundMidday")

### countAroundMidday Type

`boolean`

### countAroundMidday Default Value

The default value is:

```json
true
```
