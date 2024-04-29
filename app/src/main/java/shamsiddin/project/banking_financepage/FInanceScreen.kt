package shamsiddin.project.banking_financepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
    Column(modifier = Modifier.fillMaxSize()) {
Row (   modifier = Modifier
        .fillMaxWidth()
    .padding(16.dp),
    verticalAlignment = Alignment.CenterVertically) {
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
            .padding( 15.dp),
        fontFamily = customFontFamily,
        style = MaterialTheme.typography.headlineLarge
    )
}
        }
    }
