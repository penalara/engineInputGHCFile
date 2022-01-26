# Frame Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/frames/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Frame](ghc-properties-ghcdata-properties-frames-frame.md))

# items Properties

| Property      | Type     | Required | Nullable       | Defined by                                                                                                                                                                   |
| :------------ | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)     | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/id")     |
| [days](#days) | `array`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days") |

## id

Frame identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/id")

### id Type

`string`

## days

List of the days in the frame

`days`

*   is required

*   Type: `object[]` ([FrameDay](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days")

### days Type

`object[]` ([FrameDay](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday.md))
