(ns net.minecraft.enchantment.EnchantmentThorns
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentThorns]))

(defn ->enchantment-thorns
  "Constructor.

  rarity-in - `net.minecraft.enchantment.Enchantment$Rarity`
  slots - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^EnchantmentThorns [^net.minecraft.enchantment.Enchantment$Rarity rarity-in ^net.minecraft.inventory.EntityEquipmentSlot slots]
    (new EnchantmentThorns rarity-in slots)))

(defn *should-hit?
  "level - `int`
  rnd - `java.util.Random`

  returns: `boolean`"
  (^Boolean [^Integer level ^java.util.Random rnd]
    (EnchantmentThorns/shouldHit level rnd)))

(defn *get-damage
  "level - `int`
  rnd - `java.util.Random`

  returns: `int`"
  (^Integer [^Integer level ^java.util.Random rnd]
    (EnchantmentThorns/getDamage level rnd)))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentThorns this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^EnchantmentThorns this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^EnchantmentThorns this]
    (-> this (.getMaxLevel))))

(defn can-apply?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EnchantmentThorns this ^net.minecraft.item.ItemStack stack]
    (-> this (.canApply stack))))

(defn on-user-hurt
  "user - `net.minecraft.entity.EntityLivingBase`
  attacker - `net.minecraft.entity.Entity`
  level - `int`"
  ([^EnchantmentThorns this ^net.minecraft.entity.EntityLivingBase user ^net.minecraft.entity.Entity attacker ^Integer level]
    (-> this (.onUserHurt user attacker level))))

