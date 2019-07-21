(ns net.minecraft.util.math.Cartesian
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math Cartesian]))

(defn ->cartesian
  "Constructor."
  (^Cartesian []
    (new Cartesian )))

(defn *cartesian-product
  "clazz - `java.lang.Class`
  sets - `java.lang.Iterable`

  returns: `<T> java.lang.Iterable<T[]>`"
  ([^java.lang.Class clazz ^java.lang.Iterable sets]
    (Cartesian/cartesianProduct clazz sets))
  ([^java.lang.Iterable sets]
    (Cartesian/cartesianProduct sets)))

