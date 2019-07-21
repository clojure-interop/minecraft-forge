(ns net.minecraftforge.fml.repackage.com.nothome.delta.DebugDiffWriter
  "For debugging patch generation."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta DebugDiffWriter]))

(defn ->debug-diff-writer
  "Constructor.

  Constructs a new DebugDiffWriter."
  (^DebugDiffWriter []
    (new DebugDiffWriter )))

(defn add-copy
  "Description copied from interface: DiffWriter

  offset - `long`
  length - `int`

  throws: java.io.IOException"
  ([^DebugDiffWriter this ^Long offset ^Integer length]
    (-> this (.addCopy offset length))))

(defn add-data
  "Description copied from interface: DiffWriter

  b - `byte`

  throws: java.io.IOException"
  ([^DebugDiffWriter this ^Byte b]
    (-> this (.addData b))))

(defn flush
  "Description copied from interface: DiffWriter

  throws: java.io.IOException"
  ([^DebugDiffWriter this]
    (-> this (.flush))))

(defn close
  "Description copied from interface: DiffWriter

  throws: java.io.IOException"
  ([^DebugDiffWriter this]
    (-> this (.close))))

