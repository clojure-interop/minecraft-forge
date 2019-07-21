(ns net.minecraft.network.rcon.RConUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.rcon RConUtils]))

(defn ->r-con-utils
  "Constructor."
  (^RConUtils []
    (new RConUtils )))

(def *-hex-digits
  "Static Constant.

  type: char[]"
  RConUtils/HEX_DIGITS)

(defn *get-bytes-as-string
  "p-72661-0 - `byte[]`
  p-72661-1 - `int`
  p-72661-2 - `int`

  returns: `java.lang.String`"
  (^java.lang.String [p-72661-0 ^Integer p-72661-1 ^Integer p-72661-2]
    (RConUtils/getBytesAsString p-72661-0 p-72661-1 p-72661-2)))

(defn *get-remaining-bytes-as-le-int
  "p-72662-0 - `byte[]`
  p-72662-1 - `int`

  returns: `int`"
  (^Integer [p-72662-0 ^Integer p-72662-1]
    (RConUtils/getRemainingBytesAsLEInt p-72662-0 p-72662-1)))

(defn *get-bytes-as-le-int
  "p-72665-0 - `byte[]`
  p-72665-1 - `int`
  p-72665-2 - `int`

  returns: `int`"
  (^Integer [p-72665-0 ^Integer p-72665-1 ^Integer p-72665-2]
    (RConUtils/getBytesAsLEInt p-72665-0 p-72665-1 p-72665-2)))

(defn *get-bytes-as-b-eint
  "p-72664-0 - `byte[]`
  p-72664-1 - `int`
  p-72664-2 - `int`

  returns: `int`"
  (^Integer [p-72664-0 ^Integer p-72664-1 ^Integer p-72664-2]
    (RConUtils/getBytesAsBEint p-72664-0 p-72664-1 p-72664-2)))

(defn *get-byte-as-hex-string
  "input - `byte`

  returns: `java.lang.String`"
  (^java.lang.String [^Byte input]
    (RConUtils/getByteAsHexString input)))

