package com.example.databinding

import androidx.annotation.DrawableRes

data class Person(
    val name: String,
    val age : Int,
    @DrawableRes val image : Int
)
