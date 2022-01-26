# Untitled undefined type in EngineInputGHCSchema Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionSettings/properties/sameHourPreference
```

Preference over class units that coincide in the same time slot.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## sameHourPreference Type

unknown

## sameHourPreference Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"same"`   |             |

## sameHourPreference Default Value

The default value is:

```json
"ignore"
```
