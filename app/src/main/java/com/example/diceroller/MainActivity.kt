package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button by its identifier and assign a click event handler
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice() // Call the rollDice() function when you click on the button

        }
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }


    // A class that represents a cube with the specified number of faces
    class Dice(private val numSides: Int) {
        // A function that rolls a dice and returns the result
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}