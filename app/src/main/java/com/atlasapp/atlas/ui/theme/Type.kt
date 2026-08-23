package com.atlasapp.atlas.ui.theme

import android.R.attr.fontFamily
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.R

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
val inclusivesansFontFamily = FontFamily(
    Font(com.atlasapp.atlas.R.font.inclusivesans_bold, FontWeight.Black),
    Font(com.atlasapp.atlas.R.font.inclusivesans_bolditalic, FontWeight.Black),
    Font(com.atlasapp.atlas.R.font.inclusivesans_italic, FontWeight.Black),
    Font(com.atlasapp.atlas.R.font.inclusivesans_light, FontWeight.Black),
    Font(com.atlasapp.atlas.R.font.inclusivesans_lightitalic, FontWeight.Black),
    Font(com.atlasapp.atlas.R.font.inclusivesans_medium, FontWeight.Black),
    Font(com.atlasapp.atlas.R.font.inclusivesans_mediumitalic, FontWeight.Black),
    Font(com.atlasapp.atlas.R.font.inclusivesans_regular, FontWeight.Black),
    Font(com.atlasapp.atlas.R.font.inclusivesans_semibold, FontWeight.Black),
    Font(com.atlasapp.atlas.R.font.inclusivesans_semibolditalic, FontWeight.Black)
)
