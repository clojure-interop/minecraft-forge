(ns net.minecraft.block.BlockDoublePlant$EnumBlockHalf
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDoublePlant$EnumBlockHalf]))

(def UPPER
  "Enum Constant.

  type: net.minecraft.block.BlockDoublePlant$EnumBlockHalf"
  BlockDoublePlant$EnumBlockHalf/UPPER)

(def LOWER
  "Enum Constant.

  type: net.minecraft.block.BlockDoublePlant$EnumBlockHalf"
  BlockDoublePlant$EnumBlockHalf/LOWER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockDoublePlant.EnumBlockHalf c : BlockDoublePlant.EnumBlockHalf.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockDoublePlant$EnumBlockHalf[]`"
  ([]
    (BlockDoublePlant$EnumBlockHalf/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockDoublePlant$EnumBlockHalf`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockDoublePlant$EnumBlockHalf [^java.lang.String name]
    (BlockDoublePlant$EnumBlockHalf/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDoublePlant$EnumBlockHalf this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDoublePlant$EnumBlockHalf this]
    (-> this (.getName))))

