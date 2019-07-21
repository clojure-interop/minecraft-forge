(ns net.minecraft.block.BlockSandStone$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSandStone$EnumType]))

(def DEFAULT
  "Enum Constant.

  type: net.minecraft.block.BlockSandStone$EnumType"
  BlockSandStone$EnumType/DEFAULT)

(def CHISELED
  "Enum Constant.

  type: net.minecraft.block.BlockSandStone$EnumType"
  BlockSandStone$EnumType/CHISELED)

(def SMOOTH
  "Enum Constant.

  type: net.minecraft.block.BlockSandStone$EnumType"
  BlockSandStone$EnumType/SMOOTH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockSandStone.EnumType c : BlockSandStone.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockSandStone$EnumType[]`"
  ([]
    (BlockSandStone$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockSandStone$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockSandStone$EnumType [^java.lang.String name]
    (BlockSandStone$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockSandStone$EnumType`"
  (^net.minecraft.block.BlockSandStone$EnumType [^Integer meta]
    (BlockSandStone$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockSandStone$EnumType this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSandStone$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSandStone$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSandStone$EnumType this]
    (-> this (.getUnlocalizedName))))

