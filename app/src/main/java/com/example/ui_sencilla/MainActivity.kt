package com.example.ui_sencilla

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var txtNombre : EditText
    private lateinit var btnAceptar : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Para hacer referencia a cada variable
        txtNombre = findViewById(R.id.txtNombre)
        btnAceptar = findViewById(R.id.btnAceptar)

        btnAceptar.setOnClickListener {
            //Creamos el Intent y le añadimos la informacion que va a pasar entre actividades
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)
            intent.putExtra("NOMBRE", txtNombre.text.toString())

            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}