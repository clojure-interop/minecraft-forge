(ns net.minecraft.entity.passive.EntityVillager$ListEnchantedBookForEmeralds
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityVillager$ListEnchantedBookForEmeralds]))

(defn ->list-enchanted-book-for-emeralds
  "Constructor."
  (^EntityVillager$ListEnchantedBookForEmeralds []
    (new EntityVillager$ListEnchantedBookForEmeralds )))

(defn add-merchant-recipe
  "merchant - `net.minecraft.entity.IMerchant`
  recipe-list - `net.minecraft.village.MerchantRecipeList`
  random - `java.util.Random`"
  ([^EntityVillager$ListEnchantedBookForEmeralds this ^net.minecraft.entity.IMerchant merchant ^net.minecraft.village.MerchantRecipeList recipe-list ^java.util.Random random]
    (-> this (.addMerchantRecipe merchant recipe-list random))))

