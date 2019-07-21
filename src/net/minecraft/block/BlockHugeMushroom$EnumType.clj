(ns net.minecraft.block.BlockHugeMushroom$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockHugeMushroom$EnumType]))

(def NORTH_WEST
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/NORTH_WEST)

(def NORTH
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/NORTH)

(def NORTH_EAST
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/NORTH_EAST)

(def WEST
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/WEST)

(def CENTER
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/CENTER)

(def EAST
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/EAST)

(def SOUTH_WEST
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/SOUTH_WEST)

(def SOUTH
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/SOUTH)

(def SOUTH_EAST
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/SOUTH_EAST)

(def STEM
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/STEM)

(def ALL_INSIDE
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/ALL_INSIDE)

(def ALL_OUTSIDE
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/ALL_OUTSIDE)

(def ALL_STEM
  "Enum Constant.

  type: net.minecraft.block.BlockHugeMushroom$EnumType"
  BlockHugeMushroom$EnumType/ALL_STEM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockHugeMushroom.EnumType c : BlockHugeMushroom.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockHugeMushroom$EnumType[]`"
  ([]
    (BlockHugeMushroom$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockHugeMushroom$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockHugeMushroom$EnumType [^java.lang.String name]
    (BlockHugeMushroom$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockHugeMushroom$EnumType`"
  (^net.minecraft.block.BlockHugeMushroom$EnumType [^Integer meta]
    (BlockHugeMushroom$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockHugeMushroom$EnumType this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockHugeMushroom$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockHugeMushroom$EnumType this]
    (-> this (.getName))))

