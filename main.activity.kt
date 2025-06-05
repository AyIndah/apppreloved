package com.example.homepage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.newestRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val productList = listOf(
            Product("Nike", "Product 1", "$10.99", R.drawable.shoes),
            Product("Uniqlo", "Product 2", "$12.99", R.drawable.shirt),
            Product("No Brand", "Product 3", "$15.00", R.drawable.trousers)
        )

        adapter = ProductAdapter(productList)
        recyclerView.adapter = adapter
    }
}
