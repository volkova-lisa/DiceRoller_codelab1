package quizapp.volkova.diceroller_codelab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val randomNum: Int = (1..6).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val countUpButton: Button = findViewById(R.id.button2)
        val textView: TextView = findViewById(R.id.textView)

        rollButton.setOnClickListener { rollDiceToast(textView)}
        countUpButton.setOnClickListener{ countUp(textView) }
    }

    private fun rollDiceToast(textV : TextView) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        textV.text = randomNum.toString()
    }

    private fun countUp(textV : TextView){
        val value1 = textV.text.toString()
        val valueToNum = value1.toInt()
        val counted = valueToNum + 1
        textV.text = counted.toString()
    }

}