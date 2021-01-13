# EngineSettings Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/engineSettings
```

Custom parameters about engine configuration.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## engineSettings Type

`object` ([EngineSettings](ghc-properties-ghcdata-properties-enginesettings.md))

# EngineSettings Properties

| Property                                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                         |
| :---------------------------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [teacherBalance](#teacherbalance)               | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-enginesettings-properties-teacherbalance.md "engineInputGHCSchema#/properties/ghcData/properties/engineSettings/properties/teacherBalance")               |
| [countGapsAroundMidday](#countgapsaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-enginesettings-properties-countgapsaroundmidday.md "engineInputGHCSchema#/properties/ghcData/properties/engineSettings/properties/countGapsAroundMidday") |

## teacherBalance

Indicates If the optimizer should balance the timetables of the different teachers, to avoid very bad schedules for a particular teacher.


`teacherBalance`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-enginesettings-properties-teacherbalance.md "engineInputGHCSchema#/properties/ghcData/properties/engineSettings/properties/teacherBalance")

### teacherBalance Type

`boolean`

### teacherBalance Default Value

The default value is:

```json
true
```

## countGapsAroundMidday

Indicates, in case of a split day (with midday break), that the unoccupied intervals between the morning and afternoon class units are counted. This option affect to ponderation at teacher optimization about gaps in it timetable.


`countGapsAroundMidday`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-enginesettings-properties-countgapsaroundmidday.md "engineInputGHCSchema#/properties/ghcData/properties/engineSettings/properties/countGapsAroundMidday")

### countGapsAroundMidday Type

`boolean`

### countGapsAroundMidday Default Value

The default value is:

```json
true
```
