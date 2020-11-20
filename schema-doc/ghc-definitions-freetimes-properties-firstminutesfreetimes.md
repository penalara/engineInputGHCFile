# FirstMinutesFreeTimes Schema

```txt
engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes
```

Teacher's free intervals at the beginning of the day.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## firstMinutes Type

`object` ([FirstMinutesFreeTimes](ghc-definitions-freetimes-properties-firstminutesfreetimes.md))

# FirstMinutesFreeTimes Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                    |
| :------------------------------ | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [strictDays](#strictdays)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes-properties-strictdays.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes/properties/strictDays")       |
| [preferredDays](#preferreddays) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes-properties-preferreddays.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes/properties/preferredDays") |
| [minutes](#minutes)             | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes-properties-minutes.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes/properties/minutes")             |

## strictDays

Number of strict days when teacher should have the free interval at the beginning of the day.


`strictDays`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes-properties-strictdays.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes/properties/strictDays")

### strictDays Type

`integer`

## preferredDays

Number of preferred days when teacher should have the free interval at the beginning of the day.


`preferredDays`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes-properties-preferreddays.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes/properties/preferredDays")

### preferredDays Type

`integer`

## minutes

Minutes of free time at the beginning of the day.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-freetimes-properties-firstminutesfreetimes-properties-minutes.md "engineInputGHCSchema#/definitions/freeTimes/properties/firstMinutes/properties/minutes")

### minutes Type

`integer`
