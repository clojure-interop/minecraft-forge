(ns net.minecraft.world.WorldEntitySpawner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldEntitySpawner]))

(defn ->world-entity-spawner
  "Constructor."
  (^WorldEntitySpawner []
    (new WorldEntitySpawner )))

(defn *valid-empty-spawn-block?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^net.minecraft.block.state.IBlockState state]
    (WorldEntitySpawner/isValidEmptySpawnBlock state)))

(defn *can-creature-type-spawn-at-location?
  "spawn-placement-type-in - `net.minecraft.entity.EntityLiving$SpawnPlacementType`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLiving$SpawnPlacementType spawn-placement-type-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (WorldEntitySpawner/canCreatureTypeSpawnAtLocation spawn-placement-type-in world-in pos)))

(defn *perform-world-gen-spawning
  "world-in - `net.minecraft.world.World`
  biome-in - `net.minecraft.world.biome.Biome`
  p-77191-2 - `int`
  p-77191-3 - `int`
  p-77191-4 - `int`
  p-77191-5 - `int`
  random-in - `java.util.Random`"
  ([^net.minecraft.world.World world-in ^net.minecraft.world.biome.Biome biome-in ^Integer p-77191-2 ^Integer p-77191-3 ^Integer p-77191-4 ^Integer p-77191-5 ^java.util.Random random-in]
    (WorldEntitySpawner/performWorldGenSpawning world-in biome-in p-77191-2 p-77191-3 p-77191-4 p-77191-5 random-in)))

(defn find-chunks-for-spawning
  "world-server-in - `net.minecraft.world.WorldServer`
  spawn-hostile-mobs - `boolean`
  spawn-peaceful-mobs - `boolean`
  spawn-on-set-tick-rate - `boolean`

  returns: `int`"
  (^Integer [^WorldEntitySpawner this ^net.minecraft.world.WorldServer world-server-in ^Boolean spawn-hostile-mobs ^Boolean spawn-peaceful-mobs ^Boolean spawn-on-set-tick-rate]
    (-> this (.findChunksForSpawning world-server-in spawn-hostile-mobs spawn-peaceful-mobs spawn-on-set-tick-rate))))

