# EngineSettings Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/engineSettings
```

Customised engine configuration parameters.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                               |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [engineSpecification.schema.json\*](../../../out/engineSpecification.schema.json "open original schema") |

## engineSettings Type

`object` ([EngineSettings](enginespecification-properties-enginesettings.md))

# engineSettings Properties

| Property                                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                  |
| :---------------------------------------------- | :-------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [teacherBalance](#teacherbalance)               | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-enginesettings-properties-teacherbalance.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/engineSettings/properties/teacherBalance")               |
| [countGapsAroundMidday](#countgapsaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-enginesettings-properties-countgapsaroundmidday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/engineSettings/properties/countGapsAroundMidday") |

## teacherBalance

It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.

`teacherBalance`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-enginesettings-properties-teacherbalance.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/engineSettings/properties/teacherBalance")

### teacherBalance Type

`boolean`

### teacherBalance Default Value

The default value is:

```json
true
```

## countGapsAroundMidday

It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable.

`countGapsAroundMidday`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-enginesettings-properties-countgapsaroundmidday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/engineSettings/properties/countGapsAroundMidday")

### countGapsAroundMidday Type

`boolean`

### countGapsAroundMidday Default Value

The default value is:

```json
true
```
