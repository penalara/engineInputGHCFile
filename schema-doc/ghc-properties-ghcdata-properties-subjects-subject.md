# Subject Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/subjects/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Subject](ghc-properties-ghcdata-properties-subjects-subject.md))

# Subject Properties

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                   |
| :-------------------------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                               | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/id")                               |
| [student-mentoring](#student-mentoring) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-student-mentoring.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/student-mentoring") |
| [frameTemplate](#frametemplate)         | Merged    | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/frameTemplate")         |

## id

Identifier name of the subject.


`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/id")

### id Type

`string`

## student-mentoring

Indicates if the subject is a tutorship


`student-mentoring`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-student-mentoring.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/student-mentoring")

### student-mentoring Type

`boolean`

## frameTemplate




`frameTemplate`

-   is optional
-   Type: merged type ([Details](ghc-properties-ghcdata-properties-subjects-subject-properties-frametemplate.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/frameTemplate")

### frameTemplate Type

merged type ([Details](ghc-properties-ghcdata-properties-subjects-subject-properties-frametemplate.md))

all of

-   [FrameTemplate](ghc-definitions-frametemplate.md "check type definition")
-   [Untitled undefined type in EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-frametemplate-allof-1.md "check type definition")
