package com.atlasapp.atlas.ui.telas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.atlasapp.atlas.R.drawable.call_end
import com.atlasapp.atlas.R.drawable.id_card
import com.atlasapp.atlas.R.drawable.mail
import com.atlasapp.atlas.R.drawable.mic
import com.atlasapp.atlas.R.drawable.visibility_off
import com.atlasapp.atlas.SpeechView
import com.atlasapp.atlas.ui.theme.AzulAtlas
import com.atlasapp.atlas.ui.theme.BrancoAtlas
import com.atlasapp.atlas.ui.theme.CinzaAtlas
import com.atlasapp.atlas.ui.theme.FundoLayout
import com.atlasapp.atlas.ui.theme.inclusivesansFontFamily

@Composable
fun CadastroDefVisual(
    modifier: Modifier = Modifier,
    navController: NavController,
    speechView: SpeechView
) {

    val keyboardController = LocalSoftwareKeyboardController.current
    val focusRequester = remember { FocusRequester() }
    val state by speechView.state.collectAsState()
    var campoAtivo by remember { mutableStateOf<String?>(null) }
    var nome by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var confirmarsenha by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var nomeInput by remember { mutableStateOf(false) }
    var emailInput by remember { mutableStateOf(false) }
    var senhaInput by remember { mutableStateOf(false) }
    var confirmarsenhaInput by remember { mutableStateOf(false) }
    var cpfInput by remember { mutableStateOf(false) }
    var telefoneInput by remember { mutableStateOf(false) }

    LaunchedEffect(state.spokenText) {
        if (state.spokenText.isNotEmpty()) {
            when (campoAtivo) {
                "nome" -> nome = state.spokenText
                "email" -> email = state.spokenText
                "senha" -> senha = state.spokenText
                "confirmarsenha" -> confirmarsenha = state.spokenText
                "cpf" -> cpf = state.spokenText
                "telefone" -> telefone = state.spokenText
            }
        }
    }

    FundoLayout(telaAtual = 3) {
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        )
        {
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawRoundRect(
                    color = AzulAtlas,
                    topLeft = Offset(x = size.width * 0f, y = size.height * 0.19f),
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
                Spacer(modifier = Modifier.height(105.dp))
                Text(
                    "Cadastro",
                    fontFamily = inclusivesansFontFamily,
                    fontSize = 45.sp,
                    color = BrancoAtlas
                )
                Spacer(modifier = Modifier.height(15.dp))
                TextField(
                    value = nome,
                    onValueChange = { nome = it },
                    readOnly = !nomeInput,
                    label = {
                        Text(
                            "Nome",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    modifier = Modifier
                        .onFocusChanged { focusState ->
                            if (focusState.isFocused) {
                                campoAtivo = "nome"
                            } else {
                                nomeInput = false
                            }
                        }
                        .pointerInput(Unit) {
                            awaitPointerEventScope {
                                while (true) {
                                    val event = awaitPointerEvent()
                                    if (event.type == PointerEventType.Press && campoAtivo == "nome") {
                                        nomeInput = true
                                    }
                                }
                            }
                        },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(mail),
                            contentDescription = "icone email",
                            modifier = Modifier.size(20.dp)
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    readOnly = !emailInput,
                    label = {
                        Text(
                            "Email",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    modifier = Modifier
                        .onFocusChanged { focusState ->
                            if (focusState.isFocused) {
                                campoAtivo = "email"
                            } else {
                                emailInput = false
                            }
                        }
                        .pointerInput(Unit) {
                            awaitPointerEventScope {
                                while (true) {
                                    val event = awaitPointerEvent()
                                    if (event.type == PointerEventType.Press && campoAtivo == "email") {
                                        emailInput = true
                                    }
                                }
                            }
                        },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(mail),
                            contentDescription = "icone email",
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = senha,
                    onValueChange = { senha = it },
                    readOnly = !senhaInput,
                    label = {
                        Text(
                            "Senha",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    modifier = Modifier
                        .onFocusChanged { focusState ->
                            if (focusState.isFocused) {
                                campoAtivo = "senha"
                            } else {
                                senhaInput = false
                            }
                        }
                        .pointerInput(Unit) {
                            awaitPointerEventScope {
                                while (true) {
                                    val event = awaitPointerEvent()
                                    if (event.type == PointerEventType.Press && campoAtivo == "senha") {
                                        senhaInput = true
                                    }
                                }
                            }
                        },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(visibility_off),
                            contentDescription = "visualisação senha",
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = confirmarsenha,
                    onValueChange = { confirmarsenha = it },
                    readOnly = !confirmarsenhaInput,
                    label = {
                        Text(
                            "Confirmar senha",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    modifier = Modifier
                        .onFocusChanged { focusState ->
                            if (focusState.isFocused) {
                                campoAtivo = "confirmarsenha"
                            } else {
                                confirmarsenhaInput = false
                            }
                        }
                        .pointerInput(Unit) {
                            awaitPointerEventScope {
                                while (true) {
                                    val event = awaitPointerEvent()
                                    if (event.type == PointerEventType.Press && campoAtivo == "confirmarsenha") {
                                        confirmarsenhaInput = true
                                    }

                                }
                            }
                        },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(visibility_off),
                            contentDescription = "visualização",
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = cpf,
                    onValueChange = { cpf = it },
                    readOnly = !cpfInput,
                    label = {
                        Text(
                            "CPF",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    modifier = Modifier
                        .onFocusChanged { focusState ->
                            if (focusState.isFocused) {
                                campoAtivo = "cpf"
                            } else {
                                cpfInput = false
                            }
                        }
                        .pointerInput(Unit) {
                            awaitPointerEventScope {
                                while (true) {
                                    val event = awaitPointerEvent()
                                    if (event.type == PointerEventType.Press && campoAtivo == "cpf") {
                                        cpfInput = true
                                    }

                                }
                            }
                        },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id_card),
                            contentDescription = "card id",
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = telefone,
                    onValueChange = { telefone = it },
                    readOnly = !telefoneInput,
                    label = {
                        Text(
                            "Telefone",
                            fontFamily = inclusivesansFontFamily
                        )
                    },
                    shape = RoundedCornerShape(17.dp),
                    modifier = Modifier
                        .onFocusChanged { focusState ->
                            if (focusState.isFocused) {
                                campoAtivo = "telefone"
                            } else {
                                telefoneInput = false
                            }
                        }
                        .pointerInput(Unit) {
                            awaitPointerEventScope {
                                while (true) {
                                    val event = awaitPointerEvent()
                                    if (event.type == PointerEventType.Press && campoAtivo == "telefone") {
                                        telefoneInput = true
                                    }

                                }
                            }
                        },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(call_end),
                            contentDescription = "telefone",
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = BrancoAtlas,
                        unfocusedContainerColor = BrancoAtlas,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        focusedLabelColor = AzulAtlas,
                        unfocusedLabelColor = AzulAtlas
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Button(
                    onClick = {
                        if (state.isSpeaking) {
                            speechView.stopListening()
                        } else {
                            speechView.startListening("pt-BR")
                        }

                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = CinzaAtlas
                    ),
                    modifier = Modifier.size(width = 85.dp, height = 85.dp)
                )
                {
                    Image(
                        painter = painterResource(mic),
                        contentDescription = "icone microfone",
                        modifier = Modifier.size(30.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(top = 15.dp))
                Button(
                    onClick = { navController.navigate("LoginDefVisual") },
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
