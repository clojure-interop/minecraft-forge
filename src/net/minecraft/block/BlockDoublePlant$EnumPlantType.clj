(ns net.minecraft.block.BlockDoublePlant$EnumPlantType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDoublePlant$EnumPlantType]))

(def SUNFLOWER
  "Enum Constant.

  type: net.minecraft.block.BlockDoublePlant$EnumPlantType"
  BlockDoublePlant$EnumPlantType/SUNFLOWER)

(def SYRINGA
  "Enum Constant.

  type: net.minecraft.block.BlockDoublePlant$EnumPlantType"
  BlockDoublePlant$EnumPlantType/SYRINGA)

(def GRASS
  "Enum Constant.

  type: net.minecraft.block.BlockDoublePlant$EnumPlantType"
  BlockDoublePlant$EnumPlantType/GRASS)

(def FERN
  "Enum Constant.

  type: net.minecraft.block.BlockDoublePlant$EnumPlantType"
  BlockDoublePlant$EnumPlantType/FERN)

(def ROSE
  "Enum Constant.

  type: net.minecraft.block.BlockDoublePlant$EnumPlantType"
  BlockDoublePlant$EnumPlantType/ROSE)

(def PAEONIA
  "Enum Constant.

  type: net.minecraft.block.BlockDoublePlant$EnumPlantType"
  BlockDoublePlant$EnumPlantType/PAEONIA)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockDoublePlant.EnumPlantType c : BlockDoublePlant.EnumPlantType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockDoublePlant$EnumPlantType[]`"
  ([]
    (BlockDoublePlant$EnumPlantType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockDoublePlant$EnumPlantType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockDoublePlant$EnumPlantType [^java.lang.String name]
    (BlockDoublePlant$EnumPlantType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockDoublePlant$EnumPlantType`"
  (^net.minecraft.block.BlockDoublePlant$EnumPlantType [^Integer meta]
    (BlockDoublePlant$EnumPlantType/byMetadata meta)))

(defn get-meta
  "returns: `int`"
  (^Integer [^BlockDoublePlant$EnumPlantType this]
    (-> this (.getMeta))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDoublePlant$EnumPlantType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDoublePlant$EnumPlantType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDoublePlant$EnumPlantType this]
    (-> this (.getUnlocalizedName))))

