package com.daviddev.mewert

import android.content.Intent   //temp - added (to work on or delete it)
import android.os.Bundle
import android.widget.Button    //temp - added (to work on or delete it)
import androidx.appcompat.app.AppCompatActivity

class AccessPinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_access_pin)

        // added (to work on or delete it)
        val sendToMainActivity= findViewById<Button>(R.id.login_temporario)
        sendToMainActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    //-- TODO
    //fazer o screen do pin, ou seja renovar e alterar
}