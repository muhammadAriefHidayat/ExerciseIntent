package com.apps.exerciseintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend.setOnClickListener {
            val nama = findViewById<EditText>(R.id.edtxNama)

            val mPerson = Person(nama.text.toString(), 12, "andi@gmail.com", "jaksel", true)

            startActivity(Intent(this, MainActivity2::class.java).apply {
                putExtra(INTENT_NAME, mPerson.nama)
                putExtra(INTENT_UMUR, mPerson.umur)
                putExtra(INTENT_STATUS, mPerson.statusMenikah)
            })
        }
    }

    companion object {
        const val INTENT_NAME = "name"
        const val INTENT_EMAIL = "EMAIL"
        const val INTENT_UMUR = "umur"
        const val INTENT_STATUS = "status"
    }
}