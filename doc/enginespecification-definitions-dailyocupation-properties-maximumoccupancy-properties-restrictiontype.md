# RestrictionType Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumOccupancy/properties/restriction
```

Indicate whether the incompatibility is a strict, ignore, preferred (strong optimization weight) or accordingToRule (weight according to optimization rule).

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## restriction Type

unknown ([RestrictionType](enginespecification-definitions-dailyocupation-properties-maximumoccupancy-properties-restrictiontype.md))

## restriction Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value               | Explanation |
| :------------------ | :---------- |
| `"ignore"`          |             |
| `"strict"`          |             |
| `"preferred"`       |             |
| `"accordingToRule"` |             |
