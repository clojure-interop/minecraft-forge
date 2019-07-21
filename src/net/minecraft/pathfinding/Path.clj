(ns net.minecraft.pathfinding.Path
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding Path]))

(defn ->path
  "Constructor.

  pathpoints - `net.minecraft.pathfinding.PathPoint[]`"
  (^Path [pathpoints]
    (new Path pathpoints)))

(defn *read
  "buf - `net.minecraft.network.PacketBuffer`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^net.minecraft.network.PacketBuffer buf]
    (Path/read buf)))

(defn get-current-path-length
  "returns: `int`"
  (^Integer [^Path this]
    (-> this (.getCurrentPathLength))))

(defn get-current-pos
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Path this]
    (-> this (.getCurrentPos))))

(defn get-position
  "entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Path this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getPosition entity-in))))

(defn set-current-path-index
  "current-path-index-in - `int`"
  ([^Path this ^Integer current-path-index-in]
    (-> this (.setCurrentPathIndex current-path-index-in))))

(defn get-vector-from-index
  "entity-in - `net.minecraft.entity.Entity`
  index - `int`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Path this ^net.minecraft.entity.Entity entity-in ^Integer index]
    (-> this (.getVectorFromIndex entity-in index))))

(defn increment-path-index
  ""
  ([^Path this]
    (-> this (.incrementPathIndex))))

(defn get-final-path-point
  "returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^Path this]
    (-> this (.getFinalPathPoint))))

(defn get-path-point-from-index
  "index - `int`

  returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^Path this ^Integer index]
    (-> this (.getPathPointFromIndex index))))

(defn get-open-set
  "returns: `net.minecraft.pathfinding.PathPoint[]`"
  ([^Path this]
    (-> this (.getOpenSet))))

(defn set-current-path-length
  "length - `int`"
  ([^Path this ^Integer length]
    (-> this (.setCurrentPathLength length))))

(defn same-path?
  "pathentity-in - `net.minecraft.pathfinding.Path`

  returns: `boolean`"
  (^Boolean [^Path this ^net.minecraft.pathfinding.Path pathentity-in]
    (-> this (.isSamePath pathentity-in))))

(defn get-target
  "returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^Path this]
    (-> this (.getTarget))))

(defn get-closed-set
  "returns: `net.minecraft.pathfinding.PathPoint[]`"
  ([^Path this]
    (-> this (.getClosedSet))))

(defn get-current-path-index
  "returns: `int`"
  (^Integer [^Path this]
    (-> this (.getCurrentPathIndex))))

(defn set-point
  "index - `int`
  point - `net.minecraft.pathfinding.PathPoint`"
  ([^Path this ^Integer index ^net.minecraft.pathfinding.PathPoint point]
    (-> this (.setPoint index point))))

(defn finished?
  "returns: `boolean`"
  (^Boolean [^Path this]
    (-> this (.isFinished))))

