(ns net.minecraft.pathfinding.PathHeap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding PathHeap]))

(defn ->path-heap
  "Constructor."
  (^PathHeap []
    (new PathHeap )))

(defn add-point
  "point - `net.minecraft.pathfinding.PathPoint`

  returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^PathHeap this ^net.minecraft.pathfinding.PathPoint point]
    (-> this (.addPoint point))))

(defn clear-path
  ""
  ([^PathHeap this]
    (-> this (.clearPath))))

(defn dequeue
  "returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^PathHeap this]
    (-> this (.dequeue))))

(defn change-distance
  "point - `net.minecraft.pathfinding.PathPoint`
  distance - `float`"
  ([^PathHeap this ^net.minecraft.pathfinding.PathPoint point ^Float distance]
    (-> this (.changeDistance point distance))))

(defn path-empty?
  "returns: `boolean`"
  (^Boolean [^PathHeap this]
    (-> this (.isPathEmpty))))

