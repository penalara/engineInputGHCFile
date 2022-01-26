# FrameDay Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items
```

Day with its sections.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([FrameDay](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday.md))

# items Properties

| Property              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                          |
| :-------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)           | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/day")           |
| [sections](#sections) | `array`   | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections") |

## day

Day of the week.

`day`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/day")

### day Type

`integer`

## sections

Timetable cells where class units are located.

`sections`

*   is required

*   Type: `object[]` ([Section](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections")

### sections Type

`object[]` ([Section](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section.md))
