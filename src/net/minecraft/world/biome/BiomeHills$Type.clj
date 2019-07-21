(ns net.minecraft.world.biome.BiomeHills$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeHills$Type]))

(def NORMAL
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeHills$Type"
  BiomeHills$Type/NORMAL)

(def EXTRA_TREES
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeHills$Type"
  BiomeHills$Type/EXTRA_TREES)

(def MUTATED
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeHills$Type"
  BiomeHills$Type/MUTATED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BiomeHills.Type c : BiomeHills.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.biome.BiomeHills$Type[]`"
  ([]
    (BiomeHills$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.biome.BiomeHills$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.biome.BiomeHills$Type [^java.lang.String name]
    (BiomeHills$Type/valueOf name)))

