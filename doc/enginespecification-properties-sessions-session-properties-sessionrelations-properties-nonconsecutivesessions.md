# NonConsecutiveSessions Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionRelations/properties/nonConsecutiveSessions
```

Identifiers of the sessions which class units must not be consecutive. This is a strict condition.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## nonConsecutiveSessions Type

`integer[]` ([SessionRef](enginespecification-properties-sessions-session-properties-sessionrelations-properties-nonconsecutivesessions-sessionref.md))

## nonConsecutiveSessions Constraints

**minimum number of items**: the minimum number of items for this array is: `1`
