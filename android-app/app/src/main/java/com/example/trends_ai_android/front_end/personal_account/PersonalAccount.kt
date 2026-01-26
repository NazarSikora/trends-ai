package com.example.app.ui.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.app.databinding.FragmentPersonalAccountBinding

class PersonalAccountFragment : Fragment() {

    private var _binding: FragmentPersonalAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Тимчасові дані (пізніше підтягнеш з API / Firebase / DataStore)
        binding.tvUserName.text = "Nazariy Sikora"
        binding.tvEmail.text = "nazariy@example.com"
        binding.tvStatus.text = "Student"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

