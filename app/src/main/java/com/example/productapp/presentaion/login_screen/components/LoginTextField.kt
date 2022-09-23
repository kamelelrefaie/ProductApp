package com.example.productapp.presentaion.login_screen.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginTextField(value : String ,onValueChanged: () ->Unit){
    OutlinedTextField(value = value, onValueChange ={onValueChanged()} )
}


