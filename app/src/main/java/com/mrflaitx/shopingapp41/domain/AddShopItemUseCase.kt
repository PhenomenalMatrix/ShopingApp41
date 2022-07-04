package com.mrflaitx.shopingapp41.domain

import com.mrflaitx.shopingapp41.domain.entity.ShopItem

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }

}