(ns net.minecraft.pathfinding.NodeProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding NodeProcessor]))

(defn ->node-processor
  "Constructor."
  (^NodeProcessor []
    (new NodeProcessor )))

(defn get-can-break-doors?
  "returns: `boolean`"
  (^Boolean [^NodeProcessor this]
    (-> this (.getCanBreakDoors))))

(defn set-can-enter-doors
  "can-enter-doors-in - `boolean`"
  ([^NodeProcessor this ^Boolean can-enter-doors-in]
    (-> this (.setCanEnterDoors can-enter-doors-in))))

(defn init-processor
  "source-in - `net.minecraft.world.IBlockAccess`
  mob - `net.minecraft.entity.EntityLiving`"
  ([^NodeProcessor this ^net.minecraft.world.IBlockAccess source-in ^net.minecraft.entity.EntityLiving mob]
    (-> this (.initProcessor source-in mob))))

(defn get-path-node-type
  "blockaccess-in - `net.minecraft.world.IBlockAccess`
  x - `int`
  y - `int`
  z - `int`
  entityliving-in - `net.minecraft.entity.EntityLiving`
  x-size - `int`
  y-size - `int`
  z-size - `int`
  can-break-doors-in - `boolean`
  can-enter-doors-in - `boolean`

  returns: `net.minecraft.pathfinding.PathNodeType`"
  (^net.minecraft.pathfinding.PathNodeType [^NodeProcessor this ^net.minecraft.world.IBlockAccess blockaccess-in ^Integer x ^Integer y ^Integer z ^net.minecraft.entity.EntityLiving entityliving-in ^Integer x-size ^Integer y-size ^Integer z-size ^Boolean can-break-doors-in ^Boolean can-enter-doors-in]
    (-> this (.getPathNodeType blockaccess-in x y z entityliving-in x-size y-size z-size can-break-doors-in can-enter-doors-in)))
  (^net.minecraft.pathfinding.PathNodeType [^NodeProcessor this ^net.minecraft.world.IBlockAccess blockaccess-in ^Integer x ^Integer y ^Integer z]
    (-> this (.getPathNodeType blockaccess-in x y z))))

(defn get-can-swim?
  "returns: `boolean`"
  (^Boolean [^NodeProcessor this]
    (-> this (.getCanSwim))))

(defn get-can-enter-doors?
  "returns: `boolean`"
  (^Boolean [^NodeProcessor this]
    (-> this (.getCanEnterDoors))))

(defn set-can-swim
  "can-swim-in - `boolean`"
  ([^NodeProcessor this ^Boolean can-swim-in]
    (-> this (.setCanSwim can-swim-in))))

(defn find-path-options
  "path-options - `net.minecraft.pathfinding.PathPoint[]`
  current-point - `net.minecraft.pathfinding.PathPoint`
  target-point - `net.minecraft.pathfinding.PathPoint`
  max-distance - `float`

  returns: `int`"
  (^Integer [^NodeProcessor this path-options ^net.minecraft.pathfinding.PathPoint current-point ^net.minecraft.pathfinding.PathPoint target-point ^Float max-distance]
    (-> this (.findPathOptions path-options current-point target-point max-distance))))

(defn post-process
  ""
  ([^NodeProcessor this]
    (-> this (.postProcess))))

(defn set-can-break-doors
  "can-break-doors-in - `boolean`"
  ([^NodeProcessor this ^Boolean can-break-doors-in]
    (-> this (.setCanBreakDoors can-break-doors-in))))

(defn get-start
  "returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^NodeProcessor this]
    (-> this (.getStart))))

(defn get-path-point-to-coords
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^NodeProcessor this ^Double x ^Double y ^Double z]
    (-> this (.getPathPointToCoords x y z))))

