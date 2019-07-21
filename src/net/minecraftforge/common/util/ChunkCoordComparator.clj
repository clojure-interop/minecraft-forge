(ns net.minecraftforge.common.util.ChunkCoordComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util ChunkCoordComparator]))

(defn ->chunk-coord-comparator
  "Constructor.

  entityplayer - `net.minecraft.entity.player.EntityPlayerMP`"
  (^ChunkCoordComparator [^net.minecraft.entity.player.EntityPlayerMP entityplayer]
    (new ChunkCoordComparator entityplayer)))

(defn compare
  "a - `net.minecraft.util.math.ChunkPos`
  b - `net.minecraft.util.math.ChunkPos`

  returns: `int`"
  (^Integer [^ChunkCoordComparator this ^net.minecraft.util.math.ChunkPos a ^net.minecraft.util.math.ChunkPos b]
    (-> this (.compare a b))))

