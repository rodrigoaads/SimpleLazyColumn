package com.rodrigoaads.composelazycolumn.ui.atoms

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rodrigoaads.composelazycolumn.R
import com.rodrigoaads.composelazycolumn.ui.theme.Blue

@Composable
fun ShowStateIconAtom(
    showState: Boolean,
    onClick: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        modifier = modifier
            .size(20.dp),
        onClick = { onClick.invoke(!showState) }
    ) {
        Icon(
            painter = painterResource(
                id = if (showState) {
                    R.drawable.ic_arrow_up
                } else {
                    R.drawable.ic_arrow_down
                }
            ),
            contentDescription = null,
            tint = Blue
        )
    }
}

@Preview
@Composable
private fun ShowStateIconAtomPreview() {
    ShowStateIconAtom(
        showState = true,
        onClick = {}
    )
}