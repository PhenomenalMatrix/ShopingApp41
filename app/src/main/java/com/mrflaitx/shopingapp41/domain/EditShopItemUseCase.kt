package com.mrflaitx.shopingapp41.domain

import com.mrflaitx.shopingapp41.domain.entity.ShopItem

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem){
        shopListRepository.editShopItem(shopItem)
    }

}