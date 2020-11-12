# SectionPreference Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/classRoomTemplate/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([SectionPreference](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-sectionpreference.md))

# SectionPreference Properties

| Property        | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                 |
| :-------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-sectionpreference-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/classRoomTemplate/items/properties/day")     |
| [index](#index) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-sectionpreference-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/classRoomTemplate/items/properties/index") |
| [frame](#frame) | `string`      | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-sectionpreference-properties-frame.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/classRoomTemplate/items/properties/frame") |
| [type](#type)   | Not specified | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-sectionpreference-properties-type.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/classRoomTemplate/items/properties/type")   |

## day

Day of the week when is located the section.


`day`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-sectionpreference-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/classRoomTemplate/items/properties/day")

### day Type

`integer`

## index

Index inside the day where is located the section.


`index`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-sectionpreference-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/classRoomTemplate/items/properties/index")

### index Type

`integer`

## frame

Identifier name of the frame.


`frame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-sectionpreference-properties-frame.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/classRoomTemplate/items/properties/frame")

### frame Type

`string`

## type

Element availability to be assigned to the section.


`type`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-sectionpreference-properties-type.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/classRoomTemplate/items/properties/type")

### type Type

unknown

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"banned"`    |             |
| `"available"` |             |