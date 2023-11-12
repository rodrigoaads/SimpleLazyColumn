package com.rodrigoaads.composelazycolumn.ui.pages

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rodrigoaads.composelazycolumn.ui.templates.ListTemplate

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListPage(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier
    ) { paddingValues ->
        ListTemplate(
            modifier = Modifier
                .padding(paddingValues)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ListPagePreview() {
    ListPage()
}