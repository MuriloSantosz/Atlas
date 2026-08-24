package com.atlasapp.atlas.ui.theme

import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.atlasapp.atlas.R.drawable.atlasnome
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.R

@Composable
fun FundoLayout(telaAtual: Int, content: @Composable () -> Unit)
{
    Box(modifier = Modifier.background(BrancoAtlas).fillMaxSize())
    {
        Row(modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(atlasnome),
                contentDescription = "Logo Nome",
                modifier = Modifier.size(220.dp).padding(bottom = 35.dp)
            )
        }
        Canvas(modifier = Modifier.fillMaxSize()){
            drawRoundRect(
                color = if (telaAtual == 1) AzulAtlas else CinzaAtlas,
                topLeft = Offset(x = size.width * 0.21f, y = size.height * 0.15f),
                cornerRadius = CornerRadius(25f,25f),
                size = Size(180f,33f)
            )
            drawRoundRect(
                color = if (telaAtual == 2)AzulAtlas else CinzaAtlas,
                topLeft = Offset(x = size.width * 0.42f, y = size.height * 0.15f),
                cornerRadius = CornerRadius(25f,25f),
                size = Size(180f,33f)
            )
            drawRoundRect(
                color = if (telaAtual == 3)AzulAtlas else CinzaAtlas,
                topLeft = Offset(x = size.width * 0.63f, y = size.height * 0.15f),
                cornerRadius = CornerRadius(25f,25f),
                size = Size(180f,33f)
            )

            drawCircle(
                color = AzulAtlas,
                radius = 97.dp.toPx(),
                center = Offset(x = size.width * 0.99f, y = size.height * 0.05f)
            )
            drawCircle(
                color = AzulAtlas,
                radius = 90.dp.toPx(),
                center = Offset(x = size.width * 0.01f, y = size.height * 0.27f)
            )
            drawCircle(
                color = AzulAtlas,
                radius = 83.dp.toPx(),
                center = Offset(x = size.width * 1.09f, y = size.height * 0.40f)
            )
            drawCircle(
                color = AzulAtlas,
                radius = 105.dp.toPx(),
                center = Offset(x = size.width * 0.05f, y = size.height * 0.96f)
            )

        }
        content()
    }
}