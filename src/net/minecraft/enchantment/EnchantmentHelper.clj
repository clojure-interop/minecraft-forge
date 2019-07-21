(ns net.minecraft.enchantment.EnchantmentHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentHelper]))

(defn ->enchantment-helper
  "Constructor."
  (^EnchantmentHelper []
    (new EnchantmentHelper )))

(defn *get-depth-strider-modifier
  "p-185294-0 - `net.minecraft.entity.EntityLivingBase`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase p-185294-0]
    (EnchantmentHelper/getDepthStriderModifier p-185294-0)))

(defn *add-random-enchantment
  "random - `java.util.Random`
  p-77504-1 - `net.minecraft.item.ItemStack`
  p-77504-2 - `int`
  allow-treasure - `boolean`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^java.util.Random random ^net.minecraft.item.ItemStack p-77504-1 ^Integer p-77504-2 ^Boolean allow-treasure]
    (EnchantmentHelper/addRandomEnchantment random p-77504-1 p-77504-2 allow-treasure)))

(defn *has-frost-walker-enchantment?
  "player - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLivingBase player]
    (EnchantmentHelper/hasFrostWalkerEnchantment player)))

(defn *get-modifier-for-creature
  "stack - `net.minecraft.item.ItemStack`
  creature-attribute - `net.minecraft.entity.EnumCreatureAttribute`

  returns: `float`"
  (^Float [^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EnumCreatureAttribute creature-attribute]
    (EnchantmentHelper/getModifierForCreature stack creature-attribute)))

(defn *get-looting-modifier
  "p-185283-0 - `net.minecraft.entity.EntityLivingBase`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase p-185283-0]
    (EnchantmentHelper/getLootingModifier p-185283-0)))

(defn *get-aqua-affinity-modifier?
  "p-185287-0 - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLivingBase p-185287-0]
    (EnchantmentHelper/getAquaAffinityModifier p-185287-0)))

