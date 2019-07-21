(ns net.minecraft.world.biome.BiomeColorHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeColorHelper]))

(defn ->biome-color-helper
  "Constructor."
  (^BiomeColorHelper []
    (new BiomeColorHelper )))

(defn *get-grass-color-at-pos
  "block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos]
    (BiomeColorHelper/getGrassColorAtPos block-access pos)))

(defn *get-foliage-color-at-pos
  "block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos]
    (BiomeColorHelper/getFoliageColorAtPos block-access pos)))

(defn *get-water-color-at-pos
  "block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos]
    (BiomeColorHelper/getWaterColorAtPos block-access pos)))

