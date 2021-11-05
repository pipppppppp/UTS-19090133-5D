package com.example.uts_19090133

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_detail.*

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imageView.setImageResource(intent.getIntExtra("gambar", 1))
        textViewNama.text = intent.getStringExtra("nama")
        textViewAsal.text = intent.getStringExtra("asal")
        textViewKeterangan.text = intent.getStringExtra("keterangan")

        fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId){
                android.R.id.home ->{
                    finish()
                    return true
                }
            }
            return super.onOptionsItemSelected(item)
        }

        fun finish() {
            super.finish()
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

    }

}