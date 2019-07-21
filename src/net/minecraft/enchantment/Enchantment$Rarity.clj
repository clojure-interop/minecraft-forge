(ns net.minecraft.enchantment.Enchantment$Rarity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.enchantment Enchantment$Rarity]))

(def COMMON
  "Enum Constant.

  type: net.minecraft.enchantment.Enchantment$Rarity"
  Enchantment$Rarity/COMMON)

(def UNCOMMON
  "Enum Constant.

  type: net.minecraft.enchantment.Enchantment$Rarity"
  Enchantment$Rarity/UNCOMMON)

(def RARE
  "Enum Constant.

  type: net.minecraft.enchantment.Enchantment$Rarity"
  Enchantment$Rarity/RARE)

(def VERY_RARE
  "Enum Constant.

  type: net.minecraft.enchantment.Enchantment$Rarity"
  Enchantment$Rarity/VERY_RARE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Enchantment.Rarity c : Enchantment.Rarity.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.enchantment.Enchantment$Rarity[]`"
  ([]
    (Enchantment$Rarity/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.enchantment.Enchantment$Rarity`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.enchantment.Enchantment$Rarity [^java.lang.String name]
    (Enchantment$Rarity/valueOf name)))

(defn get-weight
  "returns: `int`"
  (^Integer [^Enchantment$Rarity this]
    (-> this (.getWeight))))

