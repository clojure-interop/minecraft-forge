(ns net.minecraft.block.Block$EnumOffsetType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block Block$EnumOffsetType]))

(def NONE
  "Enum Constant.

  type: net.minecraft.block.Block$EnumOffsetType"
  Block$EnumOffsetType/NONE)

(def XZ
  "Enum Constant.

  type: net.minecraft.block.Block$EnumOffsetType"
  Block$EnumOffsetType/XZ)

(def XYZ
  "Enum Constant.

  type: net.minecraft.block.Block$EnumOffsetType"
  Block$EnumOffsetType/XYZ)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Block.EnumOffsetType c : Block.EnumOffsetType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.Block$EnumOffsetType[]`"
  ([]
    (Block$EnumOffsetType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.Block$EnumOffsetType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.Block$EnumOffsetType [^java.lang.String name]
    (Block$EnumOffsetType/valueOf name)))

