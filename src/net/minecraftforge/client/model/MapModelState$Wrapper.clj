(ns net.minecraftforge.client.model.MapModelState$Wrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model MapModelState$Wrapper]))

(defn ->wrapper
  "Constructor.

  obj - `java.lang.Object`"
  (^MapModelState$Wrapper [^java.lang.Object obj]
    (new MapModelState$Wrapper obj)))

(defn hash-code
  "returns: `int`"
  (^Integer [^MapModelState$Wrapper this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MapModelState$Wrapper this ^java.lang.Object obj]
    (-> this (.equals obj))))

