(ns net.minecraft.enchantment.Enchantment
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment Enchantment]))

(def *-registry
  "Static Constant.

  type: net.minecraft.util.registry.RegistryNamespaced<net.minecraft.util.ResourceLocation,net.minecraft.enchantment.Enchantment>"
  Enchantment/REGISTRY)

(defn type
  "Instance Field.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  (^net.minecraft.enchantment.EnumEnchantmentType [^Enchantment this]
    (-> this .-type)))

(defn *get-enchantment-by-id
  "id - `int`

  returns: `net.minecraft.enchantment.Enchantment`"
  (^net.minecraft.enchantment.Enchantment [^Integer id]
    (Enchantment/getEnchantmentByID id)))

(defn *get-enchantment-id
  "enchantment-in - `net.minecraft.enchantment.Enchantment`

  returns: `int`"
  (^Integer [^net.minecraft.enchantment.Enchantment enchantment-in]
    (Enchantment/getEnchantmentID enchantment-in)))

(defn *get-enchantment-by-location
  "location - `java.lang.String`

  returns: `net.minecraft.enchantment.Enchantment`"
  (^net.minecraft.enchantment.Enchantment [^java.lang.String location]
    (Enchantment/getEnchantmentByLocation location)))

(defn *register-enchantments
  ""
  ([]
    (Enchantment/registerEnchantments )))

(defn get-translated-name
  "level - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Enchantment this ^Integer level]
    (-> this (.getTranslatedName level))))

(defn can-apply-at-enchanting-table?
  "This applies specifically to applying at the enchanting table. The other method canApply(ItemStack)
   applies for all possible enchantments.

  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^Enchantment this ^net.minecraft.item.ItemStack stack]
    (-> this (.canApplyAtEnchantingTable stack))))

(defn get-min-level
  "returns: `int`"
  (^Integer [^Enchantment this]
    (-> this (.getMinLevel))))

(defn set-name
  "ench-name - `java.lang.String`

  returns: `net.minecraft.enchantment.Enchantment`"
  (^net.minecraft.enchantment.Enchantment [^Enchantment this ^java.lang.String ench-name]
    (-> this (.setName ench-name))))

(defn calc-damage-by-creature
  "level - `int`
  creature-type - `net.minecraft.entity.EnumCreatureAttribute`

  returns: `float`"
  (^Float [^Enchantment this ^Integer level ^net.minecraft.entity.EnumCreatureAttribute creature-type]
    (-> this (.calcDamageByCreature level creature-type))))

(defn curse?
  "returns: `boolean`"
  (^Boolean [^Enchantment this]
    (-> this (.isCurse))))

(defn get-max-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^Enchantment this ^Integer enchantment-level]
    (-> this (.getMaxEnchantability enchantment-level))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Enchantment this]
    (-> this (.getName))))

(defn get-max-level
  "returns: `int`"
  (^Integer [^Enchantment this]
    (-> this (.getMaxLevel))))

(defn func-191560-c
  "p-191560-1 - `net.minecraft.enchantment.Enchantment`

  returns: `boolean`"
  (^Boolean [^Enchantment this ^net.minecraft.enchantment.Enchantment p-191560-1]
    (-> this (.func_191560_c p-191560-1))))

(defn get-entity-equipment
  "entity-in - `net.minecraft.entity.EntityLivingBase`

  returns: `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^Enchantment this ^net.minecraft.entity.EntityLivingBase entity-in]
    (-> this (.getEntityEquipment entity-in))))

(defn get-rarity
  "returns: `net.minecraft.enchantment.Enchantment$Rarity`"
  (^net.minecraft.enchantment.Enchantment$Rarity [^Enchantment this]
    (-> this (.getRarity))))

(defn on-user-hurt
  "user - `net.minecraft.entity.EntityLivingBase`
  attacker - `net.minecraft.entity.Entity`
  level - `int`"
  ([^Enchantment this ^net.minecraft.entity.EntityLivingBase user ^net.minecraft.entity.Entity attacker ^Integer level]
    (-> this (.onUserHurt user attacker level))))

(defn can-apply?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^Enchantment this ^net.minecraft.item.ItemStack stack]
    (-> this (.canApply stack))))

(defn allowed-on-books?
  "Is this enchantment allowed to be enchanted on books via Enchantment Table

  returns: false to disable the vanilla feature - `boolean`"
  (^Boolean [^Enchantment this]
    (-> this (.isAllowedOnBooks))))

(defn get-min-enchantability
  "enchantment-level - `int`

  returns: `int`"
  (^Integer [^Enchantment this ^Integer enchantment-level]
    (-> this (.getMinEnchantability enchantment-level))))

(defn calc-modifier-damage
  "level - `int`
  source - `net.minecraft.util.DamageSource`

  returns: `int`"
  (^Integer [^Enchantment this ^Integer level ^net.minecraft.util.DamageSource source]
    (-> this (.calcModifierDamage level source))))

(defn treasure-enchantment?
  "returns: `boolean`"
  (^Boolean [^Enchantment this]
    (-> this (.isTreasureEnchantment))))

(defn on-entity-damaged
  "user - `net.minecraft.entity.EntityLivingBase`
  target - `net.minecraft.entity.Entity`
  level - `int`"
  ([^Enchantment this ^net.minecraft.entity.EntityLivingBase user ^net.minecraft.entity.Entity target ^Integer level]
    (-> this (.onEntityDamaged user target level))))

