(ns net.minecraft.enchantment.EnchantmentArrowFire
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentArrowFire]))

(defn ->enchantment-arrow-fire
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentArrowFire [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentArrowFire rarity-in slots)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentArrowFire this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentArrowFire this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentArrowFire this]
    (-> this (.getMaxLevel))))

