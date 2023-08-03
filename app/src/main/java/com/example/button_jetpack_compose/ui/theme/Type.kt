package com.example.button_jetpack_compose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.button_jetpack_compose.R

val CairoFont = FontFamily(
    Font(R.font.cairo_regular),
    Font(R.font.cairo_semi_bold, weight = FontWeight.SemiBold),
)



val cairoAmericanPurpleSemiBold24 = TextStyle(

    fontFamily = CairoFont,
    color = ColorAmericanPurple,
    fontWeight = FontWeight.SemiBold,
    fontSize = 24.sp
)


val cairoColorPlatinumSemiBold24 = TextStyle(

    fontFamily = CairoFont,
    color = ColorPlatinum,
    fontWeight = FontWeight.SemiBold,
    fontSize = 24.sp
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)