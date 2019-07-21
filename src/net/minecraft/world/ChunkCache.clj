(ns net.minecraft.world.ChunkCache
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world ChunkCache]))

(defn ->chunk-cache
  "Constructor.

  world-in - `net.minecraft.world.World`
  pos-from-in - `net.minecraft.util.math.BlockPos`
  pos-to-in - `net.minecraft.util.math.BlockPos`
  sub-in - `int`"
  (^ChunkCache [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos-from-in ^net.minecraft.util.math.BlockPos pos-to-in ^Integer sub-in]
    (new ChunkCache world-in pos-from-in pos-to-in sub-in)))

(defn get-world-type
  "returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^ChunkCache this]
    (-> this (.getWorldType))))

(defn get-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`
  p-190300-2 - `net.minecraft.world.chunk.Chunk$EnumCreateEntityType`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^ChunkCache this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.chunk.Chunk$EnumCreateEntityType p-190300-2]
    (-> this (.getTileEntity pos p-190300-2)))
  (^net.minecraft.tileentity.TileEntity [^ChunkCache this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getTileEntity pos))))

(defn get-biome
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^ChunkCache this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBiome pos))))

(defn get-block-state
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^ChunkCache this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockState pos))))

(defn air-block?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^ChunkCache this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isAirBlock pos))))

(defn get-combined-light
  "pos - `net.minecraft.util.math.BlockPos`
  light-value - `int`

  returns: `int`"
  (^Integer [^ChunkCache this ^net.minecraft.util.math.BlockPos pos ^Integer light-value]
    (-> this (.getCombinedLight pos light-value))))

(defn side-solid?
  "Description copied from interface: IBlockAccess

  pos - Position - `net.minecraft.util.math.BlockPos`
  side - Side - `net.minecraft.util.EnumFacing`
  default - default return value - `boolean`

  returns: if the block is solid on the side - `boolean`"
  (^Boolean [^ChunkCache this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^Boolean default]
    (-> this (.isSideSolid pos side default))))

(defn extended-levels-in-chunk-cache
  "returns: `boolean`"
  (^Boolean [^ChunkCache this]
    (-> this (.extendedLevelsInChunkCache))))

(defn get-light-for
  "p-175628-1 - `net.minecraft.world.EnumSkyBlock`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^ChunkCache this ^net.minecraft.world.EnumSkyBlock p-175628-1 ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightFor p-175628-1 pos))))

(defn get-strong-power
  "pos - `net.minecraft.util.math.BlockPos`
  direction - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^ChunkCache this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing direction]
    (-> this (.getStrongPower pos direction))))

