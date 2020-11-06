# Classrom Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Classrom](ghc-properties-ghcdata-properties-classroms-classrom.md))

# Classrom Properties

| Property                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                      |
| :------------------------------ | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                       | `string`  | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-id.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/id")                       |
| [capacity](#capacity)           | `integer` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-capacity.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/capacity")           |
| [frameTemplate](#frametemplate) | Merged    | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-frametemplate.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/frameTemplate") |
| [refBuilding](#refbuilding)     | `string`  | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-refbuilding.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/refBuilding")     |
| [fullDay](#fullday)             | `boolean` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-fullday.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/fullDay")             |

## id

Identifier name of the classroom.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-id.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/id")

### id Type

`string`

## capacity

Maximum students number who the classroom can accommodate.


`capacity`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-capacity.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/capacity")

### capacity Type

`integer`

## frameTemplate




`frameTemplate`

-   is optional
-   Type: merged type ([Details](ghc-properties-ghcdata-properties-classroms-classrom-properties-frametemplate.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-frametemplate.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/frameTemplate")

### frameTemplate Type

merged type ([Details](ghc-properties-ghcdata-properties-classroms-classrom-properties-frametemplate.md))

all of

-   [FrameTemplate](ghc-definitions-frametemplate.md "check type definition")
-   [Untitled undefined type in JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-frametemplate-allof-1.md "check type definition")

## refBuilding

Abbreviated name building where is located the classroom.


`refBuilding`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-refbuilding.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/refBuilding")

### refBuilding Type

`string`

## fullDay

Indicates if the classroom must be reserved all day after it have one assignment.


`fullDay`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-classroms-classrom-properties-fullday.md "GeneralJsonGHCSchema#/properties/ghcData/properties/classRooms/items/properties/fullDay")

### fullDay Type

`boolean`