(ns net.minecraft.enchantment.EnchantmentArrowInfinite
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentArrowInfinite]))

(defn ->enchantment-arrow-infinite
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentArrowInfinite [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentArrowInfinite rarity-in slots)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentArrowInfinite this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentArrowInfinite this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentArrowInfinite this]
    (-> this (.getMaxLevel))))

(defn can-apply-together?
  "ench - `net.minecraft.enchantment.Enchantment`

  returns: `boolean`"
  (^Boolean [^EnchantmentArrowInfinite this ^net.minecraft.enchantment.Enchantment ench]
    (-> this (.canApplyTogether ench))))

