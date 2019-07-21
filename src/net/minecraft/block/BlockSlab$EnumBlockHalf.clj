(ns net.minecraft.block.BlockSlab$EnumBlockHalf
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSlab$EnumBlockHalf]))

(def TOP
  "Enum Constant.

  type: net.minecraft.block.BlockSlab$EnumBlockHalf"
  BlockSlab$EnumBlockHalf/TOP)

(def BOTTOM
  "Enum Constant.

  type: net.minecraft.block.BlockSlab$EnumBlockHalf"
  BlockSlab$EnumBlockHalf/BOTTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockSlab.EnumBlockHalf c : BlockSlab.EnumBlockHalf.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockSlab$EnumBlockHalf[]`"
  ([]
    (BlockSlab$EnumBlockHalf/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockSlab$EnumBlockHalf`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockSlab$EnumBlockHalf [^java.lang.String name]
    (BlockSlab$EnumBlockHalf/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSlab$EnumBlockHalf this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSlab$EnumBlockHalf this]
    (-> this (.getName))))

