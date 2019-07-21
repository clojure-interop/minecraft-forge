(ns net.minecraftforge.common.config.Configuration$UnicodeInputStreamReader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.config Configuration$UnicodeInputStreamReader]))

(defn ->unicode-input-stream-reader
  "Constructor.

  source - `java.io.InputStream`
  encoding - `java.lang.String`

  throws: java.io.IOException"
  (^Configuration$UnicodeInputStreamReader [^java.io.InputStream source ^java.lang.String encoding]
    (new Configuration$UnicodeInputStreamReader source encoding)))

(defn get-encoding
  "returns: `java.lang.String`"
  (^java.lang.String [^Configuration$UnicodeInputStreamReader this]
    (-> this (.getEncoding))))

(defn read
  "cbuf - `char[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^Configuration$UnicodeInputStreamReader this cbuf ^Integer off ^Integer len]
    (-> this (.read cbuf off len))))

(defn close
  "throws: java.io.IOException"
  ([^Configuration$UnicodeInputStreamReader this]
    (-> this (.close))))

