(ns net.minecraftforge.fml.repackage.com.nothome.delta.Checksum
  "Checksum computation class."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta Checksum]))

(defn ->checksum
  "Constructor.

  Initialize checksums for source. The checksum for the chunkSize bytes at offset
   chunkSize * i is inserted into a hash map.

  source - `net.minecraftforge.fml.repackage.com.nothome.delta.SeekableSource`
  chunk-size - `int`

  throws: java.io.IOException"
  (^Checksum [^net.minecraftforge.fml.repackage.com.nothome.delta.SeekableSource source ^Integer chunk-size]
    (new Checksum source chunk-size)))

(defn *query-checksum
  "Finds the checksum computed from the buffer.
   Marks, gets, then resets the buffer.

  bb - `java.nio.ByteBuffer`
  len - `int`

  returns: `long`"
  (^Long [^java.nio.ByteBuffer bb ^Integer len]
    (Checksum/queryChecksum bb len)))

(defn *increment-checksum
  "Increments a checksum.

  checksum - initial checksum - `long`
  out - byte leaving view - `byte`
  in - byte entering view - `byte`
  chunk-size - size of chunks - `int`

  returns: new checksum - `long`"
  (^Long [^Long checksum ^Byte out ^Byte in ^Integer chunk-size]
    (Checksum/incrementChecksum checksum out in chunk-size)))

(defn *get-single-hash
  "256 random hash values.

  returns: `char[]`"
  ([]
    (Checksum/getSingleHash )))

(defn find-checksum-index
  "Finds the index of a checksum.

  hashf - `long`

  returns: `int`"
  (^Integer [^Checksum this ^Long hashf]
    (-> this (.findChecksumIndex hashf))))

(defn to-string
  "Returns a debug String.

  returns: `java.lang.String`"
  (^java.lang.String [^Checksum this]
    (-> this (.toString))))

