# Untitled undefined type in EngineInputGHCSchema Schema

```txt
engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/setting
```

Indicates whether the automatic calculation of the value must be adjusted to higher or lower.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## setting Type

unknown

## setting Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value       | Explanation |
| :---------- | ----------- |
| `"auto"`    |             |
| `"oneMore"` |             |
| `"oneLess"` |             |

## setting Default Value

The default value is:

```json
"auto"
```
