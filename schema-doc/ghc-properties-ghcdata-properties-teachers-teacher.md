# Teacher Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items
```

Object with personal information and preferences from the teacher.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Teacher](ghc-properties-ghcdata-properties-teachers-teacher.md))

# Teacher Properties

| Property                                        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                           |
| :---------------------------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                       | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/id")                                       |
| [associationIdentifier](#associationidentifier) | `string` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-associationidentifier.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/associationIdentifier") |
| [frameTemplate](#frametemplate)                 | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/frameTemplate")                                                               |
| [generalSettings](#generalsettings)             | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-generalsettings.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings")             |
| [periodSettings](#periodsettings)               | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings")              |

## id




`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/id")

### id Type

`string`

## associationIdentifier

Group or association of teachers that should have similar of entry and out hours, if it is possible. It's useful for teachers that share transport.


`associationIdentifier`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-associationidentifier.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/associationIdentifier")

### associationIdentifier Type

`string`

## frameTemplate

Templates with assignment preferences to section of the frames.


`frameTemplate`

-   is optional
-   Type: `object[]` ([SectionPreference](ghc-definitions-frametemplate-sectionpreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SectionPreference](ghc-definitions-frametemplate-sectionpreference.md))

## generalSettings

Teacher's strict and ponderable conditions for the timetable. If there is not unique periods, these conditios are the default value, but they can be custom specified for each period in the 'periodSettings' tag.


`generalSettings`

-   is optional
-   Type: `object` ([GeneralSettings](ghc-properties-ghcdata-properties-teachers-teacher-properties-generalsettings.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-generalsettings.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/generalSettings")

### generalSettings Type

`object` ([GeneralSettings](ghc-properties-ghcdata-properties-teachers-teacher-properties-generalsettings.md))

## periodSettings

Teacher's strict and ponderable conditions,customized for each week/period


`periodSettings`

-   is optional
-   Type: `object[]` ([PeriodSetting](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings-periodsetting.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/periodSettings")

### periodSettings Type

`object[]` ([PeriodSetting](ghc-properties-ghcdata-properties-teachers-teacher-properties-periodssettings-periodsetting.md))
