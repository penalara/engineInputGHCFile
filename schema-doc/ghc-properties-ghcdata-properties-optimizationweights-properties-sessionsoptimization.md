# SessionsOptimization Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions
```

Contains options related to optimizable conditions for all sessions.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## sessions Type

`object` ([SessionsOptimization](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization.md))

# SessionsOptimization Properties

| Property                                            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                           |
| :-------------------------------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [nonPreferredClassRoom](#nonpreferredclassroom)     | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-nonpreferredclassroom.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/nonPreferredClassRoom")     |
| [samePositionEveryPeriod](#samepositioneveryperiod) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-samepositioneveryperiod.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/samePositionEveryPeriod") |

## nonPreferredClassRoom

Indicates the weight of if class units are configured with a preferred classroom and with a group of alternative classrooms, it will be punished with the weight to be placed in one of the alternative classrooms.


`nonPreferredClassRoom`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-nonpreferredclassroom.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/nonPreferredClassRoom")

### nonPreferredClassRoom Type

`integer`

### nonPreferredClassRoom Default Value

The default value is:

```json
3
```

## samePositionEveryPeriod

Indicates the weight of placing the entities of a session that belongs to several periods in the same positions or not (it affects the on call services too).


`samePositionEveryPeriod`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-optimizationweights-properties-sessionsoptimization-properties-samepositioneveryperiod.md "engineInputGHCSchema#/properties/ghcData/properties/optimizationWeights/properties/sessions/properties/samePositionEveryPeriod")

### samePositionEveryPeriod Type

`integer`

### samePositionEveryPeriod Default Value

The default value is:

```json
1
```
