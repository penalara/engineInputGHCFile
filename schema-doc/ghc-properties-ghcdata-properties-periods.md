# Periods Schema

```txt
engineInputGHCSchema#/properties/ghcData/properties/periods
```

Weeks or periods with different assignments which contains the timetable.


> If there is not periods defined the engine will created unique period with all days of the timetable.
>

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                         |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghc.schema.json\*](../out/ghc.schema.json "open original schema") |

## periods Type

`object` ([Periods](ghc-properties-ghcdata-properties-periods.md))

# Periods Properties

| Property                            | Type      | Required | Nullable       | Defined by                                                                                                                                                                               |
| :---------------------------------- | --------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [followedPeriods](#followedperiods) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods-properties-followedperiods.md "engineInputGHCSchema#/properties/ghcData/properties/periods/properties/followedPeriods") |
| [periodsList](#periodslist)         | `array`   | Required | cannot be null | [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods-properties-periodslist.md "engineInputGHCSchema#/properties/ghcData/properties/periods/properties/periodsList")         |

## followedPeriods

Indicates whether, the periods or weeks, considered consecutive days the last day of the previous one, with the first of the next.


`followedPeriods`

-   is optional
-   Type: `boolean` ([FollowedPeriods](ghc-properties-ghcdata-properties-periods-properties-followedperiods.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods-properties-followedperiods.md "engineInputGHCSchema#/properties/ghcData/properties/periods/properties/followedPeriods")

### followedPeriods Type

`boolean` ([FollowedPeriods](ghc-properties-ghcdata-properties-periods-properties-followedperiods.md))

## periodsList

List of periods.


`periodsList`

-   is required
-   Type: `object[]` ([Period](ghc-properties-ghcdata-properties-periods-properties-periodslist-period.md))
-   cannot be null
-   defined in: [EngineInputGHCSchema](ghc-properties-ghcdata-properties-periods-properties-periodslist.md "engineInputGHCSchema#/properties/ghcData/properties/periods/properties/periodsList")

### periodsList Type

`object[]` ([Period](ghc-properties-ghcdata-properties-periods-properties-periodslist-period.md))
