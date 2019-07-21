(ns net.minecraftforge.event.world.WorldEvent$PotentialSpawns
  "Called by WorldServer to gather a list of all possible entities that can spawn at the specified location.
  If an entry is added to the list, it needs to be a globally unique instance.
  The event is called in WorldServer.getSpawnListEntryForTypeAt(EnumCreatureType, BlockPos) as well as
  WorldServer#canCreatureTypeSpawnHere(EnumCreatureType, SpawnListEntry, BlockPos)
  where the latter checks for identity, meaning both events must add the same instance.
  Canceling the event will result in a empty list, meaning no entity will be spawned."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world WorldEvent$PotentialSpawns]))

(defn ->potential-spawns
  "Constructor.

  world - `net.minecraft.world.World`
  type - `net.minecraft.entity.EnumCreatureType`
  pos - `net.minecraft.util.math.BlockPos`
  old-list - `java.util.List`"
  (^WorldEvent$PotentialSpawns [^net.minecraft.world.World world ^net.minecraft.entity.EnumCreatureType type ^net.minecraft.util.math.BlockPos pos ^java.util.List old-list]
    (new WorldEvent$PotentialSpawns world type pos old-list)))

(defn get-type
  "returns: `net.minecraft.entity.EnumCreatureType`"
  (^net.minecraft.entity.EnumCreatureType [^WorldEvent$PotentialSpawns this]
    (-> this (.getType))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^WorldEvent$PotentialSpawns this]
    (-> this (.getPos))))

(defn get-list
  "returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^WorldEvent$PotentialSpawns this]
    (-> this (.getList))))

