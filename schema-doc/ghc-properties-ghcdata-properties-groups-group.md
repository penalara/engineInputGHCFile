# Group Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/groups/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Group](ghc-properties-ghcdata-properties-groups-group.md))

# Group Properties

| Property                                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                           |
| :---------------------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                             | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/id")                                             |
| [refFrame](#refframe)                                 | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/refFrame")                                 |
| [frameTemplate](#frametemplate)                       | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/frameTemplate")                                                                 |
| [numStudents](#numstudents)                           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-numstudents.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/numStudents")                           |
| [freeAfternoons](#freeafternoons)                     | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-freeafternoons.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/freeAfternoons")                     |
| [notGaps](#notgaps)                                   | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-notgaps.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/notGaps")                                   |
| [gapsAlwaysInNonPreferred](#gapsalwaysinnonpreferred) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-gapsalwaysinnonpreferred.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/gapsAlwaysInNonPreferred") |

## id

Identifier name of the group.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/id")

### id Type

`string`

## refFrame

Identifier name of the group's frame.


`refFrame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/refFrame")

### refFrame Type

`string`

## frameTemplate

Templates with assignment preferences to section of the frames.


`frameTemplate`

-   is optional
-   Type: `object[]` ([SectionPreference](ghc-definitions-frametemplate-sectionpreference.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SectionPreference](ghc-definitions-frametemplate-sectionpreference.md))

## numStudents

Number of students in the group.


`numStudents`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-numstudents.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/numStudents")

### numStudents Type

`integer`

## freeAfternoons

Stric number of free afternoons for the group.


`freeAfternoons`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-freeafternoons.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/freeAfternoons")

### freeAfternoons Type

`integer`

## notGaps

Indicates If the group can have gaps in its timetable.


`notGaps`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-notgaps.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/notGaps")

### notGaps Type

`boolean`

## gapsAlwaysInNonPreferred

Indicates If the engine, for free intervals or gaps, to be in positions marked as non-preferred in the template.


`gapsAlwaysInNonPreferred`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-groups-group-properties-gapsalwaysinnonpreferred.md "engineInputGHCSchema#/properties/ghcData/properties/groups/items/properties/gapsAlwaysInNonPreferred")

### gapsAlwaysInNonPreferred Type

`boolean`
