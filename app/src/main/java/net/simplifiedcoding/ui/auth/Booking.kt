package net.simplifiedcoding.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.NonDisposableHandle.parent
import net.simplifiedcoding.R
import net.simplifiedcoding.data.Resource
import net.simplifiedcoding.navigation.ROUTE_HOME
import net.simplifiedcoding.navigation.ROUTE_LOGIN
import net.simplifiedcoding.navigation.ROUTE_SIGNUP

class Booking : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            booking()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable

fun booking(){

    var destination by remember {
        mutableStateOf("")
    }


    var people by remember {
        mutableStateOf("")
    }

    var duration by remember {
        mutableStateOf("")
    }

    var nationality by remember {
        mutableStateOf("")
    }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()

    ){


        OutlinedTextField(value = destination,
            leadingIcon = { Icon(Icons.Default.Place, contentDescription = null) },
            onValueChange ={ destination = it},
            label = { Text(text = "Destination") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)

        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = people,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) },
            onValueChange ={ people = it},
            label = { Text(text = "Number of people") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)

        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = duration,
            onValueChange ={ duration = it},
            label = { Text(text = "Duration") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)

        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value =  nationality,
          leadingIcon = { Icon(Icons.Default.Place, contentDescription = null) },
            onValueChange ={ nationality = it},
            label = { Text(text = "Nationality") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)

        )

        Spacer(modifier = Modifier.height(20.dp))


        val enter = LocalContext.current
        Button(
            onClick = {

                enter.startActivity(Intent(enter, Resource.Success::class.java))
            },
            shape = RoundedCornerShape(15),
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Blue)

        ) {

            Text(text = "Book")
        }


    }

}
