package com.example.tugas_day_3_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager


private val <ActivityMainBinding> ActivityMainBinding.root: Any
    get() {}

class MainActivity<ActivityMainBinding> : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.Inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val rvUserListAdapter = UserListAdapter<Any>()

        binding.rvUserList.layoutManager = LinearLayoutManager(this)
        binding.rvUserList.adapter = rvUserListAdapter

        rvUserListAdapter.addListOfName(listNames)
        rvUserListAdapter.addListOfEmail(listEmails)
        rvUserListAdapter.addListOfJurusan(listJurusan)
        rvUserListAdapter.addListOfSemester(listSemester)
        rvUserListAdapter.addListOfImage(listImages)
    }
}