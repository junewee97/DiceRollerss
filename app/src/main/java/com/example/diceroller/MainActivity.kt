package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }
    }

    private fun rollDice() {
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage1: ImageView = findViewById(R.id.dice_image1)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)

        for (i in 1..3) {
            val randomInt = Random().nextInt(6) + 1

            val drawableResource = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            when(i){
                1 -> diceImage.setImageResource(drawableResource)
                2 -> diceImage1.setImageResource(drawableResource)
                3 -> diceImage2.setImageResource(drawableResource)
            }
        }
    }


}


