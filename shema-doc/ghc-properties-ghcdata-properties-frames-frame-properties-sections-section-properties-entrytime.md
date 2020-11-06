# Untitled string in JsonGHCFile Schema

```txt
GeneralJsonGHCSchema#/properties/ghcData/properties/frames/items/properties/sections/items/properties/entryTime
```

Start time of the section.


| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## entryTime Type

`string`

## entryTime Constraints

**time**: the string must be a time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")
