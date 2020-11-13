# DifferentDays Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays
```

Conditions about this and other session can not coincide in the same day.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## differentDays Type

`object` ([DifferentDays](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays.md))

# DifferentDays Properties

| Property                    | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                 |
| :-------------------------- | ------------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refSesions](#refsesions)   | `array`       | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-refsesions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays/properties/refSesions")   |
| [daysSetting](#dayssetting) | Not specified | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-dayssetting.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays/properties/daysSetting") |

## refSesions

Identifiers of the sessions that they should not be assigned at the same day when this one.


`refSesions`

-   is required
-   Type: `string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-refsesions-sessionref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-refsesions.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays/properties/refSesions")

### refSesions Type

`string[]` ([SessionRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-refsesions-sessionref.md))

### refSesions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## daysSetting

Keep the same position each week or period for the classes of the session.


`daysSetting`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionrelations-properties-differentdays-properties-dayssetting.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionRelations/properties/differentDays/properties/daysSetting")

### daysSetting Type

unknown

### daysSetting Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                                 | Explanation |
| :------------------------------------ | ----------- |
| `"nonConsecutiveDaysPreferred"`       |             |
| `"consecutiveDaysPreferred"`          |             |
| `"strictNonConsecutiveDaysPreferred"` |             |
| `"strictConsecutiveDaysPreferred"`    |             |
