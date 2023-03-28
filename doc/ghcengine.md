# GhcEngineSchema Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json
```

Schema with the structure of GHC Engine files

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                         |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :--------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghcEngine.schema.json](../../../out/ghcEngine.schema.json "open original schema") |

## GhcEngineSchema Type

`object` ([GhcEngineSchema](ghcengine.md))

# GhcEngineSchema Properties

| Property                          | Type      | Required | Nullable       | Defined by                                                                                                                                                                 |
| :-------------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                         | `integer` | Optional | cannot be null | [GhcEngineSchema](ghcengine-properties-idfile.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/id")               |
| [meta](#meta)                     | `object`  | Required | cannot be null | [GhcEngineSchema](ghcengine-properties-filemetadata.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta")       |
| [specifications](#specifications) | `object`  | Required | cannot be null | [GhcEngineSchema](enginespecification.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/specifications") |
| [results](#results)               | `array`   | Optional | cannot be null | [GhcEngineSchema](ghcengine-properties-engineresults.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/results")   |

## id

Indicates the id number of the file at the Penalara Server.

`id`

*   is optional

*   Type: `integer` ([IdFile](ghcengine-properties-idfile.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-idfile.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/id")

### id Type

`integer` ([IdFile](ghcengine-properties-idfile.md))

## meta

Information about the file.

`meta`

*   is required

*   Type: `object` ([FileMetadata](ghcengine-properties-filemetadata.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-filemetadata.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta")

### meta Type

`object` ([FileMetadata](ghcengine-properties-filemetadata.md))

## specifications

Schema of the object that contains the timetable planning data.

`specifications`

*   is required

*   Type: `object` ([EngineInputGHCSchema](enginespecification.md))

*   cannot be null

*   defined in: [GhcEngineSchema](enginespecification.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/specifications")

### specifications Type

`object` ([EngineInputGHCSchema](enginespecification.md))

## results

Tables of the timetable that contain sections where the class units are located.

`results`

*   is optional

*   Type: `object[]` ([EngineResult](ghcengine-properties-engineresults-engineresult.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-engineresults.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/results")

### results Type

`object[]` ([EngineResult](ghcengine-properties-engineresults-engineresult.md))
