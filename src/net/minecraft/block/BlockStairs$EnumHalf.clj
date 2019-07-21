(ns net.minecraft.block.BlockStairs$EnumHalf
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStairs$EnumHalf]))

(def TOP
  "Enum Constant.

  type: net.minecraft.block.BlockStairs$EnumHalf"
  BlockStairs$EnumHalf/TOP)

(def BOTTOM
  "Enum Constant.

  type: net.minecraft.block.BlockStairs$EnumHalf"
  BlockStairs$EnumHalf/BOTTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockStairs.EnumHalf c : BlockStairs.EnumHalf.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockStairs$EnumHalf[]`"
  ([]
    (BlockStairs$EnumHalf/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockStairs$EnumHalf`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockStairs$EnumHalf [^java.lang.String name]
    (BlockStairs$EnumHalf/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStairs$EnumHalf this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStairs$EnumHalf this]
    (-> this (.getName))))

