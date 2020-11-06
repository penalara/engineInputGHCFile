# Group Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Group](ghc-properties-ghcdata-properties-groups-group.md))

# Group Properties

| Property                                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                  |
| :---------------------------------------------------- | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [frame](#frame)                                       | `string`  | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-frame.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/frame")                                       |
| [name](#name)                                         | `string`  | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-name.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/name")                                         |
| [teacher-mentoring](#teacher-mentoring)               | `string`  | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-teacher-mentoring.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/teacher-mentoring")               |
| [freeAfternoons](#freeafternoons)                     | `integer` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-freeafternoons.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/freeAfternoons")                     |
| [frameTemplate](#frametemplate)                       | Merged    | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-frametemplate.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/frameTemplate")                       |
| [numStudents](#numstudents)                           | `integer` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-numstudents.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/numStudents")                           |
| [notGaps](#notgaps)                                   | `boolean` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-notgaps.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/notGaps")                                   |
| [gapsAlwaysInNonPreferred](#gapsalwaysinnonpreferred) | `boolean` | Optional | cannot be null | [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-gapsalwaysinnonpreferred.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/gapsAlwaysInNonPreferred") |

## frame

Identifier name of the group's frame.


`frame`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-frame.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/frame")

### frame Type

`string`

## name

Identifier name of the group.


`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-name.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/name")

### name Type

`string`

## teacher-mentoring

.


`teacher-mentoring`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-teacher-mentoring.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/teacher-mentoring")

### teacher-mentoring Type

`string`

## freeAfternoons

.


`freeAfternoons`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-freeafternoons.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/freeAfternoons")

### freeAfternoons Type

`integer`

## frameTemplate




`frameTemplate`

-   is optional
-   Type: merged type ([Details](ghc-properties-ghcdata-properties-groups-group-properties-frametemplate.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-frametemplate.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/frameTemplate")

### frameTemplate Type

merged type ([Details](ghc-properties-ghcdata-properties-groups-group-properties-frametemplate.md))

all of

-   [FrameTemplate](ghc-definitions-frametemplate.md "check type definition")
-   [Untitled undefined type in JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-frametemplate-allof-1.md "check type definition")

## numStudents

Number of students in the group.


`numStudents`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-numstudents.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/numStudents")

### numStudents Type

`integer`

## notGaps

Indicates If the group can have gaps in its timetable.


`notGaps`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-notgaps.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/notGaps")

### notGaps Type

`boolean`

## gapsAlwaysInNonPreferred

Indicates If the engine, for free intervals or gaps, to be in positions marked as non-preferred in the template.


`gapsAlwaysInNonPreferred`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata-properties-groups-group-properties-gapsalwaysinnonpreferred.md "GeneralJsonGHCSchema#/properties/ghcData/properties/groups/items/properties/gapsAlwaysInNonPreferred")

### gapsAlwaysInNonPreferred Type

`boolean`
