# EngineInputGHCSchema Schema

```txt
engineInputGHCSchema
```

Schema document to keep the information of the timetable to be generated by PenalaraGHC.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                       |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ---------------------------------------------------------------- |
| Can be instantiated | Yes        | Unknown status | No           | Forbidden         | Allowed               | none                | [ghc.schema.json](../out/ghc.schema.json "open original schema") |

## EngineInputGHCSchema Type

`object` ([EngineInputGHCSchema](ghc.md))

# EngineInputGHCSchema Properties

| Property                    | Type     | Required | Nullable       | Defined by                                                                                             |
| :-------------------------- | -------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------- |
| [versionJson](#versionjson) | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-schemaversion.md "engineInputGHCSchema#/properties/versionJson") |
| [date](#date)               | `string` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-jsongenerationdate.md "engineInputGHCSchema#/properties/date")   |
| [ghcData](#ghcdata)         | `object` | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata.md "engineInputGHCSchema#/properties/ghcData")           |

## versionJson

Version of EngineInputGHCSchema used


`versionJson`

-   is required
-   Type: `string` ([SchemaVersion](ghc-properties-schemaversion.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-schemaversion.md "engineInputGHCSchema#/properties/versionJson")

### versionJson Type

`string` ([SchemaVersion](ghc-properties-schemaversion.md))

## date

Json's generation date.


`date`

-   is required
-   Type: `string` ([JsonGenerationDate](ghc-properties-jsongenerationdate.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-jsongenerationdate.md "engineInputGHCSchema#/properties/date")

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
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata.md "engineInputGHCSchema#/properties/ghcData")

### ghcData Type

`object` ([GhcData](ghc-properties-ghcdata.md))

# EngineInputGHCSchema Definitions

## Definitions group frameTemplate

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/frameTemplate"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group weeklyStable

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/weeklyStable"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group weeklyVariable

Reference this group by using

```json
{"$ref":"engineInputGHCSchema#/definitions/weeklyVariable"}
```

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                               |
| :---------------------------------------- | ------------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [numSessions](#numsessions)               | `number`      | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-numsessions.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/numSessions")               |
| [maxSessionsDaily](#maxsessionsdaily)     | `number`      | Required | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxsessionsdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxSessionsDaily")     |
| [minSessionsDayly](#minsessionsdayly)     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minsessionsdayly.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minSessionsDayly")     |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity") |

### numSessions

.


`numSessions`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-numsessions.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/numSessions")

#### numSessions Type

`number`

### maxSessionsDaily

.


`maxSessionsDaily`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-maxsessionsdaily.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/maxSessionsDaily")

#### maxSessionsDaily Type

`number`

### minSessionsDayly

.


`minSessionsDayly`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-minsessionsdayly.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/minSessionsDayly")

#### minSessionsDayly Type

unknown

#### minSessionsDayly Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"allow"`     |             |
| `"avoid"`     |             |
| `"forbidden"` |             |

#### minSessionsDayly Default Value

The default value is:

```json
"allow"
```

### avoidMaxDuration

.


`avoidMaxDuration`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-avoidmaxduration.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/avoidMaxDuration")

#### avoidMaxDuration Type

`boolean`

### allowDiscontinuity

.


`allowDiscontinuity`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-definitions-weeklyvariable-properties-allowdiscontinuity.md "engineInputGHCSchema#/definitions/weeklyVariable/properties/allowDiscontinuity")

#### allowDiscontinuity Type

`boolean`