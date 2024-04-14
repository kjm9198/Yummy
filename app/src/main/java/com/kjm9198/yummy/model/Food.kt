package com.kjm9198.yummy.model

import androidx.annotation.DrawableRes

data class Food(
    @DrawableRes
    val icon: Int,
    val name: String,
    val ingredients: List<String>,

)
