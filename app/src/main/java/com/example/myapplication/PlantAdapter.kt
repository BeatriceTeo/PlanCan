package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.data.PlantCharacteristics



class PlantAdapter(private val ListOfPlants: List<PlantCharacteristics>): RecyclerView.Adapter<PlantAdapter.ViewHolder>(){

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(plant: PlantCharacteristics) {

            //afisare nume plante

            val PlantName: TextView = itemView.findViewById(R.id.PlantName)

//
//                if(plant.PlantSeedPC == "Jan Oct Nov Feb Mar"){
//
//                    PlantTitleInfo.text = plant.PlantNamePC
//
//                }
//                else{
//                    PlantTitleInfo.text = null
//                }
//
//            fun SearchByMonthSelFun(view: View){
//
//
//            }


            PlantName.text = plant.PlantNamePC

            //legatura cu InfoPlant - prin apasarea pe numele plantei vom primi informatiile de semanare
            PlantName.setOnClickListener {

                //plant.name = schimba cu un id unic
                val action = RecyclerPlantDirections.actionRecyclerPlantToInfoPlant(plant.PlantCodePC)
                view.findNavController().navigate(action)

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_plant_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() = ListOfPlants.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val plant = ListOfPlants[position]
        holder.bind(plant)
    }


}