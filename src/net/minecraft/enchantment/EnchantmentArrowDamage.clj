(ns net.minecraft.enchantment.EnchantmentArrowDamage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentArrowDamage]))

(defn ->enchantment-arrow-damage
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentArrowDamage [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentArrowDamage rarity-in slots)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentArrowDamage this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentArrowDamage this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentArrowDamage this]
    (-> this (.getMaxLevel))))

