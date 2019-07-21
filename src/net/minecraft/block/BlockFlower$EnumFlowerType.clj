(ns net.minecraft.block.BlockFlower$EnumFlowerType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockFlower$EnumFlowerType]))

(def DANDELION
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/DANDELION)

(def POPPY
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/POPPY)

(def BLUE_ORCHID
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/BLUE_ORCHID)

(def ALLIUM
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/ALLIUM)

(def HOUSTONIA
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/HOUSTONIA)

(def RED_TULIP
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/RED_TULIP)

(def ORANGE_TULIP
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/ORANGE_TULIP)

(def WHITE_TULIP
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/WHITE_TULIP)

(def PINK_TULIP
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/PINK_TULIP)

(def OXEYE_DAISY
  "Enum Constant.

  type: net.minecraft.block.BlockFlower$EnumFlowerType"
  BlockFlower$EnumFlowerType/OXEYE_DAISY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockFlower.EnumFlowerType c : BlockFlower.EnumFlowerType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockFlower$EnumFlowerType[]`"
  ([]
    (BlockFlower$EnumFlowerType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockFlower$EnumFlowerType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockFlower$EnumFlowerType [^java.lang.String name]
    (BlockFlower$EnumFlowerType/valueOf name)))

(defn *get-type
  "block-type - `net.minecraft.block.BlockFlower$EnumFlowerColor`
  meta - `int`

  returns: `net.minecraft.block.BlockFlower$EnumFlowerType`"
  (^net.minecraft.block.BlockFlower$EnumFlowerType [^net.minecraft.block.BlockFlower$EnumFlowerColor block-type ^Integer meta]
    (BlockFlower$EnumFlowerType/getType block-type meta)))

(defn *get-types
  "flower-color - `net.minecraft.block.BlockFlower$EnumFlowerColor`

  returns: `net.minecraft.block.BlockFlower$EnumFlowerType[]`"
  ([^net.minecraft.block.BlockFlower$EnumFlowerColor flower-color]
    (BlockFlower$EnumFlowerType/getTypes flower-color)))

(defn get-block-type
  "returns: `net.minecraft.block.BlockFlower$EnumFlowerColor`"
  (^net.minecraft.block.BlockFlower$EnumFlowerColor [^BlockFlower$EnumFlowerType this]
    (-> this (.getBlockType))))

(defn get-meta
  "returns: `int`"
  (^Integer [^BlockFlower$EnumFlowerType this]
    (-> this (.getMeta))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockFlower$EnumFlowerType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockFlower$EnumFlowerType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockFlower$EnumFlowerType this]
    (-> this (.getUnlocalizedName))))

