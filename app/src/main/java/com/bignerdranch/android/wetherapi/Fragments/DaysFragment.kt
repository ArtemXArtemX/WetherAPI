package com.bignerdranch.android.wetherapi.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.bignerdranch.android.wetherapi.MainViewModel
import com.bignerdranch.android.wetherapi.adapters.WeatherAdapter
import com.bignerdranch.android.wetherapi.adapters.WeatherModel
import com.bignerdranch.android.wetherapi.databinding.FragmentHoursBinding

class DaysFragment : Fragment(), WeatherAdapter.Listener{
    private lateinit var adapter: WeatherAdapter
    private lateinit var binding: FragmentHoursBinding
    private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        model.liveDataList.observe(viewLifecycleOwner){
            adapter.submitList(it.subList(1, it.size))
        }
    }

    private fun init() = with(binding){
        adapter = WeatherAdapter(this@DaysFragment)
        rcView.layoutManager = LinearLayoutManager(activity)
        rcView.adapter = adapter
    }

    override fun OnClick(item: WeatherModel) {
        model.liveDataCurrent.value = item
    }

    companion object {
        @JvmStatic
        fun newInstance() = DaysFragment()

    }
}