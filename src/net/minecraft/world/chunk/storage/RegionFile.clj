(ns net.minecraft.world.chunk.storage.RegionFile
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage RegionFile]))

(defn ->region-file
  "Constructor.

  file-name-in - `java.io.File`"
  (^RegionFile [^java.io.File file-name-in]
    (new RegionFile file-name-in)))

(defn chunk-exists
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^RegionFile this ^Integer x ^Integer z]
    (-> this (.chunkExists x z))))

(defn get-chunk-data-input-stream
  "x - `int`
  z - `int`

  returns: `java.io.DataInputStream`"
  (^java.io.DataInputStream [^RegionFile this ^Integer x ^Integer z]
    (-> this (.getChunkDataInputStream x z))))

(defn get-chunk-data-output-stream
  "x - `int`
  z - `int`

  returns: `java.io.DataOutputStream`"
  (^java.io.DataOutputStream [^RegionFile this ^Integer x ^Integer z]
    (-> this (.getChunkDataOutputStream x z))))

(defn chunk-saved?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^RegionFile this ^Integer x ^Integer z]
    (-> this (.isChunkSaved x z))))

(defn close
  "throws: java.io.IOException"
  ([^RegionFile this]
    (-> this (.close))))

