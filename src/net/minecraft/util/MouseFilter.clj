(ns net.minecraft.util.MouseFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util MouseFilter]))

(defn ->mouse-filter
  "Constructor."
  (^MouseFilter []
    (new MouseFilter )))

(defn smooth
  "p-76333-1 - `float`
  p-76333-2 - `float`

  returns: `float`"
  (^Float [^MouseFilter this ^Float p-76333-1 ^Float p-76333-2]
    (-> this (.smooth p-76333-1 p-76333-2))))

(defn reset
  ""
  ([^MouseFilter this]
    (-> this (.reset))))

