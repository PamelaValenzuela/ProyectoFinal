package com.example.micronutrientes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.micronutrientes.R
import com.example.micronutrientes.viewModel.ViewModelNutri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       var mVMnutrients= ViewModelProvider(this).get(ViewModelNutri::class.java)

        button.setOnClickListener{
            var textoIngresado=search_ingr.text.toString()
            mVMnutrients.obtenerllamado(textoIngresado)
            Log.d("Pame", "texto ingresado $textoIngresado")
        }

        mVMnutrients.obtenerllamadoDB().observe(this,{
            //poner funcionalidad en caso de actulizacion de la lista
            if(it!=null){
                Log.d("Pame","$it")
                vitaminab12.text= it.totalNutrients.CA.toString()
            }else{
                Log.d("Pame", "nulo $it")
            }
        })
    }
}