package com.example.fitnerd

import android.app.Activity
import android.os.Bundle

import android.widget.Button
import android.widget.Toast
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fitnerd.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnCadastrar.setOnClickListener {
            exibirInformacoesEdt()
        }
    }
        //val btnCadastrar=findViewById<Button>(R.id.btn_cadastrar)
        fun exibirInformacoesEdt(){
            val nome=binding.edtNome.text.toString()
            Log.d("Info Cliente","Nome: ${nome}")

            val email=binding.edtEmail.text.toString()
            Log.d("Info Cliente","Email: ${email}")

            val idade=binding.edtIdade.text.toString()
            Log.d("Info Cliente","Idade: ${idade}")

            val senha=binding.edtSenha.text.toString()
            Log.d("Info Cliente","Senha: ${senha}")


        }

}