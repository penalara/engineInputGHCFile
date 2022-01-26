# Untitled undefined type in EngineInputGHCSchema Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/capacityType
```

It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## capacityType Type

unknown

## capacityType Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value          | Explanation |
| :------------- | :---------- |
| `"individual"` |             |
| `"collective"` |             |

## capacityType Default Value

The default value is:

```json
"individual"
```
