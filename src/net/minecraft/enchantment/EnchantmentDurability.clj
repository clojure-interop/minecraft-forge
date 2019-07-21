(ns net.minecraft.enchantment.EnchantmentDurability
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentDurability]))

(defn *negate-damage
  "p-92097-0 - `net.minecraft.item.ItemStack`
  p-92097-1 - `int`
  p-92097-2 - `java.util.Random`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack p-92097-0 ^Integer p-92097-1 ^java.util.Random p-92097-2]
    (EnchantmentDurability/negateDamage p-92097-0 p-92097-1 p-92097-2)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentDurability this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentDurability this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentDurability this]
    (-> this (.getMaxLevel))))

(defn can-apply?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EnchantmentDurability this ^net.minecraft.item.ItemStack stack]
    (-> this (.canApply stack))))

