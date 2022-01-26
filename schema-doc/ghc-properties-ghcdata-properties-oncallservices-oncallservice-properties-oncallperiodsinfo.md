# OnCallPeriodsInfo Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refPeriods
```

It contains the periods when the service must be set and mirror placement in periods condition (same placement in periods).

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## refPeriods Type

`object` ([OnCallPeriodsInfo](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo.md))

# refPeriods Properties

| Property                                            | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                    |
| :-------------------------------------------------- | :------------ | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [periods](#periods)                                 | `array`       | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo-properties-periodslist.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refPeriods/properties/periods")                             |
| [samePositionEveryPeriod](#samepositioneveryperiod) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo-properties-samepositioneveryperiod.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refPeriods/properties/samePositionEveryPeriod") |

## periods

List of Periods when the service must be set.

`periods`

*   is required

*   Type: `string[]`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo-properties-periodslist.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refPeriods/properties/periods")

### periods Type

`string[]`

## samePositionEveryPeriod

Keep the same position each week or period for the service units.

`samePositionEveryPeriod`

*   is optional

*   Type: unknown

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-oncallservices-oncallservice-properties-oncallperiodsinfo-properties-samepositioneveryperiod.md "engineInputGHCSchema#/properties/ghcData/properties/onCallServices/items/properties/refPeriods/properties/samePositionEveryPeriod")

### samePositionEveryPeriod Type

unknown

### samePositionEveryPeriod Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | :---------- |
| `"ignore"`    |             |
| `"attempt"`   |             |
| `"avoid"`     |             |
| `"strict"`    |             |
| `"forbidden"` |             |

### samePositionEveryPeriod Default Value

The default value is:

```json
"ignore"
```
