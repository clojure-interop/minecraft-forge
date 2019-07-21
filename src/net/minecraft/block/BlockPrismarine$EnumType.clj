(ns net.minecraft.block.BlockPrismarine$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPrismarine$EnumType]))

(def ROUGH
  "Enum Constant.

  type: net.minecraft.block.BlockPrismarine$EnumType"
  BlockPrismarine$EnumType/ROUGH)

(def BRICKS
  "Enum Constant.

  type: net.minecraft.block.BlockPrismarine$EnumType"
  BlockPrismarine$EnumType/BRICKS)

(def DARK
  "Enum Constant.

  type: net.minecraft.block.BlockPrismarine$EnumType"
  BlockPrismarine$EnumType/DARK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockPrismarine.EnumType c : BlockPrismarine.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockPrismarine$EnumType[]`"
  ([]
    (BlockPrismarine$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockPrismarine$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockPrismarine$EnumType [^java.lang.String name]
    (BlockPrismarine$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockPrismarine$EnumType`"
  (^net.minecraft.block.BlockPrismarine$EnumType [^Integer meta]
    (BlockPrismarine$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockPrismarine$EnumType this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPrismarine$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPrismarine$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPrismarine$EnumType this]
    (-> this (.getUnlocalizedName))))

