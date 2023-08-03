package com.example.button_jetpack_compose.ui.theme.Widget.button

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.button_jetpack_compose.ui.theme.ColorPlatinum
import com.example.button_jetpack_compose.ui.theme.ColorPurple100
import com.example.button_jetpack_compose.ui.theme.ColorPurple200
import com.example.button_jetpack_compose.ui.theme.ColorPurple500
import com.example.button_jetpack_compose.ui.theme.Purple80
import com.example.button_jetpack_compose.ui.theme.cairoAmericanPurpleSemiBold24
import com.example.button_jetpack_compose.ui.theme.cairoColorPlatinumSemiBold24


@Composable
fun FirstButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,

    ) {
    CustomButton(
        modifier = Modifier.fillMaxWidth(0.8f),
        color = ColorPurple100,
        cornerRadius = 0.dp,
        conteTextStyle = cairoAmericanPurpleSemiBold24,
        textId = textId,
        onClick = onClick
    )
}

@Composable
fun SecondButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {
    CustomButton(
        modifier = modifier,
        color = ColorPurple200,
        cornerRadius = 10.dp,
        conteTextStyle = cairoAmericanPurpleSemiBold24,
        textId = textId,
        onClick = onClick
    )

}

@Composable
fun ThirdButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {
    CustomButton(
        modifier = modifier,
        color = Purple80,
        cornerRadius = 50.dp,
        conteTextStyle = cairoAmericanPurpleSemiBold24,
        textId = textId,
        onClick = onClick
    )

}


@Composable
fun FourthButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {

    CustomButton(
        onClick = onClick,
        modifier = modifier,
        borderWidth = 2.dp,
        borderColor = ColorPlatinum,
        color = Color.Transparent,
        cornerRadius = 50.dp,
        textId = textId,
        conteTextStyle = cairoColorPlatinumSemiBold24
    )

}


@Composable
fun FifthButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {

    val gradient = Brush.horizontalGradient( //عمل ال gradientهين
        listOf(
            ColorPurple100,
            ColorPurple500
        )
    )

    CustomButton(
        onClick = onClick,
        modifier = modifier,
        gradient = gradient,
        color = Color.Transparent,
        cornerRadius = 50.dp,
        textId = textId,
        conteTextStyle = cairoColorPlatinumSemiBold24
    )

}
