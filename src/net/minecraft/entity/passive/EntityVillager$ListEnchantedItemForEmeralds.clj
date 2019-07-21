(ns net.minecraft.entity.passive.EntityVillager$ListEnchantedItemForEmeralds
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityVillager$ListEnchantedItemForEmeralds]))

(defn ->list-enchanted-item-for-emeralds
  "Constructor.

  p-i-45814-1 - `net.minecraft.item.Item`
  p-i-45814-2 - `net.minecraft.entity.passive.EntityVillager$PriceInfo`"
  (^EntityVillager$ListEnchantedItemForEmeralds [^net.minecraft.item.Item p-i-45814-1 ^net.minecraft.entity.passive.EntityVillager$PriceInfo p-i-45814-2]
    (new EntityVillager$ListEnchantedItemForEmeralds p-i-45814-1 p-i-45814-2)))

(defn enchanted-item-stack
  "Instance Field.

  type: net.minecraft.item.ItemStack"
  (^net.minecraft.item.ItemStack [^EntityVillager$ListEnchantedItemForEmeralds this]
    (-> this .-enchantedItemStack)))

(defn price-info
  "Instance Field.

  type: net.minecraft.entity.passive.EntityVillager$PriceInfo"
  (^net.minecraft.entity.passive.EntityVillager$PriceInfo [^EntityVillager$ListEnchantedItemForEmeralds this]
    (-> this .-priceInfo)))

(defn add-merchant-recipe
  "merchant - `net.minecraft.entity.IMerchant`
  recipe-list - `net.minecraft.village.MerchantRecipeList`
  random - `java.util.Random`"
  ([^EntityVillager$ListEnchantedItemForEmeralds this ^net.minecraft.entity.IMerchant merchant ^net.minecraft.village.MerchantRecipeList recipe-list ^java.util.Random random]
    (-> this (.addMerchantRecipe merchant recipe-list random))))

