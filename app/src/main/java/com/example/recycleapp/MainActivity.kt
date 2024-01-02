package com.example.recycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Toggle button click method
        val button = findViewById<Button>(R.id.toggle_button) // Use findViewById with the correct type

        var isDarkMode = false // Assuming the initial mode is light

        button.setOnClickListener {
            isDarkMode = !isDarkMode
            AppCompatDelegate.setDefaultNightMode(if (isDarkMode) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO)
        }


        val contactList = arrayListOf(
            ContactModel(R.drawable.image1, "John Doe", "123-456-7890"),
            ContactModel(R.drawable.image2, "Alice Smith", "987-654-3210"),
            ContactModel(R.drawable.image3, "Bob Johnson", "555-123-4567"),
            // Adding more ContactModel instances
            ContactModel(R.drawable.image4, "Emily Davis", "111-222-3333"),
            ContactModel(R.drawable.image5, "James Wilson", "444-555-6666"),
            ContactModel(R.drawable.image6, "Sophia Brown", "777-888-9999"),
            ContactModel(R.drawable.image7, "Oliver Miller", "333-222-1111"),
            ContactModel(R.drawable.image8, "Charlotte Garcia", "999-888-7777"),
            ContactModel(R.drawable.image9, "Daniel Martinez", "444-333-2222"),
            ContactModel(R.drawable.image10, "Ava Johnson", "666-777-8888"),

            // Adding more ContactModel instances
            ContactModel(R.drawable.image4, "Emily Davis", "111-222-3333"),
            ContactModel(R.drawable.image5, "James Wilson", "444-555-6666"),
            ContactModel(R.drawable.image6, "Sophia Brown", "777-888-9999"),
            ContactModel(R.drawable.image7, "Oliver Miller", "333-222-1111"),
            ContactModel(R.drawable.image8, "Charlotte Garcia", "999-888-7777"),
            ContactModel(R.drawable.image9, "Daniel Martinez", "444-333-2222"),
            ContactModel(R.drawable.image10, "Ava Johnson", "666-777-8888"),

            // Adding more ContactModel instances
            ContactModel(R.drawable.image4, "Emily Davis", "111-222-3333"),
            ContactModel(R.drawable.image5, "James Wilson", "444-555-6666"),
            ContactModel(R.drawable.image6, "Sophia Brown", "777-888-9999"),
            ContactModel(R.drawable.image7, "Oliver Miller", "333-222-1111"),
            ContactModel(R.drawable.image8, "Charlotte Garcia", "999-888-7777"),
            ContactModel(R.drawable.image9, "Daniel Martinez", "444-333-2222"),
            ContactModel(R.drawable.image10, "Ava Johnson", "666-777-8888"),
        )

        // Inside your Activity or Fragment where the RecyclerView is present
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)


// Create an instance of RecyclerContactAdapter
        val adapter = RecyclerContactAdapter(this, contactList)

// Set the adapter to your RecyclerView
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}