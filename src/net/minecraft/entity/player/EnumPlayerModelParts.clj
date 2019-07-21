(ns net.minecraft.entity.player.EnumPlayerModelParts
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.player EnumPlayerModelParts]))

(def CAPE
  "Enum Constant.

  type: net.minecraft.entity.player.EnumPlayerModelParts"
  EnumPlayerModelParts/CAPE)

(def JACKET
  "Enum Constant.

  type: net.minecraft.entity.player.EnumPlayerModelParts"
  EnumPlayerModelParts/JACKET)

(def LEFT_SLEEVE
  "Enum Constant.

  type: net.minecraft.entity.player.EnumPlayerModelParts"
  EnumPlayerModelParts/LEFT_SLEEVE)

(def RIGHT_SLEEVE
  "Enum Constant.

  type: net.minecraft.entity.player.EnumPlayerModelParts"
  EnumPlayerModelParts/RIGHT_SLEEVE)

(def LEFT_PANTS_LEG
  "Enum Constant.

  type: net.minecraft.entity.player.EnumPlayerModelParts"
  EnumPlayerModelParts/LEFT_PANTS_LEG)

(def RIGHT_PANTS_LEG
  "Enum Constant.

  type: net.minecraft.entity.player.EnumPlayerModelParts"
  EnumPlayerModelParts/RIGHT_PANTS_LEG)

(def HAT
  "Enum Constant.

  type: net.minecraft.entity.player.EnumPlayerModelParts"
  EnumPlayerModelParts/HAT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumPlayerModelParts c : EnumPlayerModelParts.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.player.EnumPlayerModelParts[]`"
  ([]
    (EnumPlayerModelParts/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.player.EnumPlayerModelParts`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.player.EnumPlayerModelParts [^java.lang.String name]
    (EnumPlayerModelParts/valueOf name)))

(defn get-part-mask
  "returns: `int`"
  (^Integer [^EnumPlayerModelParts this]
    (-> this (.getPartMask))))

(defn get-part-id
  "returns: `int`"
  (^Integer [^EnumPlayerModelParts this]
    (-> this (.getPartId))))

(defn get-part-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumPlayerModelParts this]
    (-> this (.getPartName))))

(defn get-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^EnumPlayerModelParts this]
    (-> this (.getName))))

