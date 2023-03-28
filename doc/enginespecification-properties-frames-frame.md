# Frame Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([Frame](enginespecification-properties-frames-frame.md))

# items Properties

| Property      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                            |
| :------------ | :------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [id](#id)     | `string` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-frames-frame-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items/properties/id")     |
| [days](#days) | `array`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-frames-frame-properties-days.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items/properties/days") |

## id

Frame identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-frames-frame-properties-id.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items/properties/id")

### id Type

`string`

## days

List of the days in the frame

`days`

*   is required

*   Type: `object[]` ([FrameDay](enginespecification-properties-frames-frame-properties-days-frameday.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-frames-frame-properties-days.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames/items/properties/days")

### days Type

`object[]` ([FrameDay](enginespecification-properties-frames-frame-properties-days-frameday.md))
