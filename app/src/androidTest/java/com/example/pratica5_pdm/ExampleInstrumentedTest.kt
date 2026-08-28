package com.example.cartao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDetalhes = findViewById<Button>(R.id.btnDetalhes)
        val btnContato = findViewById<Button>(R.id.btnContato)

        btnDetalhes.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)
            startActivity(intent)
        }

        btnContato.setOnClickListener {
            val intent = Intent(this, ContatoActivity::class.java)
            startActivity(intent)
        }
    }
}