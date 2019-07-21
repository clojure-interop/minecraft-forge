(ns net.minecraft.util.MapPopulator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util MapPopulator]))

(defn ->map-populator
  "Constructor."
  (^MapPopulator []
    (new MapPopulator )))

(defn *create-map
  "keys - `java.lang.Iterable`
  values - `java.lang.Iterable`

  returns: `<K,V> java.util.Map<K,V>`"
  ([^java.lang.Iterable keys ^java.lang.Iterable values]
    (MapPopulator/createMap keys values)))

(defn *populate-map
  "keys - `java.lang.Iterable`
  values - `java.lang.Iterable`
  map - `java.util.Map`

  returns: `<K,V> java.util.Map<K,V>`"
  ([^java.lang.Iterable keys ^java.lang.Iterable values ^java.util.Map map]
    (MapPopulator/populateMap keys values map)))

