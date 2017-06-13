package io.github.naqushab.activityinteractionkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById(R.id.button)

        button.setOnClickListener(){
            setContentView(R.layout.activity_main2)
        }
    }
}
