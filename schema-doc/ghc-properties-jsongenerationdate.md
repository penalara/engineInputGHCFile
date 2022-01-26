# JsonGenerationDate Schema

```txt
engineInputGHCSchema#/properties/lastModifiedDate
```

Json last modification date.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## lastModifiedDate Type

`string` ([JsonGenerationDate](ghc-properties-jsongenerationdate.md))

## lastModifiedDate Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")
