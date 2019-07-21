(ns net.minecraft.block.BlockWall$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockWall$EnumType]))

(def NORMAL
  "Enum Constant.

  type: net.minecraft.block.BlockWall$EnumType"
  BlockWall$EnumType/NORMAL)

(def MOSSY
  "Enum Constant.

  type: net.minecraft.block.BlockWall$EnumType"
  BlockWall$EnumType/MOSSY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockWall.EnumType c : BlockWall.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockWall$EnumType[]`"
  ([]
    (BlockWall$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockWall$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockWall$EnumType [^java.lang.String name]
    (BlockWall$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockWall$EnumType`"
  (^net.minecraft.block.BlockWall$EnumType [^Integer meta]
    (BlockWall$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockWall$EnumType this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockWall$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockWall$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockWall$EnumType this]
    (-> this (.getUnlocalizedName))))

