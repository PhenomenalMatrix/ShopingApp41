package com.mrflaitx.shopingapp41.domain

import com.mrflaitx.shopingapp41.domain.entity.ShopItem

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItem(shopItemId)
    }

}