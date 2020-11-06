# Untitled undefined type in JsonGHCFile Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/tasks/properties/taskList/items/properties/frameTemplate/allOf/1/items/properties/type
```

Availability of task to be assigned to the section.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## type Type

unknown

## type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                    | Explanation |
| :----------------------- | ----------- |
| `"banned"`               |             |
| `"available"`            |             |
| `"strong-non-preferred"` |             |
| `"weak-non-preferred"`   |             |