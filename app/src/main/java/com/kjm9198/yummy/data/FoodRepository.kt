package com.kjm9198.yummy.data

import com.kjm9198.yummy.model.Food

interface FoodRepository {
    fun getFoodList(): List<Food>
}