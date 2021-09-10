package quizapp.volkova.diceroller_codelab1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ImagesOfDices : AppCompatActivity() {
    private val randomNum: Int = (1..6).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images)

        var rollButton: Button = findViewById(R.id.rollButton)
        var prevActivity: Button = findViewById(R.id.back)
        var dicePic: ImageView = findViewById(R.id.imageView)

        rollButton.setOnClickListener{setPic(dicePic)}

        val intent = Intent(this, MainActivity::class.java)

        prevActivity.setOnClickListener{
            startActivity(intent)
        }


    }

    private fun setPic(dicePic: ImageView) {
        var chosenPic = when (randomNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dicePic.setImageResource(chosenPic)
    }

}