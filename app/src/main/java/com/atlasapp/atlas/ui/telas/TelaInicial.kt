package com.atlasapp.atlas.ui.telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.atlasapp.atlas.ui.theme.AzulAtlas
import com.atlasapp.atlas.ui.theme.BrancoAtlas
import com.atlasapp.atlas.ui.theme.FundoLayout
import com.atlasapp.atlas.ui.theme.inclusivesansFontFamily

@Composable
fun TelaInicial(modifier: Modifier = Modifier, navController: NavController) {
    FundoLayout(telaAtual = 1) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

            Column(modifier = Modifier) {
                Spacer(modifier = Modifier.padding(top = 55.dp))
                OutlinedButton(
                    onClick = {navController.navigate("TipoPerfil")},
                    modifier = Modifier.width(280.dp).height(59.dp),
                    border = BorderStroke(3.dp, AzulAtlas),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = AzulAtlas
                    ),
                )
                {
                    Text("Cadastro", fontFamily = inclusivesansFontFamily, fontSize = 20.sp)

                }
                Spacer(modifier = Modifier.height(15.dp))
                Button(
                    onClick = {navController.navigate(route = "TipoPerfilLogin")},
                    modifier = Modifier.width(280.dp).height(59.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AzulAtlas, contentColor = BrancoAtlas
                    )
                ) {
                    Text("Login", fontFamily = inclusivesansFontFamily, fontSize = 20.sp)

                }
            }

        }


    }
}
