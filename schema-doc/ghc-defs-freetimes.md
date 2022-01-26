# FreeTimes Schema

```txt
engineInputGHCSchema#/$defs/freeTimes
```

It contains the free time spaces that the teacher must have.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## freeTimes Type

`object` ([FreeTimes](ghc-defs-freetimes.md))

# freeTimes Properties

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                 |
| :---------------------------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [fullDay](#fullday)                       | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freetimes-properties-fulldaysfreetimes.md "engineInputGHCSchema#/$defs/freeTimes/properties/fullDay")                      |
| [firstMinutes](#firstminutes)             | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freetimes-properties-firstminutesfreetimes.md "engineInputGHCSchema#/$defs/freeTimes/properties/firstMinutes")             |
| [lastMinutes](#lastminutes)               | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freetimes-properties-lastminutesfreetimes.md "engineInputGHCSchema#/$defs/freeTimes/properties/lastMinutes")               |
| [consecutiveAnyTime](#consecutiveanytime) | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freetimes-properties-consecutiveanytimefreetimes.md "engineInputGHCSchema#/$defs/freeTimes/properties/consecutiveAnyTime") |

## fullDay

Teacher's full days of free time.

`fullDay`

*   is optional

*   Type: `object` ([FullDaysFreeTimes](ghc-defs-freetimes-properties-fulldaysfreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freetimes-properties-fulldaysfreetimes.md "engineInputGHCSchema#/$defs/freeTimes/properties/fullDay")

### fullDay Type

`object` ([FullDaysFreeTimes](ghc-defs-freetimes-properties-fulldaysfreetimes.md))

## firstMinutes

Teacher's free intervals at the beginning of the day.

`firstMinutes`

*   is optional

*   Type: `object` ([FirstMinutesFreeTimes](ghc-defs-freetimes-properties-firstminutesfreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freetimes-properties-firstminutesfreetimes.md "engineInputGHCSchema#/$defs/freeTimes/properties/firstMinutes")

### firstMinutes Type

`object` ([FirstMinutesFreeTimes](ghc-defs-freetimes-properties-firstminutesfreetimes.md))

## lastMinutes

Teacher's free intervals at the end of the day.

`lastMinutes`

*   is optional

*   Type: `object` ([LastMinutesFreeTimes](ghc-defs-freetimes-properties-lastminutesfreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freetimes-properties-lastminutesfreetimes.md "engineInputGHCSchema#/$defs/freeTimes/properties/lastMinutes")

### lastMinutes Type

`object` ([LastMinutesFreeTimes](ghc-defs-freetimes-properties-lastminutesfreetimes.md))

## consecutiveAnyTime

Teacher's free intervals at any time of the day.

`consecutiveAnyTime`

*   is optional

*   Type: `object` ([ConsecutiveAnyTimeFreeTimes](ghc-defs-freetimes-properties-consecutiveanytimefreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freetimes-properties-consecutiveanytimefreetimes.md "engineInputGHCSchema#/$defs/freeTimes/properties/consecutiveAnyTime")

### consecutiveAnyTime Type

`object` ([ConsecutiveAnyTimeFreeTimes](ghc-defs-freetimes-properties-consecutiveanytimefreetimes.md))
