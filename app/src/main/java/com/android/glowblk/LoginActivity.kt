package com.android.glowblk

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button_createAccount: Button = findViewById<Button>(R.id.createAccountButton)
        button_createAccount.setOnClickListener {
            Log.e("Sample Project", "Button is clicked!")
        }
    }
}