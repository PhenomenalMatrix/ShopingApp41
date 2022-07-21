package com.geektech.shoppingapplication.data

import com.geektech.shoppingapplication.data.entity.ShopItemDB
import com.geektech.shoppingapplication.domain.entity.ShopItem

class ShopListMapper {

    fun mapEntityToDbModel(shopItem: ShopItem) = ShopItemDB(
        id = shopItem.id,
        name = shopItem.name,
        count = shopItem.count,
        enable = shopItem.enable
    )

    fun mapDbModelToEntity(shopItemDB: ShopItemDB) = ShopItem(
        id = shopItemDB.id,
        name = shopItemDB.name,
        count = shopItemDB.count,
        enable = shopItemDB.enable
    )

//    fun mapListDbModelToListEntity(list: List<ShopItemDB>): List<ShopItem> {
//        val array = mutableListOf<ShopItem>()
//        for (i in 0..list.size){
//            array.add(mapDbModelToEntity(list[i]))
//        }
//        return array
//    }

    fun mapListDbModelToListEntity(list: List<ShopItemDB>) = list.map {
        mapDbModelToEntity(it)
    }

}