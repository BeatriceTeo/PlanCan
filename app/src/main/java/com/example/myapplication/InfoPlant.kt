package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class InfoPlant : Fragment() {
    private val args: InfoPlantArgs by navArgs()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.info_plant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val PlantTitleInfo: TextView = view.findViewById(R.id.PlantTitleInfo)
        val PlantSeedInfo: TextView = view.findViewById(R.id.PlantSeedInfo)
        val PlantDepthInfo: TextView = view.findViewById(R.id.PlantDepthInfo)
        val DisPlantsInfo: TextView = view.findViewById(R.id.DisPlantsInfo)
        val DisRowsInfo: TextView = view.findViewById(R.id.DisRowsInfo)
        val PlantHarvastInfo: TextView = view.findViewById(R.id.PlantHarvastInfo)
        val PlantDetailsInfo: TextView = view.findViewById(R.id.PlantDetailsInfo)
        val PlantAssocInfo: TextView = view.findViewById(R.id.PlantAssocInfo)

        val goToJanLcl = view.findViewById<Button>(R.id.goToJan)
        val fromInfoToCalendar: TextView = view.findViewById(R.id.fromInfoToCalendar)

        val pCode=args.plantIdArgument

        val plant = PlantListData().allPlants().find { it.PlantCodePC == pCode }



        if(plant != null) {



            PlantTitleInfo.text = plant.PlantNamePC
            PlantSeedInfo.text = "Planting period: ${plant.PlantSeedPC}"
            PlantDepthInfo.text = "Planting depth: ${plant.PlantDepthPC}"
            DisPlantsInfo.text = "Distance between plants: ${plant.DisPlantsPC.toString()}"
            DisRowsInfo.text = "Distance between rows: ${plant.DisRowsPC.toString()}"
            PlantDetailsInfo.text = "Harvest period: ${plant.PlantHarvestPC}"
            PlantHarvastInfo.text = "Maintenance details: ${plant.PlantDetailsPC}"
            PlantAssocInfo.text = "Good associations with: ${plant.PlantAssocPC}"

            fromInfoToCalendar.setOnClickListener {
                requireActivity().getSharedPreferences("plant_cal",Context.MODE_PRIVATE).edit().apply {
                    putString("plant_in_cal",plant.PlantNamePC)

                }.apply()
            }

        }

        view.findViewById<Button>(R.id.fromInfoToCalendar).setOnClickListener {
            findNavController().navigate(R.id.action_infoPlant_to_recyclerCalendar)
        }






    }
}