(defn *get-enchantments
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.util.Map<net.minecraft.enchantment.Enchantment,java.lang.Integer>`"
  (^java.util.Map [^net.minecraft.item.ItemStack stack]
    (EnchantmentHelper/getEnchantments stack)))

(defn *func-191527-a
  "p-191527-0 - `net.minecraft.entity.EntityLivingBase`

  returns: `float`"
  (^Float [^net.minecraft.entity.EntityLivingBase p-191527-0]
    (EnchantmentHelper/func_191527_a p-191527-0)))

(defn *get-fire-aspect-modifier
  "player - `net.minecraft.entity.EntityLivingBase`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase player]
    (EnchantmentHelper/getFireAspectModifier player)))

(defn *get-respiration-modifier
  "p-185292-0 - `net.minecraft.entity.EntityLivingBase`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase p-185292-0]
    (EnchantmentHelper/getRespirationModifier p-185292-0)))

(defn *has-binding-curse?
  "p-190938-0 - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack p-190938-0]
    (EnchantmentHelper/hasBindingCurse p-190938-0)))

(defn *get-knockback-modifier
  "player - `net.minecraft.entity.EntityLivingBase`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase player]
    (EnchantmentHelper/getKnockbackModifier player)))

(defn *calc-item-stack-enchantability
  "rand - `java.util.Random`
  enchant-num - `int`
  power - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^java.util.Random rand ^Integer enchant-num ^Integer power ^net.minecraft.item.ItemStack stack]
    (EnchantmentHelper/calcItemStackEnchantability rand enchant-num power stack)))

(defn *get-enchantment-level
  "ench-id - `net.minecraft.enchantment.Enchantment`
  stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.enchantment.Enchantment ench-id ^net.minecraft.item.ItemStack stack]
    (EnchantmentHelper/getEnchantmentLevel ench-id stack)))

(defn *func-191529-b
  "p-191529-0 - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack p-191529-0]
    (EnchantmentHelper/func_191529_b p-191529-0)))

(defn *get-enchantment-modifier-damage
  "stacks - `java.lang.Iterable`
  source - `net.minecraft.util.DamageSource`

  returns: `int`"
  (^Integer [^java.lang.Iterable stacks ^net.minecraft.util.DamageSource source]
    (EnchantmentHelper/getEnchantmentModifierDamage stacks source)))

(defn *build-enchantment-list
  "random-in - `java.util.Random`
  item-stack-in - `net.minecraft.item.ItemStack`
  p-77513-2 - `int`
  allow-treasure - `boolean`

  returns: `java.util.List<net.minecraft.enchantment.EnchantmentData>`"
  (^java.util.List [^java.util.Random random-in ^net.minecraft.item.ItemStack item-stack-in ^Integer p-77513-2 ^Boolean allow-treasure]
    (EnchantmentHelper/buildEnchantmentList random-in item-stack-in p-77513-2 allow-treasure)))

(defn *get-efficiency-modifier
  "p-185293-0 - `net.minecraft.entity.EntityLivingBase`

  returns: `int`"
  (^Integer [^net.minecraft.entity.EntityLivingBase p-185293-0]
    (EnchantmentHelper/getEfficiencyModifier p-185293-0)))

(defn *set-enchantments
  "ench-map - `java.util.Map`
  stack - `net.minecraft.item.ItemStack`"
  ([^java.util.Map ench-map ^net.minecraft.item.ItemStack stack]
    (EnchantmentHelper/setEnchantments ench-map stack)))

(defn *apply-arthropod-enchantments
  "p-151385-0 - `net.minecraft.entity.EntityLivingBase`
  p-151385-1 - `net.minecraft.entity.Entity`"
  ([^net.minecraft.entity.EntityLivingBase p-151385-0 ^net.minecraft.entity.Entity p-151385-1]
    (EnchantmentHelper/applyArthropodEnchantments p-151385-0 p-151385-1)))

(defn *get-max-enchantment-level
  "p-185284-0 - `net.minecraft.enchantment.Enchantment`
  p-185284-1 - `net.minecraft.entity.EntityLivingBase`

  returns: `int`"
  (^Integer [^net.minecraft.enchantment.Enchantment p-185284-0 ^net.minecraft.entity.EntityLivingBase p-185284-1]
    (EnchantmentHelper/getMaxEnchantmentLevel p-185284-0 p-185284-1)))

(defn *get-enchanted-item
  "p-92099-0 - `net.minecraft.enchantment.Enchantment`
  p-92099-1 - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.enchantment.Enchantment p-92099-0 ^net.minecraft.entity.EntityLivingBase p-92099-1]
    (EnchantmentHelper/getEnchantedItem p-92099-0 p-92099-1)))

(defn *has-vanishing-curse?
  "p-190939-0 - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack p-190939-0]
    (EnchantmentHelper/hasVanishingCurse p-190939-0)))

(defn *remove-incompatible
  "p-185282-0 - `java.util.List`
  p-185282-1 - `net.minecraft.enchantment.EnchantmentData`"
  ([^java.util.List p-185282-0 ^net.minecraft.enchantment.EnchantmentData p-185282-1]
    (EnchantmentHelper/removeIncompatible p-185282-0 p-185282-1)))

(defn *apply-thorn-enchantments
  "p-151384-0 - `net.minecraft.entity.EntityLivingBase`
  p-151384-1 - `net.minecraft.entity.Entity`"
  ([^net.minecraft.entity.EntityLivingBase p-151384-0 ^net.minecraft.entity.Entity p-151384-1]
    (EnchantmentHelper/applyThornEnchantments p-151384-0 p-151384-1)))

(defn *func-191528-c
  "p-191528-0 - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack p-191528-0]
    (EnchantmentHelper/func_191528_c p-191528-0)))

(defn *get-enchantment-datas
  "p-185291-0 - `int`
  p-185291-1 - `net.minecraft.item.ItemStack`
  allow-treasure - `boolean`

  returns: `java.util.List<net.minecraft.enchantment.EnchantmentData>`"
  (^java.util.List [^Integer p-185291-0 ^net.minecraft.item.ItemStack p-185291-1 ^Boolean allow-treasure]
    (EnchantmentHelper/getEnchantmentDatas p-185291-0 p-185291-1 allow-treasure)))

