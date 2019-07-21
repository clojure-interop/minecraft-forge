(ns net.minecraft.entity.passive.EntityVillager$ListItemForEmeralds
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityVillager$ListItemForEmeralds]))

(defn ->list-item-for-emeralds
  "Constructor.

  par-1-item - `net.minecraft.item.Item`
  price-info - `net.minecraft.entity.passive.EntityVillager$PriceInfo`"
  (^EntityVillager$ListItemForEmeralds [^net.minecraft.item.Item par-1-item ^net.minecraft.entity.passive.EntityVillager$PriceInfo price-info]
    (new EntityVillager$ListItemForEmeralds par-1-item price-info)))

(defn item-to-buy
  "Instance Field.

  type: net.minecraft.item.ItemStack"
  (^net.minecraft.item.ItemStack [^EntityVillager$ListItemForEmeralds this]
    (-> this .-itemToBuy)))

(defn price-info
  "Instance Field.

  type: net.minecraft.entity.passive.EntityVillager$PriceInfo"
  (^net.minecraft.entity.passive.EntityVillager$PriceInfo [^EntityVillager$ListItemForEmeralds this]
    (-> this .-priceInfo)))

(defn add-merchant-recipe
  "merchant - `net.minecraft.entity.IMerchant`
  recipe-list - `net.minecraft.village.MerchantRecipeList`
  random - `java.util.Random`"
  ([^EntityVillager$ListItemForEmeralds this ^net.minecraft.entity.IMerchant merchant ^net.minecraft.village.MerchantRecipeList recipe-list ^java.util.Random random]
    (-> this (.addMerchantRecipe merchant recipe-list random))))

