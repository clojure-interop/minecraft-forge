(ns net.minecraft.block.BlockRedSandstone$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockRedSandstone$EnumType]))

(def DEFAULT
  "Enum Constant.

  type: net.minecraft.block.BlockRedSandstone$EnumType"
  BlockRedSandstone$EnumType/DEFAULT)

(def CHISELED
  "Enum Constant.

  type: net.minecraft.block.BlockRedSandstone$EnumType"
  BlockRedSandstone$EnumType/CHISELED)

(def SMOOTH
  "Enum Constant.

  type: net.minecraft.block.BlockRedSandstone$EnumType"
  BlockRedSandstone$EnumType/SMOOTH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockRedSandstone.EnumType c : BlockRedSandstone.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockRedSandstone$EnumType[]`"
  ([]
    (BlockRedSandstone$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockRedSandstone$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockRedSandstone$EnumType [^java.lang.String name]
    (BlockRedSandstone$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockRedSandstone$EnumType`"
  (^net.minecraft.block.BlockRedSandstone$EnumType [^Integer meta]
    (BlockRedSandstone$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockRedSandstone$EnumType this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockRedSandstone$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockRedSandstone$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockRedSandstone$EnumType this]
    (-> this (.getUnlocalizedName))))

