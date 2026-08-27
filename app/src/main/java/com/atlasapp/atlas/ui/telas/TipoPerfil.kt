package com.atlasapp.atlas.ui.telas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.atlasapp.atlas.ui.theme.AzulAtlas
import com.atlasapp.atlas.ui.theme.BrancoAtlas
import com.atlasapp.atlas.ui.theme.FundoLayout
import com.atlasapp.atlas.ui.theme.inclusivesansFontFamily

@Composable
fun TipoPerfil(modifier: Modifier = Modifier, navController: NavController) {
    FundoLayout(telaAtual = 2) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
        {
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawRoundRect(
                    color = AzulAtlas,
                    topLeft = Offset(x = size.width * 0f, y = size.height * 0.5f),
                    cornerRadius = CornerRadius(155f, 155f),
                    size = Size(width = size.width, height = 3000f)
                )
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    "Quem é você?",
                    fontFamily = inclusivesansFontFamily,
                    fontSize = 45.sp,
                    color = BrancoAtlas,
                    modifier = Modifier.padding(top = 335.dp)
                )
                Spacer(modifier = Modifier.padding(top = 45.dp))


                Button(
                    onClick = { navController.navigate("CadastroDefVisual") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BrancoAtlas, contentColor = AzulAtlas
                    ),
                    modifier = Modifier
                        .size(width = 350.dp, height = 55.dp)
                )
                {
                    Text(
                        "Sou uma pessoa com deficiência visual",
                        fontFamily = inclusivesansFontFamily,
                        fontSize = 15.sp
                    )

                }

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = { navController.navigate("CadastroResponsavel") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BrancoAtlas, contentColor = AzulAtlas
                    ),
                    modifier = Modifier
                        .size(width = 350.dp, height = 55.dp)

                )
                {
                    Text(
                        "Sou um responsável de menor",
                        fontFamily = inclusivesansFontFamily,
                        fontSize = 20.sp
                    )
                }

            }


        }


    }

}
