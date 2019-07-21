(ns net.minecraft.enchantment.EnchantmentProtection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentProtection]))

(defn ->enchantment-protection
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  protection-type-in - `net.minecraft.enchantment.EnchantmentProtection$Type`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentProtection [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^net.minecraft.enchantment.EnchantmentProtection$Type protection-type-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentProtection rarity-in protection-type-in slots)))

(defn protection-type
  "Instance Constant.

  type: net.minecraft.enchantment.EnchantmentProtection$Type"
  (^net.minecraft.enchantment.EnchantmentProtection$Type [^EnchantmentProtection this]
    (-> this .-protectionType)))

(defn *get-fire-time-for-entity
  "p-92093-0 - `net.minecraft.entity.EntityLivingBase`
  p-92093-1 - `int`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase p-92093-0 ^Integer p-92093-1]
    (EnchantmentProtection/getFireTimeForEntity p-92093-0 p-92093-1)))

(defn *get-blast-damage-reduction
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`
  damage - `double`

  returns: `double`"
  (^Double [^net.minecraft.entity.EntityLivingBase entity-living-base-in ^Double damage]
    (EnchantmentProtection/getBlastDamageReduction entity-living-base-in damage)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentProtection this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentProtection this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentProtection this]
    (-> this (.getMaxLevel))))

(defn calc-modifier-damage
  "level - `int`
  source - `net.minecraft.util.DamageSource`

  returns: `int`"
  (^Integer [^EnchantmentProtection this ^Integer level ^net.minecraft.util.DamageSource source]
    (-> this (.calcModifierDamage level source))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EnchantmentProtection this]
    (-> this (.getName))))

(defn can-apply-together?
  "ench - `net.minecraft.enchantment.Enchantment`

  returns: `boolean`"
  (^Boolean [^EnchantmentProtection this ^net.minecraft.enchantment.Enchantment ench]
    (-> this (.canApplyTogether ench))))

