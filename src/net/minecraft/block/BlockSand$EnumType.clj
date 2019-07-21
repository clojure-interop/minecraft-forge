(ns net.minecraft.block.BlockSand$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSand$EnumType]))

(def SAND
  "Enum Constant.

  type: net.minecraft.block.BlockSand$EnumType"
  BlockSand$EnumType/SAND)

(def RED_SAND
  "Enum Constant.

  type: net.minecraft.block.BlockSand$EnumType"
  BlockSand$EnumType/RED_SAND)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockSand.EnumType c : BlockSand.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockSand$EnumType[]`"
  ([]
    (BlockSand$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockSand$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockSand$EnumType [^java.lang.String name]
    (BlockSand$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockSand$EnumType`"
  (^net.minecraft.block.BlockSand$EnumType [^Integer meta]
    (BlockSand$EnumType/byMetadata meta)))

(defn get-dust-color
  "returns: `int`"
  (^Integer [^BlockSand$EnumType this]
    (-> this (.getDustColor))))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockSand$EnumType this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSand$EnumType this]
    (-> this (.toString))))

(defn get-map-color
  "returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockSand$EnumType this]
    (-> this (.getMapColor))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSand$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSand$EnumType this]
    (-> this (.getUnlocalizedName))))

