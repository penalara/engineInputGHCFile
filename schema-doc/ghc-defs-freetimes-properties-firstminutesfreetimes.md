# FirstMinutesFreeTimes Schema

```txt
engineInputGHCSchema#/$defs/freeTimes/properties/firstMinutes
```

Teacher's free intervals at the beginning of the day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## firstMinutes Type

`object` ([FirstMinutesFreeTimes](ghc-defs-freetimes-properties-firstminutesfreetimes.md))

# firstMinutes Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                       |
| :------------------------------ | :-------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strictDays](#strictdays)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freetimes-properties-firstminutesfreetimes-properties-strictdays.md "engineInputGHCSchema#/$defs/freeTimes/properties/firstMinutes/properties/strictDays")       |
| [preferredDays](#preferreddays) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-defs-freetimes-properties-firstminutesfreetimes-properties-preferreddays.md "engineInputGHCSchema#/$defs/freeTimes/properties/firstMinutes/properties/preferredDays") |
| [minutes](#minutes)             | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-defs-freetimes-properties-firstminutesfreetimes-properties-minutes.md "engineInputGHCSchema#/$defs/freeTimes/properties/firstMinutes/properties/minutes")             |

## strictDays

Strict number of days on which the teacher must have the interval free at the beginning of the day.

`strictDays`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freetimes-properties-firstminutesfreetimes-properties-strictdays.md "engineInputGHCSchema#/$defs/freeTimes/properties/firstMinutes/properties/strictDays")

### strictDays Type

`integer`

## preferredDays

Preferred number of days on which the teacher should have the interval free at the beginning of the day.

`preferredDays`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freetimes-properties-firstminutesfreetimes-properties-preferreddays.md "engineInputGHCSchema#/$defs/freeTimes/properties/firstMinutes/properties/preferredDays")

### preferredDays Type

`integer`

## minutes

Minutes of free time at the beginning of the day.

`minutes`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-freetimes-properties-firstminutesfreetimes-properties-minutes.md "engineInputGHCSchema#/$defs/freeTimes/properties/firstMinutes/properties/minutes")

### minutes Type

`integer`
