package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dado Rolado!", Toast.LENGTH_SHORT)
            toast.show()
            rollDice()

        }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceroll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = diceroll.toString()

    }
}

class Dice(val numSides: Int)
{
    fun roll() : Int {

        return(1..numSides).random()
    }
}
