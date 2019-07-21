(ns net.minecraft.world.chunk.storage.RegionFileCache
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage RegionFileCache]))

(defn ->region-file-cache
  "Constructor."
  (^RegionFileCache []
    (new RegionFileCache )))

(defn *create-or-load-region-file
  "world-dir - `java.io.File`
  chunk-x - `int`
  chunk-z - `int`

  returns: `net.minecraft.world.chunk.storage.RegionFile`"
  (^net.minecraft.world.chunk.storage.RegionFile [^java.io.File world-dir ^Integer chunk-x ^Integer chunk-z]
    (RegionFileCache/createOrLoadRegionFile world-dir chunk-x chunk-z)))

(defn *get-region-file-if-exists
  "p-191065-0 - `java.io.File`
  p-191065-1 - `int`
  p-191065-2 - `int`

  returns: `net.minecraft.world.chunk.storage.RegionFile`"
  (^net.minecraft.world.chunk.storage.RegionFile [^java.io.File p-191065-0 ^Integer p-191065-1 ^Integer p-191065-2]
    (RegionFileCache/getRegionFileIfExists p-191065-0 p-191065-1 p-191065-2)))

(defn *clear-region-file-references
  ""
  ([]
    (RegionFileCache/clearRegionFileReferences )))

(defn *get-chunk-input-stream
  "world-dir - `java.io.File`
  chunk-x - `int`
  chunk-z - `int`

  returns: `java.io.DataInputStream`"
  (^java.io.DataInputStream [^java.io.File world-dir ^Integer chunk-x ^Integer chunk-z]
    (RegionFileCache/getChunkInputStream world-dir chunk-x chunk-z)))

(defn *get-chunk-output-stream
  "world-dir - `java.io.File`
  chunk-x - `int`
  chunk-z - `int`

  returns: `java.io.DataOutputStream`"
  (^java.io.DataOutputStream [^java.io.File world-dir ^Integer chunk-x ^Integer chunk-z]
    (RegionFileCache/getChunkOutputStream world-dir chunk-x chunk-z)))

(defn *chunk-exists
  "p-191064-0 - `java.io.File`
  p-191064-1 - `int`
  p-191064-2 - `int`

  returns: `boolean`"
  (^Boolean [^java.io.File p-191064-0 ^Integer p-191064-1 ^Integer p-191064-2]
    (RegionFileCache/chunkExists p-191064-0 p-191064-1 p-191064-2)))

