# Untitled undefined type in EngineInputGHCSchema Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays/properties/daysSetting
```

Keep the same position each week or period for the class units.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## daysSetting Type

unknown

## daysSetting Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                           | Explanation |
| :------------------------------ | ----------- |
| `"nonConsecutiveDaysPreferred"` |             |
| `"indifferentDaysPreferred"`    |             |
| `"strictNonConsecutiveDays"`    |             |
| `"strictConsecutiveDays"`       |             |

## daysSetting Default Value

The default value is:

```json
"indifferentDaysPreferred"
```
