package com.rodrigoaads.composelazycolumn.ui.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rodrigoaads.composelazycolumn.R

@Composable
fun ItemImageAtom(
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .size(50.dp)
            .clip(CircleShape),
        painter = painterResource(id = R.drawable.gandalf),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Preview
@Composable
private fun ImageAtomPreview() {
    ItemImageAtom()
}