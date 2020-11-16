# EngineSettings Schema

```txt
engineInputGHCSchema#/properties/engineSettings
```

Custom parameters about engine configuration.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## engineSettings Type

`object` ([EngineSettings](ghc-properties-enginesettings.md))

# EngineSettings Properties

| Property                          | Type      | Required | Nullable       | Defined by                                                                                                                                                     |
| :-------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [teacherBalance](#teacherbalance) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-enginesettings-properties-teacherbalance.md "engineInputGHCSchema#/properties/engineSettings/properties/teacherBalance") |

## teacherBalance

Indicates If the optimizer should balance the timetables of the different teachers, to avoid very bad schedules for a particular teacher.


`teacherBalance`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-enginesettings-properties-teacherbalance.md "engineInputGHCSchema#/properties/engineSettings/properties/teacherBalance")

### teacherBalance Type

`boolean`

### teacherBalance Default Value

The default value is:

```json
true
```
