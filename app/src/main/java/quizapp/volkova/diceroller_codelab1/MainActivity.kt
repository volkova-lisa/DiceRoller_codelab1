package quizapp.volkova.diceroller_codelab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDiceToast()}

    }

    private fun rollDiceToast() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}