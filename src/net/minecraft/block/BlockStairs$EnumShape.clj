(ns net.minecraft.block.BlockStairs$EnumShape
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStairs$EnumShape]))

(def STRAIGHT
  "Enum Constant.

  type: net.minecraft.block.BlockStairs$EnumShape"
  BlockStairs$EnumShape/STRAIGHT)

(def INNER_LEFT
  "Enum Constant.

  type: net.minecraft.block.BlockStairs$EnumShape"
  BlockStairs$EnumShape/INNER_LEFT)

(def INNER_RIGHT
  "Enum Constant.

  type: net.minecraft.block.BlockStairs$EnumShape"
  BlockStairs$EnumShape/INNER_RIGHT)

(def OUTER_LEFT
  "Enum Constant.

  type: net.minecraft.block.BlockStairs$EnumShape"
  BlockStairs$EnumShape/OUTER_LEFT)

(def OUTER_RIGHT
  "Enum Constant.

  type: net.minecraft.block.BlockStairs$EnumShape"
  BlockStairs$EnumShape/OUTER_RIGHT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockStairs.EnumShape c : BlockStairs.EnumShape.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockStairs$EnumShape[]`"
  ([]
    (BlockStairs$EnumShape/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockStairs$EnumShape`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockStairs$EnumShape [^java.lang.String name]
    (BlockStairs$EnumShape/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStairs$EnumShape this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStairs$EnumShape this]
    (-> this (.getName))))

