package com.mrflaitx.shopingapp41.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mrflaitx.shopingapp41.data.ShopListRepositoryImpl
import com.mrflaitx.shopingapp41.domain.*
import com.mrflaitx.shopingapp41.domain.entity.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl()

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val addShopItemUseCase = AddShopItemUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val getShopItemUseCase = GetShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopListLD = MutableLiveData<List<ShopItem>>()

    fun addShopItem(shopItem: ShopItem){
        addShopItemUseCase.addShopItem(shopItem)
//        getShopList()
    }

    fun getShopList(){
        shopListLD.value = getShopListUseCase.getShopList()
    }

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)
        getShopList()
    }

    fun editShopItem(shopItem: ShopItem){
        val newItem = shopItem.copy(enable = !shopItem.enable)
        editShopItemUseCase.editShopItem(newItem)
        getShopList()
    }

    fun getShopItem(shopItemId: Int) = getShopItemUseCase.getShopItem(shopItemId)

}