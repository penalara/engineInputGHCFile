# Classroom Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/classRooms/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Classroom](ghc-properties-ghcdata-properties-classrooms-classroom.md))

# Classroom Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                       |
| :------------------------------ | --------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                       | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/id")                             |
| [capacity](#capacity)           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-capacity.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/capacity")                 |
| [frameTemplate](#frametemplate) | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-bannedframetemplate.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/frameTemplate") |
| [refBuilding](#refbuilding)     | `string`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/refBuilding")           |
| [fullDay](#fullday)             | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-fullday.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/fullDay")                   |

## id

Identifier name of the classroom.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/id")

### id Type

`string`

## capacity

Maximum students number who the classroom can accommodate.


`capacity`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-capacity.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/capacity")

### capacity Type

`integer`

## frameTemplate

Templates with only banned sections of the frames.


> It is used when the element cannot have non preferred sections.
>

`frameTemplate`

-   is optional
-   Type: `object[]` ([BannedSectionPreference](ghc-properties-ghcdata-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-bannedframetemplate.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([BannedSectionPreference](ghc-properties-ghcdata-properties-classrooms-classroom-properties-bannedframetemplate-bannedsectionpreference.md))

## refBuilding

Identifier name building where is located the classroom.


`refBuilding`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/refBuilding")

### refBuilding Type

`string`

## fullDay

Indicates if the classroom must be reserved all day after it have one assignment.


`fullDay`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-classrooms-classroom-properties-fullday.md "engineInputGHCSchema#/properties/ghcData/properties/classRooms/items/properties/fullDay")

### fullDay Type

`boolean`
