package com.rodrigoaads.composelazycolumn.ui.atoms

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.rodrigoaads.composelazycolumn.ui.theme.TextColor

@Composable
fun ItemTitleAtom(
    position: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = "Gandalf $position",
        fontSize = 18.sp,
        style = TextStyle.Default.copy(fontWeight = FontWeight.Bold),
        color = TextColor
    )
}

@Preview
@Composable
private fun ItemTitleAtomPreview() {
    ItemTitleAtom("1")
}