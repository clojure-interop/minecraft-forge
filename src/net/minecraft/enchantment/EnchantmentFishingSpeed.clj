(ns net.minecraft.enchantment.EnchantmentFishingSpeed
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentFishingSpeed]))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentFishingSpeed this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentFishingSpeed this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentFishingSpeed this]
    (-> this (.getMaxLevel))))

