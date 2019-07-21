(ns net.minecraft.util.MouseHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util MouseHelper]))

(defn ->mouse-helper
  "Constructor."
  (^MouseHelper []
    (new MouseHelper )))

(defn delta-x
  "Instance Field.

  type: int"
  (^Integer [^MouseHelper this]
    (-> this .-deltaX)))

(defn delta-y
  "Instance Field.

  type: int"
  (^Integer [^MouseHelper this]
    (-> this .-deltaY)))

(defn grab-mouse-cursor
  ""
  ([^MouseHelper this]
    (-> this (.grabMouseCursor))))

(defn ungrab-mouse-cursor
  ""
  ([^MouseHelper this]
    (-> this (.ungrabMouseCursor))))

(defn mouse-xy-change
  ""
  ([^MouseHelper this]
    (-> this (.mouseXYChange))))

