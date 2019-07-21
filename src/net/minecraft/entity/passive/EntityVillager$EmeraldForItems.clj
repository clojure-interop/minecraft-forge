(ns net.minecraft.entity.passive.EntityVillager$EmeraldForItems
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityVillager$EmeraldForItems]))

(defn ->emerald-for-items
  "Constructor.

  item-in - `net.minecraft.item.Item`
  price-in - `net.minecraft.entity.passive.EntityVillager$PriceInfo`"
  (^EntityVillager$EmeraldForItems [^net.minecraft.item.Item item-in ^net.minecraft.entity.passive.EntityVillager$PriceInfo price-in]
    (new EntityVillager$EmeraldForItems item-in price-in)))

(defn buying-item
  "Instance Field.

  type: net.minecraft.item.Item"
  (^net.minecraft.item.Item [^EntityVillager$EmeraldForItems this]
    (-> this .-buyingItem)))

(defn price
  "Instance Field.

  type: net.minecraft.entity.passive.EntityVillager$PriceInfo"
  (^net.minecraft.entity.passive.EntityVillager$PriceInfo [^EntityVillager$EmeraldForItems this]
    (-> this .-price)))

(defn add-merchant-recipe
  "merchant - `net.minecraft.entity.IMerchant`
  recipe-list - `net.minecraft.village.MerchantRecipeList`
  random - `java.util.Random`"
  ([^EntityVillager$EmeraldForItems this ^net.minecraft.entity.IMerchant merchant ^net.minecraft.village.MerchantRecipeList recipe-list ^java.util.Random random]
    (-> this (.addMerchantRecipe merchant recipe-list random))))

