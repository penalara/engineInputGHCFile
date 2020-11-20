# MinimumTeaching Schema

```txt
engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching
```

Teacher's minimum time of teaching with students.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## minimumTeaching Type

`object` ([MinimumTeaching](ghc-definitions-dailyocupation-properties-minimumteaching.md))

# MinimumTeaching Properties

| Property                    | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                       |
| :-------------------------- | ------------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [restriction](#restriction) | Not specified | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumteaching-properties-restriction.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/restriction") |
| [setting](#setting)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumteaching-properties-setting.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/setting")         |

## restriction

Kind of restriction. It can be 'strict', 'preferred' or according to the related rule of optimization.


`restriction`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumteaching-properties-restriction.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/restriction")

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
-   defined in: [EngineInputGHCSchema](ghc-definitions-dailyocupation-properties-minimumteaching-properties-setting.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/setting")

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
