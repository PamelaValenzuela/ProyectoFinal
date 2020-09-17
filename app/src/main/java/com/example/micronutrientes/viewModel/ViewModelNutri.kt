package com.example.micronutrientes.viewModel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.micronutrientes.model.RepositoryNutri
import com.example.micronutrientes.model.dataClass.nutrientes.Micronutrients

class ViewModelNutri (application: Application): AndroidViewModel(application){



    val reponutri: RepositoryNutri=RepositoryNutri(application)

    fun obtenerllamado(ingr: String){
        //1%20large%20apple
        var molde: String="1%large%"
        reponutri.llamado(molde+ingr)
    }

    fun obtenerllamadoDB(): LiveData<Micronutrients>{
    return reponutri.obtenerListadoDesdeDB()

    }
}