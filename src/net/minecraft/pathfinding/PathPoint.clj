(ns net.minecraft.pathfinding.PathPoint
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding PathPoint]))

(defn ->path-point
  "Constructor.

  x - `int`
  y - `int`
  z - `int`"
  (^PathPoint [^Integer x ^Integer y ^Integer z]
    (new PathPoint x y z)))

(defn x-coord
  "Instance Constant.

  type: int"
  (^Integer [^PathPoint this]
    (-> this .-xCoord)))

(defn y-coord
  "Instance Constant.

  type: int"
  (^Integer [^PathPoint this]
    (-> this .-yCoord)))

(defn z-coord
  "Instance Constant.

  type: int"
  (^Integer [^PathPoint this]
    (-> this .-zCoord)))

(defn index
  "Instance Field.

  type: int"
  (^Integer [^PathPoint this]
    (-> this .-index)))

(defn total-path-distance
  "Instance Field.

  type: float"
  (^Float [^PathPoint this]
    (-> this .-totalPathDistance)))

(defn distance-to-next
  "Instance Field.

  type: float"
  (^Float [^PathPoint this]
    (-> this .-distanceToNext)))

(defn distance-to-target
  "Instance Field.

  type: float"
  (^Float [^PathPoint this]
    (-> this .-distanceToTarget)))

(defn previous
  "Instance Field.

  type: net.minecraft.pathfinding.PathPoint"
  (^net.minecraft.pathfinding.PathPoint [^PathPoint this]
    (-> this .-previous)))

(defn visited
  "Instance Field.

  type: boolean"
  (^Boolean [^PathPoint this]
    (-> this .-visited)))

(defn distance-from-origin
  "Instance Field.

  type: float"
  (^Float [^PathPoint this]
    (-> this .-distanceFromOrigin)))

(defn cost
  "Instance Field.

  type: float"
  (^Float [^PathPoint this]
    (-> this .-cost)))

(defn cost-malus
  "Instance Field.

  type: float"
  (^Float [^PathPoint this]
    (-> this .-costMalus)))

(defn node-type
  "Instance Field.

  type: net.minecraft.pathfinding.PathNodeType"
  (^net.minecraft.pathfinding.PathNodeType [^PathPoint this]
    (-> this .-nodeType)))

(defn *make-hash
  "x - `int`
  y - `int`
  z - `int`

  returns: `int`"
  (^Integer [^Integer x ^Integer y ^Integer z]
    (PathPoint/makeHash x y z)))

(defn *create-from-buffer
  "buf - `net.minecraft.network.PacketBuffer`

  returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^net.minecraft.network.PacketBuffer buf]
    (PathPoint/createFromBuffer buf)))

(defn clone-move
  "x - `int`
  y - `int`
  z - `int`

  returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^PathPoint this ^Integer x ^Integer y ^Integer z]
    (-> this (.cloneMove x y z))))

(defn distance-to
  "pathpoint-in - `net.minecraft.pathfinding.PathPoint`

  returns: `float`"
  (^Float [^PathPoint this ^net.minecraft.pathfinding.PathPoint pathpoint-in]
    (-> this (.distanceTo pathpoint-in))))

(defn distance-to-squared
  "pathpoint-in - `net.minecraft.pathfinding.PathPoint`

  returns: `float`"
  (^Float [^PathPoint this ^net.minecraft.pathfinding.PathPoint pathpoint-in]
    (-> this (.distanceToSquared pathpoint-in))))

(defn distance-manhattan
  "p-186281-1 - `net.minecraft.pathfinding.PathPoint`

  returns: `float`"
  (^Float [^PathPoint this ^net.minecraft.pathfinding.PathPoint p-186281-1]
    (-> this (.distanceManhattan p-186281-1))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PathPoint this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PathPoint this]
    (-> this (.hashCode))))

(defn assigned?
  "returns: `boolean`"
  (^Boolean [^PathPoint this]
    (-> this (.isAssigned))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PathPoint this]
    (-> this (.toString))))

