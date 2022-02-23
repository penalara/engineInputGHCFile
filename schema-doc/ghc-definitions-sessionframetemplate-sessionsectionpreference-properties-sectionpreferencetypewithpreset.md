# SectionPreferenceTypeWithPreset Schema

```txt
engineInputGHCSchema#/definitions/sessionFrameTemplate/items/properties/type
```

Session availability to be assigned to the section.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## type Type

unknown ([SectionPreferenceTypeWithPreset](ghc-definitions-sessionframetemplate-sessionsectionpreference-properties-sectionpreferencetypewithpreset.md))

## type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                    | Explanation |
| :----------------------- | :---------- |
| `"banned"`               |             |
| `"strong-non-preferred"` |             |
| `"weak-non-preferred"`   |             |
| `"preset"`               |             |
