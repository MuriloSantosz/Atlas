package com.atlasapp.atlas.ui.telas

import android.R.attr.contentDescription
import android.service.autofill.OnClickAction
import android.system.Os.link
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.atlasapp.atlas.R
import com.atlasapp.atlas.R.drawable.atlasnome
import com.atlasapp.atlas.ui.theme.AzulAtlas
import com.atlasapp.atlas.ui.theme.BrancoAtlas
import com.atlasapp.atlas.ui.theme.FundoLayout
import com.atlasapp.atlas.ui.theme.inclusivesansFontFamily

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    FundoLayout() {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

            Column(modifier = Modifier) {
                Spacer(modifier = Modifier.padding(top = 55.dp))
                OutlinedButton(
                    onClick = {},
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
                    onClick = {},
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
