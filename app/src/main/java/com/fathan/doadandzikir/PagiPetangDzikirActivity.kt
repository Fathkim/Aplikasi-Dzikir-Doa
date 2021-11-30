package com.fathan.doadandzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class PagiPetangDzikirActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_pagi_petang_dzikir)

        val cvDzikirPagiActivity: CardView = findViewById(R.id.cv_dzikir_pagi)
        cvDzikirPagiActivity.setOnClickListener(this)
        val btnDzikirPagiActivity: ImageButton = findViewById(R.id.img_btn_dzikir_pagi)
        btnDzikirPagiActivity.setOnClickListener(this)


        val cvDzikirPetangActivity: CardView = findViewById(R.id.cv_dzikir_petang)
        cvDzikirPetangActivity.setOnClickListener(this)
        val btnDzikirPetangActivity: ImageButton = findViewById(R.id.img_btn_dzikir_petang)
        btnDzikirPetangActivity.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.cv_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))
            R.id.img_btn_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))

            R.id.cv_dzikir_petang -> startActivity(Intent(this, DzikirPetangActivity::class.java))
            R.id.img_btn_dzikir_petang -> startActivity(Intent(this, DzikirPetangActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}