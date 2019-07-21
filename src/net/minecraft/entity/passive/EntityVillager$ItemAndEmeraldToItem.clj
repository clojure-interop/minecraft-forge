(ns net.minecraft.entity.passive.EntityVillager$ItemAndEmeraldToItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityVillager$ItemAndEmeraldToItem]))

(defn ->item-and-emerald-to-item
  "Constructor.

  p-i-45813-1 - `net.minecraft.item.Item`
  p-i-45813-2 - `net.minecraft.entity.passive.EntityVillager$PriceInfo`
  p-i-45813-3 - `net.minecraft.item.Item`
  p-i-45813-4 - `net.minecraft.entity.passive.EntityVillager$PriceInfo`"
  (^EntityVillager$ItemAndEmeraldToItem [^net.minecraft.item.Item p-i-45813-1 ^net.minecraft.entity.passive.EntityVillager$PriceInfo p-i-45813-2 ^net.minecraft.item.Item p-i-45813-3 ^net.minecraft.entity.passive.EntityVillager$PriceInfo p-i-45813-4]
    (new EntityVillager$ItemAndEmeraldToItem p-i-45813-1 p-i-45813-2 p-i-45813-3 p-i-45813-4)))

(defn buying-item-stack
  "Instance Field.

  type: net.minecraft.item.ItemStack"
  (^net.minecraft.item.ItemStack [^EntityVillager$ItemAndEmeraldToItem this]
    (-> this .-buyingItemStack)))

(defn buying-price-info
  "Instance Field.

  type: net.minecraft.entity.passive.EntityVillager$PriceInfo"
  (^net.minecraft.entity.passive.EntityVillager$PriceInfo [^EntityVillager$ItemAndEmeraldToItem this]
    (-> this .-buyingPriceInfo)))

(defn selling-itemstack
  "Instance Field.

  type: net.minecraft.item.ItemStack"
  (^net.minecraft.item.ItemStack [^EntityVillager$ItemAndEmeraldToItem this]
    (-> this .-sellingItemstack)))

(defn selling-price-info
  "Instance Field.

  type: net.minecraft.entity.passive.EntityVillager$PriceInfo"
  (^net.minecraft.entity.passive.EntityVillager$PriceInfo [^EntityVillager$ItemAndEmeraldToItem this]
    (-> this .-sellingPriceInfo)))

(defn add-merchant-recipe
  "merchant - `net.minecraft.entity.IMerchant`
  recipe-list - `net.minecraft.village.MerchantRecipeList`
  random - `java.util.Random`"
  ([^EntityVillager$ItemAndEmeraldToItem this ^net.minecraft.entity.IMerchant merchant ^net.minecraft.village.MerchantRecipeList recipe-list ^java.util.Random random]
    (-> this (.addMerchantRecipe merchant recipe-list random))))

