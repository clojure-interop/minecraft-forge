(ns net.minecraft.item.EnumDyeColor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item EnumDyeColor]))

(def WHITE
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/WHITE)

(def ORANGE
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/ORANGE)

(def MAGENTA
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/MAGENTA)

(def LIGHT_BLUE
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/LIGHT_BLUE)

(def YELLOW
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/YELLOW)

(def LIME
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/LIME)

(def PINK
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/PINK)

(def GRAY
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/GRAY)

(def SILVER
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/SILVER)

(def CYAN
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/CYAN)

(def PURPLE
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/PURPLE)

(def BLUE
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/BLUE)

(def BROWN
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/BROWN)

(def GREEN
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/GREEN)

(def RED
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/RED)

(def BLACK
  "Enum Constant.

  type: net.minecraft.item.EnumDyeColor"
  EnumDyeColor/BLACK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumDyeColor c : EnumDyeColor.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.item.EnumDyeColor[]`"
  ([]
    (EnumDyeColor/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.item.EnumDyeColor`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.item.EnumDyeColor [^java.lang.String name]
    (EnumDyeColor/valueOf name)))

(defn *by-dye-damage
  "damage - `int`

  returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^Integer damage]
    (EnumDyeColor/byDyeDamage damage)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^Integer meta]
    (EnumDyeColor/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^EnumDyeColor this]
    (-> this (.getMetadata))))

(defn get-dye-damage
  "returns: `int`"
  (^Integer [^EnumDyeColor this]
    (-> this (.getDyeDamage))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumDyeColor this]
    (-> this (.getUnlocalizedName))))

(defn get-map-color
  "returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^EnumDyeColor this]
    (-> this (.getMapColor))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumDyeColor this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumDyeColor this]
    (-> this (.getName))))

