# SessionClassRooms Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionClassRooms
```

It contains the information about the classrooms for the class units. At least one classroom is required for the class units.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## sessionClassRooms Type

`object` ([SessionClassRooms](enginespecification-properties-sessions-session-properties-sessionclassrooms.md))

# sessionClassRooms Properties

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                        |
| :---------------------------------------- | :------------ | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [classRoomsToAssign](#classroomstoassign) | `array`       | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionClassRooms/properties/classRoomsToAssign") |
| [capacityPreference](#capacitypreference) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionclassrooms-properties-capacitypreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionClassRooms/properties/capacityPreference") |
| [capacityType](#capacitytype)             | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionclassrooms-properties-capacitytype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionClassRooms/properties/capacityType")             |

## classRoomsToAssign

List of classrooms to the session. Each object in the list represent one classroom that must be assigned.

`classRoomsToAssign`

*   is required

*   Type: `object[]` ([RefClassRoomToAssign](enginespecification-definitions-refclassroomtoassign.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionClassRooms/properties/classRoomsToAssign")

### classRoomsToAssign Type

`object[]` ([RefClassRoomToAssign](enginespecification-definitions-refclassroomtoassign.md))

## capacityPreference

Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.

`capacityPreference`

*   is optional

*   Type: unknown

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionclassrooms-properties-capacitypreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionClassRooms/properties/capacityPreference")

### capacityPreference Type

unknown

### capacityPreference Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value       | Explanation |
| :---------- | :---------- |
| `"attempt"` |             |
| `"strict"`  |             |
| `"ignore"`  |             |

### capacityPreference Default Value

The default value is:

```json
"ignore"
```

## capacityType

It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.

`capacityType`

*   is optional

*   Type: unknown

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-sessionclassrooms-properties-capacitytype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/sessionClassRooms/properties/capacityType")

### capacityType Type

unknown

### capacityType Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value          | Explanation |
| :------------- | :---------- |
| `"individual"` |             |
| `"collective"` |             |

### capacityType Default Value

The default value is:

```json
"individual"
```
