package com.example.warehouse

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

//import com.example.warehouse.DatabaseHelper as db

class Homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        val buttonIn: ImageButton = findViewById(R.id.btn_stock_in)
        buttonIn.setOnClickListener {
            val intent = Intent(this, ProductScan::class.java)
            intent.putExtra("stock_in_out", "1")
            startActivity(intent)
        }

        val buttonOut: ImageButton = findViewById(R.id.btn_stock_out)
        buttonOut.setOnClickListener {
            val intent = Intent(this, ProductScan::class.java)
            intent.putExtra("stock_in_out", "2")
            startActivity(intent)
        }

        val btnReport: ImageButton=findViewById(R.id.btn_report)
        btnReport.setOnClickListener{
            val intent = Intent(this, Report::class.java)
            startActivity(intent)
        }

        val btnWarehouse: ImageButton=findViewById(R.id.btn_warehouse)
        btnWarehouse.setOnClickListener{
            val intent = Intent(this, warehouse::class.java)
            startActivity(intent)
        }

        val btnSearch: Button =findViewById(R.id.btn_search)
        btnSearch.setOnClickListener{
            val intent = Intent(this, Search::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {

    }


}