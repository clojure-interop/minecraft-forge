(ns net.minecraftforge.event.terraingen.TerrainGen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen TerrainGen]))

(defn ->terrain-gen
  "Constructor."
  (^TerrainGen []
    (new TerrainGen )))

(defn *get-modded-noise-generators
  "world - `net.minecraft.world.World`
  rand - `java.util.Random`
  original - `T`

  returns: `<T extends net.minecraftforge.event.terraingen.InitNoiseGensEvent$Context> T`"
  ([^net.minecraft.world.World world ^java.util.Random rand original]
    (TerrainGen/getModdedNoiseGenerators world rand original)))

(defn *get-modded-map-gen
  "original - `net.minecraft.world.gen.MapGenBase`
  type - `net.minecraftforge.event.terraingen.InitMapGenEvent$EventType`

  returns: `net.minecraft.world.gen.MapGenBase`"
  (^net.minecraft.world.gen.MapGenBase [^net.minecraft.world.gen.MapGenBase original ^net.minecraftforge.event.terraingen.InitMapGenEvent$EventType type]
    (TerrainGen/getModdedMapGen original type)))

(defn *populate
  "chunk-provider - `net.minecraft.world.chunk.IChunkGenerator`
  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-x - `int`
  chunk-z - `int`
  has-village-generated - `boolean`
  type - `net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.chunk.IChunkGenerator chunk-provider ^net.minecraft.world.World world ^java.util.Random rand ^Integer chunk-x ^Integer chunk-z ^Boolean has-village-generated ^net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType type]
    (TerrainGen/populate chunk-provider world rand chunk-x chunk-z has-village-generated type)))

(defn *decorate
  "world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`
  type - `net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType type]
    (TerrainGen/decorate world rand pos type)))

(defn *generate-ore
  "world - `net.minecraft.world.World`
  rand - `java.util.Random`
  generator - `net.minecraft.world.gen.feature.WorldGenerator`
  pos - `net.minecraft.util.math.BlockPos`
  type - `net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.world.gen.feature.WorldGenerator generator ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType type]
    (TerrainGen/generateOre world rand generator pos type)))

(defn *sapling-grow-tree
  "world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (TerrainGen/saplingGrowTree world rand pos)))

