(ns net.minecraft.network.rcon.RConOutputStream
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.rcon RConOutputStream]))

(defn ->r-con-output-stream
  "Constructor.

  size - `int`"
  (^RConOutputStream [^Integer size]
    (new RConOutputStream size)))

(defn write-byte-array
  "data - `byte[]`

  throws: java.io.IOException"
  ([^RConOutputStream this data]
    (-> this (.writeByteArray data))))

(defn write-string
  "data - `java.lang.String`

  throws: java.io.IOException"
  ([^RConOutputStream this ^java.lang.String data]
    (-> this (.writeString data))))

(defn write-int
  "data - `int`

  throws: java.io.IOException"
  ([^RConOutputStream this ^Integer data]
    (-> this (.writeInt data))))

(defn write-short
  "data - `short`

  throws: java.io.IOException"
  ([^RConOutputStream this ^Short data]
    (-> this (.writeShort data))))

(defn to-byte-array
  "returns: `byte[]`"
  ([^RConOutputStream this]
    (-> this (.toByteArray))))

(defn reset
  ""
  ([^RConOutputStream this]
    (-> this (.reset))))

