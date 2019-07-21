(ns net.minecraft.block.BlockStoneSlab$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStoneSlab$EnumType]))

(def STONE
  "Enum Constant.

  type: net.minecraft.block.BlockStoneSlab$EnumType"
  BlockStoneSlab$EnumType/STONE)

(def SAND
  "Enum Constant.

  type: net.minecraft.block.BlockStoneSlab$EnumType"
  BlockStoneSlab$EnumType/SAND)

(def WOOD
  "Enum Constant.

  type: net.minecraft.block.BlockStoneSlab$EnumType"
  BlockStoneSlab$EnumType/WOOD)

(def COBBLESTONE
  "Enum Constant.

  type: net.minecraft.block.BlockStoneSlab$EnumType"
  BlockStoneSlab$EnumType/COBBLESTONE)

(def BRICK
  "Enum Constant.

  type: net.minecraft.block.BlockStoneSlab$EnumType"
  BlockStoneSlab$EnumType/BRICK)

(def SMOOTHBRICK
  "Enum Constant.

  type: net.minecraft.block.BlockStoneSlab$EnumType"
  BlockStoneSlab$EnumType/SMOOTHBRICK)

(def NETHERBRICK
  "Enum Constant.

  type: net.minecraft.block.BlockStoneSlab$EnumType"
  BlockStoneSlab$EnumType/NETHERBRICK)

(def QUARTZ
  "Enum Constant.

  type: net.minecraft.block.BlockStoneSlab$EnumType"
  BlockStoneSlab$EnumType/QUARTZ)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockStoneSlab.EnumType c : BlockStoneSlab.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockStoneSlab$EnumType[]`"
  ([]
    (BlockStoneSlab$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockStoneSlab$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockStoneSlab$EnumType [^java.lang.String name]
    (BlockStoneSlab$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockStoneSlab$EnumType`"
  (^net.minecraft.block.BlockStoneSlab$EnumType [^Integer meta]
    (BlockStoneSlab$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockStoneSlab$EnumType this]
    (-> this (.getMetadata))))

(defn get-map-color
  "returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockStoneSlab$EnumType this]
    (-> this (.getMapColor))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneSlab$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneSlab$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneSlab$EnumType this]
    (-> this (.getUnlocalizedName))))

