(ns net.minecraft.enchantment.EnchantmentDigging
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentDigging]))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentDigging this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentDigging this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentDigging this]
    (-> this (.getMaxLevel))))

(defn can-apply?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EnchantmentDigging this ^net.minecraft.item.ItemStack stack]
    (-> this (.canApply stack))))

