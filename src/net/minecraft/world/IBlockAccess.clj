(ns net.minecraft.world.IBlockAccess
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world IBlockAccess]))

(defn get-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^IBlockAccess this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getTileEntity pos))))

(defn get-combined-light
  "pos - `net.minecraft.util.math.BlockPos`
  light-value - `int`

  returns: `int`"
  (^Integer [^IBlockAccess this ^net.minecraft.util.math.BlockPos pos ^Integer light-value]
    (-> this (.getCombinedLight pos light-value))))

(defn get-block-state
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^IBlockAccess this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockState pos))))

(defn air-block?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^IBlockAccess this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isAirBlock pos))))

(defn get-biome
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^IBlockAccess this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBiome pos))))

(defn get-strong-power
  "pos - `net.minecraft.util.math.BlockPos`
  direction - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^IBlockAccess this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing direction]
    (-> this (.getStrongPower pos direction))))

(defn get-world-type
  "returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^IBlockAccess this]
    (-> this (.getWorldType))))

(defn side-solid?
  "FORGE: isSideSolid, pulled up from World

  pos - Position - `net.minecraft.util.math.BlockPos`
  side - Side - `net.minecraft.util.EnumFacing`
  default - default return value - `boolean`

  returns: if the block is solid on the side - `boolean`"
  (^Boolean [^IBlockAccess this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^Boolean default]
    (-> this (.isSideSolid pos side default))))

