# RefClassRoomToAssign Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/classRoomsToAssign/items
```

Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([RefClassRoomToAssign](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign.md))

# RefClassRoomToAssign Properties

| Property                                  | Type    | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                      |
| :---------------------------------------- | ------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [classRoomsList](#classroomslist)         | `array` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign-properties-classroomref.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/classRoomsToAssign/items/properties/classRoomsList")           |
| [classRoomsSetsList](#classroomssetslist) | `array` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign-properties-classroomssetslist.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/classRoomsToAssign/items/properties/classRoomsSetsList") |

## classRoomsList

Available classroom list to be assigned to session.


`classRoomsList`

-   is optional
-   Type: `string[]` ([ClassRoomRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign-properties-classroomref-classroomref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign-properties-classroomref.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/classRoomsToAssign/items/properties/classRoomsList")

### classRoomsList Type

`string[]` ([ClassRoomRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign-properties-classroomref-classroomref.md))

## classRoomsSetsList

Classroom set list where one classroom could be taken to assign to session.


`classRoomsSetsList`

-   is optional
-   Type: `string[]` ([ClassRoomSetRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign-properties-classroomssetslist-classroomsetref.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign-properties-classroomssetslist.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/sessionClassRooms/properties/classRoomsToAssign/items/properties/classRoomsSetsList")

### classRoomsSetsList Type

`string[]` ([ClassRoomSetRef](ghc-properties-ghcdata-properties-sessions-session-properties-sessionclassrooms-properties-classroomstoassign-refclassroomtoassign-properties-classroomssetslist-classroomsetref.md))
