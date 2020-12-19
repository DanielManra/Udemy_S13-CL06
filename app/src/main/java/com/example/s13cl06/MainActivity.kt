package com.example.s13cl06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var dado: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTirarDado.setOnClickListener{ view ->
            when(generarDadoAleatorio()){
                1 -> imageViewDado.setImageResource(R.drawable.dado_1)
                2 -> imageViewDado.setImageResource(R.drawable.dado_2)
                3 -> imageViewDado.setImageResource(R.drawable.dado_3)
                4 -> imageViewDado.setImageResource(R.drawable.dado_4)
                5 -> imageViewDado.setImageResource(R.drawable.dado_5)
                6 -> imageViewDado.setImageResource(R.drawable.dado_6)
            }
        }
    }

    private fun generarDadoAleatorio():Int {
        return Random.nextInt(6) + 1
    }
}
