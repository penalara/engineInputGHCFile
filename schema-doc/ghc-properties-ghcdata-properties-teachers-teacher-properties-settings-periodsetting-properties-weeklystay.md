# WeeklyStay Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/weeklyStay
```

Indicates the maximum teacher´s permanence time,  preferred  and strict , for the weekly stay that the teacher can be in the school.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## weeklyStay Type

`object` ([WeeklyStay](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay.md))

# WeeklyStay Properties

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                           |
| :-------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/weeklyStay/properties/strict")                       |
| [preferred](#preferred)                 | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay-properties-preferred.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/weeklyStay/properties/preferred")                 |
| [countAroundMidday](#countaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay-properties-countaroundmidday.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/weeklyStay/properties/countAroundMidday") |

## strict

Strict time in minutes of maximum weekly stay.


`strict`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/weeklyStay/properties/strict")

### strict Type

`integer`

## preferred

Ponderable Time in minutes of maximum weeekly stay.


`preferred`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay-properties-preferred.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/weeklyStay/properties/preferred")

### preferred Type

`integer`

## countAroundMidday

Indicates, in case of a split day, that the unoccupied intervals between the morning and afternoon class units are counted each day.


`countAroundMidday`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-weeklystay-properties-countaroundmidday.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/weeklyStay/properties/countAroundMidday")

### countAroundMidday Type

`boolean`
