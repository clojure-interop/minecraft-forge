(ns net.minecraftforge.common.BiomeDictionary
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common BiomeDictionary]))

(defn ->biome-dictionary
  "Constructor."
  (^BiomeDictionary []
    (new BiomeDictionary )))

(defn *add-types
  "Adds the given types to the biome.

  biome - `net.minecraft.world.biome.Biome`
  types - `net.minecraftforge.common.BiomeDictionary$Type`"
  ([^net.minecraft.world.biome.Biome biome ^net.minecraftforge.common.BiomeDictionary$Type types]
    (BiomeDictionary/addTypes biome types)))

(defn *get-biomes
  "Gets the set of biomes that have the given type.

  type - `net.minecraftforge.common.BiomeDictionary$Type`

  returns: `java.util.Set<net.minecraft.world.biome.Biome>`"
  (^java.util.Set [^net.minecraftforge.common.BiomeDictionary$Type type]
    (BiomeDictionary/getBiomes type)))

(defn *get-types
  "Gets the set of types that have been added to the given biome.

  biome - `net.minecraft.world.biome.Biome`

  returns: `java.util.Set<net.minecraftforge.common.BiomeDictionary$Type>`"
  (^java.util.Set [^net.minecraft.world.biome.Biome biome]
    (BiomeDictionary/getTypes biome)))

(defn *are-similar
  "Checks if the two given biomes have types in common.

  biome-a - `net.minecraft.world.biome.Biome`
  biome-b - `net.minecraft.world.biome.Biome`

  returns: returns true if a common type is found, false otherwise - `boolean`"
  (^Boolean [^net.minecraft.world.biome.Biome biome-a ^net.minecraft.world.biome.Biome biome-b]
    (BiomeDictionary/areSimilar biome-a biome-b)))

(defn *has-type?
  "Checks if the given type has been added to the given biome.

  biome - `net.minecraft.world.biome.Biome`
  type - `net.minecraftforge.common.BiomeDictionary$Type`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.biome.Biome biome ^net.minecraftforge.common.BiomeDictionary$Type type]
    (BiomeDictionary/hasType biome type)))

(defn *has-any-type?
  "Checks if any type has been added to the given biome.

  biome - `net.minecraft.world.biome.Biome`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.biome.Biome biome]
    (BiomeDictionary/hasAnyType biome)))

(defn *make-best-guess
  "Automatically adds appropriate types to a given biome based on certain heuristics.
   If a biome's types are requested and no types have been added to the biome so far, the biome's types
   will be determined and added using this method.

  biome - `net.minecraft.world.biome.Biome`"
  ([^net.minecraft.world.biome.Biome biome]
    (BiomeDictionary/makeBestGuess biome)))

