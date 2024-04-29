package shamsiddin.project.banking_financepage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import shamsiddin.project.banking_financepage.ui.theme.Typography

@Preview(showBackground = true)
@Composable
fun FInanceScreen(){
    val customFontFamily = FontFamily(Font(R.font.poppinsmedium))
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_back),
                contentDescription = null,
                modifier = Modifier
                    .size(28.dp) // Adjust the size as needed
                    .padding(2.dp)
            )
            Text(
                text = "Finance",

                modifier = Modifier
                    .weight(1f) // Take up remaining space in the Row
                    .padding(15.dp),
                fontFamily = customFontFamily,
                style = MaterialTheme.typography.headlineLarge,
                color = Color(0xFF00214E)
            )
        }
        Text(
            text = "Connected Account",
            modifier = Modifier
                .padding(vertical = 10.dp)
                .fillMaxWidth(),
            fontFamily = customFontFamily,
            style = MaterialTheme.typography.headlineLarge.copy(fontSize = 18.sp),
            color = Color(0xFF00214E)
        )

        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 240.dp, height = 80.dp)
                .background(Color.White),

            ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
               rasm()
                Text(
                    text = "UBL Digital",
                    modifier = Modifier
                        .padding(26.dp)
                        .align(Alignment.CenterVertically),
                    textAlign = TextAlign.Center,
                    fontFamily = customFontFamily,
                    style = MaterialTheme.typography.headlineLarge.copy(fontSize = 15.sp),
                    color = Color(0xFF00214E)
                )
                Spacer(modifier = Modifier.width(140.dp))
                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = "card",
                    modifier = Modifier
                        .size(50.dp) // Adjust the size of the image as needed
                        .padding(8.dp) // Add padding around the image
                )

            }
        }
        Text(
            text = "Set up a payment",
            modifier = Modifier
                .padding(vertical = 10.dp)
                .fillMaxWidth(),
            fontFamily = customFontFamily,
            style = MaterialTheme.typography.headlineLarge.copy(fontSize = 18.sp),
            color = Color(0xFF00214E)
        )

        OutlinedCard(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface,
            ),
            border = BorderStroke(1.dp,Color(0xFFB3EBD9)),
             modifier = Modifier
                 .fillMaxWidth()
                 .size(width = 240.dp, height = 80.dp)
                 .background(Color.White),

            ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.rectangle_1),
                    contentDescription = "card",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(5.dp)
                        .align(Alignment.CenterVertically),
                )
                Spacer(modifier = Modifier.width(17.dp))
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Regular payment",


                        textAlign = TextAlign.Center,
                        fontFamily = customFontFamily,
                        style = MaterialTheme.typography.headlineLarge.copy(fontSize = 15.sp),
                        color = Color(0xFF00214E)
                    )

                    Text(
                        text = "200$",

                        textAlign = TextAlign.Center,
                        fontFamily = customFontFamily,
                        style = MaterialTheme.typography.bodyMedium.copy(fontSize = 12.sp),
                        color = Color.Gray
                    )
                }
                    Spacer(modifier = Modifier.width(100.dp))
                    Image(
                        painter = painterResource(id = R.drawable.next),
                        contentDescription = "card",
                        modifier = Modifier
                            .size(50.dp) // Adjust the size of the image as needed
                            .padding(6.dp) // Add padding around the image
                    )

                }


                Spacer(modifier = Modifier.width(170.dp))
                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = "card",
                    modifier = Modifier
                        .size(50.dp) // Adjust the size of the image as needed
                        .padding(8.dp) // Add padding around the image
                )

            }

        Spacer(modifier = Modifier.height(17.dp))
        OutlinedCard(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface,
            ),
            border = BorderStroke(1.dp,Color(0xFFA181F9)),
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 240.dp, height = 80.dp)
                .background(Color.White),

            ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.ikki_rectangle),
                    contentDescription = "card",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(5.dp)
                        .align(Alignment.CenterVertically),
                )
                Spacer(modifier = Modifier.width(17.dp))
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Round-ups",


                        textAlign = TextAlign.Center,
                        fontFamily = customFontFamily,
                        style = MaterialTheme.typography.headlineLarge.copy(fontSize = 15.sp),
                        color = Color(0xFF00214E)
                    )

                    Text(
                        text = "200$",

                        textAlign = TextAlign.Center,
                        fontFamily = customFontFamily,
                        style = MaterialTheme.typography.bodyMedium.copy(fontSize = 12.sp),
                        color = Color.Gray
                    )
                }
                Spacer(modifier = Modifier.width(150.dp))
                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = "card",
                    modifier = Modifier
                        .size(50.dp) // Adjust the size of the image as needed
                        .padding(4.dp) // Add padding around the image
                )

            }


            Spacer(modifier = Modifier.width(170.dp))
            Image(
                painter = painterResource(id = R.drawable.next),
                contentDescription = "card",
                modifier = Modifier
                    .size(50.dp) // Adjust the size of the image as needed
                    .padding(8.dp) // Add padding around the image
            )

        }
        Spacer(modifier = Modifier.height(17.dp))
        OutlinedCard(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface,
            ),
            border = BorderStroke(1.dp,Color(0xFFF3B21F)),
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 240.dp, height = 80.dp)
                .background(Color.White),

            ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.rectangle_3),
                    contentDescription = "card",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(5.dp)
                        .align(Alignment.CenterVertically),
                )
                Spacer(modifier = Modifier.width(17.dp))
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Additional payments",


                        textAlign = TextAlign.Center,
                        fontFamily = customFontFamily,
                        style = MaterialTheme.typography.headlineLarge.copy(fontSize = 15.sp),
                        color = Color(0xFF00214E)
                    )

                    Text(
                        text = "200$",

                        textAlign = TextAlign.Center,
                        fontFamily = customFontFamily,
                        style = MaterialTheme.typography.bodyMedium.copy(fontSize = 12.sp),
                        color = Color.Gray
                    )
                }
                Spacer(modifier = Modifier.width(80.dp))
                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = "card",
                    modifier = Modifier
                        .size(50.dp) // Adjust the size of the image as needed
                        .padding(3.dp) // Add padding around the image
                )

            }


            Spacer(modifier = Modifier.width(170.dp))
            Image(
                painter = painterResource(id = R.drawable.next),
                contentDescription = "card",
                modifier = Modifier
                    .size(50.dp) // Adjust the size of the image as needed
                    .padding(8.dp) // Add padding around the image
            )

        }

    }

    }



@Preview
@Composable
fun rasm() {
    Box(modifier =Modifier.padding(5.dp)) {
        Image(
            painter = painterResource(id = R.drawable.rectangle),
            contentDescription = "card",
            modifier = Modifier
                .size(50.dp) // Adjust the size of the image as needed

        )
        Image(
            painter = painterResource(id = R.drawable.yozuv),
            contentDescription = "card",
            modifier = Modifier
                .size(50.dp) // Adjust the size of the image as needed

        )
    }
}
//fun ElevatedCardExample() {
//    ElevatedCard(
//        elevation = CardDefaults.cardElevation(
//            defaultElevation = 10.dp
//        ),
//        modifier = Modifier
//            .size(width = 240.dp, height = 100.dp)
//    ) {
//        Text(
//            text = "Elevated",
//            modifier = Modifier
//                .padding(16.dp),
//            textAlign = TextAlign.Center,
//        )
//    }
//}
//
//@Preview
//@Composable
//fun OneLine() {
//    ListItem(
//        headlineContent = { Text("One line list item with 24x24 icon") },
//        leadingContent = {
//            Icon(
//                Icons.Filled.Favorite,
//                contentDescription = "Localized description",
//            )
//        }
//    )
//}