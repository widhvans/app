package com.example.testapp

// Yeh aapka Kotlin code hai
// Path: /app/src/main/java/com/example/testapp/MainActivity.kt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // View Binding ke liye variable
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Layout ko inflate (load) karna
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Screen par layout ko set karna
        setContentView(binding.root)

        // Button par click listener lagana
        binding.submitButton.setOnClickListener {
            // EditText se text nikalna
            val userName = binding.nameEditText.text.toString()

            // Check karna ki naam khali (empty) toh nahi hai
            if (userName.isNotEmpty()) {
                // TextView ka text update karna
                binding.greetingTextView.text = "Hello, $userName!"
            } else {
                // Agar khali hai toh default greeting dikhana
                binding.greetingTextView.text = "Hello, World!"
            }
        }
    }
}
