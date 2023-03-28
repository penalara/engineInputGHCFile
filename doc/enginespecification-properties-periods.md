# Periods Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods
```

Weeks or periods with different assignments which contains the timetable.

> If there are no defined periods, the engine will create a single period with all the days of the timetable.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## periods Type

`object` ([Periods](enginespecification-properties-periods.md))

# periods Properties

| Property                            | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                        |
| :---------------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [followedPeriods](#followedperiods) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-periods-properties-followedperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods/properties/followedPeriods") |
| [periodsList](#periodslist)         | `array`   | Required | cannot be null | [EngineInputGHCSchema](enginespecification-properties-periods-properties-periodslist.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods/properties/periodsList")         |

## followedPeriods

It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.

`followedPeriods`

*   is optional

*   Type: `boolean` ([FollowedPeriods](enginespecification-properties-periods-properties-followedperiods.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-periods-properties-followedperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods/properties/followedPeriods")

### followedPeriods Type

`boolean` ([FollowedPeriods](enginespecification-properties-periods-properties-followedperiods.md))

## periodsList

List of periods.

`periodsList`

*   is required

*   Type: `object[]` ([Period](enginespecification-properties-periods-properties-periodslist-period.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-periods-properties-periodslist.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods/properties/periodsList")

### periodsList Type

`object[]` ([Period](enginespecification-properties-periods-properties-periodslist-period.md))
