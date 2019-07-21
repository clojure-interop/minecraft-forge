(ns net.minecraft.block.BlockTallGrass$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockTallGrass$EnumType]))

(def DEAD_BUSH
  "Enum Constant.

  type: net.minecraft.block.BlockTallGrass$EnumType"
  BlockTallGrass$EnumType/DEAD_BUSH)

(def GRASS
  "Enum Constant.

  type: net.minecraft.block.BlockTallGrass$EnumType"
  BlockTallGrass$EnumType/GRASS)

(def FERN
  "Enum Constant.

  type: net.minecraft.block.BlockTallGrass$EnumType"
  BlockTallGrass$EnumType/FERN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockTallGrass.EnumType c : BlockTallGrass.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockTallGrass$EnumType[]`"
  ([]
    (BlockTallGrass$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockTallGrass$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockTallGrass$EnumType [^java.lang.String name]
    (BlockTallGrass$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockTallGrass$EnumType`"
  (^net.minecraft.block.BlockTallGrass$EnumType [^Integer meta]
    (BlockTallGrass$EnumType/byMetadata meta)))

(defn get-meta
  "returns: `int`"
  (^Integer [^BlockTallGrass$EnumType this]
    (-> this (.getMeta))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockTallGrass$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockTallGrass$EnumType this]
    (-> this (.getName))))

