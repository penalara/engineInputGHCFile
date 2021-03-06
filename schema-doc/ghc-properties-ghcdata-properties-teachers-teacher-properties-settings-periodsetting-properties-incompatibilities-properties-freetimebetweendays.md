# FreeTimeBetweenDays Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent
```

Minutes between the departure and the next day's entry.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freeTimeBetweenDayBeforeAndCurrent Type

`object` ([FreeTimeBetweenDays](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweendays.md))

# FreeTimeBetweenDays Properties

| Property            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                                                  |
| :------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [strict](#strict)   | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweendays-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent/properties/strict")   |
| [minutes](#minutes) | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweendays-properties-minutes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent/properties/minutes") |

## strict

Indicate if the incompatibility is a strict condition.


`strict`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweendays-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent/properties/strict")

### strict Type

`boolean`

## minutes

Custom time in minutes for incompatibility.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimebetweendays-properties-minutes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent/properties/minutes")

### minutes Type

`integer`
