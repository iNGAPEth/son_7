package com.example.lesson_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nameLIst = ArrayList<String>()
        nameLIst.add("серега-разраб")
        nameLIst.add("леха")
        nameLIst.add("егор")
        nameLIst.add("степан")
        nameLIst.add("денис")
        nameLIst.add("семен")


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameLIst)
        listView.adapter = adapter
        listView.setOnItemClickListener{parent, view, position, id ->

          Toast.makeText(this, "Pressed item position : ${nameLIst.get(position)}", Toast.LENGTH_SHORT).show()


        }



    }
}