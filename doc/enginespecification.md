# EngineInputGHCSchema Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json
```

Schema of the object that contains the timetable planning data.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                             |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------- |
| Can be instantiated | Yes        | Unknown status | No           | Forbidden         | Allowed               | none                | [engineSpecification.schema.json](../../../out/engineSpecification.schema.json "open original schema") |

## EngineInputGHCSchema Type

`object` ([EngineInputGHCSchema](enginespecification.md))

# EngineInputGHCSchema Properties

| Property                                            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                  |
| :-------------------------------------------------- | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [periods](#periods)                                 | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-periods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods")                                 |
| [frames](#frames)                                   | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-frames.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames")                                   |
| [buildings](#buildings)                             | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-buildings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/buildings")                             |
| [classRooms](#classrooms)                           | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classrooms.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms")                           |
| [classRoomsSets](#classroomssets)                   | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-classroomssets.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRoomsSets")                   |
| [tasks](#tasks)                                     | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-tasks.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/tasks")                                     |
| [teachers](#teachers)                               | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-teachers.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers")                               |
| [subjects](#subjects)                               | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-subjects.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/subjects")                               |
| [groups](#groups)                                   | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-groups.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups")                                   |
| [sessions](#sessions)                               | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-sessions.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions")                               |
| [meetings](#meetings)                               | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-meetings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/meetings")                               |
| [complementaryActivities](#complementaryactivities) | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-complementaryactivities.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities") |
| [onCallServices](#oncallservices)                   | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-oncallservices.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices")                   |
| [optimizationWeights](#optimizationweights)         | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-optimizationweights.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights")         |
| [engineSettings](#enginesettings)                   | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-properties-enginesettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/engineSettings")                   |

## periods

Weeks or periods with different assignments which contains the timetable.

> If there are no defined periods, the engine will create a single period with all the days of the timetable.

`periods`

*   is optional

*   Type: `object` ([Periods](enginespecification-properties-periods.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-periods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/periods")

### periods Type

`object` ([Periods](enginespecification-properties-periods.md))

## frames

Tables of the timetable that contain sections where the class units are located.

`frames`

*   is optional

*   Type: `object[]` ([Frame](enginespecification-properties-frames-frame.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-frames.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/frames")

### frames Type

`object[]` ([Frame](enginespecification-properties-frames-frame.md))

## buildings

It contains the school or educational institution buildings.

`buildings`

*   is optional

*   Type: `object[]` ([Building](enginespecification-properties-buildings-building.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-buildings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/buildings")

### buildings Type

`object[]` ([Building](enginespecification-properties-buildings-building.md))

## classRooms

It contains the classrooms to organize the class units.

`classRooms`

*   is optional

*   Type: `object[]` ([Classroom](enginespecification-properties-classrooms-classroom.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classrooms.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRooms")

### classRooms Type

`object[]` ([Classroom](enginespecification-properties-classrooms-classroom.md))

## classRoomsSets

A division of the classrooms, grouped by organizational characteristics or needs.

`classRoomsSets`

*   is optional

*   Type: `object[]` ([ClassRoomSet](enginespecification-properties-classroomssets-classroomset.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-classroomssets.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/classRoomsSets")

### classRoomsSets Type

`object[]` ([ClassRoomSet](enginespecification-properties-classroomssets-classroomset.md))

## tasks

Types of tasks or activities for the teachers.

`tasks`

*   is optional

*   Type: `object[]` ([Task](enginespecification-properties-tasks-task.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-tasks.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/tasks")

### tasks Type

`object[]` ([Task](enginespecification-properties-tasks-task.md))

## teachers

Teachers list of the timetable.

`teachers`

*   is optional

*   Type: `object[]` ([Teacher](enginespecification-properties-teachers-teacher.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-teachers.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/teachers")

### teachers Type

`object[]` ([Teacher](enginespecification-properties-teachers-teacher.md))

## subjects

School subjects taught in the class units.

`subjects`

*   is optional

*   Type: `object[]` ([Subject](enginespecification-properties-subjects-subject.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-subjects.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/subjects")

### subjects Type

`object[]` ([Subject](enginespecification-properties-subjects-subject.md))

## groups

Sets of students.

`groups`

*   is optional

*   Type: `object[]` ([Group](enginespecification-properties-groups-group.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-groups.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/groups")

### groups Type

`object[]` ([Group](enginespecification-properties-groups-group.md))

## sessions

Definition of the teacher class units. These may be with groups of students, meetings with other teachers or complementary activities.

`sessions`

*   is optional

*   Type: `object[]` ([Session](enginespecification-properties-sessions-session.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-sessions.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/sessions")

### sessions Type

`object[]` ([Session](enginespecification-properties-sessions-session.md))

## meetings

List of meetings between teachers defined in the timetable.

`meetings`

*   is optional

*   Type: `object[]` ([Meeting](enginespecification-properties-meetings-meeting.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-meetings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/meetings")

### meetings Type

`object[]` ([Meeting](enginespecification-properties-meetings-meeting.md))

## complementaryActivities

List of complementary activities of the teachers.

`complementaryActivities`

*   is optional

*   Type: `object[]` ([Complementary](enginespecification-properties-complementaryactivities-complementary.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-complementaryactivities.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/complementaryActivities")

### complementaryActivities Type

`object[]` ([Complementary](enginespecification-properties-complementaryactivities-complementary.md))

## onCallServices

List of on-call services of teachers defined in the timetable.

`onCallServices`

*   is optional

*   Type: `object[]` ([OnCallService](enginespecification-properties-oncallservices-oncallservice.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-oncallservices.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/onCallServices")

### onCallServices Type

`object[]` ([OnCallService](enginespecification-properties-oncallservices-oncallservice.md))

## optimizationWeights

This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.

`optimizationWeights`

*   is optional

*   Type: `object` ([OptimizationWeights](enginespecification-properties-optimizationweights.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-optimizationweights.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/optimizationWeights")

### optimizationWeights Type

`object` ([OptimizationWeights](enginespecification-properties-optimizationweights.md))

## engineSettings

Customised engine configuration parameters.

`engineSettings`

*   is optional

*   Type: `object` ([EngineSettings](enginespecification-properties-enginesettings.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-properties-enginesettings.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/properties/engineSettings")

### engineSettings Type

`object` ([EngineSettings](enginespecification-properties-enginesettings.md))

# EngineInputGHCSchema Definitions

## Definitions group conditionType

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionType"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group restrictionType

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/restrictionType"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group conditionTypeWithTime

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime"}
```

