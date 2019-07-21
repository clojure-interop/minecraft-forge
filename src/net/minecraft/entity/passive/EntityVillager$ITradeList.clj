(ns net.minecraft.entity.passive.EntityVillager$ITradeList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityVillager$ITradeList]))

(defn add-merchant-recipe
  "merchant - `net.minecraft.entity.IMerchant`
  recipe-list - `net.minecraft.village.MerchantRecipeList`
  random - `java.util.Random`"
  ([^EntityVillager$ITradeList this ^net.minecraft.entity.IMerchant merchant ^net.minecraft.village.MerchantRecipeList recipe-list ^java.util.Random random]
    (-> this (.addMerchantRecipe merchant recipe-list random))))

