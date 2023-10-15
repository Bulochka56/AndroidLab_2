package com.example.lab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView1 = findViewById<TextView>(R.id.textView1)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val button = findViewById<Button>(R.id.button)
        val hiddenTextView = findViewById<TextView>(R.id.greetingTextView)

        button.setOnClickListener {
            // Скрываем textView1, editText1 и button
            textView1.visibility = View.GONE
            editText1.visibility = View.GONE
            button.visibility = View.GONE

            // Получаем текст из editText1
            val userInput = editText1.text.toString()

            // Показываем hiddenTextView с "Hello" и введенным текстом
            hiddenTextView.text = "Hello $userInput!"
            hiddenTextView.visibility = View.VISIBLE
        }
    }
}