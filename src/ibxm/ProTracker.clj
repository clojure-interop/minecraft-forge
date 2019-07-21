(ns ibxm.ProTracker
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm ProTracker]))

(defn ->pro-tracker
  "Constructor."
  (^ProTracker []
    (new ProTracker )))

(defn *mod?
  "header-1084-bytes - `byte[]`

  returns: `boolean`"
  (^Boolean [header-1084-bytes]
    (ProTracker/is_mod header-1084-bytes)))

(defn *load-mod
  "header-1084-bytes - `byte[]`
  data-input - `java.io.DataInput`

  returns: `ibxm.Module`

  throws: java.io.IOException"
  (^ibxm.Module [header-1084-bytes ^java.io.DataInput data-input]
    (ProTracker/load_mod header-1084-bytes data-input)))

