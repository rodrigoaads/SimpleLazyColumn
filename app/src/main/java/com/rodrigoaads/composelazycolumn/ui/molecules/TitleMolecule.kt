package com.rodrigoaads.composelazycolumn.ui.molecules

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rodrigoaads.composelazycolumn.ui.atoms.ItemTitleAtom
import com.rodrigoaads.composelazycolumn.ui.atoms.ShowStateIconAtom

@Composable
fun TitleMolecule(
    position: String,
    showState: Boolean,
    onClickShowStateIcon: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        ItemTitleAtom(position)
        Spacer(
            modifier = Modifier
                .weight(1f)
        )
        ShowStateIconAtom(
            showState = showState,
            onClick = onClickShowStateIcon
        )
    }
}

@Preview
@Composable
private fun TitleMoleculePreview() {
    TitleMolecule(
        position = "1",
        showState = false,
        onClickShowStateIcon = {}
    )
}