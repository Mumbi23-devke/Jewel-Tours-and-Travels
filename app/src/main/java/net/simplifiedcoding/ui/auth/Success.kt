package com.example.application_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.simplifiedcoding.R

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)

@Composable

fun image(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ,
    )

    {




    }

//    Text(text = "I miss you!!")

    LazyColumn(){

        item{

            Column {

                Text(text = "We offer tours to national game parks.")

                Image(painter = painterResource(id = R.drawable.giraffe),
                    contentDescription = null,
                    modifier = Modifier
                        .size(500.dp)
                        .border(3.dp, Color.Black)
                )


                Text(text = "We have accommodation services.")

                Image(painter = painterResource(id = R.drawable.hotel),
                    contentDescription = null,
                    modifier = Modifier
                        .size(500.dp)
                        .border(3.dp, Color.Black)
                )

                Text(text = "We have picnics and make friends along the way")

                Image(painter = painterResource(id = R.drawable.picnic),
                    contentDescription = null,
                    modifier = Modifier
                        .size(500.dp)
                        .border(3.dp, Color.Black)
                )

                Text(text = "Enjoy spectacular sunsets out in the wild.")

                Image(painter = painterResource(id = R.drawable.sunset),
                    contentDescription = null,
                    modifier = Modifier
                        .size(500.dp)
                        .border(3.dp, Color.Black)
                )

                Text(text = "Hot air balloon rides are also part of the fun.")

                Image(painter = painterResource(id =   R.drawable.balloon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(500.dp)
                        .border(3.dp, Color.Black)
                )

                Text(text = "From the sandy beaches of Mombasa to jetski rides,we have it all. ")

                Image(painter = painterResource(id = R.drawable.beach),
                    contentDescription = null,
                    modifier = Modifier
                        .size(500.dp)
                        .border(3.dp, Color.Black)
                )

                Text(text = "Thank you for choosing Jewel Tours and Travels.")


                Text(text = "In case of any enquiries or changes send us an email.")

                val emaillaunch = LocalContext.current

                Button(
                    onClick = {
                        val emailintent = Intent(Intent.ACTION_SENDTO).apply {
                            data = Uri.parse("mailto:mumbiwaweru5@gmail.com")
                            putExtra(Intent.EXTRA_SUBJECT, "Subject")
                            putExtra(Intent.EXTRA_TEXT, "Body")

                        }
                        val chooserintent = Intent.createChooser(emailintent, "Send Email...")
                        emaillaunch.startActivity(chooserintent)

                    },
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .fillMaxWidth()

                )

                {
                    Text(text = "LAUNCH EMAIL")

                    Spacer(modifier = Modifier.height(20.dp))
                }


            }
        }

    }

}

private fun <ColumnScope> ColumnScope.Button(onClick: () -> Unit, shape: RoundedCornerShape, modifier: Modifier) {

}
