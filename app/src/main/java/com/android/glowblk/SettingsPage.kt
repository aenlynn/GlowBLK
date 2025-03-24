package com.android.glowblk

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast


class SettingsPage : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_page)

        // Back Button
        findViewById<ImageView>(R.id.backButton).setOnClickListener {
            finish() // Close the activity
        }

        // Click Listeners for each setting option
        setupClickListeners()
    }

    private fun setupClickListeners() {
        val settings = mapOf(
            R.id.account to "Account",
            R.id.notifications to "Notification",
            R.id.privacy to "Privacy",
            R.id.payment to "Payment",
            R.id.language to "Language",
            R.id.help to "Help",
            R.id.aboutDevelopers to "About the Developers",
            R.id.logout to "Logout"
        )

        for ((id, name) in settings) {
            findViewById<LinearLayout>(id)?.setOnClickListener {
                if (id == R.id.logout) {
                    Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show()
                    // Add logout functionality here (e.g., clear user session, redirect to login)
                } else {
                    Toast.makeText(this, "$name clicked", Toast.LENGTH_SHORT).show()
                    // Navigate to the corresponding activity if needed
                }
            }
        }
    }
}