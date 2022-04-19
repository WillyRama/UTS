package com.example.utswilly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yamahalist = listOf<Yamaha>(
            Yamaha(
                R.drawable.fazzio,
                "Yamaha fazzio",
                "yamaha Fazzio tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Yamaha hadir dalam 4 varian. Bicara soal spesifikasi mesin Yamaha Fazzio, ini ditenagai dua pilihan mesin Petrol berkapasitas 124.86 cc. Fazzio tersedia dengan transmisi CVT tergantung variannya. Fazzio adalah Scooter 2 seater dengan panjang 1820 mm, lebar 685 mm, wheelbase 1280 mm. serta ground clearance 135 mm."
            ),
            Yamaha(
                R.drawable.fino,
                "Yamaha Fino",
                "Harga Yamaha Fino 125 mulai dari Rp 19,58 Juta, Cek Promo terbaik hari ini 19 April 2022, dengan DP mulai dari Rp 4,5 Juta, Angsuran Rp 799.000 (35x)."
            ),
            Yamaha(
                R.drawable.freego,
                "Yamaha Freego",
                "Yamaha FreeGo tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Yamaha hadir dalam 6 varian. Bicara soal spesifikasi mesin Yamaha FreeGo, ini ditenagai dua pilihan mesin Petrol berkapasitas 125 cc. FreeGo tersedia dengan transmisi Automatic tergantung variannya. FreeGo adalah Scooter 2 seater dengan panjang 1905 mm, lebar 690 mm, wheelbase 1275 mm."
            ),
            Yamaha(
                R.drawable.gear,
                "Yamaha Gear",
                "Yamaha Gear 125 tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Yamaha hadir dalam 4 varian. Bicara soal spesifikasi mesin Yamaha Gear 125, ini ditenagai dua pilihan mesin Petrol berkapasitas 124.96 cc. Gear 125 tersedia dengan transmisi CVT tergantung variannya. Gear 125 adalah Scooter 2 seater dengan panjang 1870 mm, lebar 685 mm, wheelbase 1260 mm. serta ground clearance 160 mm. "
            ),
            Yamaha(
                R.drawable.mios,
                "Yamaha Mio S",
                "amaha Mio S tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Yamaha hadir dalam 2 varian. Bicara soal spesifikasi mesin Yamaha Mio S, ini ditenagai dua pilihan mesin Petrol berkapasitas 125 cc. Mio S tersedia dengan transmisi CVT tergantung variannya. Mio S adalah Scooter 2 seater dengan panjang 1870 mm, lebar 685 mm, wheelbase 1260 mm. serta ground clearance 135 mm."
            ),
            Yamaha(
                R.drawable.xride,
                "Yamaha X-ride",
                "YYamaha XRide 125 tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Yamaha hadir dalam 2 varian. Bicara soal spesifikasi mesin Yamaha XRide 125, ini ditenagai dua pilihan mesin Petrol berkapasitas 125 cc. XRide 125 tersedia dengan transmisi CVT tergantung variannya. XRide 125 adalah Scooter 2 seater dengan panjang 1860 mm, lebar 740 mm, wheelbase 1260 mm. serta ground clearance 135 mm."
            ),
        )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_yamaha)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = YamahaAdapter(this, yamahalist){
            val intent = Intent(this,DetailYamahaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}