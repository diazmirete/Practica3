package net.sessochoa.ignaciodiazmirete.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import net.sessochoa.ignaciodiazmirete.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //var num:Int = 0
    private val TAG = "mostrar log"
    val model: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //iniciamos el contador. Si es la primera vez, a cero, si es una reconstrucción,
// //lo hará al valor que tenía
        binding.tvNumero.text=model.contador.toString()
        binding.btSuma.setOnClickListener(){
//sumamos uno
            model.run { sumaUno() }
//mostramos el valor
            binding.tvNumero.text=model.contador.toString()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }
    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }
    override fun onStop() {
        Log.i(TAG, "onStop")
        super.onStop()
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }
    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }
}