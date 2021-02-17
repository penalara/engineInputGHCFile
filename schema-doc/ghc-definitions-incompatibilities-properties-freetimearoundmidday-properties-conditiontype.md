# ConditionType Schema

```txt
engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeAroundMidday/properties/type
```

Indicate if the incompatibility is a strict, avoid (penalisable at optimization) or ignore.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## type Type

unknown ([ConditionType](ghc-definitions-incompatibilities-properties-freetimearoundmidday-properties-conditiontype.md))

## type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |
