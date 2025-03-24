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
        button_login.setOnClickListener {
            val username = edittext_usernameInput.text
            val password = edittext_passwordInput.text

            if(username.isNullOrEmpty() || password.isNullOrEmpty()){
                Toast.makeText(this, "Username and Password cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener

            }
        }


        val button_createAccount: Button = findViewById<Button>(R.id.createAccountButton)
        button_createAccount.setOnClickListener {
            Log.e("Sample Project", "Button is clicked!")

            Toast.makeText(this, "Opening register screen", Toast.LENGTH_LONG).show()

            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

    }
}