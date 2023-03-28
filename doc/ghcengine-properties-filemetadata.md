# FileMetadata Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta
```

Information about the file.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                           |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghcEngine.schema.json\*](../../../out/ghcEngine.schema.json "open original schema") |

## meta Type

`object` ([FileMetadata](ghcengine-properties-filemetadata.md))

# meta Properties

| Property                              | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                     |
| :------------------------------------ | :------------ | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                         | `string`      | Required | cannot be null | [GhcEngineSchema](ghcengine-properties-filemetadata-properties-timetablename.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/name")                  |
| [versionJson](#versionjson)           | `string`      | Required | cannot be null | [GhcEngineSchema](ghcengine-properties-filemetadata-properties-schemaversion.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/versionJson")           |
| [createdDate](#createddate)           | `string`      | Required | cannot be null | [GhcEngineSchema](ghcengine-properties-filemetadata-properties-jsoncreateddate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/createdDate")         |
| [lastModifiedDate](#lastmodifieddate) | `string`      | Required | cannot be null | [GhcEngineSchema](ghcengine-properties-filemetadata-properties-jsongenerationdate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/lastModifiedDate") |
| [refUser](#refuser)                   | `string`      | Required | cannot be null | [GhcEngineSchema](ghcengine-properties-filemetadata-properties-userreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/refUser")               |
| [source](#source)                     | Not specified | Required | cannot be null | [GhcEngineSchema](ghcengine-properties-filemetadata-properties-sourcemodule.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/source")                 |
| [fullMode](#fullmode)                 | `boolean`     | Optional | cannot be null | [GhcEngineSchema](ghcengine-properties-filemetadata-properties-fullplannermode.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/fullMode")            |

## name

Name of the Timetable

`name`

*   is required

*   Type: `string` ([TimetableName](ghcengine-properties-filemetadata-properties-timetablename.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-filemetadata-properties-timetablename.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/name")

### name Type

`string` ([TimetableName](ghcengine-properties-filemetadata-properties-timetablename.md))

## versionJson

Version of multiplatformGHCSchema used

`versionJson`

*   is required

*   Type: `string` ([SchemaVersion](ghcengine-properties-filemetadata-properties-schemaversion.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-filemetadata-properties-schemaversion.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/versionJson")

### versionJson Type

`string` ([SchemaVersion](ghcengine-properties-filemetadata-properties-schemaversion.md))

## createdDate

Json generation date.

`createdDate`

*   is required

*   Type: `string` ([JsonCreatedDate](ghcengine-properties-filemetadata-properties-jsoncreateddate.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-filemetadata-properties-jsoncreateddate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/createdDate")

### createdDate Type

`string` ([JsonCreatedDate](ghcengine-properties-filemetadata-properties-jsoncreateddate.md))

### createdDate Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## lastModifiedDate

Json last modification date.

`lastModifiedDate`

*   is required

*   Type: `string` ([JsonGenerationDate](ghcengine-properties-filemetadata-properties-jsongenerationdate.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-filemetadata-properties-jsongenerationdate.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/lastModifiedDate")

### lastModifiedDate Type

`string` ([JsonGenerationDate](ghcengine-properties-filemetadata-properties-jsongenerationdate.md))

### lastModifiedDate Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## refUser

Contains a user reference who owns the file.

`refUser`

*   is required

*   Type: `string` ([UserReference](ghcengine-properties-filemetadata-properties-userreference.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-filemetadata-properties-userreference.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/refUser")

### refUser Type

`string` ([UserReference](ghcengine-properties-filemetadata-properties-userreference.md))

## source

Indicates the GHCMultiplatform module that generated the file.

`source`

*   is required

*   Type: unknown ([SourceModule](ghcengine-properties-filemetadata-properties-sourcemodule.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-filemetadata-properties-sourcemodule.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/source")

### source Type

unknown ([SourceModule](ghcengine-properties-filemetadata-properties-sourcemodule.md))

### source Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value        | Explanation |
| :----------- | :---------- |
| `"horarios"` |             |
| `"je"`       |             |

## fullMode

Indicates if the planner must use the full mode.

`fullMode`

*   is optional

*   Type: `boolean` ([FullPlannerMode](ghcengine-properties-filemetadata-properties-fullplannermode.md))

*   cannot be null

*   defined in: [GhcEngineSchema](ghcengine-properties-filemetadata-properties-fullplannermode.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/ghcEngine.schema.json#/properties/meta/properties/fullMode")

### fullMode Type

`boolean` ([FullPlannerMode](ghcengine-properties-filemetadata-properties-fullplannermode.md))
