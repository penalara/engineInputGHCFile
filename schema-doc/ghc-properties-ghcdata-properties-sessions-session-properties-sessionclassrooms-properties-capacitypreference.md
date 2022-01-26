# Untitled undefined type in EngineInputGHCSchema Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/capacityPreference
```

Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## capacityPreference Type

unknown

## capacityPreference Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value       | Explanation |
| :---------- | :---------- |
| `"attempt"` |             |
| `"strict"`  |             |
| `"ignore"`  |             |

## capacityPreference Default Value

The default value is:

```json
"ignore"
```
