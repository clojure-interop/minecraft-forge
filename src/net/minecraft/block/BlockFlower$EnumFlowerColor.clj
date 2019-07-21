(ns net.minecraft.block.BlockFlower$EnumFlowerColor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockFlower$EnumFlowerColor]))

(def YELLOW
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerColor"
  BlockFlower$EnumFlowerColor/YELLOW)

(def RED
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerColor"
  BlockFlower$EnumFlowerColor/RED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockFlower.EnumFlowerColor c : BlockFlower.EnumFlowerColor.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockFlower$EnumFlowerColor[]`"
  ([]
    (BlockFlower$EnumFlowerColor/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockFlower$EnumFlowerColor`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockFlower$EnumFlowerColor [^java.lang.String name]
    (BlockFlower$EnumFlowerColor/valueOf name)))

(defn get-block
  "returns: `net.minecraft.block.BlockFlower`"
  (^net.minecraft.block.BlockFlower [^BlockFlower$EnumFlowerColor this]
    (-> this (.getBlock))))

