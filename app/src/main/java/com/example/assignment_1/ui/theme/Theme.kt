package com.example.assignment_1.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.assignment_1.R

val Charcoal = Color(0xFF2B2B2B)
val Gunmetal = Color(0xFF4A4A4A)
val MutedOlive = Color(0xFF8B9A7D)
val OffWhite = Color(0xFFE0E0E0)
val DeepBlack = Color(0xFF1A1A1A)

private val FieldDarkColorScheme = darkColorScheme(
    primary = MutedOlive,
    onPrimary = DeepBlack,
    secondary = Gunmetal,
    onSecondary = OffWhite,
    background = Charcoal,
    onBackground = OffWhite,
    surface = DeepBlack,
    onSurface = OffWhite
)

val Poppins = FontFamily(
    Font(R.font.Poppins_Regular, FontWeight.Normal),
    Font(R.font.Poppins_Medium, FontWeight.Medium),
    Font(R.font.Poppins_Bold, FontWeight.Bold)
)

private val FieldTypography = Typography(
    headlineMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        letterSpacing = 1.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 22.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        letterSpacing = 1.5.sp
    )
)

@Composable
fun Assignment_1Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = FieldDarkColorScheme,
        typography = FieldTypography,
        content = content
    )
}