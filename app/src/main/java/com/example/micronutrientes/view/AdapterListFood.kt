package com.example.micronutrientes.view

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.micronutrientes.model.dataClass.nutrientes.Micronutrients
import kotlinx.android.synthetic.main.list_selecction.view.*


class AdapterListFood(var mAdapterListF: List<Micronutrients>): RecyclerView.Adapter<AdapterListFood.ViewHoldermicronutrients>() {
  /*  fun updateData(mFoodList: ?){
        if (mFoodList != null) {
            mAdapterNutris= mFoodList
        }
        notifyDataSetChanged()
    }*/


        class ViewHoldermicronutrients(itemView: View): RecyclerView.ViewHolder(itemView){
            var mQuantity: TextView=itemView.viewquantity
            var mMeasure : TextView=itemView.viewmeasure
            var mFood: TextView=itemView.viewfood
            var mImage: ImageView=itemView.imagelist


        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoldermicronutrients {
        TODO("Not yet implemented")
    }


    override fun getItemCount(): Int {
        return mAdapterListF.size
    }

    override fun onBindViewHolder(holder: ViewHoldermicronutrients, position: Int) {
        TODO("Not yet implemented")
    }


}