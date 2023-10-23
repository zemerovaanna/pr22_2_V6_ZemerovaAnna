package com.example.myweatherapiroom

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.myweatherapiroom.adapter.WeatherAdapter
import com.example.myweatherapiroom.data.AppDatabase
import com.example.myweatherapiroom.data.entity.Weather
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var fab: FloatingActionButton
    private var list = mutableListOf<Weather>()
    private lateinit var adapter: WeatherAdapter
    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        fab = findViewById(R.id.fab)

        database = AppDatabase.getInstance(applicationContext)
        adapter = WeatherAdapter(list)
        adapter.setDialog(object : WeatherAdapter.Dialog {

            override fun onClick(position: Int) {
                val dialog = AlertDialog.Builder(this@MainActivity)
                dialog.setTitle(list[position].cityName)
                dialog.setItems(
                    R.array.itemsoption,
                    DialogInterface.OnClickListener { dialog, which ->
                        when (which) {
                            0 -> {
                                val intent = Intent(this@MainActivity, EditorActivity::class.java)
                                intent.putExtra("id", list[position].uid)
                                startActivity(intent)
                            }

                            1 -> {
                                database.weatherDao().delete(list[position])
                                getData()
                            }

                            else -> {
                                dialog.dismiss()
                            }
                        }
                    })
                val dialogView = dialog.create()
                dialogView.show()
            }

        })

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(applicationContext, VERTICAL, false)
        recyclerView.addItemDecoration(DividerItemDecoration(applicationContext, VERTICAL))

        fab.setOnClickListener {
            startActivity(Intent(this, EditorActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        getData()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun getData() {
        list.clear()
        list.addAll(database.weatherDao().getAll())
        adapter.notifyDataSetChanged()
    }
}