# OnCallSectionPreference Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate/items
```

Template with a teacher section assignment preference about the service.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([OnCallSectionPreference](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference.md))

# OnCallSectionPreference Properties

| Property        | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                             |
| :-------------- | ------------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [day](#day)     | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate/items/properties/day")     |
| [index](#index) | `integer`     | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate/items/properties/index") |
| [frame](#frame) | `string`      | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference-properties-frame.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate/items/properties/frame") |
| [type](#type)   | Not specified | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference-properties-type.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate/items/properties/type")   |

## day

Day of the week when is located the section.


`day`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference-properties-day.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate/items/properties/day")

### day Type

`integer`

## index

Index inside the day where is located the section.


`index`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference-properties-index.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate/items/properties/index")

### index Type

`integer`

## frame

Identifier name of the frame.


`frame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference-properties-frame.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate/items/properties/frame")

### frame Type

`string`

## type

Teacher availability to be assigned to the section.


`type`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-refteachers-refteacher-properties-oncalltemplate-oncallsectionpreference-properties-type.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refTeachers/items/properties/frameTemplate/items/properties/type")

### type Type

unknown

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"banned"` |             |
| `"preset"` |             |
