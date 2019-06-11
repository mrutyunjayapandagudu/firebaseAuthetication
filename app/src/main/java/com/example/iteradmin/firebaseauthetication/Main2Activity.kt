package com.example.iteradmin.firebaseauthetication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class Main2Activity : AppCompatActivity() {

    private lateinit var mAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text= findViewById<TextView>(R.id.txt)
        val bt1=findViewById<Button>(R.id.bt)

        val user:FirebaseUser? =mAuth.currentUser
        if (user != null){
            text.text=user.uid
        }
        bt1.setOnClickListener {
            mAuth.signOut()
            finish()
        }

    }
}
