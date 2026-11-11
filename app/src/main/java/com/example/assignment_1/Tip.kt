package com.example.assignment_1

data class Tip(
    val day: Int,
    val title: String,
    val description: String,
    val imageResId: Int
)

val fieldProtocolTips = listOf(
    Tip(
        day = 1,
        title = "OPSEC: Operational Security",
        description = "Never discuss sensitive details in unsecured channels. Keep your digital footprint minimal and your physical presence low-profile. The mission starts with silence.",
        imageResId = R.drawable.day1
    ),
    Tip(
        day = 2,
        title = "SITREP: Situation Report",
        description = "Assess your surroundings frequently. Note exits, potential cover, and anomalies. A 30-second scan can save your life.",
        imageResId = R.drawable.day2
    ),
    Tip(
        day = 3,
        title = "Pace Count",
        description = "Know your baseline step distance. In the field, tracking your pace is the simplest way to estimate distance traveled without electronics.",
        imageResId = R.drawable.day3
    ),
    Tip(
        day = 4,
        title = "Checkpoints & Rally Points",
        description = "Establish primary and secondary meeting points. If separated, regroup at the primary. Never wait in the open.",
        imageResId = R.drawable.day4
    ),
    Tip(
        day = 5,
        title = "MGRS Navigation",
        description = "Master the map. Rely on terrain association and a compass. Electronics fail; paper and magnetic north do not.",
        imageResId = R.drawable.day5
    ),
    Tip(
        day = 6,
        title = "Field Hygiene",
        description = "Keep your feet dry and clean. Change socks daily if possible. A foot injury compromises mobility and the mission.",
        imageResId = R.drawable.day6
    ),
    Tip(
        day = 7,
        title = "Comms Check",
        description = "Maintain regular radio checks. If you miss a check-in, assume coms are down and revert to visual signals.",
        imageResId = R.drawable.day7
    )
)