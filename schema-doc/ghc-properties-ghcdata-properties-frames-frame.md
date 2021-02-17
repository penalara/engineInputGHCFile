# Frame Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/frames/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Frame](ghc-properties-ghcdata-properties-frames-frame.md))

# Frame Properties

| Property              | Type     | Required | Nullable       | Defined by                                                                                                                                                                           |
| :-------------------- | -------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)             | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/id")             |
| [sections](#sections) | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-sections.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/sections") |

## id

Frame identifier.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/id")

### id Type

`string`

## sections

Timetable cells where class units are located.


`sections`

-   is required
-   Type: `object[]` ([Section](ghc-properties-ghcdata-properties-frames-frame-properties-sections-section.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-sections.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/sections")

### sections Type

`object[]` ([Section](ghc-properties-ghcdata-properties-frames-frame-properties-sections-section.md))
