# FreeTimeAroundMidday Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeAroundMidday
```

Do not have less than a custom free time around noon pause.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freeTimeAroundMidday Type

`object` ([FreeTimeAroundMidday](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimearoundmidday.md))

# FreeTimeAroundMidday Properties

| Property            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                            |
| :------------------ | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)   | `boolean` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimearoundmidday-properties-strict.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeAroundMidday/properties/strict")   |
| [minutes](#minutes) | `integer` | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimearoundmidday-properties-minutes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeAroundMidday/properties/minutes") |

## strict

Indicate if the incompatibility is a strict condition.


`strict`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimearoundmidday-properties-strict.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeAroundMidday/properties/strict")

### strict Type

`boolean`

## minutes

Custom time in minutes for incompatibility.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimearoundmidday-properties-minutes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeAroundMidday/properties/minutes")

### minutes Type

`integer`
