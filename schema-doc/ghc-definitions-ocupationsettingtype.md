# OcupationSettingType Schema

```txt
engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy/properties/setting
```

Indicates whether the automatic calculation of the value must be adjusted to higher or lower. The adjustment will set with the duration of the greater section.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## setting Type

unknown ([OcupationSettingType](ghc-definitions-ocupationsettingtype.md))

## setting Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"auto"`   |             |
| `"higher"` |             |
| `"lower"`  |             |
