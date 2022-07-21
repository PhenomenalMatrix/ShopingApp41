package com.geektech.shoppingapplication.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.geektech.shoppingapplication.data.entity.ShopItemDB

@Dao
interface ShopItemDao {

    @Query("SELECT * FROM shop_table")
    fun getShopList(): LiveData<List<ShopItemDB>>

    @Insert
    fun addShopItem(shopItemDB: ShopItemDB)

}