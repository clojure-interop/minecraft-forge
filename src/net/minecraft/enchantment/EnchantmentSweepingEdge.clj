(ns net.minecraft.enchantment.EnchantmentSweepingEdge
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentSweepingEdge]))

(defn ->enchantment-sweeping-edge
  "Constructor.

  p-i-47366-1 - `net.minecraft.enchantment.Enchantment$Rarity`
  p-i-47366-2 - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentSweepingEdge [^net.minecraft.enchantment.Enchantment$Rarity p-i-47366-1 ^net.minecraft.inventory.EntityEquipmentSlot p-i-47366-2]
    (new EnchantmentSweepingEdge p-i-47366-1 p-i-47366-2)))

(defn *func-191526-e
  "p-191526-0 - `int`

  returns: `float`"
  (^Float [^Integer p-191526-0]
    (EnchantmentSweepingEdge/func_191526_e p-191526-0)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentSweepingEdge this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentSweepingEdge this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentSweepingEdge this]
    (-> this (.getMaxLevel))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EnchantmentSweepingEdge this]
    (-> this (.getName))))

