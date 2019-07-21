(ns net.minecraft.pathfinding.WalkNodeProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding WalkNodeProcessor]))

(defn ->walk-node-processor
  "Constructor."
  (^WalkNodeProcessor []
    (new WalkNodeProcessor )))

(defn init-processor
  "source-in - `net.minecraft.world.IBlockAccess`
  mob - `net.minecraft.entity.EntityLiving`"
  ([^WalkNodeProcessor this ^net.minecraft.world.IBlockAccess source-in ^net.minecraft.entity.EntityLiving mob]
    (-> this (.initProcessor source-in mob))))

(defn post-process
  ""
  ([^WalkNodeProcessor this]
    (-> this (.postProcess))))

(defn get-start
  "returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^WalkNodeProcessor this]
    (-> this (.getStart))))

(defn get-path-point-to-coords
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.pathfinding.PathPoint`"
  (^net.minecraft.pathfinding.PathPoint [^WalkNodeProcessor this ^Double x ^Double y ^Double z]
    (-> this (.getPathPointToCoords x y z))))

(defn find-path-options
  "path-options - `net.minecraft.pathfinding.PathPoint[]`
  current-point - `net.minecraft.pathfinding.PathPoint`
  target-point - `net.minecraft.pathfinding.PathPoint`
  max-distance - `float`

  returns: `int`"
  (^Integer [^WalkNodeProcessor this path-options ^net.minecraft.pathfinding.PathPoint current-point ^net.minecraft.pathfinding.PathPoint target-point ^Float max-distance]
    (-> this (.findPathOptions path-options current-point target-point max-distance))))

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
  (^net.minecraft.pathfinding.PathNodeType [^WalkNodeProcessor this ^net.minecraft.world.IBlockAccess blockaccess-in ^Integer x ^Integer y ^Integer z ^net.minecraft.entity.EntityLiving entityliving-in ^Integer x-size ^Integer y-size ^Integer z-size ^Boolean can-break-doors-in ^Boolean can-enter-doors-in]
    (-> this (.getPathNodeType blockaccess-in x y z entityliving-in x-size y-size z-size can-break-doors-in can-enter-doors-in)))
  (^net.minecraft.pathfinding.PathNodeType [^WalkNodeProcessor this ^net.minecraft.world.IBlockAccess blockaccess-in ^Integer x ^Integer y ^Integer z]
    (-> this (.getPathNodeType blockaccess-in x y z))))

