package com.example.mynavapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.mynavapplication.R

class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contact, container, false)

        val name = view.findViewById<EditText>(R.id.editTextName)
        val phone = view.findViewById<EditText>(R.id.editTextPhone)
        val email = view.findViewById<EditText>(R.id.editTextEmail)
        val message = view.findViewById<EditText>(R.id.editTextMessage)
        val sendButton = view.findViewById<Button>(R.id.buttonSend)

        sendButton.setOnClickListener {
            val nameText = name.text.toString()
            val phoneText = phone.text.toString()
            val emailText = email.text.toString()
            val messageText = message.text.toString()

            Toast.makeText(requireContext(), "Mensaje enviado por $nameText", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
