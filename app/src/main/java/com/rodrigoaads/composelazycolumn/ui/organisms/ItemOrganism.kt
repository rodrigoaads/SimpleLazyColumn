package com.rodrigoaads.composelazycolumn.ui.organisms

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rodrigoaads.composelazycolumn.ui.atoms.ItemDescriptionTextAtom
import com.rodrigoaads.composelazycolumn.ui.atoms.ItemImageAtom
import com.rodrigoaads.composelazycolumn.ui.molecules.TitleMolecule
import com.rodrigoaads.composelazycolumn.ui.theme.BackgroundColor

@Composable
fun ItemOrganism(
    position: String,
    modifier: Modifier = Modifier
) {

    var isExpanded by remember {
        mutableStateOf(false)
    }

    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = BackgroundColor
        )
    ) {
        Row(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 500 ,
                        easing = LinearOutSlowInEasing
                    )
                )
                .fillMaxWidth()
                .padding(8.dp)
                .then(
                    if (isExpanded) Modifier.wrapContentHeight()
                    else Modifier.height(50.dp)
                )
        ) {
            ItemImageAtom()
            Spacer(
                modifier = Modifier
                    .padding(start = 8.dp)
            )
            Column {
                TitleMolecule(
                    showState = isExpanded,
                    onClickShowStateIcon = { state ->
                        isExpanded = state
                    },
                    position = position
                )
                Spacer(
                    modifier = Modifier
                        .height(2.dp)
                )
                ItemDescriptionTextAtom()
            }
        }
    }
}

@Preview
@Composable
private fun ItemOrganismPreview() {
    ItemOrganism(position = "1")
}