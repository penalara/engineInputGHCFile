# MaximumOccupancy Schema

```txt
engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy
```

Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## maximumOccupancy Type

`object` ([MaximumOccupancy](ghc-definitions-dailyocupation-properties-maximumoccupancy.md))

# maximumOccupancy Properties

| Property                    | Type          | Required | Nullable       | Defined by                                                                                                                                                        |
| :-------------------------- | :------------ | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [restriction](#restriction) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-restrictiontype.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy/properties/restriction")  |
| [setting](#setting)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-ocupationsettingtype.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy/properties/setting") |

## restriction

Indicate whether the incompatibility is a strict, ignore, preferred (strong optimization weight) or accordingToRule (weight according to optimization rule).

`restriction`

*   is optional

*   Type: unknown ([RestrictionType](ghc-definitions-restrictiontype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-restrictiontype.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy/properties/restriction")

### restriction Type

unknown ([RestrictionType](ghc-definitions-restrictiontype.md))

### restriction Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value               | Explanation |
| :------------------ | :---------- |
| `"ignore"`          |             |
| `"strict"`          |             |
| `"preferred"`       |             |
| `"accordingToRule"` |             |

## setting

Indicates whether the automatic calculation of the value must be adjusted to higher or lower. The adjustment will set with the duration of the greater section.

`setting`

*   is optional

*   Type: unknown ([OcupationSettingType](ghc-definitions-ocupationsettingtype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-ocupationsettingtype.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy/properties/setting")

### setting Type

unknown ([OcupationSettingType](ghc-definitions-ocupationsettingtype.md))

### setting Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"auto"`   |             |
| `"higher"` |             |
| `"lower"`  |             |
