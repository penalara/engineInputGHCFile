# OnCallSectionPreference Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate/items
```

Template with a teacher section assignment preference about the service.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([OnCallSectionPreference](enginespecification-definitions-oncalltemplate-oncallsectionpreference.md))

# items Properties

| Property        | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                         |
| :-------------- | :------------ | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer`     | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate/items/properties/day")                                |
| [index](#index) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate/items/properties/index")                            |
| [frame](#frame) | `string`      | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-frame.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate/items/properties/frame")                            |
| [type](#type)   | Not specified | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-sectionpreferencetypebannedpreset.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate/items/properties/type") |

## day

Day of the week when is located the section.

`day`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate/items/properties/day")

### day Type

`integer`

## index

Index inside the day where is located the section.

`index`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate/items/properties/index")

### index Type

`integer`

## frame

Identifier name of the frame.

`frame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-frame.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate/items/properties/frame")

### frame Type

`string`

## type

Teacher availability to be assigned to the section.

`type`

*   is required

*   Type: unknown ([SectionPreferenceTypeBannedPreset](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-sectionpreferencetypebannedpreset.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-sectionpreferencetypebannedpreset.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate/items/properties/type")

### type Type

unknown ([SectionPreferenceTypeBannedPreset](enginespecification-definitions-oncalltemplate-oncallsectionpreference-properties-sectionpreferencetypebannedpreset.md))

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"banned"` |             |
| `"preset"` |             |
