(ns ibxm.ScreamTracker3
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm ScreamTracker3]))

(defn ->scream-tracker-3
  "Constructor."
  (^ScreamTracker3 []
    (new ScreamTracker3 )))

(defn *s-3m?
  "header-96-bytes - `byte[]`

  returns: `boolean`"
  (^Boolean [header-96-bytes]
    (ScreamTracker3/is_s3m header-96-bytes)))

(defn *load-s-3m
  "header-96-bytes - `byte[]`
  data-input - `java.io.DataInput`

  returns: `ibxm.Module`

  throws: java.io.IOException"
  (^ibxm.Module [header-96-bytes ^java.io.DataInput data-input]
    (ScreamTracker3/load_s3m header-96-bytes data-input)))

