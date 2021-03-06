# FreeTimeFirstOrLastHoursDay Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeFirstOrLastHoursDay
```

Minutes of free time at first or last hours of the day.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freeTimeFirstOrLastHoursDay Type

`object` ([FreeTimeFirstOrLastHoursDay](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimefirstorlasthoursday.md))

# FreeTimeFirstOrLastHoursDay Properties

| Property            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                                                   |
| :------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)   | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimefirstorlasthoursday-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/strict")   |
| [minutes](#minutes) | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimefirstorlasthoursday-properties-minutes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/minutes") |

## strict

Indicate if the incompatibility is a strict condition.


`strict`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimefirstorlasthoursday-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/strict")

### strict Type

`boolean`

## minutes

Custom time in minutes for incompatibility.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-incompatibilities-properties-freetimefirstorlasthoursday-properties-minutes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/minutes")

### minutes Type

`integer`
