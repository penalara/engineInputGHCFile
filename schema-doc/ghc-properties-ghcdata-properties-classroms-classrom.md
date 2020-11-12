# Classrom Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/classRooms/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Classrom](ghc-properties-ghcdata-properties-classroms-classrom.md))

# Classrom Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                   |
| :------------------------------ | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                       | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/id")                           |
| [capacity](#capacity)           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-capacity.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/capacity")               |
| [frameTemplate](#frametemplate) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/frameTemplate") |
| [refBuilding](#refbuilding)     | `string`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/refBuilding")         |
| [fullDay](#fullday)             | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-fullday.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/fullDay")                 |

## id

Identifier name of the classroom.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/id")

### id Type

`string`

## capacity

Maximum students number who the classroom can accommodate.


`capacity`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-capacity.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/capacity")

### capacity Type

`integer`

## frameTemplate

Classroom template with assignment preferences to section of the frames.


`frameTemplate`

-   is optional
-   Type: `object[]` ([ClassRoomSectionPreference](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-classroomsectionpreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([ClassRoomSectionPreference](ghc-properties-ghcdata-properties-classroms-classrom-properties-classroomtemplate-classroomsectionpreference.md))

## refBuilding

Abbreviated name building where is located the classroom.


`refBuilding`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/refBuilding")

### refBuilding Type

`string`

## fullDay

Indicates if the classroom must be reserved all day after it have one assignment.


`fullDay`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classroms-classrom-properties-fullday.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/fullDay")

### fullDay Type

`boolean`
