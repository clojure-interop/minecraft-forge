(ns net.minecraft.block.BlockQuartz$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockQuartz$EnumType]))

(def DEFAULT
  "Enum Constant.

  type: net.minecraft.block.BlockQuartz$EnumType"
  BlockQuartz$EnumType/DEFAULT)

(def CHISELED
  "Enum Constant.

  type: net.minecraft.block.BlockQuartz$EnumType"
  BlockQuartz$EnumType/CHISELED)

(def LINES_Y
  "Enum Constant.

  type: net.minecraft.block.BlockQuartz$EnumType"
  BlockQuartz$EnumType/LINES_Y)

(def LINES_X
  "Enum Constant.

  type: net.minecraft.block.BlockQuartz$EnumType"
  BlockQuartz$EnumType/LINES_X)

(def LINES_Z
  "Enum Constant.

  type: net.minecraft.block.BlockQuartz$EnumType"
  BlockQuartz$EnumType/LINES_Z)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockQuartz.EnumType c : BlockQuartz.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockQuartz$EnumType[]`"
  ([]
    (BlockQuartz$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockQuartz$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockQuartz$EnumType [^java.lang.String name]
    (BlockQuartz$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockQuartz$EnumType`"
  (^net.minecraft.block.BlockQuartz$EnumType [^Integer meta]
    (BlockQuartz$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockQuartz$EnumType this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockQuartz$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockQuartz$EnumType this]
    (-> this (.getName))))

