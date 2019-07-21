(ns net.minecraft.world.biome.BiomeForest$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeForest$Type]))

(def NORMAL
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeForest$Type"
  BiomeForest$Type/NORMAL)

(def FLOWER
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeForest$Type"
  BiomeForest$Type/FLOWER)

(def BIRCH
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeForest$Type"
  BiomeForest$Type/BIRCH)

(def ROOFED
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeForest$Type"
  BiomeForest$Type/ROOFED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BiomeForest.Type c : BiomeForest.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.biome.BiomeForest$Type[]`"
  ([]
    (BiomeForest$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.biome.BiomeForest$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.biome.BiomeForest$Type [^java.lang.String name]
    (BiomeForest$Type/valueOf name)))

