# MiddayReference Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/middayReference
```

.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## middayReference Type

`object` ([MiddayReference](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-middayreference.md))

# MiddayReference Properties

| Property              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                   |
| :-------------------- | --------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refFrame](#refframe) | `string`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-middayreference-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/middayReference/properties/refFrame") |
| [strict](#strict)     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-middayreference-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/middayReference/properties/strict")     |

## refFrame

Identifier name of a frame where the teacher take the midday. If it is not not specified, the engine will take the midday of the frame with the highest allocation.


`refFrame`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-middayreference-properties-refframe.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/middayReference/properties/refFrame")

### refFrame Type

`string`

## strict

Indicates if the teacher's midday break must be respected without placing their sessions in sections of other frames that overlap with their midday.


`strict`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-teachers-teacher-properties-settings-periodsetting-properties-middayreference-properties-strict.md "engineInputGHCSchema#/properties/ghcData/properties/teachers/items/properties/settings/items/properties/middayReference/properties/strict")

### strict Type

`boolean`

### strict Default Value

The default value is:

```json
true
```
