# GroupReferenceType Schema

```txt
engineInputGHCSchema#/definitions/refGroup
```

Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## refGroup Type

`object` ([GroupReferenceType](ghc-definitions-groupreferencetype.md))

# refGroup Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                               |
| :-------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refIdGroup](#refidgroup)   | `string`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-groupreferencetype-properties-refidgroup.md "engineInputGHCSchema#/definitions/refGroup/properties/refIdGroup")   |
| [numStudents](#numstudents) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-groupreferencetype-properties-numstudents.md "engineInputGHCSchema#/definitions/refGroup/properties/numStudents") |

## refIdGroup

Group identifier.

`refIdGroup`

*   is optional

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-groupreferencetype-properties-refidgroup.md "engineInputGHCSchema#/definitions/refGroup/properties/refIdGroup")

### refIdGroup Type

`string`

## numStudents

Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.

`numStudents`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-groupreferencetype-properties-numstudents.md "engineInputGHCSchema#/definitions/refGroup/properties/numStudents")

### numStudents Type

`integer`