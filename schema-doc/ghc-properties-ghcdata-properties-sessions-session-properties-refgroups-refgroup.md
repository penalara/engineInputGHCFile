# RefGroup Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items
```

Value pair: group identifier and number of students.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([RefGroup](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup.md))

# items Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                |
| :-------------------------- | :-------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refGroup](#refgroup)       | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup-properties-refgroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items/properties/refGroup")       |
| [numStudents](#numstudents) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup-properties-numstudents.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items/properties/numStudents") |

## refGroup

Group identifier.

`refGroup`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup-properties-refgroup.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items/properties/refGroup")

### refGroup Type

`string`

## numStudents

Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.

`numStudents`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup-properties-numstudents.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items/properties/numStudents")

### numStudents Type

`integer`
