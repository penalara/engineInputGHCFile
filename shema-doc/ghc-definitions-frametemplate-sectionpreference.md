# SectionPreference Schema

```txt
GeneralJsonGHCSchema#/definitions/frameTemplate/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([SectionPreference](ghc-definitions-frametemplate-sectionpreference.md))

# SectionPreference Properties

| Property        | Type      | Required | Nullable       | Defined by                                                                                                                                                  |
| :-------------- | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer` | Required | cannot be null | [JsonGHCFile](ghc-definitions-frametemplate-sectionpreference-properties-day.md "GeneralJsonGHCSchema#/definitions/frameTemplate/items/properties/day")     |
| [index](#index) | `integer` | Required | cannot be null | [JsonGHCFile](ghc-definitions-frametemplate-sectionpreference-properties-index.md "GeneralJsonGHCSchema#/definitions/frameTemplate/items/properties/index") |
| [frame](#frame) | `string`  | Required | cannot be null | [JsonGHCFile](ghc-definitions-frametemplate-sectionpreference-properties-frame.md "GeneralJsonGHCSchema#/definitions/frameTemplate/items/properties/frame") |

## day

Day of the week when is located the section.


`day`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-definitions-frametemplate-sectionpreference-properties-day.md "GeneralJsonGHCSchema#/definitions/frameTemplate/items/properties/day")

### day Type

`integer`

## index

Index inside the day where is located the section.


`index`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-definitions-frametemplate-sectionpreference-properties-index.md "GeneralJsonGHCSchema#/definitions/frameTemplate/items/properties/index")

### index Type

`integer`

## frame

Identifier name of the frame.


`frame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [JsonGHCFile](ghc-definitions-frametemplate-sectionpreference-properties-frame.md "GeneralJsonGHCSchema#/definitions/frameTemplate/items/properties/frame")

### frame Type

`string`
