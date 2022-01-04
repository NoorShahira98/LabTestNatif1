package com.example.android.labtest1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddress = findViewById<Button>(R.id.btnAddress)
        btnAddress.setOnClickListener {
            val address = findViewById<EditText>(R.id.txtAddress)
            var strURL = address.text.toString()
            if (strURL.indexOf("http://www") < 0) {
                strURL = "http://www.$strURL"
            }
            val implicit = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(strURL)
            )
            startActivity(implicit)
        }

    }
}