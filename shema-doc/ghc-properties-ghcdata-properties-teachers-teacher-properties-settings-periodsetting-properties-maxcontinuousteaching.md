# MaxContinuousTeaching Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/maxContinuousTeaching
```

Indicates the continuous maximum time teaching sessions, that are allowed without have a free gap or a non teaching session in between.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## maxContinuousTeaching Type

`object` ([MaxContinuousTeaching](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching.md))

# MaxContinuousTeaching Properties

| Property              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                      |
| :-------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict)     | `boolean` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching-properties-strict.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/maxContinuousTeaching/properties/strict")     |
| [minutes](#minutes)   | `integer` | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching-properties-minutes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/maxContinuousTeaching/properties/minutes")   |
| [minBreak](#minbreak) | `integer` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching-properties-minbreak.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/maxContinuousTeaching/properties/minBreak") |

## strict

Indicate if it is a strict condition.


`strict`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching-properties-strict.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/maxContinuousTeaching/properties/strict")

### strict Type

`boolean`

## minutes

Maximum continuous teaching time in minutes.


`minutes`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching-properties-minutes.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/maxContinuousTeaching/properties/minutes")

### minutes Type

`integer`

## minBreak

Minimum time gap to considered it as a break.


`minBreak`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-maxcontinuousteaching-properties-minbreak.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/maxContinuousTeaching/properties/minBreak")

### minBreak Type

`integer`

### minBreak Default Value

The default value is:

```json
30
```
