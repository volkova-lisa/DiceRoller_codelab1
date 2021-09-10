package quizapp.volkova.diceroller_codelab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var rollButton: Button
    lateinit var textView: TextView
    private val randomNum: Int = (1..6).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        rollButton.setOnClickListener { rollDiceToast(textView)}

    }

    private fun rollDiceToast(textV : TextView) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        textV.text = randomNum.toString()
    }
}