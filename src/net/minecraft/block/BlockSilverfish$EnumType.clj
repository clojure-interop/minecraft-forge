(ns net.minecraft.block.BlockSilverfish$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSilverfish$EnumType]))

(def STONE
  "Enum Constant.

  type: net.minecraft.block.BlockSilverfish$EnumType"
  BlockSilverfish$EnumType/STONE)

(def COBBLESTONE
  "Enum Constant.

  type: net.minecraft.block.BlockSilverfish$EnumType"
  BlockSilverfish$EnumType/COBBLESTONE)

(def STONEBRICK
  "Enum Constant.

  type: net.minecraft.block.BlockSilverfish$EnumType"
  BlockSilverfish$EnumType/STONEBRICK)

(def MOSSY_STONEBRICK
  "Enum Constant.

  type: net.minecraft.block.BlockSilverfish$EnumType"
  BlockSilverfish$EnumType/MOSSY_STONEBRICK)

(def CRACKED_STONEBRICK
  "Enum Constant.

  type: net.minecraft.block.BlockSilverfish$EnumType"
  BlockSilverfish$EnumType/CRACKED_STONEBRICK)

(def CHISELED_STONEBRICK
  "Enum Constant.

  type: net.minecraft.block.BlockSilverfish$EnumType"
  BlockSilverfish$EnumType/CHISELED_STONEBRICK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockSilverfish.EnumType c : BlockSilverfish.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockSilverfish$EnumType[]`"
  ([]
    (BlockSilverfish$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockSilverfish$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockSilverfish$EnumType [^java.lang.String name]
    (BlockSilverfish$EnumType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockSilverfish$EnumType`"
  (^net.minecraft.block.BlockSilverfish$EnumType [^Integer meta]
    (BlockSilverfish$EnumType/byMetadata meta)))

(defn *for-model-block
  "model - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.BlockSilverfish$EnumType`"
  (^net.minecraft.block.BlockSilverfish$EnumType [^net.minecraft.block.state.IBlockState model]
    (BlockSilverfish$EnumType/forModelBlock model)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockSilverfish$EnumType this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSilverfish$EnumType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSilverfish$EnumType this]
    (-> this (.getName))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSilverfish$EnumType this]
    (-> this (.getUnlocalizedName))))

(defn get-model-block
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSilverfish$EnumType this]
    (-> this (.getModelBlock))))

