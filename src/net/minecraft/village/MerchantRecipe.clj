(ns net.minecraft.village.MerchantRecipe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.village MerchantRecipe]))

(defn ->merchant-recipe
  "Constructor.

  buy-1 - `net.minecraft.item.ItemStack`
  buy-2 - `net.minecraft.item.ItemStack`
  sell - `net.minecraft.item.ItemStack`
  tool-uses-in - `int`
  max-trade-uses-in - `int`"
  (^MerchantRecipe [^net.minecraft.item.ItemStack buy-1 ^net.minecraft.item.ItemStack buy-2 ^net.minecraft.item.ItemStack sell ^Integer tool-uses-in ^Integer max-trade-uses-in]
    (new MerchantRecipe buy-1 buy-2 sell tool-uses-in max-trade-uses-in))
  (^MerchantRecipe [^net.minecraft.item.ItemStack buy-1 ^net.minecraft.item.ItemStack buy-2 ^net.minecraft.item.ItemStack sell]
    (new MerchantRecipe buy-1 buy-2 sell))
  (^MerchantRecipe [^net.minecraft.item.ItemStack buy-1 ^net.minecraft.item.ItemStack sell]
    (new MerchantRecipe buy-1 sell))
  (^MerchantRecipe [^net.minecraft.nbt.NBTTagCompound tag-compound]
    (new MerchantRecipe tag-compound)))

(defn get-max-trade-uses
  "returns: `int`"
  (^Integer [^MerchantRecipe this]
    (-> this (.getMaxTradeUses))))

(defn get-item-to-buy
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^MerchantRecipe this]
    (-> this (.getItemToBuy))))

(defn compensate-tool-uses
  ""
  ([^MerchantRecipe this]
    (-> this (.compensateToolUses))))

(defn get-item-to-sell
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^MerchantRecipe this]
    (-> this (.getItemToSell))))

(defn read-from-tags
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^MerchantRecipe this ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.readFromTags tag-compound))))

(defn get-tool-uses
  "returns: `int`"
  (^Integer [^MerchantRecipe this]
    (-> this (.getToolUses))))

(defn recipe-disabled?
  "returns: `boolean`"
  (^Boolean [^MerchantRecipe this]
    (-> this (.isRecipeDisabled))))

(defn get-second-item-to-buy
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^MerchantRecipe this]
    (-> this (.getSecondItemToBuy))))

(defn has-second-item-to-buy?
  "returns: `boolean`"
  (^Boolean [^MerchantRecipe this]
    (-> this (.hasSecondItemToBuy))))

(defn get-rewards-exp?
  "returns: `boolean`"
  (^Boolean [^MerchantRecipe this]
    (-> this (.getRewardsExp))))

(defn increase-max-trade-uses
  "increment - `int`"
  ([^MerchantRecipe this ^Integer increment]
    (-> this (.increaseMaxTradeUses increment))))

(defn increment-tool-uses
  ""
  ([^MerchantRecipe this]
    (-> this (.incrementToolUses))))

(defn write-to-tags
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^MerchantRecipe this]
    (-> this (.writeToTags))))

