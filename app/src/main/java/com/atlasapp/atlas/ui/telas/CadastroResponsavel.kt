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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.atlasapp.atlas.ui.theme.AzulAtlas
import com.atlasapp.atlas.ui.theme.BrancoAtlas
import com.atlasapp.atlas.ui.theme.FundoLayout
import com.atlasapp.atlas.ui.theme.inclusivesansFontFamily
import org.w3c.dom.Text

@Composable
fun CadastroResponsavel(modifier: Modifier = Modifier, navController: NavController) {
    FundoLayout(telaAtual = 3)
    {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
        {
            Canvas(modifier = Modifier.fillMaxSize())
            {
                drawRoundRect(
                    color = AzulAtlas,
                    topLeft = Offset(x = size.width * 0f, y = size.height * 0.21f),
                    cornerRadius = CornerRadius(125f, 125f),
                    size = Size(width = size.width, height = 3000f)
                )
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )

            {
                Spacer(modifier = Modifier.padding(top = 90.dp))
                Text(
                    "Cadastro", fontFamily = inclusivesansFontFamily,
                    fontSize = 45.sp,
                    color = BrancoAtlas
                )
                Spacer(modifier = Modifier.height(15.dp))
                TextField(
                    state = rememberTextFieldState(),
                    label = {
                        Text(
                            "Digite seu nome aqui...",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                TextField(
                    state = rememberTextFieldState(),
                    label = {
                        Text(
                            "Digite seu email aqui...",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                TextField(
                    state = rememberTextFieldState(),
                    label = {
                        Text(
                            "Digite sua senha aqui...",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                TextField(
                    state = rememberTextFieldState(),
                    label = { Text("Confirmar senha...", fontFamily = inclusivesansFontFamily) },
                    shape = RoundedCornerShape(17.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                TextField(
                    state = rememberTextFieldState(),
                    label = {
                        Text(
                            "Digite seu CPF aqui...",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                TextField(
                    state = rememberTextFieldState(),
                    label = {
                        Text(
                            "Digite seu telefone aqui...",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Button(
                    onClick = { navController.navigate("loginresponsavel") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BrancoAtlas, contentColor = AzulAtlas
                    ),
                    modifier = Modifier.size(width = 350.dp, height = 55.dp)
                )
                {
                    Text("Cadastro", fontFamily = inclusivesansFontFamily, fontSize = 20.sp)
                }

            }
        }


    }
}