(ns net.minecraft.block.BlockStoneBrick$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStoneBrick$EnumType]))

(def DEFAULT
  "Enum Constant.

  type: net.minecraft.block.BlockStoneBrick$EnumType"
  BlockStoneBrick$EnumType/DEFAULT)

(def MOSSY
  "Enum Constant.

  type: net.minecraft.block.BlockStoneBrick$EnumType"
  BlockStoneBrick$EnumType/MOSSY)

(def CRACKED
  "Enum Constant.

  type: net.minecraft.block.BlockStoneBrick$EnumType"
  BlockStoneBrick$EnumType/CRACKED)

(def CHISELED
  "Enum Constant.

  type: net.minecraft.block.BlockStoneBrick$EnumType"
  BlockStoneBrick$EnumType/CHISELED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockStoneBrick.EnumType c : BlockStoneBrick.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockStoneBrick$EnumType[]`"
  ([]
    (BlockStoneBrick$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockStoneBrick$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockStoneBrick$EnumType [^java.lang.String name]
    (BlockStoneBrick$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockStoneBrick$EnumType`"
  (^net.minecraft.block.BlockStoneBrick$EnumType [^Integer meta]
    (BlockStoneBrick$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockStoneBrick$EnumType this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneBrick$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneBrick$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneBrick$EnumType this]
    (-> this (.getUnlocalizedName))))

