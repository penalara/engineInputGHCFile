# Classroom Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Classroom](enginespecification-properties-classrooms-classroom.md))

# items Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                |
| :------------------------------ | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [id](#id)                       | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/id")                             |
| [capacity](#capacity)           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-capacity.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/capacity")                 |
| [frameTemplate](#frametemplate) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/frameTemplate") |
| [refBuilding](#refbuilding)     | `string`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-refbuilding.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/refBuilding")           |
| [fullDay](#fullday)             | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-fullday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/fullDay")                   |

## id

Identifier name of the classroom.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/id")

### id Type

`string`

## capacity

The maximum number of students the classroom can hold.

`capacity`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-capacity.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/capacity")

### capacity Type

`integer`

## frameTemplate

Template with only banned preferences.

> It is used when the element cannot have non-preferred sections.

`frameTemplate`

*   is optional

*   Type: `object[]` ([BannedSectionPreference](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([BannedSectionPreference](enginespecification-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference.md))

## refBuilding

Building identifier where the class is located.

`refBuilding`

*   is optional

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-refbuilding.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/refBuilding")

### refBuilding Type

`string`

## fullDay

This indicates whether the classroom should be booked all day after holding a subject.

`fullDay`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classrooms-classroom-properties-fullday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms/items/properties/fullDay")

### fullDay Type

`boolean`
