# MaximumTeaching Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumTeaching
```

Minimum teaching time of the teacher with students.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## maximumTeaching Type

`object` ([MaximumTeaching](enginespecification-definitions-dailyocupation-properties-maximumteaching.md))

# maximumTeaching Properties

| Property                    | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                           |
| :-------------------------- | :------------ | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [restriction](#restriction) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumteaching-properties-restrictiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumTeaching/properties/restriction")  |
| [setting](#setting)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumteaching-properties-ocupationsettingtype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumTeaching/properties/setting") |

## restriction

Indicate whether the incompatibility is a strict, ignore, preferred (strong optimization weight) or accordingToRule (weight according to optimization rule).

`restriction`

*   is optional

*   Type: unknown ([RestrictionType](enginespecification-definitions-dailyocupation-properties-maximumteaching-properties-restrictiontype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumteaching-properties-restrictiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumTeaching/properties/restriction")

### restriction Type

unknown ([RestrictionType](enginespecification-definitions-dailyocupation-properties-maximumteaching-properties-restrictiontype.md))

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

*   Type: unknown ([OcupationSettingType](enginespecification-definitions-dailyocupation-properties-maximumteaching-properties-ocupationsettingtype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumteaching-properties-ocupationsettingtype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumTeaching/properties/setting")

### setting Type

unknown ([OcupationSettingType](enginespecification-definitions-dailyocupation-properties-maximumteaching-properties-ocupationsettingtype.md))

### setting Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"auto"`   |             |
| `"higher"` |             |
| `"lower"`  |             |
