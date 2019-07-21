(ns net.minecraft.enchantment.EnchantmentFireAspect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentFireAspect]))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentFireAspect this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentFireAspect this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentFireAspect this]
    (-> this (.getMaxLevel))))

