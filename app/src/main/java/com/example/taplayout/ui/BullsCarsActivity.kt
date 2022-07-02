package com.example.taplayout.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.taplayout.R

class BullsCarsActivity : Fragment() {
    lateinit var binding : ActivityBullsCarsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container:ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = ActivityBullsCarsBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }
}