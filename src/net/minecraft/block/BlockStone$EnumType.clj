(ns net.minecraft.block.BlockStone$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStone$EnumType]))

(def STONE
  "Enum Constant.

  type: net.minecraft.block.BlockStone$EnumType"
  BlockStone$EnumType/STONE)

(def GRANITE
  "Enum Constant.

  type: net.minecraft.block.BlockStone$EnumType"
  BlockStone$EnumType/GRANITE)

(def GRANITE_SMOOTH
  "Enum Constant.

  type: net.minecraft.block.BlockStone$EnumType"
  BlockStone$EnumType/GRANITE_SMOOTH)

(def DIORITE
  "Enum Constant.

  type: net.minecraft.block.BlockStone$EnumType"
  BlockStone$EnumType/DIORITE)

(def DIORITE_SMOOTH
  "Enum Constant.

  type: net.minecraft.block.BlockStone$EnumType"
  BlockStone$EnumType/DIORITE_SMOOTH)

(def ANDESITE
  "Enum Constant.

  type: net.minecraft.block.BlockStone$EnumType"
  BlockStone$EnumType/ANDESITE)

(def ANDESITE_SMOOTH
  "Enum Constant.

  type: net.minecraft.block.BlockStone$EnumType"
  BlockStone$EnumType/ANDESITE_SMOOTH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockStone.EnumType c : BlockStone.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockStone$EnumType[]`"
  ([]
    (BlockStone$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockStone$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockStone$EnumType [^java.lang.String name]
    (BlockStone$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockStone$EnumType`"
  (^net.minecraft.block.BlockStone$EnumType [^Integer meta]
    (BlockStone$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockStone$EnumType this]
    (-> this (.getMetadata))))

(defn get-map-color
  "returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockStone$EnumType this]
    (-> this (.getMapColor))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStone$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStone$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStone$EnumType this]
    (-> this (.getUnlocalizedName))))

(defn natural?
  "returns: `boolean`"
  (^Boolean [^BlockStone$EnumType this]
    (-> this (.isNatural))))

