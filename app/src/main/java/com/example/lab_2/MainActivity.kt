package com.example.lab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView1 = findViewById<TextView>(R.id.textView1)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val button = findViewById<Button>(R.id.button)
        val hiddenTextView = findViewById<TextView>(R.id.greetingTextView)
        val textView2 =findViewById<TextView>(R.id.textView2)
        val radioGroup = findViewById<RadioGroup>(R.id.RadioGroup)
        val radioButton = findViewById<RadioButton>(R.id.radioButton)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val button2 = findViewById<Button>(R.id.button2)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val textView3 = findViewById<TextView>(R.id.textView3)

        button.setOnClickListener {
            textView1.visibility = View.GONE
            editText1.visibility = View.GONE
            button.visibility = View.GONE

            val userInput = editText1.text.toString()

            hiddenTextView.text = "Hello $userInput!"
            hiddenTextView.visibility = View.VISIBLE
            textView2.visibility = View.VISIBLE
            radioGroup.visibility = View.VISIBLE
            button2.visibility = View.VISIBLE

        }
        button2.setOnClickListener{
            textView2.visibility = View.GONE
            radioGroup.visibility = View.GONE
            button2.visibility = View.GONE

            val checkedId = radioGroup.checkedRadioButtonId
            if (checkedId == radioButton.id) {
                imageView.setImageResource(R.drawable.happy_cat)
                textView3.text = ("YAY!")
            } else if (checkedId == radioButton2.id) {
                imageView.setImageResource(R.drawable.sad_cat)
                textView3.text = ("Don't be sad, take a cat.")
            }
            imageView.visibility = View.VISIBLE
            textView3.visibility = View.VISIBLE
        }

    }
}