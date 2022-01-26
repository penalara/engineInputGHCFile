# SessionSectionPreference Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate/items
```

Section assignment preference.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([SessionSectionPreference](ghc-properties-ghcdata-properties-sessions-session-properties-sessionframetemplate-sessionsectionpreference.md))

# items Properties

| Property        | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                   |
| :-------------- | :------------ | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionframetemplate-sessionsectionpreference-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate/items/properties/day")     |
| [index](#index) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionframetemplate-sessionsectionpreference-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate/items/properties/index") |
| [frame](#frame) | `string`      | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionframetemplate-sessionsectionpreference-properties-frame.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate/items/properties/frame") |
| [type](#type)   | Not specified | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionframetemplate-sessionsectionpreference-properties-type.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate/items/properties/type")   |

## day

Day of the week when the section is located.

`day`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionframetemplate-sessionsectionpreference-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate/items/properties/day")

### day Type

`integer`

## index

Index built into the day where the section is located.

`index`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionframetemplate-sessionsectionpreference-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate/items/properties/index")

### index Type

`integer`

## frame

Frame identifier.

`frame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionframetemplate-sessionsectionpreference-properties-frame.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate/items/properties/frame")

### frame Type

`string`

## type

Session availability to be assigned to the section.

`type`

*   is required

*   Type: unknown

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionframetemplate-sessionsectionpreference-properties-type.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/frameTemplate/items/properties/type")

### type Type

unknown

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                    | Explanation |
| :----------------------- | :---------- |
| `"banned"`               |             |
| `"strong-non-preferred"` |             |
| `"weak-non-preferred"`   |             |
| `"preset"`               |             |
