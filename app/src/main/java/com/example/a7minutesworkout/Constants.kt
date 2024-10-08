package com.example.a7minutesworkout

import java.lang.reflect.Array

object Constants {

    fun defaultExerciseList() : ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val abdominalCrunch = ExerciseModel(
            2,
            "Abdominal Crunch",
            R.drawable.ic_abdominal_crunch,
            false,
            false
        )
        exerciseList.add(abdominalCrunch)

        val highKneesRunning = ExerciseModel(
            3,
            "High Knees Running",
            R.drawable.ic_high_knees_running_in_place,
            false,
            false
        )
        exerciseList.add(highKneesRunning)

        val lunge = ExerciseModel(
            4,
            "lunge",
            R.drawable.ic_lunge,
            false,
            false
        )
        exerciseList.add(lunge)

        val plank = ExerciseModel(
                5,
        "plank",
        R.drawable.ic_plank,
        false,
        false
        )
        exerciseList.add(plank)

        val pushUp = ExerciseModel(
                6,
        "pushUp",
        R.drawable.ic_push_up,
        false,
        false
        )
        exerciseList.add(pushUp)

        val pushUpAndRotation = ExerciseModel(
                7,
        "pushUpAndRotation",
        R.drawable.ic_push_up_and_rotation,
        false,
        false
        )
        exerciseList.add(pushUpAndRotation)

        val sidePlank = ExerciseModel(
                8,
        "sidePlank",
        R.drawable.ic_side_plank,
        false,
        false
        )
        exerciseList.add(sidePlank)

        val squat = ExerciseModel(
                9,
        "squat",
        R.drawable.ic_squat,
        false,
        false
        )
        exerciseList.add(squat)

        val stepUpOntoChair = ExerciseModel(
                10,
        "stepUpOnto",
        R.drawable.ic_step_up_onto_chair,
        false,
        false
        )
        exerciseList.add(stepUpOntoChair)

        val tricepsDipChair = ExerciseModel(
                11,
        "tricepsDipChair",
        R.drawable.ic_triceps_dip_on_chair,
        false,
        false
        )
        exerciseList.add(tricepsDipChair)

        val wallSit = ExerciseModel(
            12,
            "wallSit",
            R.drawable.ic_wall_sit,
            false,
            false
        )
        exerciseList.add(wallSit)

        return exerciseList
    }

}