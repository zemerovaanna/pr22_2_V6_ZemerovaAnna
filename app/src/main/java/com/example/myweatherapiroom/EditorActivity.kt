package com.example.myweatherapiroom

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myweatherapiroom.adapter.WeatherAdapter
import com.example.myweatherapiroom.data.AppDatabase
import com.example.myweatherapiroom.data.entity.Weather
import java.util.Calendar


class EditorActivity : AppCompatActivity() {

    private lateinit var cityFullName: EditText
    private lateinit var cityTemperature: EditText
    private lateinit var cityWindySpeed: EditText
    private lateinit var cityPressure: EditText
    private lateinit var cityHumidity: EditText
    private lateinit var bttnSave: Button
    private lateinit var database: AppDatabase
    private var list = mutableListOf<Weather>()
    private lateinit var adapter: WeatherAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        cityFullName = findViewById(R.id.city_full_name)
        cityTemperature = findViewById(R.id.city_temperature)
        cityWindySpeed = findViewById(R.id.city_windy_speed)
        cityPressure = findViewById(R.id.city_pressure)
        cityHumidity = findViewById(R.id.city_humidity)
        bttnSave = findViewById(R.id.bttn_save)
        database = AppDatabase.getInstance(applicationContext)

        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH) + 1
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val intent = intent.extras
        if (intent != null) {
            val id = intent.getInt("id", 0)
            val weather = database.weatherDao().get(id)

            cityFullName.setText(weather.cityName)
            cityFullName.isEnabled = false
            cityTemperature.setText(weather.temp)
            cityWindySpeed.setText(weather.windySpeed)
            cityPressure.setText(weather.pressure)
            cityHumidity.setText(weather.humidity)
        } else {
            cityFullName.isEnabled = true
        }

        bttnSave.setOnClickListener {
            if (cityFullName.text.isNotEmpty() && cityTemperature.text.isNotEmpty() && cityWindySpeed.text.isNotEmpty() && cityPressure.text.isNotEmpty() && cityHumidity.text.isNotEmpty()) {
                try {
                    val t = cityTemperature.text.toString().toInt()
                    val w = cityWindySpeed.text.toString().toInt()
                    val p = cityPressure.text.toString().toInt()
                    val h = cityHumidity.text.toString().toInt()

                    if (t < -89 || t > 57) {
                        Toast.makeText(
                            applicationContext,
                            R.string.errortemperature,
                            Toast.LENGTH_SHORT
                        ).show()
                    } else if (w < 0 || w > 408) {
                        Toast.makeText(
                            applicationContext,
                            R.string.errorwindyspeed,
                            Toast.LENGTH_SHORT
                        ).show()
                    } else if (p < 879 || p > 1050) {
                        Toast.makeText(
                            applicationContext,
                            R.string.errorpressure,
                            Toast.LENGTH_SHORT
                        ).show()
                    } else if (h < 0 || h > 100) {
                        Toast.makeText(
                            applicationContext,
                            R.string.errorhumidity,
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {

                        if (intent != null) {
                            database.weatherDao().update(
                                Weather(
                                    intent.getInt("id", 0),
                                    cityFullName.text.toString(),
                                    cityTemperature.text.toString(),
                                    cityWindySpeed.text.toString(),
                                    cityPressure.text.toString(),
                                    cityHumidity.text.toString(),
                                    "$year-$month-$day $hour:$minute"
                                )
                            )
                        } else {
                            list.clear()
                            list.addAll(
                                database.weatherDao()
                                    .search(cityFullName.text.toString())
                            )
                            adapter = WeatherAdapter(list)

                            if (adapter.itemCount == 0) {
                                database.weatherDao().insertAll(
                                    Weather(
                                        null,
                                        cityFullName.text.toString(),
                                        cityTemperature.text.toString(),
                                        cityWindySpeed.text.toString(),
                                        cityPressure.text.toString(),
                                        cityHumidity.text.toString(),
                                        "$year-$month-$day $hour:$minute"
                                    )
                                )
                            } else {
                                database.weatherDao().delete(list[0])
                                database.weatherDao().insertAll(
                                    Weather(
                                        null,
                                        cityFullName.text.toString(),
                                        cityTemperature.text.toString(),
                                        cityWindySpeed.text.toString(),
                                        cityPressure.text.toString(),
                                        cityHumidity.text.toString(),
                                        "$year-$month-$day $hour:$minute"
                                    )
                                )
                            }
                        }
                        finish()
                    }
                } catch (e: Exception) {
                    Toast.makeText(
                        applicationContext,
                        R.string.onlydigit,
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }

            } else {
                Toast.makeText(applicationContext, R.string.emptyfield, Toast.LENGTH_SHORT).show()
            }
        }
    }
}