# FreeTimes Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes
```

Contains the free spaces of time that the teacher should have.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freeTimes Type

`object` ([FreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes.md))

# FreeTimes Properties

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                    |
| :---------------------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [fullDay](#fullday)                       | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-fulldaysfreetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/fullDay")                      |
| [firstMinutes](#firstminutes)             | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-firstminutesfreetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/firstMinutes")             |
| [lastMinutes](#lastminutes)               | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-lastminutesfreetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/lastMinutes")               |
| [consecutiveAnyTime](#consecutiveanytime) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/consecutiveAnyTime") |

## fullDay

Teacher's full days of free time.


`fullDay`

-   is optional
-   Type: `object` ([FullDaysFreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-fulldaysfreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-fulldaysfreetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/fullDay")

### fullDay Type

`object` ([FullDaysFreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-fulldaysfreetimes.md))

## firstMinutes

Teacher's free intervals at the beginning of the day.


`firstMinutes`

-   is optional
-   Type: `object` ([FirstMinutesFreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-firstminutesfreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-firstminutesfreetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/firstMinutes")

### firstMinutes Type

`object` ([FirstMinutesFreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-firstminutesfreetimes.md))

## lastMinutes

Teacher's free intervals at the end of the day.


`lastMinutes`

-   is optional
-   Type: `object` ([LastMinutesFreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-lastminutesfreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-lastminutesfreetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/lastMinutes")

### lastMinutes Type

`object` ([LastMinutesFreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-lastminutesfreetimes.md))

## consecutiveAnyTime

Teacher's free intervals at any time of the day.


`consecutiveAnyTime`

-   is optional
-   Type: `object` ([ConsecutiveAnyTimeFreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/consecutiveAnyTime")

### consecutiveAnyTime Type

`object` ([ConsecutiveAnyTimeFreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes.md))
