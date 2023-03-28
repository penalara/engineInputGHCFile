# FrameDay Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items/properties/days/items
```

Day with its sections.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([FrameDay](enginespecification-properties-frames-frame-properties-days-frameday.md))

# items Properties

| Property              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                   |
| :-------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)           | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-frames-frame-properties-days-frameday-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items/properties/days/items/properties/day")           |
| [sections](#sections) | `array`   | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-frames-frame-properties-days-frameday-properties-sections.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items/properties/days/items/properties/sections") |

## day

Day of the week.

`day`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-frames-frame-properties-days-frameday-properties-day.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items/properties/days/items/properties/day")

### day Type

`integer`

## sections

Timetable cells where class units are located.

`sections`

*   is required

*   Type: `object[]` ([Section](enginespecification-properties-frames-frame-properties-days-frameday-properties-sections-section.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-frames-frame-properties-days-frameday-properties-sections.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items/properties/days/items/properties/sections")

### sections Type

`object[]` ([Section](enginespecification-properties-frames-frame-properties-days-frameday-properties-sections-section.md))
