(ns net.minecraft.block.BlockStoneSlabNew$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStoneSlabNew$EnumType]))

(def RED_SANDSTONE
  "Enum Constant.

  type: net.minecraft.block.BlockStoneSlabNew$EnumType"
  BlockStoneSlabNew$EnumType/RED_SANDSTONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockStoneSlabNew.EnumType c : BlockStoneSlabNew.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockStoneSlabNew$EnumType[]`"
  ([]
    (BlockStoneSlabNew$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockStoneSlabNew$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockStoneSlabNew$EnumType [^java.lang.String name]
    (BlockStoneSlabNew$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockStoneSlabNew$EnumType`"
  (^net.minecraft.block.BlockStoneSlabNew$EnumType [^Integer meta]
    (BlockStoneSlabNew$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockStoneSlabNew$EnumType this]
    (-> this (.getMetadata))))

(defn get-map-color
  "returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockStoneSlabNew$EnumType this]
    (-> this (.getMapColor))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneSlabNew$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneSlabNew$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneSlabNew$EnumType this]
    (-> this (.getUnlocalizedName))))

