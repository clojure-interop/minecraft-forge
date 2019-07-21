(ns net.minecraft.enchantment.EnchantmentWaterWalker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentWaterWalker]))

(defn ->enchantment-water-walker
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentWaterWalker [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentWaterWalker rarity-in slots)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentWaterWalker this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentWaterWalker this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentWaterWalker this]
    (-> this (.getMaxLevel))))

(defn can-apply-together?
  "ench - `net.minecraft.enchantment.Enchantment`

  returns: `boolean`"
  (^Boolean [^EnchantmentWaterWalker this ^net.minecraft.enchantment.Enchantment ench]
    (-> this (.canApplyTogether ench))))

