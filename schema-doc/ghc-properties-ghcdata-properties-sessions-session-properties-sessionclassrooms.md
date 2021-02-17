# SessionClassRooms Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms
```

It contains the information about the classrooms for the class units. At least one classroom is required for the class units.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## sessionClassRooms Type

`object` ([SessionClassRooms](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms.md))

# SessionClassRooms Properties

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                               |
| :---------------------------------------- | ------------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [classRoomsToAssign](#classroomstoassign) | `array`       | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/classRoomsToAssign") |
| [capacityPreference](#capacitypreference) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-capacitypreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/capacityPreference") |
| [capacityType](#capacitytype)             | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-capacitytype.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/capacityType")             |
| [refBuilding](#refbuilding)               | `string`      | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/refBuilding")               |

## classRoomsToAssign

List of classrooms to the session. Each object in the list represent one classroom that must be assigned.


`classRoomsToAssign`

-   is optional
-   Type: `object[]` ([RefClassRoomToAssign](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/classRoomsToAssign")

### classRoomsToAssign Type

`object[]` ([RefClassRoomToAssign](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign.md))

## capacityPreference

Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.


`capacityPreference`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-capacitypreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/capacityPreference")

### capacityPreference Type

unknown

### capacityPreference Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value       | Explanation |
| :---------- | ----------- |
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

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-capacitytype.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/capacityType")

### capacityType Type

unknown

### capacityType Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value          | Explanation |
| :------------- | ----------- |
| `"individual"` |             |
| `"collective"` |             |

### capacityType Default Value

The default value is:

```json
"individual"
```

## refBuilding

Building identifier of the building where the class unit takes place. Only allowed for sessions without groups of students. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.


> It is incompatible with the other properties of 'sessionClassRooms' object.
>

`refBuilding`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-refbuilding.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/refBuilding")

### refBuilding Type

`string`
