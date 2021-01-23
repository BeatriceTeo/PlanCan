package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class InfoCal : Fragment() {
    private val args: InfoCalArgs by navArgs()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.info_cal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val PlantTitleInfo: TextView = view.findViewById(R.id.PlantTitleInfo)
        val PlantSeedInfo: TextView = view.findViewById(R.id.PlantSeedInfo)


        val pCode=args.infoCalArg

        val plant = PlantListData().allPlants().find { it.PlantCodePC == pCode }
        if(plant != null) {
            PlantTitleInfo.text = plant.PlantNamePC
            PlantSeedInfo.text = "Planting period: ${plant.PlantSeedPC}"


        }
        val textlcl = requireActivity().getSharedPreferences("plant_cal",Context.MODE_PRIVATE).getString("plant_in_cal","default")
        val CalPlantTitleInfo: TextView = view.findViewById(R.id.CalPlantTitleInfo)

        CalPlantTitleInfo.text = textlcl








    }
}