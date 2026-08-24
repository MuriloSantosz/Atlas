package com.atlasapp.atlas.ui.telas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.atlasapp.atlas.SpeechToText
import com.atlasapp.atlas.ui.theme.AzulAtlas
import com.atlasapp.atlas.ui.theme.BrancoAtlas
import com.atlasapp.atlas.ui.theme.FundoLayout
import com.atlasapp.atlas.ui.theme.inclusivesansFontFamily

@Composable
fun CadastroDefVisual(
    modifier: Modifier = Modifier,
    navController: NavController,
    speechToText: SpeechToText
) {
    val speechState by speechToText.state.collectAsState()
    var textoFalado by remember { mutableStateOf("") }
    FundoLayout(telaAtual = 3) {
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        )
        {
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawRoundRect(
                    color = AzulAtlas,
                    topLeft = Offset(x = size.width * 0f, y = size.height * 0.45f),
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

                TextField(
                    value = textoFalado,
                    onValueChange = { novoTexto ->
                        textoFalado = novoTexto
                    },
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
                Button(
                    onClick = {
                        if (speechState.isSpeaking) {
                            speechToText.stopListening()
                        } else {
                            speechToText.startListening("pt-BR")
                        }

                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BrancoAtlas, contentColor = AzulAtlas
                    ),
                    modifier = Modifier.size(width = 350.dp, height = 55.dp)
                )
                {
                    Text("Falar", fontFamily = inclusivesansFontFamily, fontSize = 20.sp)
                }
            }
        }


    }

}
