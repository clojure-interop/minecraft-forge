(ns net.minecraft.block.BlockLog$EnumAxis
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockLog$EnumAxis]))

(def X
  "Enum Constant.

  type: net.minecraft.block.BlockLog$EnumAxis"
  BlockLog$EnumAxis/X)

(def Y
  "Enum Constant.

  type: net.minecraft.block.BlockLog$EnumAxis"
  BlockLog$EnumAxis/Y)

(def Z
  "Enum Constant.

  type: net.minecraft.block.BlockLog$EnumAxis"
  BlockLog$EnumAxis/Z)

(def NONE
  "Enum Constant.

  type: net.minecraft.block.BlockLog$EnumAxis"
  BlockLog$EnumAxis/NONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockLog.EnumAxis c : BlockLog.EnumAxis.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockLog$EnumAxis[]`"
  ([]
    (BlockLog$EnumAxis/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockLog$EnumAxis`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockLog$EnumAxis [^java.lang.String name]
    (BlockLog$EnumAxis/valueOf name)))

(defn *from-facing-axis
  "axis - `net.minecraft.util.EnumFacing$Axis`

  returns: `net.minecraft.block.BlockLog$EnumAxis`"
  (^net.minecraft.block.BlockLog$EnumAxis [^net.minecraft.util.EnumFacing$Axis axis]
    (BlockLog$EnumAxis/fromFacingAxis axis)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockLog$EnumAxis this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockLog$EnumAxis this]
    (-> this (.getName))))

