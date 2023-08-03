package com.example.button_jetpack_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.button_jetpack_compose.ui.theme.ColorGunmetal
import com.example.button_jetpack_compose.ui.theme.Widget.button.FifthButton
import com.example.button_jetpack_compose.ui.theme.Widget.button.FirstButton
import com.example.button_jetpack_compose.ui.theme.Widget.button.FourthButton
import com.example.button_jetpack_compose.ui.theme.Widget.button.SecondButton
import com.example.button_jetpack_compose.ui.theme.Widget.button.ThirdButton
import java.nio.file.WatchEvent

@Composable
fun TestButton(){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = ColorGunmetal)
    ) {
        FirstButton(modifier = Modifier.fillMaxWidth(0.8f), textId = R.string.login , onClick = {})
        Spacer(modifier = Modifier.height(25.dp))
        SecondButton(modifier = Modifier.fillMaxWidth(0.8f) , textId = R.string.login , onClick = { /*TODO*/ } )
        Spacer(modifier = Modifier.height(25.dp))
        ThirdButton(modifier = Modifier.fillMaxWidth(0.8f), textId = R.string.login , onClick = {})
        Spacer(modifier = Modifier.height(25.dp))
        FourthButton(modifier = Modifier.fillMaxWidth(0.8f) , textId = R.string.login , onClick = {})
        Spacer(modifier = Modifier.height(25.dp))
        FifthButton(modifier = Modifier.fillMaxWidth(0.8f) , textId = R.string.login , onClick = {})
            



    }
}
@Composable
@Preview
fun TestButtonPreview(){
    TestButton()
}