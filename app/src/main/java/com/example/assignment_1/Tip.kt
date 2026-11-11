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
        imageResId = android.R.drawable.ic_menu_compass
    ),
    Tip(
        day = 2,
        title = "SITREP: Situation Report",
        description = "Assess your surroundings frequently. Note exits, potential cover, and anomalies. A 30-second scan can save your life.",
        imageResId = android.R.drawable.ic_menu_info_details
    ),
    Tip(
        day = 3,
        title = "Pace Count",
        description = "Know your baseline step distance. In the field, tracking your pace is the simplest way to estimate distance traveled without electronics.",
        imageResId = android.R.drawable.ic_menu_myplaces
    ),
    Tip(
        day = 4,
        title = "Checkpoints & Rally Points",
        description = "Establish primary and secondary meeting points. If separated, regroup at the primary. Never wait in the open.",
        imageResId = android.R.drawable.ic_menu_mylocation
    ),
    Tip(
        day = 5,
        title = "MGRS Navigation",
        description = "Master the map. Rely on terrain association and a compass. Electronics fail; paper and magnetic north do not.",
        imageResId = android.R.drawable.ic_menu_mapmode
    ),
    Tip(
        day = 6,
        title = "Field Hygiene",
        description = "Keep your feet dry and clean. Change socks daily if possible. A foot injury compromises mobility and the mission.",
        imageResId = android.R.drawable.ic_menu_edit
    ),
    Tip(
        day = 7,
        title = "Comms Check",
        description = "Maintain regular radio checks. If you miss a check-in, assume coms are down and revert to visual signals.",
        imageResId = android.R.drawable.ic_menu_call
    )
)