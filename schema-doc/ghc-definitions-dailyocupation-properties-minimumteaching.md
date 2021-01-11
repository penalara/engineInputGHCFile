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

| Property                    | Type          | Required | Nullable       | Defined by                                                                                                                                                       |
| :-------------------------- | ------------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [restriction](#restriction) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-restrictiontype.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/restriction")  |
| [setting](#setting)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-ocupationsettingtype.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/setting") |

## restriction

Kind of 'dailyOcupation' restriction. It can be 'ignore', 'strict', 'preferred' or according to the related rule of optimization.


`restriction`

-   is optional
-   Type: unknown ([RestrictionType](ghc-definitions-restrictiontype.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-restrictiontype.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/restriction")

### restriction Type

unknown ([RestrictionType](ghc-definitions-restrictiontype.md))

### restriction Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value               | Explanation |
| :------------------ | ----------- |
| `"ignore"`          |             |
| `"strict"`          |             |
| `"preferred"`       |             |
| `"accordingToRule"` |             |

## setting

Indicates whether the automatic calculation of the value must be adjusted to higher or lower. The adjustment is made with the duration of the greater section.


`setting`

-   is optional
-   Type: unknown ([OcupationSettingType](ghc-definitions-ocupationsettingtype.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-ocupationsettingtype.md "engineInputGHCSchema#/definitions/dailyOcupation/properties/minimumTeaching/properties/setting")

### setting Type

unknown ([OcupationSettingType](ghc-definitions-ocupationsettingtype.md))

### setting Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"auto"`   |             |
| `"higher"` |             |
| `"lower"`  |             |
