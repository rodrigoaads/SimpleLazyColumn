package com.rodrigoaads.composelazycolumn.ui.templates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rodrigoaads.composelazycolumn.ui.organisms.ItemOrganism

@Composable
fun ListTemplate(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        content = {
            items(List(10) { "$it" }) { position ->
                ItemOrganism(
                    position = position
                )
            }
        }
    )
}

@Preview()
@Composable
private fun ListTemplatePreview() {
    ListTemplate()
}