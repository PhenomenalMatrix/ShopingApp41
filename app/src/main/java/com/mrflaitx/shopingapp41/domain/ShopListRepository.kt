package com.mrflaitx.shopingapp41.domain

import com.mrflaitx.shopingapp41.domain.entity.ShopItem

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    // refactor
    fun getShopList(): List<ShopItem>
}