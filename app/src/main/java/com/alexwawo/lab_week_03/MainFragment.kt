package com.alexwawo.lab_week_03

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("DEBUG", "MainFragment: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("DEBUG", "MainFragment: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("DEBUG", "MainFragment: onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("DEBUG", "MainFragment: onViewCreated")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DEBUG", "MainFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DEBUG", "MainFragment: onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("DEBUG", "MainFragment: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DEBUG", "MainFragment: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("DEBUG", "MainFragment: onDetach")
    }
}