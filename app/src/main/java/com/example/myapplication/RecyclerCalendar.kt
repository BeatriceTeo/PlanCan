package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecyclerCalendar : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.recycler_calendar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //preluam lista plantelor cu detaliile de sadire
        val ListOfPlants = PlantListData().allPlants()

        //chemata functia din adapter
        view.findViewById<RecyclerView>(R.id.calendarRecView).apply {
            layoutManager = LinearLayoutManager (activity)
            adapter = CalendarAdapter(ListOfPlants)
        }



    }

}