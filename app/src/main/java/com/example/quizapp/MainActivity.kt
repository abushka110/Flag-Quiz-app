package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btn_start)
        val nameInput = findViewById<EditText>(R.id.name_input)

        btnStart.setOnClickListener {
            if(nameInput.text.isEmpty()) {
                Toast.makeText(this, "Enter your name!", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, nameInput.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}