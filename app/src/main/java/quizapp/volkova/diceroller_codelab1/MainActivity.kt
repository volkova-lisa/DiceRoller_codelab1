package quizapp.volkova.diceroller_codelab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val rollButton: Button = findViewById(R.id.button)
    private val textView: TextView = findViewById(R.id.textView)
    private val randomNum: Int = (1..6).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton.setOnClickListener { rollDiceToast()}

    }

    private fun rollDiceToast() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        textView.text = randomNum.toString()
    }
}