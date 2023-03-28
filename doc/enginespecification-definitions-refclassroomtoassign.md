# RefClassRoomToAssign Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign
```

Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## refClassRoomToAssign Type

`object` ([RefClassRoomToAssign](enginespecification-definitions-refclassroomtoassign.md))

# refClassRoomToAssign Properties

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                          |
| :---------------------------------------- | :------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [classRoom](#classroom)                   | `string` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign-properties-classroomref.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign/properties/classRoom")                |
| [classRoomsSetsList](#classroomssetslist) | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign-properties-classroomssetslist.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign/properties/classRoomsSetsList") |

## classRoom

Classroom identifier.

`classRoom`

*   is optional

*   Type: `string` ([ClassRoomRef](enginespecification-definitions-refclassroomtoassign-properties-classroomref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign-properties-classroomref.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign/properties/classRoom")

### classRoom Type

`string` ([ClassRoomRef](enginespecification-definitions-refclassroomtoassign-properties-classroomref.md))

## classRoomsSetsList

Classroom set list where one classroom could be taken to assign to session.

`classRoomsSetsList`

*   is optional

*   Type: `string[]` ([ClassRoomSetRef](enginespecification-definitions-refclassroomtoassign-properties-classroomssetslist-classroomsetref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign-properties-classroomssetslist.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign/properties/classRoomsSetsList")

### classRoomsSetsList Type

`string[]` ([ClassRoomSetRef](enginespecification-definitions-refclassroomtoassign-properties-classroomssetslist-classroomsetref.md))
