# Untitled undefined type in EngineInputGHCSchema Schema

```txt
engineInputGHCSchema#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent/properties/type
```

Indicate if the incompatibility is a strict, avoid (ponderable for optimization) or ignore.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## type Type

unknown

## type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |
