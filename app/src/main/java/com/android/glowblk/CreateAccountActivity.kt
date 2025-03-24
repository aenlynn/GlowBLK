package com.android.glowblk

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CreateAccountActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val fullNameInput = findViewById<EditText>(R.id.fullNameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val confirmPasswordInput = findViewById<EditText>(R.id.confirmPasswordInput)

        val button_SignUp: Button = findViewById<Button>(R.id.SignUp)
        button_SignUp.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)

            button_SignUp.setOnClickListener {
                val fullName = fullNameInput.text.toString().trim()
                val email = emailInput.text.toString().trim()
                val password = passwordInput.text.toString().trim()
                val confirmPassword = confirmPasswordInput.text.toString().trim()

                // Check if any field is empty
                if (fullName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }

                // Check password length
                if (password.length < 8) {
                    Toast.makeText(this, "Password must be at least 8 characters", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }

                // Check if passwords match
                if (password != confirmPassword) {
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }

                // If everything is valid, pass data to LoginActivity
                val intent = Intent(this, LoginActivity::class.java).apply {
                    putExtra("FULL_NAME", fullName)
                    putExtra("EMAIL", email)
                    putExtra("PASSWORD", password)
                }

                Toast.makeText(this, "Account created successfully!", Toast.LENGTH_SHORT).show()
                startActivity(intent)
                finish()
            }


        }
    }
}