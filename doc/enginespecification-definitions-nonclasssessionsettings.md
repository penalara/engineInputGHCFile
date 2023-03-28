# NonClassSessionSettings Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings
```

Settings of the meeting.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## nonClassSessionSettings Type

`object` ([NonClassSessionSettings](enginespecification-definitions-nonclasssessionsettings.md))

# nonClassSessionSettings Properties

| Property                                                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                              |
| :------------------------------------------------------ | :------------ | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [computeForMaxMinOccupancy](#computeformaxminoccupancy) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings-properties-computeformaxminoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings/properties/computeForMaxMinOccupancy") |
| [samePositionEveryPeriod](#samepositioneveryperiod)     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-samepositioneveryperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings/properties/samePositionEveryPeriod")                                        |

## computeForMaxMinOccupancy

It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.

`computeForMaxMinOccupancy`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings-properties-computeformaxminoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings/properties/computeForMaxMinOccupancy")

### computeForMaxMinOccupancy Type

`boolean`

## samePositionEveryPeriod

Keep the same position every week or period for the class units.

`samePositionEveryPeriod`

*   is optional

*   Type: unknown ([SamePositionEveryPeriod](enginespecification-definitions-samepositioneveryperiod.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-samepositioneveryperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings/properties/samePositionEveryPeriod")

### samePositionEveryPeriod Type

unknown ([SamePositionEveryPeriod](enginespecification-definitions-samepositioneveryperiod.md))

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
