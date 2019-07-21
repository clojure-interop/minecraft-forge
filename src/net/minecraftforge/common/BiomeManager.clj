(ns net.minecraftforge.common.BiomeManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common BiomeManager]))

(defn ->biome-manager
  "Constructor."
  (^BiomeManager []
    (new BiomeManager )))

(defn *-ocean-biomes
  "Static Field.

  type: java.util.List<net.minecraft.world.biome.Biome>"
  []
  BiomeManager/oceanBiomes)

(defn *-strong-hold-biomes
  "Static Field.

  type: java.util.ArrayList<net.minecraft.world.biome.Biome>"
  []
  BiomeManager/strongHoldBiomes)

(defn *-strong-hold-biomes-black-list
  "Static Field.

  type: java.util.ArrayList<net.minecraft.world.biome.Biome>"
  []
  BiomeManager/strongHoldBiomesBlackList)

(defn *remove-village-biome
  "biome - `net.minecraft.world.biome.Biome`"
  ([^net.minecraft.world.biome.Biome biome]
    (BiomeManager/removeVillageBiome biome)))

(defn *remove-spawn-biome
  "biome - `net.minecraft.world.biome.Biome`"
  ([^net.minecraft.world.biome.Biome biome]
    (BiomeManager/removeSpawnBiome biome)))

(defn *add-stronghold-biome
  "biome - `net.minecraft.world.biome.Biome`"
  ([^net.minecraft.world.biome.Biome biome]
    (BiomeManager/addStrongholdBiome biome)))

(defn *add-biome
  "type - `net.minecraftforge.common.BiomeManager$BiomeType`
  entry - `net.minecraftforge.common.BiomeManager$BiomeEntry`"
  ([^net.minecraftforge.common.BiomeManager$BiomeType type ^net.minecraftforge.common.BiomeManager$BiomeEntry entry]
    (BiomeManager/addBiome type entry)))

(defn *remove-biome
  "type - `net.minecraftforge.common.BiomeManager$BiomeType`
  entry - `net.minecraftforge.common.BiomeManager$BiomeEntry`"
  ([^net.minecraftforge.common.BiomeManager$BiomeType type ^net.minecraftforge.common.BiomeManager$BiomeEntry entry]
    (BiomeManager/removeBiome type entry)))

(defn *add-spawn-biome
  "biome - `net.minecraft.world.biome.Biome`"
  ([^net.minecraft.world.biome.Biome biome]
    (BiomeManager/addSpawnBiome biome)))

(defn *add-village-biome
  "biome - `net.minecraft.world.biome.Biome`
  can-spawn - `boolean`"
  ([^net.minecraft.world.biome.Biome biome ^Boolean can-spawn]
    (BiomeManager/addVillageBiome biome can-spawn)))

(defn *get-biomes
  "type - `net.minecraftforge.common.BiomeManager$BiomeType`

  returns: `com.google.common.collect.ImmutableList<net.minecraftforge.common.BiomeManager$BiomeEntry>`"
  (^com.google.common.collect.ImmutableList [^net.minecraftforge.common.BiomeManager$BiomeType type]
    (BiomeManager/getBiomes type)))

(defn *remove-stronghold-biome
  "biome - `net.minecraft.world.biome.Biome`"
  ([^net.minecraft.world.biome.Biome biome]
    (BiomeManager/removeStrongholdBiome biome)))

(defn *type-list-modded?
  "type - `net.minecraftforge.common.BiomeManager$BiomeType`

  returns: `boolean`"
  (^Boolean [^net.minecraftforge.common.BiomeManager$BiomeType type]
    (BiomeManager/isTypeListModded type)))

