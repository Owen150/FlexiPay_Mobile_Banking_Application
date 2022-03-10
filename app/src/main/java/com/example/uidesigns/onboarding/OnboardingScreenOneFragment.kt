package com.example.uidesigns.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.uidesigns.R


class OnboardingScreenOneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding_screen_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.btn_register_one).setOnClickListener {
            view.findNavController().navigate(R.id.action_onboardingScreenOneFragment_to_onboardingScreenTwoFragment)
        }
    }
}