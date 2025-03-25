package com.android.glowblk

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edittext_usernameInput = findViewById<EditText>(R.id.usernameInput)
        val edittext_passwordInput = findViewById<EditText>(R.id.passwordInput)
        val button_login = findViewById<Button>(R.id.loginButton)
        val button_createAccount = findViewById<Button>(R.id.createAccountButton)

        button_login.setOnClickListener {
            val username = edittext_usernameInput.text.toString().trim()
            val password = edittext_passwordInput.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Username and Password cannot be empty", Toast.LENGTH_LONG).show()
            } else {

                val intent = Intent(this, HomePage::class.java)
                startActivity(intent)
                finish()
            }
        }

        button_createAccount.setOnClickListener {
            Log.e("Sample Project", "Button is clicked!")
            Toast.makeText(this, "Opening register screen", Toast.LENGTH_LONG).show()
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }
    }
}
