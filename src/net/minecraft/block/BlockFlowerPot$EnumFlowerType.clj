(ns net.minecraft.block.BlockFlowerPot$EnumFlowerType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockFlowerPot$EnumFlowerType]))

(def EMPTY
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/EMPTY)

(def POPPY
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/POPPY)

(def BLUE_ORCHID
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/BLUE_ORCHID)

(def ALLIUM
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/ALLIUM)

(def HOUSTONIA
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/HOUSTONIA)

(def RED_TULIP
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/RED_TULIP)

(def ORANGE_TULIP
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/ORANGE_TULIP)

(def WHITE_TULIP
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/WHITE_TULIP)

(def PINK_TULIP
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/PINK_TULIP)

(def OXEYE_DAISY
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/OXEYE_DAISY)

(def DANDELION
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/DANDELION)

(def OAK_SAPLING
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/OAK_SAPLING)

(def SPRUCE_SAPLING
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/SPRUCE_SAPLING)

(def BIRCH_SAPLING
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/BIRCH_SAPLING)

(def JUNGLE_SAPLING
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/JUNGLE_SAPLING)

(def ACACIA_SAPLING
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/ACACIA_SAPLING)

(def DARK_OAK_SAPLING
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/DARK_OAK_SAPLING)

(def MUSHROOM_RED
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/MUSHROOM_RED)

(def MUSHROOM_BROWN
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/MUSHROOM_BROWN)

(def DEAD_BUSH
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/DEAD_BUSH)

(def FERN
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/FERN)

(def CACTUS
  "Enum Constant.

  type: net.minecraft.block.BlockFlowerPot$EnumFlowerType"
  BlockFlowerPot$EnumFlowerType/CACTUS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockFlowerPot.EnumFlowerType c : BlockFlowerPot.EnumFlowerType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockFlowerPot$EnumFlowerType[]`"
  ([]
    (BlockFlowerPot$EnumFlowerType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockFlowerPot$EnumFlowerType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockFlowerPot$EnumFlowerType [^java.lang.String name]
    (BlockFlowerPot$EnumFlowerType/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockFlowerPot$EnumFlowerType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockFlowerPot$EnumFlowerType this]
    (-> this (.getName))))

