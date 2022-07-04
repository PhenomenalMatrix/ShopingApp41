package com.mrflaitx.shopingapp41.domain

import com.mrflaitx.shopingapp41.domain.entity.ShopItem

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }

}