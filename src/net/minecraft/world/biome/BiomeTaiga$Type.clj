(ns net.minecraft.world.biome.BiomeTaiga$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeTaiga$Type]))

(def NORMAL
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeTaiga$Type"
  BiomeTaiga$Type/NORMAL)

(def MEGA
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeTaiga$Type"
  BiomeTaiga$Type/MEGA)

(def MEGA_SPRUCE
  "Enum Constant.

  type: net.minecraft.world.biome.BiomeTaiga$Type"
  BiomeTaiga$Type/MEGA_SPRUCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BiomeTaiga.Type c : BiomeTaiga.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.biome.BiomeTaiga$Type[]`"
  ([]
    (BiomeTaiga$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.biome.BiomeTaiga$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.biome.BiomeTaiga$Type [^java.lang.String name]
    (BiomeTaiga$Type/valueOf name)))

