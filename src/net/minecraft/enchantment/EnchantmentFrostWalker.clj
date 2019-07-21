(ns net.minecraft.enchantment.EnchantmentFrostWalker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentFrostWalker]))

(defn ->enchantment-frost-walker
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentFrostWalker [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentFrostWalker rarity-in slots)))

(defn *freeze-nearby
  "living - `net.minecraft.entity.EntityLivingBase`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  level - `int`"
  ([^net.minecraft.entity.EntityLivingBase living ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Integer level]
    (EnchantmentFrostWalker/freezeNearby living world-in pos level)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentFrostWalker this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentFrostWalker this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn treasure-enchantment?
  "returns: `boolean`"
  (^Boolean [^EnchantmentFrostWalker this]
    (-> this (.isTreasureEnchantment))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentFrostWalker this]
    (-> this (.getMaxLevel))))

(defn can-apply-together?
  "ench - `net.minecraft.enchantment.Enchantment`

  returns: `boolean`"
  (^Boolean [^EnchantmentFrostWalker this ^net.minecraft.enchantment.Enchantment ench]
    (-> this (.canApplyTogether ench))))

