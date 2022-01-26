# FullDaysFreeTimes Schema

```txt
engineInputGHCSchema#/$defs/freeTimes/properties/fullDay
```

Teacher's full days of free time.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## fullDay Type

`object` ([FullDaysFreeTimes](ghc-defs-freetimes-properties-fulldaysfreetimes.md))

# fullDay Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                              |
| :------------------------------ | :-------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strictDays](#strictdays)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freetimes-properties-fulldaysfreetimes-properties-strictdays.md "engineInputGHCSchema#/$defs/freeTimes/properties/fullDay/properties/strictDays")       |
| [preferredDays](#preferreddays) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freetimes-properties-fulldaysfreetimes-properties-preferreddays.md "engineInputGHCSchema#/$defs/freeTimes/properties/fullDay/properties/preferredDays") |

## strictDays

Number of strict days when teacher should be free.

`strictDays`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freetimes-properties-fulldaysfreetimes-properties-strictdays.md "engineInputGHCSchema#/$defs/freeTimes/properties/fullDay/properties/strictDays")

### strictDays Type

`integer`

## preferredDays

Number of preferred days when teacher should be free.

`preferredDays`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freetimes-properties-fulldaysfreetimes-properties-preferreddays.md "engineInputGHCSchema#/$defs/freeTimes/properties/fullDay/properties/preferredDays")

### preferredDays Type

`integer`
