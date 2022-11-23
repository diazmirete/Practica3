package net.sessochoa.ignaciodiazmirete.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import net.sessochoa.ignaciodiazmirete.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var num:Int = 0
    private const val TAG = "mostrar log"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
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

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvNumero.text=num.toString()
        binding.btSuma.setOnClickListener(){
            num++
            binding.tvNumero.text=num.toString()
        }
    }
}