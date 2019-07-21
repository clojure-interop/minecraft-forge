(ns net.minecraft.enchantment.EnchantmentBindingCurse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentBindingCurse]))

(defn ->enchantment-binding-curse
  "Constructor.

  p-i-47254-1 - `net.minecraft.enchantment.Enchantment$Rarity`
  p-i-47254-2 - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentBindingCurse [^net.minecraft.enchantment.Enchantment$Rarity p-i-47254-1 ^net.minecraft.inventory.EntityEquipmentSlot p-i-47254-2]
    (new EnchantmentBindingCurse p-i-47254-1 p-i-47254-2)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentBindingCurse this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentBindingCurse this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentBindingCurse this]
    (-> this (.getMaxLevel))))

(defn treasure-enchantment?
  "returns: `boolean`"
  (^Boolean [^EnchantmentBindingCurse this]
    (-> this (.isTreasureEnchantment))))

(defn curse?
  "returns: `boolean`"
  (^Boolean [^EnchantmentBindingCurse this]
    (-> this (.isCurse))))

