# WeeklyStable Schema

```txt
engineInputGHCSchema#/definitions/distribution/properties/variablePeriods/properties/weeklyStable
```

It contains only one possible weekly distribution. Each value is a assignation day.

> It indicates a stable distribution (number of days and number of sections per day of allocation), among all the periods over which it is distributed. It is not the distribution of each period, but the total of this class unit.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                        |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :---------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [ghc.schema.json*](../out/ghc.schema.json "open original schema") |

## weeklyStable Type

`integer[]` ([DailyMinutes](ghc-definitions-weeklystable-dailyminutes.md))
