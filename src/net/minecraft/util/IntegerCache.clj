(ns net.minecraft.util.IntegerCache
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util IntegerCache]))

(defn ->integer-cache
  "Constructor."
  (^IntegerCache []
    (new IntegerCache )))

(defn *get-integer
  "value - `int`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Integer value]
    (IntegerCache/getInteger value)))

