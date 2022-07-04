package com.mrflaitx.shopingapp41.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList() = shopListRepository.getShopList()

}