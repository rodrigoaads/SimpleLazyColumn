package com.rodrigoaads.composelazycolumn.ui.atoms

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.rodrigoaads.composelazycolumn.ui.theme.TextColor

@Composable
fun ItemDescriptionTextAtom(
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier
            .fillMaxWidth(),
        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
        fontSize = 12.sp,
        color = TextColor,
        overflow = TextOverflow.Ellipsis
    )
}

@Preview
@Composable
private fun DescriptionTextAtomPreview() {
    ItemDescriptionTextAtom()
}