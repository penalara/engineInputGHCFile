# ConditionType Schema

```txt
engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay/properties/type
```

Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## type Type

unknown ([ConditionType](ghc-definitions-incompatibilities-properties-freetimefirstorlasthoursday-properties-conditiontype.md))

## type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |
