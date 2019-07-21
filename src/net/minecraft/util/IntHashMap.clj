(ns net.minecraft.util.IntHashMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util IntHashMap]))

(defn ->int-hash-map
  "Constructor."
  (^IntHashMap []
    (new IntHashMap )))

(defn lookup
  "hash-entry - `int`

  returns: `V`"
  ([^IntHashMap this ^Integer hash-entry]
    (-> this (.lookup hash-entry))))

(defn contains-item
  "hash-entry - `int`

  returns: `boolean`"
  (^Boolean [^IntHashMap this ^Integer hash-entry]
    (-> this (.containsItem hash-entry))))

(defn add-key
  "hash-entry - `int`
  value-entry - `V`"
  ([^IntHashMap this ^Integer hash-entry value-entry]
    (-> this (.addKey hash-entry value-entry))))

(defn remove-object
  "p-76049-1 - `int`

  returns: `V`"
  ([^IntHashMap this ^Integer p-76049-1]
    (-> this (.removeObject p-76049-1))))

(defn clear-map
  ""
  ([^IntHashMap this]
    (-> this (.clearMap))))

