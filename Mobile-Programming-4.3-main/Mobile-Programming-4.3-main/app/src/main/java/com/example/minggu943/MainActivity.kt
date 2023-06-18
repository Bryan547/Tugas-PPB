package com.example.minggu943

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvSelectedOption: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSelectedOption = findViewById(R.id.tvSelectedOption)

        val btnShowPicker: Button = findViewById(R.id.btnShowPicker)
        btnShowPicker.setOnClickListener {
            showPicker()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_item1 -> {
                tvSelectedOption.text = "Pilihan pertama : Jokowi"
                return true
            }
            R.id.menu_item2 -> {
                tvSelectedOption.text = "Pilihan kedua : Ganjar"
                return true
            }
            R.id.menu_item3 -> {
                tvSelectedOption.text = "Pilihan ketiga : Anies"
                return true
            }

            R.id.menu_item3 -> {
                tvSelectedOption.text = "Pilihan keempat : Ferdi Sambo"
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun showMenu() {
        openOptionsMenu()
    }

    private fun showPicker() {
        val pickerOptions = arrayOf("1", "2", "3", "4")

        val builder = androidx.appcompat.app.AlertDialog.Builder(this)
        builder.setTitle("YUK DIPILIH YUK")

        builder.setItems(pickerOptions) { _, which ->
            tvSelectedOption.text = "Yang kamu pilih: ${pickerOptions[which]}"
        }

        builder.create().show()
    }
}