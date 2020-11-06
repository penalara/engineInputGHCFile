# ClassRoomSet Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/classRoomsSets/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([ClassRoomSet](ghc-properties-ghcdata-properties-classroomssets-classroomset.md))

# ClassRoomSet Properties

| Property                          | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                     |
| :-------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                         | `string`  | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-classroomssets-classroomset-properties-id.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRoomsSets/items/properties/id")                         |
| [rooms](#rooms)                   | `array`   | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-classroomssets-classroomset-properties-classroomentries.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRoomsSets/items/properties/rooms")        |
| [anonymousRooms](#anonymousrooms) | `integer` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-classroomssets-classroomset-properties-anonymousrooms.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRoomsSets/items/properties/anonymousRooms") |

## id

Identifier name of the ClassRooms group.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-classroomssets-classroomset-properties-id.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRoomsSets/items/properties/id")

### id Type

`string`

## rooms

ClassRooms which it contains the group


`rooms`

-   is required
-   Type: `string[]` ([ClassRoomRef](ghc-properties-ghcdata-properties-classroomssets-classroomset-properties-classroomentries-classroomref.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-classroomssets-classroomset-properties-classroomentries.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRoomsSets/items/properties/rooms")

### rooms Type

`string[]` ([ClassRoomRef](ghc-properties-ghcdata-properties-classroomssets-classroomset-properties-classroomentries-classroomref.md))

## anonymousRooms

Number of classrooms non-specific defined that it contains the group.


`anonymousRooms`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-classroomssets-classroomset-properties-anonymousrooms.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRoomsSets/items/properties/anonymousRooms")

### anonymousRooms Type

`integer`
