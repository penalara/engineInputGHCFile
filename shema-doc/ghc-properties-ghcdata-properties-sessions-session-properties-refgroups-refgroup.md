# RefGroup Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items
```

Identifier name of the gruop.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## items Type

`object` ([RefGroup](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup.md))

# RefGroup Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                |
| :-------------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [idGruop](#idgruop)         | `string`  | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup-properties-idgruop.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items/properties/idGruop")         |
| [numStudents](#numstudents) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup-properties-numstudents.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items/properties/numStudents") |

## idGruop

Identifier of the Group.


`idGruop`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup-properties-idgruop.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items/properties/idGruop")

### idGruop Type

`string`

## numStudents

Custom number of students who are in the sessions. If is not specified, the engine takes by default the value of the Group object.


`numStudents`

-   is optional
-   Type: `integer`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-sessions-session-properties-refgroups-refgroup-properties-numstudents.md "engineInputGHCSchema#/properties/ghcData/properties/sessions/items/properties/refGroups/items/properties/numStudents")

### numStudents Type

`integer`
