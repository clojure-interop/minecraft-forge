(ns net.minecraft.enchantment.EnchantmentVanishingCurse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentVanishingCurse]))

(defn ->enchantment-vanishing-curse
  "Constructor.

  p-i-47252-1 - `net.minecraft.enchantment.Enchantment$Rarity`
  p-i-47252-2 - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentVanishingCurse [^net.minecraft.enchantment.Enchantment$Rarity p-i-47252-1 ^net.minecraft.inventory.EntityEquipmentSlot p-i-47252-2]
    (new EnchantmentVanishingCurse p-i-47252-1 p-i-47252-2)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentVanishingCurse this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentVanishingCurse this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentVanishingCurse this]
    (-> this (.getMaxLevel))))

(defn treasure-enchantment?
  "returns: `boolean`"
  (^Boolean [^EnchantmentVanishingCurse this]
    (-> this (.isTreasureEnchantment))))

(defn curse?
  "returns: `boolean`"
  (^Boolean [^EnchantmentVanishingCurse this]
    (-> this (.isCurse))))

