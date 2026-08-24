package com.atlasapp.atlas

import android.Manifest
import android.R.attr.canRecord
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.atlasapp.atlas.ui.telas.CadastroDefVisual
import com.atlasapp.atlas.ui.telas.CadastroResponsavel
import com.atlasapp.atlas.ui.telas.LoginDefVisual
import com.atlasapp.atlas.ui.telas.LoginResponsavel
import com.atlasapp.atlas.ui.telas.TelaInicial
import com.atlasapp.atlas.ui.telas.TipoPerfil
import com.atlasapp.atlas.ui.theme.AtlasTheme
import androidx.compose.runtime.setValue
import kotlin.contracts.contract

class MainActivity : ComponentActivity() {

    val speechToText by lazy {
        SpeechToText(application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var canRecord by remember {
                mutableStateOf(false)
            }

            val recordAudioLauncher =  rememberLauncherForActivityResult(
                contract = ActivityResultContracts.RequestPermission(),
                onResult = { isGranted ->
                    canRecord = isGranted
                }
                )
            LaunchedEffect(key1 = recordAudioLauncher) {
                recordAudioLauncher.launch(Manifest.permission.RECORD_AUDIO)
            }
            val state by speechToText.state.collectAsState()
            AtlasTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "cadastrodefvisual") {
                    composable(route = "telainicial") {
                        TelaInicial(navController = navController)
                    }

                    composable(route = "tipoperfil") {
                        TipoPerfil(navController = navController)
                    }

                    composable(route = "cadastroresponsavel") {
                        CadastroResponsavel(navController = navController)
                    }

                    composable(route = "loginresponsavel") {
                        LoginResponsavel(navController = navController)
                    }

                    composable(route = "cadastrodefvisual")
                    {
                        CadastroDefVisual(navController = navController,
                            speechToText = speechToText
                        )
                    }

                    composable(route = "logindefvisual")
                    {
                        LoginDefVisual(navController = navController)
                    }

                }
            }

        }
    }
}





