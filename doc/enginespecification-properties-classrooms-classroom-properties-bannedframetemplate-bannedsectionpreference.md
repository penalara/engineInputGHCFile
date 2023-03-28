# BannedSectionPreference Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/frameTemplate/items
```

Template with only banned section assignment preference.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([BannedSectionPreference](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference.md))

# items Properties

| Property        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                |
| :-------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/frameTemplate/items/properties/day")     |
| [index](#index) | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/frameTemplate/items/properties/index") |
| [frame](#frame) | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference-properties-frame.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/frameTemplate/items/properties/frame") |

## day

Day of the week when the section is located.

`day`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/frameTemplate/items/properties/day")

### day Type

`integer`

## index

Index built into the day where the section is located.

`index`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference-properties-index.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/frameTemplate/items/properties/index")

### index Type

`integer`

## frame

Frame identifier.

`frame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference-properties-frame.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/frameTemplate/items/properties/frame")

### frame Type

`string`
