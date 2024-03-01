package com.example.myapplication

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
        
        val heightEditText = findViewById<EditText>(R.id.height)
        val weightEditText = findViewById<EditText>(R.id.weight)
        val submitButton=findViewById<Button>(R.id.res_check)

        submitButton.setOnClickListener {

            if(heightEditText.text.isEmpty()){
                Toast.makeText(this,"신장을 입력해 주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(weightEditText.text.isEmpty()){
                Toast.makeText(this,"체중을 입력해 주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            var height:Int=heightEditText.text.toString().toInt()
            var weight:Int=weightEditText.text.toString().toInt()

            var intent=Intent(this,ResultActivity::class.java)
            intent.putExtra("height", height)
            intent.putExtra("weight", weight)
            startActivity(intent)

        }

    }
}