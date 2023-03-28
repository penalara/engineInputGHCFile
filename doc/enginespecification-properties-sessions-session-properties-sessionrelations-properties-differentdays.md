# DifferentDays Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/differentDays
```

Conditions on this and another class unit cannot coincide on the same day.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## differentDays Type

`object` ([DifferentDays](enginespecification-properties-sessions-session-properties-sessionrelations-properties-differentdays.md))

# differentDays Properties

| Property                    | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                          |
| :-------------------------- | :------------ | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [refSesions](#refsesions)   | `array`       | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-refsesions.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/differentDays/properties/refSesions")   |
| [daysSetting](#dayssetting) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-dayssetting.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/differentDays/properties/daysSetting") |

## refSesions

Sessions identifiers which class units should not be assigned on the same day.

`refSesions`

*   is required

*   Type: `integer[]` ([SessionRef](enginespecification-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-refsesions-sessionref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-refsesions.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/differentDays/properties/refSesions")

### refSesions Type

`integer[]` ([SessionRef](enginespecification-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-refsesions-sessionref.md))

### refSesions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## daysSetting

Keep the same position each week or period for the class units.

`daysSetting`

*   is optional

*   Type: unknown

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-dayssetting.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/differentDays/properties/daysSetting")

### daysSetting Type

unknown

### daysSetting Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                           | Explanation |
| :------------------------------ | :---------- |
| `"nonConsecutiveDaysPreferred"` |             |
| `"indifferentDaysPreferred"`    |             |
| `"strictNonConsecutiveDays"`    |             |
| `"strictConsecutiveDays"`       |             |

### daysSetting Default Value

The default value is:

```json
"indifferentDaysPreferred"
```
