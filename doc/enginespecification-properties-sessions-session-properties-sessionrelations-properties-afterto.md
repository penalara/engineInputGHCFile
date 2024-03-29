# AfterTo Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/afterTo
```

This indicates that this class unit must be allocated on a subsequent day to the class units in the list. This is a strict condition.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## afterTo Type

`integer[]` ([SessionRef](enginespecification-properties-sessions-session-properties-sessionrelations-properties-afterto-sessionref.md))

## afterTo Constraints

**minimum number of items**: the minimum number of items for this array is: `1`
