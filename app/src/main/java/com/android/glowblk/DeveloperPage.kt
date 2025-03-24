package com.android.glowblk

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DeveloperPage : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer_page)

        // Developer 1
        val developer1Image = findViewById<ImageView>(R.id.developer1Image)
        val developer1Name = findViewById<TextView>(R.id.developer1Name)
        val developer1Bio = findViewById<TextView>(R.id.developer1Bio)
        val developer1Skills = findViewById<TextView>(R.id.developer1Skills)
        val developer1FunFact = findViewById<TextView>(R.id.developer1FunFact)


        developer1Image.setImageResource(R.drawable.charles)
        developer1Name.text = "Charles Sean"
        developer1Bio.text = "Passionate Android developer with a focus on UI/UX."
        developer1Skills.text = "Skills: Kotlin, Java, Jetpack Compose"
        developer1FunFact.text = "Fun Fact: I love hiking and playing guitar."

        // Developer 2
        val developer2Image = findViewById<ImageView>(R.id.developer2Image)
        val developer2Name = findViewById<TextView>(R.id.developer2Name)
        val developer2Bio = findViewById<TextView>(R.id.developer2Bio)
        val developer2Skills = findViewById<TextView>(R.id.developer2Skills)
        val developer2FunFact = findViewById<TextView>(R.id.developer2FunFact)

        // Set data for Developer 2
        developer2Image.setImageResource(R.drawable.analynn)
        developer2Name.text = "Analyn"
        developer2Bio.text = "Dedicated to my work to create good community in the industry."
        developer2Skills.text = "Skills: Python, Kotlin, Java"
        developer2FunFact.text = "Fun Fact: I like reading books and singing."

        // Developer 3
        findViewById<ImageView>(R.id.developer2Image)
        findViewById<TextView>(R.id.developer2Name)
        findViewById<TextView>(R.id.developer3Bio)
        findViewById<TextView>(R.id.developer3Skills)
        findViewById<TextView>(R.id.developer3FunFact)


        // Set data for Developer 3
        developer2Image.setImageResource(R.drawable.elai)
        developer2Name.text = "Elaiza Jane"
        developer2Bio.text = "Experienced in backend development and cloud technologies."
        developer2Skills.text = "Skills: Python, AWS, SQL"
        developer2FunFact.text = "Fun Fact: I'm a certified scuba diver."

    }
}

