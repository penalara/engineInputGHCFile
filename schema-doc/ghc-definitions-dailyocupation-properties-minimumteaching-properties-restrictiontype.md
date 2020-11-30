# RestrictionType Schema

```txt
engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/restriction
```

Kind of 'dailyOcupation' restriction. It can be 'ignore', 'strict', 'preferred' or according to the related rule of optimization.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## restriction Type

unknown ([RestrictionType](ghc-definitions-dailyocupation-properties-minimumteaching-properties-restrictiontype.md))

## restriction Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value               | Explanation |
| :------------------ | ----------- |
| `"ignore"`          |             |
| `"strict"`          |             |
| `"preferred"`       |             |
| `"accordingToRule"` |             |
