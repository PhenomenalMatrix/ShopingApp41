package com.mrflaitx.shopingapp41.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.mrflaitx.shopingapp41.R
import com.mrflaitx.shopingapp41.domain.entity.ShopItem

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopListLD.observe(this){
            Log.e("TAG", "initData: ${it}")
        }
        initData()
        editShopItem()
    }

    private fun initData() {
        for (i in 0..10){
            viewModel.addShopItem(ShopItem("potato",i,false))
        }
        viewModel.getShopList()
    }


    private fun deleteShopItem() {
        val item = ShopItem(
            "potato",
            5,
            false
        )
        viewModel.deleteShopItem(item)
    }

    private fun editShopItem() {
        val item = ShopItem(
            "potato",
            2,
            false,
            2
        )

        viewModel.editShopItem(item)
    }

    private fun getShopItem(){
        Toast.makeText(
            applicationContext,
            "${viewModel.getShopItem(2)}",
            Toast.LENGTH_SHORT
        ).show()
    }
}