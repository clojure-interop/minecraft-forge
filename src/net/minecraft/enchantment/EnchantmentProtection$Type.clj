(ns net.minecraft.enchantment.EnchantmentProtection$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnchantmentProtection$Type]))

(def ALL
  "Enum Constant.

  type: net.minecraft.enchantment.EnchantmentProtection$Type"
  EnchantmentProtection$Type/ALL)

(def FIRE
  "Enum Constant.

  type: net.minecraft.enchantment.EnchantmentProtection$Type"
  EnchantmentProtection$Type/FIRE)

(def FALL
  "Enum Constant.

  type: net.minecraft.enchantment.EnchantmentProtection$Type"
  EnchantmentProtection$Type/FALL)

(def EXPLOSION
  "Enum Constant.

  type: net.minecraft.enchantment.EnchantmentProtection$Type"
  EnchantmentProtection$Type/EXPLOSION)

(def PROJECTILE
  "Enum Constant.

  type: net.minecraft.enchantment.EnchantmentProtection$Type"
  EnchantmentProtection$Type/PROJECTILE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnchantmentProtection.Type c : EnchantmentProtection.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.enchantment.EnchantmentProtection$Type[]`"
  ([]
    (EnchantmentProtection$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.enchantment.EnchantmentProtection$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.enchantment.EnchantmentProtection$Type [^java.lang.String name]
    (EnchantmentProtection$Type/valueOf name)))

(defn get-type-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EnchantmentProtection$Type this]
    (-> this (.getTypeName))))

(defn get-minimal-enchantability
  "returns: `int`"
  (^Integer [^EnchantmentProtection$Type this]
    (-> this (.getMinimalEnchantability))))

(defn get-enchant-increase-per-level
  "returns: `int`"
  (^Integer [^EnchantmentProtection$Type this]
    (-> this (.getEnchantIncreasePerLevel))))

