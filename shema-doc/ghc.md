# JsonGHCFile Schema

```txt
GeneralJsonGHCSchema
```

Schema document to keep the information of the timetable to be generated by PenalaraGHC.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                       |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ---------------------------------------------------------------- |
| Can be instantiated | Yes        | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json](../out/ghc.schema.json "open original schema") |

## JsonGHCFile Type

unknown ([JsonGHCFile](ghc.md))

# JsonGHCFile Properties

| Property                    | Type     | Required | Nullable       | Defined by                                                                                    |
| :-------------------------- | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------- |
| [versionJson](#versionjson) | `string` | Required | cannot be null | [JsonGHCFile](ghc-properties-schemaversion.md "GeneralJsonGHCSchema#/properties/versionJson") |
| [date](#date)               | `string` | Required | cannot be null | [JsonGHCFile](ghc-properties-jsongenerationdate.md "GeneralJsonGHCSchema#/properties/date")   |
| [ghcData](#ghcdata)         | `object` | Required | cannot be null | [JsonGHCFile](ghc-properties-ghcdata.md "GeneralJsonGHCSchema#/properties/ghcData")           |

## versionJson

Version of GHC JSON-Schema document


`versionJson`

-   is required
-   Type: `string` ([SchemaVersion](ghc-properties-schemaversion.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-schemaversion.md "GeneralJsonGHCSchema#/properties/versionJson")

### versionJson Type

`string` ([SchemaVersion](ghc-properties-schemaversion.md))

## date

An explanation about the purpose of this instance.


`date`

-   is required
-   Type: `string` ([JsonGenerationDate](ghc-properties-jsongenerationdate.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-jsongenerationdate.md "GeneralJsonGHCSchema#/properties/date")

### date Type

`string` ([JsonGenerationDate](ghc-properties-jsongenerationdate.md))

### date Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## ghcData

Schema of the object that contains the timetable planning data.


`ghcData`

-   is required
-   Type: `object` ([GhcData](ghc-properties-ghcdata.md))
-   cannot be null
-   defined in: [JsonGHCFile](ghc-properties-ghcdata.md "GeneralJsonGHCSchema#/properties/ghcData")

### ghcData Type

`object` ([GhcData](ghc-properties-ghcdata.md))

# JsonGHCFile Definitions

## Definitions group frameTemplate

Reference this group by using

```json
{"$ref":"GeneralJsonGHCSchema#/definitions/frameTemplate"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |