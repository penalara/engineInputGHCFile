# OtherElementsInClassRooms Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/otherElementsInClassRooms/items
```

It contains interrelated elements that are present in the session in addition to the main ones.

> If a subject reference is not included, or of the other elements of the session (teacher and/or group), the relationship is understood by default with the corresponding main element of the session.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([OtherElementsInClassRooms](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms.md))

# items Properties

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                         |
| :------------------------ | :------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refSubject](#refsubject) | `string` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-subjectreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refSubject") |
| [refTeacher](#refteacher) | `string` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-teacherreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refTeacher") |
| [refGroup](#refgroup)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-groupreferencetype.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refGroup")                                                                                                                  |
| [refTask](#reftask)       | `string` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-taskreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refTask")       |

## refSubject

Identifier name of other subject in the classroom.

`refSubject`

*   is optional

*   Type: `string` ([SubjectReference](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-subjectreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-subjectreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refSubject")

### refSubject Type

`string` ([SubjectReference](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-subjectreference.md))

## refTeacher

Identifier name of other teacher in the classroom.

`refTeacher`

*   is optional

*   Type: `string` ([TeacherReference](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-teacherreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-teacherreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refTeacher")

### refTeacher Type

`string` ([TeacherReference](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-teacherreference.md))

## refGroup

Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

`refGroup`

*   is optional

*   Type: `object` ([GroupReferenceType](ghc-definitions-groupreferencetype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-groupreferencetype.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refGroup")

### refGroup Type

`object` ([GroupReferenceType](ghc-definitions-groupreferencetype.md))

## refTask

Identifier name of the task of the other teacher.

`refTask`

*   is optional

*   Type: `string` ([TaskReference](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-taskreference.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-taskreference.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/otherElementsInClassRooms/items/properties/refTask")

### refTask Type

`string` ([TaskReference](ghc-properties-ghcdata-properties-sessions-session-properties-otherelementsinclassroomslist-otherelementsinclassrooms-properties-taskreference.md))
