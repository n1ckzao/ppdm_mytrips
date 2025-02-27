package br.senai.sp.jandira.mytrips.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@SuppressLint("InvalidColorHexValue")
@Composable
fun Login() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFA2A2A2))
    ){
        Column (
            modifier = Modifier
                .padding(2.dp)
                .background(Color(0xFFFFFFFFF))
                .clip(
                    shape = RoundedCornerShape(10.dp)
                )
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.End,
        ) {
            Card(
                modifier = Modifier
                    .width(110.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(
                    topEnd = 20.dp,
                    bottomStart = 20.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Blue
                )
            ) {}
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .padding(12.dp)
            ) {
                Text(
                    text = stringResource(
                        R.string.login
                    ),
                    fontSize = 50.sp,
                    color = Color.Blue,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = stringResource(
                        R.string.please_sign
                    ),
                    color = Color.Gray,

                )
                OutlinedTextField(
                    value = "esseaq@email.com",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 70.dp
                        ),
                    shape = RoundedCornerShape(10.dp),
                    leadingIcon = {
                        Image(
                            painter = painterResource(
                                id = R.drawable.img_1
                            ),
                            contentDescription = "",
                            modifier = Modifier
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(
                                R.string.email
                            )
                        )
                    },
                )
//              leadingIcon
                OutlinedTextField(
                    value = "************",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 30.dp
                        ),
                    shape = RoundedCornerShape(10.dp),
                    leadingIcon = {
                        Image(
                            painter = painterResource(
                                id = R.drawable.img
                            ),
                            contentDescription = "",
                            modifier = Modifier
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(
                                R.string.password
                            )
                        )
                    }
                )
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(23.dp),
                    horizontalAlignment = Alignment.End
                ){
                    Button(
                        onClick = {},
                        modifier = Modifier,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF0000FF)
                        )
                        ) {
                        Text(
                            text = stringResource(
                                R.string.sign_in
                            )

                        )
                    }
                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
                    Text(
                        text = stringResource(
                            R.string.msg_sign_up
                        )
                    )
                    Text(
                        text = stringResource(
                            R.string.sign_up
                        ),
                        color = Color.Blue,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }

            Column (
                modifier = Modifier
                    .fillMaxWidth()
            ){
            Card(
                modifier = Modifier
                    .width(110.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(
                    topEnd = 20.dp,
                    bottomStart = 20.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Blue
                )
            ) {}
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    Login()
}