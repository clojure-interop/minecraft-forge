(ns net.minecraft.enchantment.EnchantmentDamage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentDamage]))

(defn ->enchantment-damage
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  damage-type-in - `int`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentDamage [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^Integer damage-type-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentDamage rarity-in damage-type-in slots)))

(defn damage-type
  "Instance Constant.

  type: int"
  (^Integer [^EnchantmentDamage this]
    (-> this .-damageType)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentDamage this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentDamage this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentDamage this]
    (-> this (.getMaxLevel))))

(defn calc-damage-by-creature
  "level - `int`
  creature-type - `net.minecraft.entity.EnumCreatureAttribute`

  returns: `float`"
  (^Float [^EnchantmentDamage this ^Integer level ^net.minecraft.entity.EnumCreatureAttribute creature-type]
    (-> this (.calcDamageByCreature level creature-type))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EnchantmentDamage this]
    (-> this (.getName))))

(defn can-apply-together?
  "ench - `net.minecraft.enchantment.Enchantment`

  returns: `boolean`"
  (^Boolean [^EnchantmentDamage this ^net.minecraft.enchantment.Enchantment ench]
    (-> this (.canApplyTogether ench))))

(defn can-apply?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EnchantmentDamage this ^net.minecraft.item.ItemStack stack]
    (-> this (.canApply stack))))

(defn on-entity-damaged
  "user - `net.minecraft.entity.EntityLivingBase`
  target - `net.minecraft.entity.Entity`
  level - `int`"
  ([^EnchantmentDamage this ^net.minecraft.entity.EntityLivingBase user ^net.minecraft.entity.Entity target ^Integer level]
    (-> this (.onEntityDamaged user target level))))

