package com.syuheifujita.android_architecture_german.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.syuheifujita.android_architecture_german.MainViewModel
import com.syuheifujita.android_architecture_german.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_second.*

class HomeFragment : Fragment() {
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
//        loadDataFromViewModel()

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_move_first.setOnClickListener{
            Log.d("TAG", "Tap first btn")
            val firstFragment = FirstFragment()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.replace(R.id.fragment, firstFragment)
            fragmentTransaction?.commit()
        }
        btn_move_second.setOnClickListener{
            Log.d("TAG", "Tap second btn")
            val secondFragment = SecondFragment()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.replace(R.id.fragment, secondFragment)
            fragmentTransaction?.commit()
        }
    }

    private fun loadDataFromViewModel() {
        tv_home_fragment.text = viewModel.value_home
        tv_first_fragment.text = viewModel.value_first
        tv_second_fragment.text = viewModel.value_second
    }
}
