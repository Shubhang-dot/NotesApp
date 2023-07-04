package com.example.notesapp.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notesapp.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(){
    Scaffold(topBar = {
        TopAppBar(title = { Text(text = stringResource(id = R.string.app_name))},
            scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
            actions = {
                Icon(imageVector = Icons.Rounded.Notifications, contentDescription = "Icon")
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color(0xFFFFEB3B)))
        },
        content = {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(top = it.calculateTopPadding()),
            horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Hello World!", fontSize = 120.sp)
        }
    })
}

@Preview(showBackground = true)
@Composable
fun NoteScreenPreview(){
    NoteScreen()
}