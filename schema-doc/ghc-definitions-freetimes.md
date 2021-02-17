# FreeTimes Schema

```txt
engineInputGHCSchema#/definitions/freeTimes
```

It contains the free time spaces that the teacher must have.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freeTimes Type

`object` ([FreeTimes](ghc-definitions-freetimes.md))

# FreeTimes Properties

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                              |
| :---------------------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [fullDay](#fullday)                       | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-fulldaysfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/fullDay")                      |
| [firstMinutes](#firstminutes)             | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes")             |
| [lastMinutes](#lastminutes)               | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-lastminutesfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/lastMinutes")               |
| [consecutiveAnyTime](#consecutiveanytime) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-consecutiveanytimefreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/consecutiveAnyTime") |

## fullDay

Teacher's full days of free time.


`fullDay`

-   is optional
-   Type: `object` ([FullDaysFreeTimes](ghc-definitions-freetimes-properties-fulldaysfreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-fulldaysfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/fullDay")

### fullDay Type

`object` ([FullDaysFreeTimes](ghc-definitions-freetimes-properties-fulldaysfreetimes.md))

## firstMinutes

Teacher's free intervals at the beginning of the day.


`firstMinutes`

-   is optional
-   Type: `object` ([FirstMinutesFreeTimes](ghc-definitions-freetimes-properties-firstminutesfreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes")

### firstMinutes Type

`object` ([FirstMinutesFreeTimes](ghc-definitions-freetimes-properties-firstminutesfreetimes.md))

## lastMinutes

Teacher's free intervals at the end of the day.


`lastMinutes`

-   is optional
-   Type: `object` ([LastMinutesFreeTimes](ghc-definitions-freetimes-properties-lastminutesfreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-lastminutesfreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/lastMinutes")

### lastMinutes Type

`object` ([LastMinutesFreeTimes](ghc-definitions-freetimes-properties-lastminutesfreetimes.md))

## consecutiveAnyTime

Teacher's free intervals at any time of the day.


`consecutiveAnyTime`

-   is optional
-   Type: `object` ([ConsecutiveAnyTimeFreeTimes](ghc-definitions-freetimes-properties-consecutiveanytimefreetimes.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-consecutiveanytimefreetimes.md "engineInputGHCSchema#/definitions/freeTimes/properties/consecutiveAnyTime")

### consecutiveAnyTime Type

`object` ([ConsecutiveAnyTimeFreeTimes](ghc-definitions-freetimes-properties-consecutiveanytimefreetimes.md))
