# RefClassRoomToAssign Schema

```txt
engineInputGHCSchema#/definitions/refClassRoomToAssign
```

Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## refClassRoomToAssign Type

`object` ([RefClassRoomToAssign](ghc-definitions-refclassroomtoassign.md))

# refClassRoomToAssign Properties

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                           |
| :---------------------------------------- | :------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [classRoom](#classroom)                   | `string` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-refclassroomtoassign-properties-classroomref.md "engineInputGHCSchema#/definitions/refClassRoomToAssign/properties/classRoom")                |
| [classRoomsSetsList](#classroomssetslist) | `array`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-refclassroomtoassign-properties-classroomssetslist.md "engineInputGHCSchema#/definitions/refClassRoomToAssign/properties/classRoomsSetsList") |

## classRoom

Classroom identifier.

`classRoom`

*   is optional

*   Type: `string` ([ClassRoomRef](ghc-definitions-refclassroomtoassign-properties-classroomref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-refclassroomtoassign-properties-classroomref.md "engineInputGHCSchema#/definitions/refClassRoomToAssign/properties/classRoom")

### classRoom Type

`string` ([ClassRoomRef](ghc-definitions-refclassroomtoassign-properties-classroomref.md))

## classRoomsSetsList

Classroom set list where one classroom could be taken to assign to session.

`classRoomsSetsList`

*   is optional

*   Type: `string[]` ([ClassRoomSetRef](ghc-definitions-refclassroomtoassign-properties-classroomssetslist-classroomsetref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-refclassroomtoassign-properties-classroomssetslist.md "engineInputGHCSchema#/definitions/refClassRoomToAssign/properties/classRoomsSetsList")

### classRoomsSetsList Type

`string[]` ([ClassRoomSetRef](ghc-definitions-refclassroomtoassign-properties-classroomssetslist-classroomsetref.md))
