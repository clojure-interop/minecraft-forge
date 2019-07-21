(ns net.minecraft.enchantment.EnchantmentData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentData]))

(defn ->enchantment-data
  "Constructor.

  enchantment-obj - `net.minecraft.enchantment.Enchantment`
  ench-level - `int`"
  (^EnchantmentData [^net.minecraft.enchantment.Enchantment enchantment-obj ^Integer ench-level]
    (new EnchantmentData enchantment-obj ench-level)))

(defn enchantmentobj
  "Instance Constant.

  type: net.minecraft.enchantment.Enchantment"
  (^net.minecraft.enchantment.Enchantment [^EnchantmentData this]
    (-> this .-enchantmentobj)))

(defn enchantment-level
  "Instance Constant.

  type: int"
  (^Integer [^EnchantmentData this]
    (-> this .-enchantmentLevel)))

