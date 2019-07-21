(ns net.minecraft.entity.passive.HorseArmorType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive HorseArmorType]))

(def NONE
  "Enum Constant.

  type: net.minecraft.entity.passive.HorseArmorType"
  HorseArmorType/NONE)

(def IRON
  "Enum Constant.

  type: net.minecraft.entity.passive.HorseArmorType"
  HorseArmorType/IRON)

(def GOLD
  "Enum Constant.

  type: net.minecraft.entity.passive.HorseArmorType"
  HorseArmorType/GOLD)

(def DIAMOND
  "Enum Constant.

  type: net.minecraft.entity.passive.HorseArmorType"
  HorseArmorType/DIAMOND)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (HorseArmorType c : HorseArmorType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.passive.HorseArmorType[]`"
  ([]
    (HorseArmorType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.passive.HorseArmorType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.passive.HorseArmorType [^java.lang.String name]
    (HorseArmorType/valueOf name)))

(defn *get-by-ordinal
  "ordinal - `int`

  returns: `net.minecraft.entity.passive.HorseArmorType`"
  (^net.minecraft.entity.passive.HorseArmorType [^Integer ordinal]
    (HorseArmorType/getByOrdinal ordinal)))

(defn *get-by-item-stack
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.entity.passive.HorseArmorType`"
  (^net.minecraft.entity.passive.HorseArmorType [^net.minecraft.item.ItemStack stack]
    (HorseArmorType/getByItemStack stack)))

(defn *get-by-item
  "item-in - `net.minecraft.item.Item`

  returns: `net.minecraft.entity.passive.HorseArmorType`"
  (^net.minecraft.entity.passive.HorseArmorType [^net.minecraft.item.Item item-in]
    (HorseArmorType/getByItem item-in)))

(defn *horse-armor?
  "item-in - `net.minecraft.item.Item`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.Item item-in]
    (HorseArmorType/isHorseArmor item-in)))

(defn get-ordinal
  "returns: `int`"
  (^Integer [^HorseArmorType this]
    (-> this (.getOrdinal))))

(defn get-hash
  "returns: `java.lang.String`"
  (^java.lang.String [^HorseArmorType this]
    (-> this (.getHash))))

(defn get-protection
  "returns: `int`"
  (^Integer [^HorseArmorType this]
    (-> this (.getProtection))))

(defn get-texture-name
  "returns: `java.lang.String`"
  (^java.lang.String [^HorseArmorType this]
    (-> this (.getTextureName))))

