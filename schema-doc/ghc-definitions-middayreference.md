# MiddayReference Schema

```txt
engineInputGHCSchema#/definitions/middayReference
```

It indicate the frame where the teacher takes noon pause.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## middayReference Type

`object` ([MiddayReference](ghc-definitions-middayreference.md))

# middayReference Properties

| Property              | Type      | Required | Nullable       | Defined by                                                                                                                                             |
| :-------------------- | :-------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refFrame](#refframe) | `string`  | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-middayreference-properties-refframe.md "engineInputGHCSchema#/definitions/middayReference/properties/refFrame") |
| [strict](#strict)     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-middayreference-properties-strict.md "engineInputGHCSchema#/definitions/middayReference/properties/strict")     |

## refFrame

Identifier of a frame where the teacher takes noon pause. If not specified, the engine shall take the noon pause of the frame with the highest allocation.

`refFrame`

*   is optional

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-middayreference-properties-refframe.md "engineInputGHCSchema#/definitions/middayReference/properties/refFrame")

### refFrame Type

`string`

## strict

It indicates whether the teacher's noon pause should be respected without placing his or her class units in sections of other frameworks that overlap with his or her noon pause.

`strict`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](ghc-definitions-middayreference-properties-strict.md "engineInputGHCSchema#/definitions/middayReference/properties/strict")

### strict Type

`boolean`

### strict Default Value

The default value is:

```json
true
```
