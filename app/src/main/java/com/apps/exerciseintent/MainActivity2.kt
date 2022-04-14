package com.apps.exerciseintent

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.apps.exerciseintent.MainActivity.Companion.INTENT_NAME
import com.apps.exerciseintent.MainActivity.Companion.INTENT_STATUS
import com.apps.exerciseintent.MainActivity.Companion.INTENT_UMUR
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nama = intent.getStringExtra(INTENT_NAME)
        val umur = intent.getIntExtra(INTENT_UMUR,0)
        val status = intent.getBooleanExtra(INTENT_STATUS,false)

        tvNama_main2.text = nama

        Log.d("testIntent", nama.toString())
        Log.d("testIntent", umur.toString())
        Log.d("testIntent", status.toString())
    }

}
