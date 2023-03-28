# OtherElementsInClassRooms Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms/items
```

It contains interrelated elements that are present in the session in addition to the main ones.

> If a subject reference is not included, or of the other elements of the session (teacher and/or group), the relationship is understood by default with the corresponding main element of the session.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## items Type

`object` ([OtherElementsInClassRooms](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms.md))

# items Properties

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                                  |
| :------------------------ | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refSubject](#refsubject) | `string` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-subjectreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refSubject") |
| [refTeacher](#refteacher) | `string` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-teacherreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refTeacher") |
| [refGroup](#refgroup)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-groupreferencetype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refGroup")                                                                                               |
| [refTask](#reftask)       | `string` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-taskreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refTask")       |

## refSubject

Identifier name of other subject in the classroom.

`refSubject`

*   is optional

*   Type: `string` ([SubjectReference](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-subjectreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-subjectreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refSubject")

### refSubject Type

`string` ([SubjectReference](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-subjectreference.md))

## refTeacher

Identifier name of other teacher in the classroom.

`refTeacher`

*   is optional

*   Type: `string` ([TeacherReference](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-teacherreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-teacherreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refTeacher")

### refTeacher Type

`string` ([TeacherReference](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-teacherreference.md))

## refGroup

Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

`refGroup`

*   is optional

*   Type: `object` ([GroupReferenceType](enginespecification-definitions-groupreferencetype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-groupreferencetype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refGroup")

### refGroup Type

`object` ([GroupReferenceType](enginespecification-definitions-groupreferencetype.md))

## refTask

Identifier name of the task of the other teacher.

`refTask`

*   is optional

*   Type: `string` ([TaskReference](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-taskreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-taskreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refTask")

### refTask Type

`string` ([TaskReference](enginespecification-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-taskreference.md))
