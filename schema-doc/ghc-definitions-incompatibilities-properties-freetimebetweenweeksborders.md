# FreeTimeBetweenWeeksBorders Schema

```txt
engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays
```

Minutes between finishing time on week's last day, and starting time the next week.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freeTimeBetweenEndWeekAndStartWeekDays Type

`object` ([FreeTimeBetweenWeeksBorders](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders.md))

# FreeTimeBetweenWeeksBorders Properties

| Property            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                        |
| :------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [strict](#strict)   | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders-properties-strict.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays/properties/strict")   |
| [minutes](#minutes) | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders-properties-minutes.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays/properties/minutes") |

## strict

Indicate if the incompatibility is a strict condition.


`strict`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders-properties-strict.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays/properties/strict")

### strict Type

`boolean`

## minutes

Custom time in minutes for incompatibility.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-incompatibilities-properties-freetimebetweenweeksborders-properties-minutes.md "engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays/properties/minutes")

### minutes Type

`integer`
