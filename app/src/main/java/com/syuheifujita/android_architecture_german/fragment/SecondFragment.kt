package com.syuheifujita.android_architecture_german.fragment

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.syuheifujita.android_architecture_german.MainViewModel
import com.syuheifujita.android_architecture_german.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

//        et_fragment_second.setText(viewModel.value_second)

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_fragment_second.setOnClickListener {
            Log.i("TAG", "Tap second btn")
            fragmentManager?.popBackStack()
        }
    }
}
