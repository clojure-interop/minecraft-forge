(ns net.minecraft.block.BlockMagma
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockMagma]))

(defn ->block-magma
  "Constructor."
  (^BlockMagma []
    (new BlockMagma )))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockMagma this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn on-entity-walk
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-in - `net.minecraft.entity.Entity`"
  ([^BlockMagma this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityWalk world-in pos entity-in))))

(defn get-packed-lightmap-coords
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BlockMagma this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPackedLightmapCoords state source pos))))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockMagma this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn can-entity-spawn?
  "state - `net.minecraft.block.state.IBlockState`
  entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^BlockMagma this ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.Entity entity-in]
    (-> this (.canEntitySpawn state entity-in))))

