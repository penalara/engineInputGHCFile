# DoNotFinishAtLastMorningSection Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection
```

Do not start at the first hour and finish at the last hour of the morning.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Type

unknown ([DoNotFinishAtLastMorningSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md))

## doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |
