(ns net.minecraft.enchantment.EnchantmentLootBonus
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentLootBonus]))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentLootBonus this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentLootBonus this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentLootBonus this]
    (-> this (.getMaxLevel))))

(defn can-apply-together?
  "ench - `net.minecraft.enchantment.Enchantment`

  returns: `boolean`"
  (^Boolean [^EnchantmentLootBonus this ^net.minecraft.enchantment.Enchantment ench]
    (-> this (.canApplyTogether ench))))

