(ns net.minecraft.enchantment.EnumEnchantmentType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment EnumEnchantmentType]))

(def ALL
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/ALL)

(def ARMOR
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/ARMOR)

(def ARMOR_FEET
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/ARMOR_FEET)

(def ARMOR_LEGS
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/ARMOR_LEGS)

(def ARMOR_CHEST
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/ARMOR_CHEST)

(def ARMOR_HEAD
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/ARMOR_HEAD)

(def WEAPON
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/WEAPON)

(def DIGGER
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/DIGGER)

(def FISHING_ROD
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/FISHING_ROD)

(def BREAKABLE
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/BREAKABLE)

(def BOW
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/BOW)

(def WEARABLE
  "Enum Constant.

  type: net.minecraft.enchantment.EnumEnchantmentType"
  EnumEnchantmentType/WEARABLE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumEnchantmentType c : EnumEnchantmentType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.enchantment.EnumEnchantmentType[]`"
  ([]
    (EnumEnchantmentType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.enchantment.EnumEnchantmentType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.enchantment.EnumEnchantmentType [^java.lang.String name]
    (EnumEnchantmentType/valueOf name)))

(defn can-enchant-item?
  "item-in - `net.minecraft.item.Item`

  returns: `boolean`"
  (^Boolean [^EnumEnchantmentType this ^net.minecraft.item.Item item-in]
    (-> this (.canEnchantItem item-in))))

