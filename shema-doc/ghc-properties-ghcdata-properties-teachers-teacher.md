# Teacher Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Teacher](ghc-properties-ghcdata-properties-teachers-teacher.md))

# Teacher Properties

| Property                                        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                  |
| :---------------------------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                       | `string` | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-id.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/id")                                       |
| [associationIdentifier](#associationidentifier) | `string` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-associationidentifier.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/associationIdentifier") |
| [frameTemplate](#frametemplate)                 | Merged   | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-frametemplate.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/frameTemplate")                 |
| [settings](#settings)                           | `array`  | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings")                           |

## id




`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-id.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/id")

### id Type

`string`

## associationIdentifier

Group or association of teachers that should have similar of entry and out hours, if it is possible. It's useful for teachers that share transport.


`associationIdentifier`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-associationidentifier.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/associationIdentifier")

### associationIdentifier Type

`string`

## frameTemplate




`frameTemplate`

-   is optional
-   Type: merged type ([Details](ghc-properties-ghcdata-properties-teachers-teacher-properties-frametemplate.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-frametemplate.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/frameTemplate")

### frameTemplate Type

merged type ([Details](ghc-properties-ghcdata-properties-teachers-teacher-properties-frametemplate.md))

all of

-   [FrameTemplate](ghc-definitions-frametemplate.md "check type definition")
-   [Untitled undefined type in JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-frametemplate-allof-1.md "check type definition")

## settings

Teacher's strict and ponderable conditions for the timetable. These can (or not) be different for eacch week/period.


`settings`

-   is optional
-   Type: `object[]` ([PeriodSetting](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings.md "GeneralJsonGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings")

### settings Type

`object[]` ([PeriodSetting](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting.md))
