package com.android.glowblk

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Logout : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)

        val yesLogoutButton = findViewById<Button>(R.id.yesLogoutButton)
        val cancelLogoutButton = findViewById<Button>(R.id.cancelLogoutButton)

        yesLogoutButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

        cancelLogoutButton.setOnClickListener {
            finish()
        }
    }
}
