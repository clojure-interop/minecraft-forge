(ns net.minecraft.block.BlockDirt$DirtType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDirt$DirtType]))

(def DIRT
  "Enum Constant.

  type: net.minecraft.block.BlockDirt$DirtType"
  BlockDirt$DirtType/DIRT)

(def COARSE_DIRT
  "Enum Constant.

  type: net.minecraft.block.BlockDirt$DirtType"
  BlockDirt$DirtType/COARSE_DIRT)

(def PODZOL
  "Enum Constant.

  type: net.minecraft.block.BlockDirt$DirtType"
  BlockDirt$DirtType/PODZOL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockDirt.DirtType c : BlockDirt.DirtType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockDirt$DirtType[]`"
  ([]
    (BlockDirt$DirtType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockDirt$DirtType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockDirt$DirtType [^java.lang.String name]
    (BlockDirt$DirtType/valueOf name)))

(defn *by-metadata
  "metadata - `int`

  returns: `net.minecraft.block.BlockDirt$DirtType`"
  (^net.minecraft.block.BlockDirt$DirtType [^Integer metadata]
    (BlockDirt$DirtType/byMetadata metadata)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockDirt$DirtType this]
    (-> this (.getMetadata))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDirt$DirtType this]
    (-> this (.getUnlocalizedName))))

(defn get-color
  "returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockDirt$DirtType this]
    (-> this (.getColor))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDirt$DirtType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDirt$DirtType this]
    (-> this (.getName))))

