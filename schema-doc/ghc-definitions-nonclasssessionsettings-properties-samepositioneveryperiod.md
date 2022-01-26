# SamePositionEveryPeriod Schema

```txt
engineInputGHCSchema#/definitions/nonClassSessionSettings/properties/samePositionEveryPeriod
```

Keep the same position every week or period for the class units.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## samePositionEveryPeriod Type

unknown ([SamePositionEveryPeriod](ghc-definitions-nonclasssessionsettings-properties-samepositioneveryperiod.md))

## samePositionEveryPeriod Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | :---------- |
| `"ignore"`    |             |
| `"attempt"`   |             |
| `"avoid"`     |             |
| `"strict"`    |             |
| `"forbidden"` |             |

## samePositionEveryPeriod Default Value

The default value is:

```json
"ignore"
```
