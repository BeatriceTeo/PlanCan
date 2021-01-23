package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecyclerPlant : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.recycler_plant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //preluam lista plantelor cu detaliile de sadire
        val ListOfPlants = PlantListData().allPlants()


//        view.findViewById<Button>(R.id.goToJan).setOnClickListener{
//
//        }


        //chemata functia din adapter
        view.findViewById<RecyclerView>(R.id.plantRecView).apply {
            layoutManager = LinearLayoutManager (activity)
            adapter = PlantAdapter(ListOfPlants)
        }

    }

}