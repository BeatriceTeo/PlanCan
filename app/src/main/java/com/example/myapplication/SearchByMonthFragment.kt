package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SearchByMonthFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.search_by_month, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        //legatura cu urmatorul layout
        view.findViewById<Button>(R.id.goToJan).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)


        }
        view.findViewById<Button>(R.id.goToFeb).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToMar).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToApr).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToMay).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToJun).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToJul).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToAug).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToSep).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToOct).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToNov).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }
        view.findViewById<Button>(R.id.goToDec).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerPlant)
        }




    }
}