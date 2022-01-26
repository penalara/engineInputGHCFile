# OnCallSectionPreference Schema

```txt
engineInputGHCSchema#/$defs/onCallServiceframeTemplate/prefixItems
```

Template with a teacher section assignment preference about the service.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## prefixItems Type

`object` ([OnCallSectionPreference](ghc-defs-oncalltemplate-oncallsectionpreference.md))

# prefixItems Properties

| Property        | Type          | Required | Nullable       | Defined by                                                                                                                                                                        |
| :-------------- | :------------ | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-defs-oncalltemplate-oncallsectionpreference-properties-day.md "engineInputGHCSchema#/$defs/onCallServiceframeTemplate/prefixItems/properties/day")     |
| [index](#index) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-defs-oncalltemplate-oncallsectionpreference-properties-index.md "engineInputGHCSchema#/$defs/onCallServiceframeTemplate/prefixItems/properties/index") |
| [frame](#frame) | `string`      | Required | cannot be null | [EngineInputGHCSchema](ghc-defs-oncalltemplate-oncallsectionpreference-properties-frame.md "engineInputGHCSchema#/$defs/onCallServiceframeTemplate/prefixItems/properties/frame") |
| [type](#type)   | Not specified | Required | cannot be null | [EngineInputGHCSchema](ghc-defs-oncalltemplate-oncallsectionpreference-properties-type.md "engineInputGHCSchema#/$defs/onCallServiceframeTemplate/prefixItems/properties/type")   |

## day

Day of the week when is located the section.

`day`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-oncalltemplate-oncallsectionpreference-properties-day.md "engineInputGHCSchema#/$defs/onCallServiceframeTemplate/prefixItems/properties/day")

### day Type

`integer`

## index

Index inside the day where is located the section.

`index`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-oncalltemplate-oncallsectionpreference-properties-index.md "engineInputGHCSchema#/$defs/onCallServiceframeTemplate/prefixItems/properties/index")

### index Type

`integer`

## frame

Identifier name of the frame.

`frame`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-oncalltemplate-oncallsectionpreference-properties-frame.md "engineInputGHCSchema#/$defs/onCallServiceframeTemplate/prefixItems/properties/frame")

### frame Type

`string`

## type

Teacher availability to be assigned to the section.

`type`

*   is required

*   Type: unknown

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-defs-oncalltemplate-oncallsectionpreference-properties-type.md "engineInputGHCSchema#/$defs/onCallServiceframeTemplate/prefixItems/properties/type")

### type Type

unknown

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"banned"` |             |
| `"preset"` |             |
