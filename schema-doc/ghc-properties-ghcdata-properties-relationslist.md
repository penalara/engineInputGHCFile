# RelationsList Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/relationsList
```

Contains relations list of simultaneous and consecutive sessions.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## relationsList Type

`object` ([RelationsList](ghc-properties-ghcdata-properties-relationslist.md))

# RelationsList Properties

| Property                                | Type    | Required | Nullable       | Defined by                                                                                                                                                                                               |
| :-------------------------------------- | ------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [simultaneusGroups](#simultaneusgroups) | `array` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/simultaneusGroups") |
| [consecutiveGroups](#consecutivegroups) | `array` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups") |

## simultaneusGroups

Contains relations list of simultaneous sessions.


`simultaneusGroups`

-   is optional
-   Type: `object[]` ([SimultaneusGroup](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups-simultaneusgroup.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/simultaneusGroups")

### simultaneusGroups Type

`object[]` ([SimultaneusGroup](ghc-properties-ghcdata-properties-relationslist-properties-simultaneusgroups-simultaneusgroup.md))

## consecutiveGroups

List of groups of sessions that must be consecutive or on the same day.


`consecutiveGroups`

-   is optional
-   Type: `object[]` ([ConsecutiveGroup](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups.md "engineInputGHCSchema#/properties/ghcData/properties/relationsList/properties/consecutiveGroups")

### consecutiveGroups Type

`object[]` ([ConsecutiveGroup](ghc-properties-ghcdata-properties-relationslist-properties-consecutivegroups-consecutivegroup.md))
