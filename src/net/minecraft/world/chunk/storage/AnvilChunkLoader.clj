(ns net.minecraft.world.chunk.storage.AnvilChunkLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage AnvilChunkLoader]))

(defn ->anvil-chunk-loader
  "Constructor.

  chunk-save-location-in - `java.io.File`
  data-fixer-in - `net.minecraft.util.datafix.DataFixer`"
  (^AnvilChunkLoader [^java.io.File chunk-save-location-in ^net.minecraft.util.datafix.DataFixer data-fixer-in]
    (new AnvilChunkLoader chunk-save-location-in data-fixer-in)))

(defn chunk-save-location
  "Instance Constant.

  type: java.io.File"
  (^java.io.File [^AnvilChunkLoader this]
    (-> this .-chunkSaveLocation)))

(defn *register-fixes
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (AnvilChunkLoader/registerFixes fixer)))

(defn *read-chunk-entity
  "compound - `net.minecraft.nbt.NBTTagCompound`
  world-in - `net.minecraft.world.World`
  chunk-in - `net.minecraft.world.chunk.Chunk`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^net.minecraft.nbt.NBTTagCompound compound ^net.minecraft.world.World world-in ^net.minecraft.world.chunk.Chunk chunk-in]
    (AnvilChunkLoader/readChunkEntity compound world-in chunk-in)))

(defn *read-world-entity-pos
  "compound - `net.minecraft.nbt.NBTTagCompound`
  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  attempt-spawn - `boolean`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^net.minecraft.nbt.NBTTagCompound compound ^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Boolean attempt-spawn]
    (AnvilChunkLoader/readWorldEntityPos compound world-in x y z attempt-spawn)))

(defn *spawn-entity
  "entity-in - `net.minecraft.entity.Entity`
  world-in - `net.minecraft.world.World`"
  ([^net.minecraft.entity.Entity entity-in ^net.minecraft.world.World world-in]
    (AnvilChunkLoader/spawnEntity entity-in world-in)))

(defn *read-world-entity
  "compound - `net.minecraft.nbt.NBTTagCompound`
  world-in - `net.minecraft.world.World`
  p-186051-2 - `boolean`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^net.minecraft.nbt.NBTTagCompound compound ^net.minecraft.world.World world-in ^Boolean p-186051-2]
    (AnvilChunkLoader/readWorldEntity compound world-in p-186051-2)))

(defn save-extra-chunk-data
  "world-in - `net.minecraft.world.World`
  chunk-in - `net.minecraft.world.chunk.Chunk`

  throws: java.io.IOException"
  ([^AnvilChunkLoader this ^net.minecraft.world.World world-in ^net.minecraft.world.chunk.Chunk chunk-in]
    (-> this (.saveExtraChunkData world-in chunk-in))))

(defn load-entities
  "world-in - `net.minecraft.world.World`
  compound - `net.minecraft.nbt.NBTTagCompound`
  chunk - `net.minecraft.world.chunk.Chunk`"
  ([^AnvilChunkLoader this ^net.minecraft.world.World world-in ^net.minecraft.nbt.NBTTagCompound compound ^net.minecraft.world.chunk.Chunk chunk]
    (-> this (.loadEntities world-in compound chunk))))

(defn chunk-exists
  "world - `net.minecraft.world.World`
  x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^AnvilChunkLoader this ^net.minecraft.world.World world ^Integer x ^Integer z]
    (-> this (.chunkExists world x z))))

(defn load-chunk
  "world-in - `net.minecraft.world.World`
  x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`

  throws: java.io.IOException"
  (^net.minecraft.world.chunk.Chunk [^AnvilChunkLoader this ^net.minecraft.world.World world-in ^Integer x ^Integer z]
    (-> this (.loadChunk world-in x z))))

(defn load-chunk-async
  "world-in - `net.minecraft.world.World`
  x - `int`
  z - `int`

  returns: `java.lang.Object[]`

  throws: java.io.IOException"
  ([^AnvilChunkLoader this ^net.minecraft.world.World world-in ^Integer x ^Integer z]
    (-> this (.loadChunk__Async world-in x z))))

(defn save-extra-data
  ""
  ([^AnvilChunkLoader this]
    (-> this (.saveExtraData))))

(defn chunk-tick
  ""
  ([^AnvilChunkLoader this]
    (-> this (.chunkTick))))

(defn chunk-generated-at?
  "p-191063-1 - `int`
  p-191063-2 - `int`

  returns: `boolean`"
  (^Boolean [^AnvilChunkLoader this ^Integer p-191063-1 ^Integer p-191063-2]
    (-> this (.isChunkGeneratedAt p-191063-1 p-191063-2))))

(defn write-next-io
  "returns: `boolean`"
  (^Boolean [^AnvilChunkLoader this]
    (-> this (.writeNextIO))))

(defn save-chunk
  "world-in - `net.minecraft.world.World`
  chunk-in - `net.minecraft.world.chunk.Chunk`

  throws: net.minecraft.world.MinecraftException"
  ([^AnvilChunkLoader this ^net.minecraft.world.World world-in ^net.minecraft.world.chunk.Chunk chunk-in]
    (-> this (.saveChunk world-in chunk-in))))

