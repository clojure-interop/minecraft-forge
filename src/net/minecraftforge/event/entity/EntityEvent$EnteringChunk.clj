(ns net.minecraftforge.event.entity.EntityEvent$EnteringChunk
  "EnteringChunk is fired when an Entity enters a chunk.
  This event is fired whenever vanilla Minecraft determines that an entity
  is entering a chunk in Chunk.addEntity(net.minecraft.entity.Entity)

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity EntityEvent$EnteringChunk]))

(defn ->entering-chunk
  "Constructor.

  entity - `net.minecraft.entity.Entity`
  new-chunk-x - `int`
  new-chunk-z - `int`
  old-chunk-x - `int`
  old-chunk-z - `int`"
  (^EntityEvent$EnteringChunk [^net.minecraft.entity.Entity entity ^Integer new-chunk-x ^Integer new-chunk-z ^Integer old-chunk-x ^Integer old-chunk-z]
    (new EntityEvent$EnteringChunk entity new-chunk-x new-chunk-z old-chunk-x old-chunk-z)))

(defn get-new-chunk-x
  "returns: `int`"
  (^Integer [^EntityEvent$EnteringChunk this]
    (-> this (.getNewChunkX))))

(defn set-new-chunk-x
  "new-chunk-x - `int`"
  ([^EntityEvent$EnteringChunk this ^Integer new-chunk-x]
    (-> this (.setNewChunkX new-chunk-x))))

(defn get-new-chunk-z
  "returns: `int`"
  (^Integer [^EntityEvent$EnteringChunk this]
    (-> this (.getNewChunkZ))))

(defn set-new-chunk-z
  "new-chunk-z - `int`"
  ([^EntityEvent$EnteringChunk this ^Integer new-chunk-z]
    (-> this (.setNewChunkZ new-chunk-z))))

(defn get-old-chunk-x
  "returns: `int`"
  (^Integer [^EntityEvent$EnteringChunk this]
    (-> this (.getOldChunkX))))

(defn set-old-chunk-x
  "old-chunk-x - `int`"
  ([^EntityEvent$EnteringChunk this ^Integer old-chunk-x]
    (-> this (.setOldChunkX old-chunk-x))))

(defn get-old-chunk-z
  "returns: `int`"
  (^Integer [^EntityEvent$EnteringChunk this]
    (-> this (.getOldChunkZ))))

(defn set-old-chunk-z
  "old-chunk-z - `int`"
  ([^EntityEvent$EnteringChunk this ^Integer old-chunk-z]
    (-> this (.setOldChunkZ old-chunk-z))))

