# ClassRoomSet Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRoomsSets/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([ClassRoomSet](enginespecification-properties-classroomssets-classroomset.md))

# items Properties

| Property                          | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                       |
| :-------------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                         | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classroomssets-classroomset-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRoomsSets/items/properties/id")                         |
| [rooms](#rooms)                   | `array`   | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classroomssets-classroomset-properties-classroomentries.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRoomsSets/items/properties/rooms")        |
| [anonymousRooms](#anonymousrooms) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classroomssets-classroomset-properties-anonymousrooms.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRoomsSets/items/properties/anonymousRooms") |

## id

ClassRooms group identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classroomssets-classroomset-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRoomsSets/items/properties/id")

### id Type

`string`

## rooms

Classrooms identifiers which contain the group.

`rooms`

*   is required

*   Type: `string[]` ([ClassRoomRef](enginespecification-properties-classroomssets-classroomset-properties-classroomentries-classroomref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classroomssets-classroomset-properties-classroomentries.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRoomsSets/items/properties/rooms")

### rooms Type

`string[]` ([ClassRoomRef](enginespecification-properties-classroomssets-classroomset-properties-classroomentries-classroomref.md))

## anonymousRooms

Number of non-specific defined classrooms that the group contains.

`anonymousRooms`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classroomssets-classroomset-properties-anonymousrooms.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRoomsSets/items/properties/anonymousRooms")

### anonymousRooms Type

`integer`
