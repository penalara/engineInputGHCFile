# Subject Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/subjects/items
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([Subject](ghc-properties-ghcdata-properties-subjects-subject.md))

# items Properties

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                   |
| :-------------------------------------- | :-------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                               | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/id")                               |
| [student-mentoring](#student-mentoring) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-student-mentoring.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/student-mentoring") |
| [frameTemplate](#frametemplate)         | `array`   | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/frameTemplate")                                                       |

## id

Subject identifier.

`id`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-id.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/id")

### id Type

`string`

## student-mentoring

It indicates whether the subject is a tutorial.

`student-mentoring`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-subjects-subject-properties-student-mentoring.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/student-mentoring")

### student-mentoring Type

`boolean`

## frameTemplate

Templates with frame sections assignment preferences.

`frameTemplate`

*   is optional

*   Type: `object[]` ([SectionPreference](ghc-definitions-frametemplate-sectionpreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-frametemplate.md "engineInputGHCSchema#/properties/ghcData/properties/subjects/items/properties/frameTemplate")

### frameTemplate Type

`object[]` ([SectionPreference](ghc-definitions-frametemplate-sectionpreference.md))
