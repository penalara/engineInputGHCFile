# ConsecutiveAnyTimeFreeTimes Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/consecutiveAnyTime
```

Teacher's free intervals at any time of the day.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## consecutiveAnyTime Type

`object` ([ConsecutiveAnyTimeFreeTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes.md))

# ConsecutiveAnyTimeFreeTimes Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                             |
| :------------------------------ | --------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strictDays](#strictdays)       | `integer` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes-properties-strictdays.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/consecutiveAnyTime/properties/strictDays")       |
| [preferredDays](#preferreddays) | `integer` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes-properties-preferreddays.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/consecutiveAnyTime/properties/preferredDays") |
| [minutes](#minutes)             | `integer` | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes-properties-minutes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/consecutiveAnyTime/properties/minutes")             |

## strictDays

Number of strict days when teacher should have the free interval.


`strictDays`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes-properties-strictdays.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/consecutiveAnyTime/properties/strictDays")

### strictDays Type

`integer`

## preferredDays

Number of preferred days when teacher should have the free interval.


`preferredDays`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes-properties-preferreddays.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/consecutiveAnyTime/properties/preferredDays")

### preferredDays Type

`integer`

## minutes

Minutes of free time interval.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freetimes-properties-consecutiveanytimefreetimes-properties-minutes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freeTimes/properties/consecutiveAnyTime/properties/minutes")

### minutes Type

`integer`
