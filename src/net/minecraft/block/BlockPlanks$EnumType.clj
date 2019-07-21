(ns net.minecraft.block.BlockPlanks$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPlanks$EnumType]))

(def OAK
  "Enum Constant.

  type: net.minecraft.block.BlockPlanks$EnumType"
  BlockPlanks$EnumType/OAK)

(def SPRUCE
  "Enum Constant.

  type: net.minecraft.block.BlockPlanks$EnumType"
  BlockPlanks$EnumType/SPRUCE)

(def BIRCH
  "Enum Constant.

  type: net.minecraft.block.BlockPlanks$EnumType"
  BlockPlanks$EnumType/BIRCH)

(def JUNGLE
  "Enum Constant.

  type: net.minecraft.block.BlockPlanks$EnumType"
  BlockPlanks$EnumType/JUNGLE)

(def ACACIA
  "Enum Constant.

  type: net.minecraft.block.BlockPlanks$EnumType"
  BlockPlanks$EnumType/ACACIA)

(def DARK_OAK
  "Enum Constant.

  type: net.minecraft.block.BlockPlanks$EnumType"
  BlockPlanks$EnumType/DARK_OAK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockPlanks.EnumType c : BlockPlanks.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockPlanks$EnumType[]`"
  ([]
    (BlockPlanks$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockPlanks$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockPlanks$EnumType [^java.lang.String name]
    (BlockPlanks$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockPlanks$EnumType`"
  (^net.minecraft.block.BlockPlanks$EnumType [^Integer meta]
    (BlockPlanks$EnumType/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockPlanks$EnumType this]
    (-> this (.getMetadata))))

(defn get-map-color
  "returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockPlanks$EnumType this]
    (-> this (.getMapColor))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPlanks$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPlanks$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPlanks$EnumType this]
    (-> this (.getUnlocalizedName))))

