# SectionPreference Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate/items
```

Template with a section assignment preference.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([SectionPreference](enginespecification-definitions-frametemplate-sectionpreference.md))

# items Properties

| Property        | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                      |
| :-------------- | :------------ | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer`     | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-frametemplate-sectionpreference-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate/items/properties/day")                                 |
| [index](#index) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-frametemplate-sectionpreference-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate/items/properties/index")                             |
| [frame](#frame) | `string`      | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-frametemplate-sectionpreference-properties-frame.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate/items/properties/frame")                             |
| [type](#type)   | Not specified | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-frametemplate-sectionpreference-properties-sectionpreferencetypewithoutpreset.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate/items/properties/type") |

## day

Day of the week when is located the section.

`day`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-frametemplate-sectionpreference-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate/items/properties/day")

### day Type

`integer`

## index

Index inside the day where is located the section.

`index`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-frametemplate-sectionpreference-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate/items/properties/index")

### index Type

`integer`

## frame

Identifier name of the frame.

`frame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-frametemplate-sectionpreference-properties-frame.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate/items/properties/frame")

### frame Type

`string`

## type

Element availability to be assigned to the section.

`type`

*   is required

*   Type: unknown ([SectionPreferenceTypeWithOutPreset](enginespecification-definitions-frametemplate-sectionpreference-properties-sectionpreferencetypewithoutpreset.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-frametemplate-sectionpreference-properties-sectionpreferencetypewithoutpreset.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate/items/properties/type")

### type Type

unknown ([SectionPreferenceTypeWithOutPreset](enginespecification-definitions-frametemplate-sectionpreference-properties-sectionpreferencetypewithoutpreset.md))

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                    | Explanation |
| :----------------------- | :---------- |
| `"banned"`               |             |
| `"strong-non-preferred"` |             |
| `"weak-non-preferred"`   |             |
