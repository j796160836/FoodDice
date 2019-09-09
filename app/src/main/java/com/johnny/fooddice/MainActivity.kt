package com.johnny.fooddice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val foodNames = arrayOf("台中太陽餅", "龐德羅莎", "魯肉飯", "鮮芋仙", "東海雞腳", "必勝客", "炸雞")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_roll.setOnClickListener {
            label_name.text = getRandomFoodName()
        }
    }

    private fun getRandomFoodName(): String {
        val num = Random.nextInt(0, foodNames.size - 1)
        return foodNames[num]
    }
}
