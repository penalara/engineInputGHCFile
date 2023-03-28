# Group Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Group](enginespecification-properties-groups-group.md))

# items Properties

| Property                                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                    |
| :---------------------------------------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                                             | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/id")                                             |
| [refFrame](#refframe)                                 | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/refFrame")                                 |
| [frameTemplate](#frametemplate)                       | `array`   | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-frametemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/frameTemplate")                                              |
| [numStudents](#numstudents)                           | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-numstudents.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/numStudents")                           |
| [freeAfternoons](#freeafternoons)                     | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-freeafternoons.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/freeAfternoons")                     |
| [notGaps](#notgaps)                                   | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-notgaps.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/notGaps")                                   |
| [gapsAlwaysInNonPreferred](#gapsalwaysinnonpreferred) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-gapsalwaysinnonpreferred.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/gapsAlwaysInNonPreferred") |

## id

Group identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/id")

### id Type

`string`

## refFrame

Group's frame identifier.

`refFrame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/refFrame")

### refFrame Type

`string`

## frameTemplate

Templates with frame sections assignment preferences.

`frameTemplate`

*   is optional

*   Type: `object[]` ([SectionPreference](enginespecification-definitions-frametemplate-sectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-frametemplate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SectionPreference](enginespecification-definitions-frametemplate-sectionpreference.md))

## numStudents

Number of students in the group.

`numStudents`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-numstudents.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/numStudents")

### numStudents Type

`integer`

## freeAfternoons

Stric number of free afternoons for the group.

`freeAfternoons`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-freeafternoons.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/freeAfternoons")

### freeAfternoons Type

`integer`

## notGaps

It indicates if the group can have gaps in its timetable.

`notGaps`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-notgaps.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/notGaps")

### notGaps Type

`boolean`

## gapsAlwaysInNonPreferred

This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.

`gapsAlwaysInNonPreferred`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-groups-group-properties-gapsalwaysinnonpreferred.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups/items/properties/gapsAlwaysInNonPreferred")

### gapsAlwaysInNonPreferred Type

`boolean`
