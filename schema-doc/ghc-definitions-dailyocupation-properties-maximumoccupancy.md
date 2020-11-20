# MaximumOccupancy Schema

```txt
engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy
```

Teacher's maximum time of teaching with students and other non-teaching activities indicated as computable.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## maximumOccupancy Type

`object` ([MaximumOccupancy](ghc-definitions-dailyocupation-properties-maximumoccupancy.md))

# MaximumOccupancy Properties

| Property                    | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                         |
| :-------------------------- | ------------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [restriction](#restriction) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumoccupancy-properties-restriction.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy/properties/restriction") |
| [setting](#setting)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumoccupancy-properties-setting.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy/properties/setting")         |

## restriction

Kind of restriction. It can be 'strict', 'preferred' or according to the related rule of optimization.


`restriction`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumoccupancy-properties-restriction.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy/properties/restriction")

### restriction Type

unknown

### restriction Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value               | Explanation |
| :------------------ | ----------- |
| `"strict"`          |             |
| `"preferred"`       |             |
| `"accordingToRule"` |             |

## setting

Indicates whether the automatic calculation of the value must be adjusted to higher or lower.


`setting`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-maximumoccupancy-properties-setting.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/maximumOccupancy/properties/setting")

### setting Type

unknown

### setting Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value       | Explanation |
| :---------- | ----------- |
| `"auto"`    |             |
| `"oneMore"` |             |
| `"oneLess"` |             |

### setting Default Value

The default value is:

```json
"auto"
```
