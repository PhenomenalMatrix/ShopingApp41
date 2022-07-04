package com.mrflaitx.shopingapp41.data

import android.util.Log
import com.mrflaitx.shopingapp41.domain.ShopListRepository
import com.mrflaitx.shopingapp41.domain.entity.ShopItem
import java.lang.RuntimeException

class ShopListRepositoryImpl: ShopListRepository {

//    private val shopList = mutableListOf<ShopItem>()
    private val shopList = sortedSetOf<ShopItem>({ o1, o2 -> o1.id.compareTo(o2.id) })

    private var autoIncrementId = 0

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNEFINED_ID){
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
        Log.e("TAG", "deleteShopItemInImp: $shopList ")
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }
}