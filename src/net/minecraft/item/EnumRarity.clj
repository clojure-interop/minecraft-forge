(ns net.minecraft.item.EnumRarity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item EnumRarity]))

(def COMMON
  "Enum Constant.

  type: net.minecraft.item.EnumRarity"
  EnumRarity/COMMON)

(def UNCOMMON
  "Enum Constant.

  type: net.minecraft.item.EnumRarity"
  EnumRarity/UNCOMMON)

(def RARE
  "Enum Constant.

  type: net.minecraft.item.EnumRarity"
  EnumRarity/RARE)

(def EPIC
  "Enum Constant.

  type: net.minecraft.item.EnumRarity"
  EnumRarity/EPIC)

(defn rarity-color
  "Instance Constant.

  type: net.minecraft.util.text.TextFormatting"
  (^net.minecraft.util.text.TextFormatting [^EnumRarity this]
    (-> this .-rarityColor)))

(defn rarity-name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^EnumRarity this]
    (-> this .-rarityName)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumRarity c : EnumRarity.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.item.EnumRarity[]`"
  ([]
    (EnumRarity/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.item.EnumRarity`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.item.EnumRarity [^java.lang.String name]
    (EnumRarity/valueOf name)))

