package com.mrflaitx.shopingapp41.domain.entity

data class ShopItem(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = UNEFINED_ID
){
    companion object {
        const val UNEFINED_ID = -1
    }
}
