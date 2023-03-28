# Teacher Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items
```

Object with personal information and teachers' preferences.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Teacher](enginespecification-properties-teachers-teacher.md))

# items Properties

| Property                                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                    |
| :---------------------------------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                       | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/id")                                       |
| [associationIdentifier](#associationidentifier) | `string`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-associationidentifier.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/associationIdentifier") |
| [overlapped](#overlapped)                       | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-overlapped.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/overlapped")                       |
| [frameTemplate](#frametemplate)                 | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-frametemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/frameTemplate")                                            |
| [generalSettings](#generalsettings)             | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-generalsettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/generalSettings")             |
| [periodSettings](#periodsettings)               | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-periodssettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings")              |

## id

Identifier of the teacher.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/id")

### id Type

`string`

## associationIdentifier

Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.

`associationIdentifier`

*   is optional

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-associationidentifier.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/associationIdentifier")

### associationIdentifier Type

`string`

## overlapped

It indicates if the teacher can have overlapped sessions

`overlapped`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-overlapped.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/overlapped")

### overlapped Type

`boolean`

## frameTemplate

Templates with frame sections assignment preferences.

`frameTemplate`

*   is optional

*   Type: `object[]` ([SectionPreference](enginespecification-definitions-frametemplate-sectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-frametemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SectionPreference](enginespecification-definitions-frametemplate-sectionpreference.md))

## generalSettings

Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.

`generalSettings`

*   is optional

*   Type: `object` ([GeneralSettings](enginespecification-properties-teachers-teacher-properties-generalsettings.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-generalsettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/generalSettings")

### generalSettings Type

`object` ([GeneralSettings](enginespecification-properties-teachers-teacher-properties-generalsettings.md))

## periodSettings

Strict and measurable teacher's conditions customized by week/period

`periodSettings`

*   is optional

*   Type: `object[]` ([PeriodSetting](enginespecification-properties-teachers-teacher-properties-periodssettings-periodsetting.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-teachers-teacher-properties-periodssettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers/items/properties/periodSettings")

### periodSettings Type

`object[]` ([PeriodSetting](enginespecification-properties-teachers-teacher-properties-periodssettings-periodsetting.md))
