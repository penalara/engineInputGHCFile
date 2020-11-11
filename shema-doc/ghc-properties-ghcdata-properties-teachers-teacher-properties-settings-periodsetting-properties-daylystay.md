# DaylyStay Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyStay
```

Indicates the maximum teacher´s permanence time,  preferred  and strict , for the daily stay that the teacher can be in the school.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## daylyStay Type

`object` ([DaylyStay](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylystay.md))

# DaylyStay Properties

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                         |
| :-------------------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylystay-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyStay/properties/strict")                       |
| [preferred](#preferred)                 | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylystay-properties-preferred.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyStay/properties/preferred")                 |
| [countAroundMidday](#countaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylystay-properties-countaroundmidday.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyStay/properties/countAroundMidday") |

## strict

Strict time in minutes of maximum daily stay.


`strict`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylystay-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyStay/properties/strict")

### strict Type

`integer`

## preferred

Ponderable Time in minutes of maximum daily stay.


`preferred`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylystay-properties-preferred.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyStay/properties/preferred")

### preferred Type

`integer`

## countAroundMidday

Indicates, in case of a split day, that the unoccupied intervals between the morning and afternoon class units are counted.


`countAroundMidday`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-daylystay-properties-countaroundmidday.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/daylyStay/properties/countAroundMidday")

### countAroundMidday Type

`boolean`