| Property            | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                         |
| :------------------ | :------------ | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)       | Not specified | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime-properties-conditiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime/properties/type") |
| [minutes](#minutes) | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime/properties/minutes")    |

### type

Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

`type`

*   is required

*   Type: unknown ([ConditionType](enginespecification-definitions-conditiontypewithtime-properties-conditiontype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime-properties-conditiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime/properties/type")

#### type Type

unknown ([ConditionType](enginespecification-definitions-conditiontypewithtime-properties-conditiontype.md))

#### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### minutes

Custom time in minutes for condition.

`minutes`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/conditionTypeWithTime/properties/minutes")

#### minutes Type

`integer`

## Definitions group ocupationSetting

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/ocupationSetting"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group frameTemplate

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/frameTemplate"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group sessionFrameTemplate

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/sessionFrameTemplate"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group onCallServiceframeTemplate

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/onCallServiceframeTemplate"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group weeklyStay

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay"}
```

| Property                                | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                    |
| :-------------------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [strict](#strict)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/strict")                       |
| [preferable](#preferable)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/preferable")               |
| [countAroundMidday](#countaroundmidday) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-countaroundmidday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/countAroundMidday") |

### strict

Strict time in minutes of maximum weekly stay.

`strict`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/strict")

#### strict Type

`integer`

### preferable

Ponderable Time in minutes of maximum weeekly stay.

`preferable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/preferable")

#### preferable Type

`integer`

### countAroundMidday

It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

`countAroundMidday`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklystay-properties-countaroundmidday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStay/properties/countAroundMidday")

#### countAroundMidday Type

`boolean`

#### countAroundMidday Default Value

The default value is:

```json
true
```

## Definitions group dailyStay

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyStay"}
```

| Property                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                  |
| :---------------------------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict-1)                       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailystay-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyStay/properties/strict")                       |
| [preferable](#preferable-1)               | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailystay-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyStay/properties/preferable")               |
| [countAroundMidday](#countaroundmidday-1) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailystay-properties-countaroundmidday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyStay/properties/countAroundMidday") |

### strict

Strict time in minutes of maximum daily stay.

`strict`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailystay-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyStay/properties/strict")

#### strict Type

`integer`

### preferable

Ponderable Time in minutes of maximum daily stay.

`preferable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailystay-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyStay/properties/preferable")

#### preferable Type

`integer`

### countAroundMidday

It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

`countAroundMidday`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailystay-properties-countaroundmidday.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyStay/properties/countAroundMidday")

#### countAroundMidday Type

`boolean`

#### countAroundMidday Default Value

The default value is:

```json
true
```

## Definitions group avoidGapsBetweenSesions

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/avoidGapsBetweenSesions"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group maxContinuousTeaching

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching"}
```

| Property              | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                         |
| :-------------------- | :------------ | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type-1)       | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-conditiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/type") |
| [minutes](#minutes-1) | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/minutes")    |
| [minBreak](#minbreak) | `integer`     | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-minbreak.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/minBreak")  |

### type

Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

`type`

*   is optional

*   Type: unknown ([ConditionType](enginespecification-definitions-maxcontinuousteaching-properties-conditiontype.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-conditiontype.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/type")

#### type Type

unknown ([ConditionType](enginespecification-definitions-maxcontinuousteaching-properties-conditiontype.md))

#### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### minutes

Maximum continuous teaching time in minutes.

`minutes`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-minutes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/minutes")

#### minutes Type

`integer`

### minBreak

Minimum time period to be considered as break time

> If not specified, the engine will assign the general value or the default time of 30 minutes.

`minBreak`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-maxcontinuousteaching-properties-minbreak.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/maxContinuousTeaching/properties/minBreak")

#### minBreak Type

`integer`

## Definitions group avoidClassesAroundBreak

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/avoidClassesAroundBreak"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group freeTimes

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes"}
```

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                             |
| :---------------------------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [fullDay](#fullday)                       | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-fulldaysfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/fullDay")                      |
| [firstMinutes](#firstminutes)             | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-firstminutesfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/firstMinutes")             |
| [lastMinutes](#lastminutes)               | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes")               |
| [consecutiveAnyTime](#consecutiveanytime) | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime") |

### fullDay

Teacher's full days of free time.

`fullDay`

*   is optional

*   Type: `object` ([FullDaysFreeTimes](enginespecification-definitions-freetimes-properties-fulldaysfreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-fulldaysfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/fullDay")

#### fullDay Type

`object` ([FullDaysFreeTimes](enginespecification-definitions-freetimes-properties-fulldaysfreetimes.md))

### firstMinutes

Teacher's free intervals at the beginning of the day.

`firstMinutes`

*   is optional

*   Type: `object` ([FirstMinutesFreeTimes](enginespecification-definitions-freetimes-properties-firstminutesfreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-firstminutesfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/firstMinutes")

#### firstMinutes Type

`object` ([FirstMinutesFreeTimes](enginespecification-definitions-freetimes-properties-firstminutesfreetimes.md))

### lastMinutes

Teacher's free intervals at the end of the day.

`lastMinutes`

*   is optional

*   Type: `object` ([LastMinutesFreeTimes](enginespecification-definitions-freetimes-properties-lastminutesfreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-lastminutesfreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/lastMinutes")

#### lastMinutes Type

`object` ([LastMinutesFreeTimes](enginespecification-definitions-freetimes-properties-lastminutesfreetimes.md))

### consecutiveAnyTime

Teacher's free intervals at any time of the day.

`consecutiveAnyTime`

*   is optional

*   Type: `object` ([ConsecutiveAnyTimeFreeTimes](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freeTimes/properties/consecutiveAnyTime")

#### consecutiveAnyTime Type

`object` ([ConsecutiveAnyTimeFreeTimes](enginespecification-definitions-freetimes-properties-consecutiveanytimefreetimes.md))

## Definitions group freePartTimes

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes"}
```

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                            |
| :---------------------------- | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [mornings](#mornings)         | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-morningsfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/mornings")         |
| [afternoons](#afternoons)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-afternoonfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/afternoons")      |
| [indistinctly](#indistinctly) | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/indistinctly") |

### mornings

Mornings off.

`mornings`

*   is optional

*   Type: `object` ([MorningsFreePartTimes](enginespecification-definitions-freeparttime-properties-morningsfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-morningsfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/mornings")

#### mornings Type

`object` ([MorningsFreePartTimes](enginespecification-definitions-freeparttime-properties-morningsfreeparttimes.md))

### afternoons

Afternoons off.

`afternoons`

*   is optional

*   Type: `object` ([AfternoonFreePartTimes](enginespecification-definitions-freeparttime-properties-afternoonfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-afternoonfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/afternoons")

#### afternoons Type

`object` ([AfternoonFreePartTimes](enginespecification-definitions-freeparttime-properties-afternoonfreeparttimes.md))

### indistinctly

Free mornings or evenings indistinctly.

`indistinctly`

*   is optional

*   Type: `object` ([IndistinctlyFreePartTimes](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/freePartTimes/properties/indistinctly")

#### indistinctly Type

`object` ([IndistinctlyFreePartTimes](enginespecification-definitions-freeparttime-properties-indistinctlyfreeparttimes.md))

## Definitions group incompatibilities

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities"}
```

| Property                                                                                                                                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                   |
| :-------------------------------------------------------------------------------------------------------------------------------------- | :------------ | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [freeTimeBetweenDayBeforeAndCurrent](#freetimebetweendaybeforeandcurrent)                                                               | `object`      | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")                                                                                          |
| [freeTimeBetweenEndWeekAndStartWeekDays](#freetimebetweenendweekandstartweekdays)                                                       | `object`      | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")                                                                                      |
| [freeTimeFirstOrLastHoursDay](#freetimefirstorlasthoursday)                                                                             | `object`      | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay")                                                                                                 |
| [doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection](#donotfinishatlastafternoonsectionifstartedatfirstafternoonsection) | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")                  |
| [doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection](#donotfinishatlastmorningsectionifstartedatfirstmorningsection)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")                        |
| [doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection](#donotfinishatlastmorningsectionifstartatfirstafternoonsection)         | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection") |
| [doNotFinishAtLastMorningSectionIfHasAfternoonAssignment](#donotfinishatlastmorningsectionifhasafternoonassignment)                     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")                |
| [doNotStartAtFirstMorningSectionIfHasAfternoonAssignment](#donotstartatfirstmorningsectionifhasafternoonassignment)                     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")                              |
| [freeTimeAroundMidday](#freetimearoundmidday)                                                                                           | `object`      | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeAroundMidday")                                                                                                        |

### freeTimeBetweenDayBeforeAndCurrent

Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.

`freeTimeBetweenDayBeforeAndCurrent`

*   is optional

*   Type: `object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeBetweenDayBeforeAndCurrent")

#### freeTimeBetweenDayBeforeAndCurrent Type

`object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

### freeTimeBetweenEndWeekAndStartWeekDays

Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.

`freeTimeBetweenEndWeekAndStartWeekDays`

*   is optional

*   Type: `object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeBetweenEndWeekAndStartWeekDays")

#### freeTimeBetweenEndWeekAndStartWeekDays Type

`object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

### freeTimeFirstOrLastHoursDay

Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.

`freeTimeFirstOrLastHoursDay`

*   is optional

*   Type: `object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeFirstOrLastHoursDay")

#### freeTimeFirstOrLastHoursDay Type

`object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection

o not finish at the last hour of the evening and start at the first.

`doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`

*   is optional

*   Type: unknown ([DoNotFinishAtLastAfternoonSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")

#### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastAfternoonSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastafternoonsection.md))

#### doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection

Do not start at the first hour and finish at the last hour of the morning.

`doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`

*   is optional

*   Type: unknown ([DoNotFinishAtLastMorningSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")

#### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Type

unknown ([DoNotFinishAtLastMorningSection](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsection.md))

#### doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection

Do not finish at the last hour of the morning and start at the first hour of the evening.

`doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`

*   is optional

*   Type: unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection")

#### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Type

unknown ([DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifstartatfirstafternoon.md))

#### doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment

Do not finish at the last hour in the morning and have the evening busy.

`doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`

*   is optional

*   Type: unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")

#### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotFinishAtLastMorningSectionIfHasAfternoon](enginespecification-definitions-incompatibilities-properties-donotfinishatlastmorningsectionifhasafternoon.md))

#### doNotFinishAtLastMorningSectionIfHasAfternoonAssignment Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment

Do not start at the first hour and keep the evening busy.

`doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`

*   is optional

*   Type: unknown ([DoNotStartAtFirstMorningSection](enginespecification-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")

#### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Type

unknown ([DoNotStartAtFirstMorningSection](enginespecification-definitions-incompatibilities-properties-donotstartatfirstmorningsection.md))

#### doNotStartAtFirstMorningSectionIfHasAfternoonAssignment Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | :---------- |
| `"ignore"` |             |
| `"avoid"`  |             |
| `"strict"` |             |

### freeTimeAroundMidday

Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.

`freeTimeAroundMidday`

*   is optional

*   Type: `object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-conditiontypewithtime.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/incompatibilities/properties/freeTimeAroundMidday")

#### freeTimeAroundMidday Type

`object` ([ConditionTypeWithTime](enginespecification-definitions-conditiontypewithtime.md))

## Definitions group dailyOcupation

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation"}
```

| Property                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                          |
| :------------------------------------ | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [allowFreeDays](#allowfreedays)       | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-allowfreedays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/allowFreeDays")       |
| [minimumTeaching](#minimumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-minimumteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/minimumTeaching")   |
| [maximumTeaching](#maximumteaching)   | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumTeaching")   |
| [minimumOccupancy](#minimumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-minimumoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/minimumOccupancy") |
| [maximumOccupancy](#maximumoccupancy) | `object`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumOccupancy") |

### allowFreeDays

It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.

`allowFreeDays`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-allowfreedays.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/allowFreeDays")

#### allowFreeDays Type

`boolean`

### minimumTeaching

Minimum teaching time of the teacher with students.

`minimumTeaching`

*   is optional

*   Type: `object` ([MinimumTeaching](enginespecification-definitions-dailyocupation-properties-minimumteaching.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-minimumteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/minimumTeaching")

#### minimumTeaching Type

`object` ([MinimumTeaching](enginespecification-definitions-dailyocupation-properties-minimumteaching.md))

### maximumTeaching

Minimum teaching time of the teacher with students.

`maximumTeaching`

*   is optional

*   Type: `object` ([MaximumTeaching](enginespecification-definitions-dailyocupation-properties-maximumteaching.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumteaching.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumTeaching")

#### maximumTeaching Type

`object` ([MaximumTeaching](enginespecification-definitions-dailyocupation-properties-maximumteaching.md))

### minimumOccupancy

Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

`minimumOccupancy`

*   is optional

*   Type: `object` ([MinimumOccupancy](enginespecification-definitions-dailyocupation-properties-minimumoccupancy.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-minimumoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/minimumOccupancy")

#### minimumOccupancy Type

`object` ([MinimumOccupancy](enginespecification-definitions-dailyocupation-properties-minimumoccupancy.md))

### maximumOccupancy

Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

`maximumOccupancy`

*   is optional

*   Type: `object` ([MaximumOccupancy](enginespecification-definitions-dailyocupation-properties-maximumoccupancy.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailyocupation-properties-maximumoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyOcupation/properties/maximumOccupancy")

#### maximumOccupancy Type

`object` ([MaximumOccupancy](enginespecification-definitions-dailyocupation-properties-maximumoccupancy.md))

## Definitions group middayReference

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/middayReference"}
```

| Property              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                            |
| :-------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refFrame](#refframe) | `string`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-middayreference-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/middayReference/properties/refFrame") |
| [strict](#strict-2)   | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-middayreference-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/middayReference/properties/strict")     |

### refFrame

Identifier of a frame where the teacher takes noon pause. If not specified, the engine shall take the noon pause of the frame with the highest allocation.

`refFrame`

*   is optional

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-middayreference-properties-refframe.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/middayReference/properties/refFrame")

#### refFrame Type

`string`

### strict

It indicates whether the teacher's noon pause should be respected without placing his or her class units in sections of other frameworks that overlap with his or her noon pause.

`strict`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-middayreference-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/middayReference/properties/strict")

#### strict Type

`boolean`

#### strict Default Value

The default value is:

```json
true
```

## Definitions group dailyBuildingTransfers

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers"}
```

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                              |
| :-------------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strict](#strict-3)         | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers/properties/strict")         |
| [preferable](#preferable-2) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers/properties/preferable") |

### strict

Strict maximum number of movements per day.

`strict`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers-properties-strict.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers/properties/strict")

#### strict Type

`integer`

### preferable

Maximum number of movements per day that can be weighted/preferred.

`preferable`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-dailybuildingtransfers-properties-preferable.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/dailyBuildingTransfers/properties/preferable")

#### preferable Type

`integer`

## Definitions group refGroup

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refGroup"}
```

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                              |
| :-------------------------- | :-------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [refIdGroup](#refidgroup)   | `string`  | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-groupreferencetype-properties-refidgroup.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refGroup/properties/refIdGroup")   |
| [numStudents](#numstudents) | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-groupreferencetype-properties-numstudents.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refGroup/properties/numStudents") |

### refIdGroup

Group identifier.

`refIdGroup`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-groupreferencetype-properties-refidgroup.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refGroup/properties/refIdGroup")

#### refIdGroup Type

`string`

### numStudents

Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.

`numStudents`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-groupreferencetype-properties-numstudents.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refGroup/properties/numStudents")

#### numStudents Type

`integer`

## Definitions group weeklyStable

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyStable"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group weeklyVariable

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable"}
```

| Property                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                              |
| :---------------------------------------- | :-------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [minutesAmount](#minutesamount)           | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-minutesamount.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/minutesAmount")           |
| [maxMinutesDaily](#maxminutesdaily)       | `integer` | Required | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-maxminutesdaily.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/maxMinutesDaily")       |
| [minMinutesDaily](#minminutesdaily)       | `integer` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-minminutesdaily.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/minMinutesDaily")       |
| [avoidMaxDuration](#avoidmaxduration)     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-avoidmaxduration.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/avoidMaxDuration")     |
| [avoidMinDuration](#avoidminduration)     | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-avoidminduration.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/avoidMinDuration")     |
| [allowDiscontinuity](#allowdiscontinuity) | `boolean` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-allowdiscontinuity.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/allowDiscontinuity") |

### minutesAmount

Total of session's weekly minutes.

`minutesAmount`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-minutesamount.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/minutesAmount")

#### minutesAmount Type

`integer`

### maxMinutesDaily

Maximum of minutes per day.

`maxMinutesDaily`

*   is required

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-maxminutesdaily.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/maxMinutesDaily")

#### maxMinutesDaily Type

`integer`

### minMinutesDaily

Minimun of minutes per day.

`minMinutesDaily`

*   is optional

*   Type: `integer`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-minminutesdaily.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/minMinutesDaily")

#### minMinutesDaily Type

`integer`

### avoidMaxDuration

It indicates the preference for class units of maximum duration.

`avoidMaxDuration`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-avoidmaxduration.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/avoidMaxDuration")

#### avoidMaxDuration Type

`boolean`

### avoidMinDuration

It indicates the preference for class units of minimun duration.

`avoidMinDuration`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-avoidminduration.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/avoidMinDuration")

#### avoidMinDuration Type

`boolean`

### allowDiscontinuity

It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.

`allowDiscontinuity`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-weeklyvariable-properties-allowdiscontinuity.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/weeklyVariable/properties/allowDiscontinuity")

#### allowDiscontinuity Type

`boolean`

## Definitions group distribution

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution"}
```

| Property                            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                    |
| :---------------------------------- | :------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [periods](#periods-1)               | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-refperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/periods")              |
| [stablePeriods](#stableperiods)     | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-stableperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods")     |
| [variablePeriods](#variableperiods) | `object` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-variableperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods") |

### periods

List of periods or weeks in which the class unit must be assigned.

`periods`

*   is optional

*   Type: `string[]` ([RefPeriod](enginespecification-definitions-distribution-properties-refperiods-refperiod.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-refperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/periods")

#### periods Type

`string[]` ([RefPeriod](enginespecification-definitions-distribution-properties-refperiods-refperiod.md))

### stablePeriods

The distribution of the class unit of the session is the same in each period.

> Only one property must be specified.

`stablePeriods`

*   is optional

*   Type: `object` ([StablePeriods](enginespecification-definitions-distribution-properties-stableperiods.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-stableperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/stablePeriods")

#### stablePeriods Type

`object` ([StablePeriods](enginespecification-definitions-distribution-properties-stableperiods.md))

### variablePeriods

The total of the class units of the distribution are divided between the periods.

> Properties 'weeklyStable' and 'weeklyVariable' are mutually exclusive.

`variablePeriods`

*   is optional

*   Type: `object` ([VariablePeriods](enginespecification-definitions-distribution-properties-variableperiods.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-distribution-properties-variableperiods.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/distribution/properties/variablePeriods")

#### variablePeriods Type

`object` ([VariablePeriods](enginespecification-definitions-distribution-properties-variableperiods.md))

## Definitions group samePositionEveryPeriod

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/samePositionEveryPeriod"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | :--- | :------- | :------- | :--------- |

## Definitions group refClassRoomToAssign

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign"}
```

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                          |
| :---------------------------------------- | :------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [classRoom](#classroom)                   | `string` | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign-properties-classroomref.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign/properties/classRoom")                |
| [classRoomsSetsList](#classroomssetslist) | `array`  | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign-properties-classroomssetslist.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign/properties/classRoomsSetsList") |

### classRoom

Classroom identifier.

`classRoom`

*   is optional

*   Type: `string` ([ClassRoomRef](enginespecification-definitions-refclassroomtoassign-properties-classroomref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign-properties-classroomref.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign/properties/classRoom")

#### classRoom Type

`string` ([ClassRoomRef](enginespecification-definitions-refclassroomtoassign-properties-classroomref.md))

### classRoomsSetsList

Classroom set list where one classroom could be taken to assign to session.

`classRoomsSetsList`

*   is optional

*   Type: `string[]` ([ClassRoomSetRef](enginespecification-definitions-refclassroomtoassign-properties-classroomssetslist-classroomsetref.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-refclassroomtoassign-properties-classroomssetslist.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/refClassRoomToAssign/properties/classRoomsSetsList")

#### classRoomsSetsList Type

`string[]` ([ClassRoomSetRef](enginespecification-definitions-refclassroomtoassign-properties-classroomssetslist-classroomsetref.md))

## Definitions group nonClassSessionSettings

Reference this group by using

```json
{"$ref":"https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings"}
```

| Property                                                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                              |
| :------------------------------------------------------ | :------------ | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [computeForMaxMinOccupancy](#computeformaxminoccupancy) | `boolean`     | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings-properties-computeformaxminoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings/properties/computeForMaxMinOccupancy") |
| [samePositionEveryPeriod](#samepositioneveryperiod)     | Not specified | Optional | cannot be null | [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings-properties-samepositioneveryperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings/properties/samePositionEveryPeriod")     |

### computeForMaxMinOccupancy

It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.

`computeForMaxMinOccupancy`

*   is optional

*   Type: `boolean`

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings-properties-computeformaxminoccupancy.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings/properties/computeForMaxMinOccupancy")

#### computeForMaxMinOccupancy Type

`boolean`

### samePositionEveryPeriod

Keep the same position every week or period for the class units.

`samePositionEveryPeriod`

*   is optional

*   Type: unknown ([SamePositionEveryPeriod](enginespecification-definitions-nonclasssessionsettings-properties-samepositioneveryperiod.md))

*   cannot be null

*   defined in: [EngineInputGHCSchema](enginespecification-definitions-nonclasssessionsettings-properties-samepositioneveryperiod.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/engine/engineSpecification.schema.json#/definitions/nonClassSessionSettings/properties/samePositionEveryPeriod")

#### samePositionEveryPeriod Type

unknown ([SamePositionEveryPeriod](enginespecification-definitions-nonclasssessionsettings-properties-samepositioneveryperiod.md))

#### samePositionEveryPeriod Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | :---------- |
| `"ignore"`    |             |
| `"attempt"`   |             |
| `"avoid"`     |             |
| `"strict"`    |             |
| `"forbidden"` |             |

#### samePositionEveryPeriod Default Value

The default value is:

```json
"ignore"
```
