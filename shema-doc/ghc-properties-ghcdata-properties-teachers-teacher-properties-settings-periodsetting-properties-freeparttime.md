# FreePartTime Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freePartTimes
```

Half day off periods.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## freePartTimes Type

`object` ([FreePartTime](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime.md))

# FreePartTime Properties

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                          |
| :---------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [mornings](#mornings)         | `object` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-morningsfreeparttimes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freePartTimes/properties/mornings")         |
| [afternoons](#afternoons)     | `object` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-afternoonfreeparttimes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freePartTimes/properties/afternoons")      |
| [indistinctly](#indistinctly) | `object` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-indistinctlyfreeparttimes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freePartTimes/properties/indistinctly") |

## mornings

Mornings off periods.


`mornings`

-   is optional
-   Type: `object` ([MorningsFreePartTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-morningsfreeparttimes.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-morningsfreeparttimes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freePartTimes/properties/mornings")

### mornings Type

`object` ([MorningsFreePartTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-morningsfreeparttimes.md))

## afternoons

Afternoons off periods.


`afternoons`

-   is optional
-   Type: `object` ([AfternoonFreePartTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-afternoonfreeparttimes.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-afternoonfreeparttimes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freePartTimes/properties/afternoons")

### afternoons Type

`object` ([AfternoonFreePartTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-afternoonfreeparttimes.md))

## indistinctly

Indistinctly, mornings or afternoons, off periods.


`indistinctly`

-   is optional
-   Type: `object` ([IndistinctlyFreePartTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-indistinctlyfreeparttimes.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-indistinctlyfreeparttimes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/freePartTimes/properties/indistinctly")

### indistinctly Type

`object` ([IndistinctlyFreePartTimes](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-freeparttime-properties-indistinctlyfreeparttimes.md))
