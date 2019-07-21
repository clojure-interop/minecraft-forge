(ns net.minecraft.enchantment.EnchantmentWaterWorker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentWaterWorker]))

(defn ->enchantment-water-worker
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentWaterWorker [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentWaterWorker rarity-in slots)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentWaterWorker this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentWaterWorker this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentWaterWorker this]
    (-> this (.getMaxLevel))))

