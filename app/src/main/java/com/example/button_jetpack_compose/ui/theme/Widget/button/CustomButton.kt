package com.example.button_jetpack_compose.ui.theme.Widget.button

import android.graphics.Color
import android.graphics.LinearGradient
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun CustomButton (
    modifier: Modifier,   // عشان بدي ادخل الطول و العرض للbuttom
    color: androidx.compose.ui.graphics.Color,
    cornerRadius: Dp,
    borderWidth: Dp = 0.dp,
    borderColor: androidx.compose.ui.graphics.Color = color,
    conteTextStyle: TextStyle,
    @StringRes textId: Int,   //buttom تبع text
    gradient: Brush? = null, // هذه عشان اذا في تدرج لوني او لاء
    onClick: ()-> Unit

    ){
    Button(
        modifier = modifier ,
        contentPadding = PaddingValues(vertical = 5.dp), // لل gradient
        colors = ButtonDefaults.buttonColors(containerColor = color,),
        shape = RoundedCornerShape(cornerRadius),
        border = BorderStroke(borderWidth,color = borderColor ),
        onClick = onClick
    ) {
      if (gradient == null){         // بدون  gradient
          Text(text = stringResource(id = textId ), style = conteTextStyle )
      }else {
         Box(       // لل gradient
             modifier = Modifier.fillMaxWidth().background(brush = gradient , shape = RoundedCornerShape(cornerRadius)).clip(RoundedCornerShape(cornerRadius)).then(modifier.padding(vertical = 5.dp)) ,
             contentAlignment = Alignment.Center

         ) {
             Text(text = stringResource(id = textId ), style = conteTextStyle)
         }
      }
    }
}


