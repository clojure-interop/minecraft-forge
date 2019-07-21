(ns net.minecraft.enchantment.EnchantmentKnockback
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentKnockback]))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentKnockback this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentKnockback this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentKnockback this]
    (-> this (.getMaxLevel))))

