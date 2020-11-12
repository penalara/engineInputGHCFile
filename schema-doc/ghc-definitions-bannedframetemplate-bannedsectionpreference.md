# BannedSectionPreference Schema

```txt
engineInputGHCSchema#/definitions/bannedFrameTemplate/items
```

Template with only banned section assignment preference.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([BannedSectionPreference](ghc-definitions-bannedframetemplate-bannedsectionpreference.md))

# BannedSectionPreference Properties

| Property        | Type      | Required | Nullable       | Defined by                                                                                                                                                                             |
| :-------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-bannedframetemplate-bannedsectionpreference-properties-day.md "engineInputGHCSchema#/definitions/bannedFrameTemplate/items/properties/day")     |
| [index](#index) | `integer` | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-bannedframetemplate-bannedsectionpreference-properties-index.md "engineInputGHCSchema#/definitions/bannedFrameTemplate/items/properties/index") |
| [frame](#frame) | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-bannedframetemplate-bannedsectionpreference-properties-frame.md "engineInputGHCSchema#/definitions/bannedFrameTemplate/items/properties/frame") |

## day

Day of the week when is located the section.


`day`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-bannedframetemplate-bannedsectionpreference-properties-day.md "engineInputGHCSchema#/definitions/bannedFrameTemplate/items/properties/day")

### day Type

`integer`

## index

Index inside the day where is located the section.


`index`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-bannedframetemplate-bannedsectionpreference-properties-index.md "engineInputGHCSchema#/definitions/bannedFrameTemplate/items/properties/index")

### index Type

`integer`

## frame

Identifier name of the frame.


`frame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-bannedframetemplate-bannedsectionpreference-properties-frame.md "engineInputGHCSchema#/definitions/bannedFrameTemplate/items/properties/frame")

### frame Type

`string`
