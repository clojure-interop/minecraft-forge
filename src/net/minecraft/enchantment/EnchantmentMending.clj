(ns net.minecraft.enchantment.EnchantmentMending
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentMending]))

(defn ->enchantment-mending
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentMending [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentMending rarity-in slots)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentMending this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentMending this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn treasure-enchantment?
  "returns: `boolean`"
  (^Boolean [^EnchantmentMending this]
    (-> this (.isTreasureEnchantment))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentMending this]
    (-> this (.getMaxLevel))))

