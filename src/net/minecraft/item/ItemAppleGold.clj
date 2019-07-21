(ns net.minecraft.item.ItemAppleGold
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemAppleGold]))

(defn ->item-apple-gold
  "Constructor.

  amount - `int`
  saturation - `float`
  is-wolf-food - `boolean`"
  (^ItemAppleGold [^Integer amount ^Float saturation ^Boolean is-wolf-food]
    (new ItemAppleGold amount saturation is-wolf-food)))

(defn has-effect?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemAppleGold this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasEffect stack))))

(defn get-rarity
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumRarity`"
  (^net.minecraft.item.EnumRarity [^ItemAppleGold this ^net.minecraft.item.ItemStack stack]
    (-> this (.getRarity stack))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemAppleGold this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

