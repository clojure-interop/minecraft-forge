(ns net.minecraftforge.fml.repackage.com.nothome.delta.DiffWriter
  "Interface for DIFF writers."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta DiffWriter]))

(defn add-copy
  "Add a GDIFF copy instruction.

  offset - `long`
  length - `int`

  throws: java.io.IOException"
  ([^DiffWriter this ^Long offset ^Integer length]
    (-> this (.addCopy offset length))))

(defn add-data
  "Add a GDIFF data instruction.
   Implementors should buffer the data.

  b - `byte`

  throws: java.io.IOException"
  ([^DiffWriter this ^Byte b]
    (-> this (.addData b))))

(defn flush
  "Flushes to output, e.g. any data added.

  throws: java.io.IOException"
  ([^DiffWriter this]
    (-> this (.flush))))

(defn close
  "Closes this stream.
   Note that DiffWriter will invoke this method at the end.

  throws: java.io.IOException"
  ([^DiffWriter this]
    (-> this (.close))))

