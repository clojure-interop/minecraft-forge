(ns net.minecraft.enchantment.EnchantmentUntouching
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentUntouching]))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentUntouching this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentUntouching this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentUntouching this]
    (-> this (.getMaxLevel))))

(defn can-apply-together?
  "ench - `net.minecraft.enchantment.Enchantment`

  returns: `boolean`"
  (^Boolean [^EnchantmentUntouching this ^net.minecraft.enchantment.Enchantment ench]
    (-> this (.canApplyTogether ench))))

