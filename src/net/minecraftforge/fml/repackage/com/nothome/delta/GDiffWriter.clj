(ns net.minecraftforge.fml.repackage.com.nothome.delta.GDiffWriter
  "Outputs a diff following the GDIFF file specification available at
  http://www.w3.org/TR/NOTE-gdiff-19970901.html."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta GDiffWriter]))

(defn ->g-diff-writer
  "Constructor.

  Constructs a new GDiffWriter.

  os - `java.io.DataOutputStream`

  throws: java.io.IOException"
  (^GDiffWriter [^java.io.DataOutputStream os]
    (new GDiffWriter os)))

(def *-chunk-size
  "Static Constant.

  Max length of a chunk.

  type: int"
  GDiffWriter/CHUNK_SIZE)

(def *-eof
  "Static Constant.

  type: byte"
  GDiffWriter/EOF)

(def *-data-max
  "Static Constant.

  Max length for single length data encode.

  type: int"
  GDiffWriter/DATA_MAX)

(def *-data-ushort
  "Static Constant.

  type: int"
  GDiffWriter/DATA_USHORT)

(def *-data-int
  "Static Constant.

  type: int"
  GDiffWriter/DATA_INT)

(def *-copy-ushort-ubyte
  "Static Constant.

  type: int"
  GDiffWriter/COPY_USHORT_UBYTE)

(def *-copy-ushort-ushort
  "Static Constant.

  type: int"
  GDiffWriter/COPY_USHORT_USHORT)

(def *-copy-ushort-int
  "Static Constant.

  type: int"
  GDiffWriter/COPY_USHORT_INT)

(def *-copy-int-ubyte
  "Static Constant.

  type: int"
  GDiffWriter/COPY_INT_UBYTE)

(def *-copy-int-ushort
  "Static Constant.

  type: int"
  GDiffWriter/COPY_INT_USHORT)

(def *-copy-int-int
  "Static Constant.

  type: int"
  GDiffWriter/COPY_INT_INT)

(def *-copy-long-int
  "Static Constant.

  type: int"
  GDiffWriter/COPY_LONG_INT)

(defn add-copy
  "Description copied from interface: DiffWriter

  offset - `long`
  length - `int`

  throws: java.io.IOException"
  ([^GDiffWriter this ^Long offset ^Integer length]
    (-> this (.addCopy offset length))))

(defn add-data
  "Adds a data byte.

  b - `byte`

  throws: java.io.IOException"
  ([^GDiffWriter this ^Byte b]
    (-> this (.addData b))))

(defn flush
  "Flushes accumulated data bytes, if any.

  throws: java.io.IOException"
  ([^GDiffWriter this]
    (-> this (.flush))))

(defn close
  "Writes the final EOF byte, closes the underlying stream.

  throws: java.io.IOException"
  ([^GDiffWriter this]
    (-> this (.close))))

