# Section Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Section](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section.md))

# items Properties

| Property                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                  |
| :---------------------- | :------------ | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [index](#index)         | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/index")         |
| [entryTime](#entrytime) | `string`      | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-entrytime.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/entryTime") |
| [exitTime](#exittime)   | `string`      | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-exittime.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/exitTime")   |
| [duration](#duration)   | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-duration.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/duration")   |
| [type](#type)           | Not specified | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-sectiontype.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/type")    |
| [allowed](#allowed)     | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-allowed.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/allowed")     |

## index

Index built into the day where the section is located.

`index`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/index")

### index Type

`integer`

## entryTime

Start time of the section.

`entryTime`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-entrytime.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/entryTime")

### entryTime Type

`string`

### entryTime Constraints

**time**: the string must be a time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## exitTime

End time of the section.

`exitTime`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-exittime.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/exitTime")

### exitTime Type

`string`

### exitTime Constraints

**time**: the string must be a time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## duration

It indicates the duration (real or proportional) of the section in minutes.

> This indicates the duration of the section that the engine will use to assign class units. It can be the actual duration between check-in and check-out, or it can be a proportional time to simplify (hour, half hour, three-quarters of an hour...). The distribution of class units will be consistent with this duration.

`duration`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-duration.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/duration")

### duration Type

`integer`

## type

Kind of section.

`type`

*   is required

*   Type: unknown ([SectionType](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-sectiontype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-sectiontype.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/type")

### type Type

unknown ([SectionType](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-sectiontype.md))

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value        | Explanation |
| :----------- | :---------- |
| `"teaching"` |             |
| `"break"`    |             |
| `"midday"`   |             |

## allowed

It indicates if the section is available to assign.

`allowed`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-frames-frame-properties-days-frameday-properties-sections-section-properties-allowed.md "engineInputGHCSchema#/properties/ghcData/properties/frames/items/properties/days/items/properties/sections/items/properties/allowed")

### allowed Type

`boolean`

### allowed Default Value

The default value is:

```json
true
```
