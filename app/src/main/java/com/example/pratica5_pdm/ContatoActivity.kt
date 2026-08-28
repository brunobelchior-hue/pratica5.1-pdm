package com.example.pratica5_pdm

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.pratica5_pdm.R

class ContatoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)

        val telefone = findViewById<TextView>(R.id.telefone)
        val email = findViewById<TextView>(R.id.email)
        val site = findViewById<TextView>(R.id.site)
        val btnCompartilhar = findViewById<Button>(R.id.btnCompartilhar)

        telefone.setOnClickListener {

            val intent = Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:SEU_NUMERO")
            )

            startActivity(intent)
        }

        email.setOnClickListener {

            val intent = Intent(
                Intent.ACTION_SENDTO,
                Uri.parse("mailto:SEU_EMAIL")
            )

            startActivity(intent)
        }

        site.setOnClickListener {

            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.linkedin.com/")
            )

            startActivity(intent)
        }

        btnCompartilhar.setOnClickListener {

            val mensagem = """
                BRUNO ROCHA
                
                Consultor de Vendas Fiat | Seminovos Multimarcas
                
                Telefone: SEU_NUMERO
                E-mail: SEU_EMAIL
            """.trimIndent()

            val intent = Intent(Intent.ACTION_SEND)

            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, mensagem)

            startActivity(
                Intent.createChooser(intent, "Compartilhar contato")
            )
        }
    }
}