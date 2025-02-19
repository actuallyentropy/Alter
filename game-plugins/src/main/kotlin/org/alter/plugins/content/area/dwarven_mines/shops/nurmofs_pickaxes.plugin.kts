package org.alter.plugins.content.area.dwarven_mines.shops

import org.alter.plugins.content.mechanics.shops.CoinCurrency

create_shop("Nurmof's Pickaxe Shop.", CoinCurrency(), purchasePolicy = PurchasePolicy.BUY_STOCK) {
    items[0] = ShopItem(Items.BRONZE_PICKAXE, 6)
    items[1] = ShopItem(Items.IRON_PICKAXE, 5)
    items[2] = ShopItem(Items.STEEL_PICKAXE, 4)
    items[3] = ShopItem(Items.MITHRIL_PICKAXE, 3)
    items[4] = ShopItem(Items.ADAMANT_PICKAXE, 2)
    items[5] = ShopItem(Items.RUNE_PICKAXE, 1)
}