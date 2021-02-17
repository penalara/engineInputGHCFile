# Untitled undefined type in EngineInputGHCSchema Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/followedDaysPreference
```

If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## followedDaysPreference Type

unknown

## followedDaysPreference Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"ignore"`    |             |
| `"attempt"`   |             |
| `"avoid"`     |             |
| `"strict"`    |             |
| `"forbidden"` |             |

## followedDaysPreference Default Value

The default value is:

```json
"ignore"
```
