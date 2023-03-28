# DoNotFinishAtLastAfternoonSection Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection
```

o not finish at the last hour of the evening and start at the first.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastAfternoonSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md))

## doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |
