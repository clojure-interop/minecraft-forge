(ns ibxm.FastTracker2
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm FastTracker2]))

(defn ->fast-tracker-2
  "Constructor."
  (^FastTracker2 []
    (new FastTracker2 )))

(defn *xm?
  "header-60-bytes - `byte[]`

  returns: `boolean`"
  (^Boolean [header-60-bytes]
    (FastTracker2/is_xm header-60-bytes)))

(defn *load-xm
  "header-60-bytes - `byte[]`
  data-input - `java.io.DataInput`

  returns: `ibxm.Module`

  throws: java.io.IOException"
  (^ibxm.Module [header-60-bytes ^java.io.DataInput data-input]
    (FastTracker2/load_xm header-60-bytes data-input)))

