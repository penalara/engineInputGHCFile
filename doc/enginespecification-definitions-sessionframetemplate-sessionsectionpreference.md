# SessionSectionPreference Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate/items
```

Section assignment preference.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([SessionSectionPreference](enginespecification-definitions-sessionframetemplate-sessionsectionpreference.md))

# items Properties

| Property        | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                        |
| :-------------- | :------------ | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer`     | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate/items/properties/day")                              |
| [index](#index) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate/items/properties/index")                          |
| [frame](#frame) | `string`      | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-frame.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate/items/properties/frame")                          |
| [type](#type)   | Not specified | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-sectionpreferencetypewithpreset.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate/items/properties/type") |

## day

Day of the week when the section is located.

`day`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate/items/properties/day")

### day Type

`integer`

## index

Index built into the day where the section is located.

`index`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate/items/properties/index")

### index Type

`integer`

## frame

Frame identifier.

`frame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-frame.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate/items/properties/frame")

### frame Type

`string`

## type

Session availability to be assigned to the section.

`type`

*   is required

*   Type: unknown ([SectionPreferenceTypeWithPreset](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-sectionpreferencetypewithpreset.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-sectionpreferencetypewithpreset.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate/items/properties/type")

### type Type

unknown ([SectionPreferenceTypeWithPreset](enginespecification-definitions-sessionframetemplate-sessionsectionpreference-properties-sectionpreferencetypewithpreset.md))

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                    | Explanation |
| :----------------------- | :---------- |
| `"banned"`               |             |
| `"strong-non-preferred"` |             |
| `"weak-non-preferred"`   |             |
| `"preset"`               |             |
