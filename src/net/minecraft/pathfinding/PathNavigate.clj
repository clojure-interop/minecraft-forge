(ns net.minecraft.pathfinding.PathNavigate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding PathNavigate]))

(defn ->path-navigate
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`
  world-in - `net.minecraft.world.World`"
  (^PathNavigate [^net.minecraft.entity.EntityLiving entityliving-in ^net.minecraft.world.World world-in]
    (new PathNavigate entityliving-in world-in)))

(defn set-speed
  "speed-in - `double`"
  ([^PathNavigate this ^Double speed-in]
    (-> this (.setSpeed speed-in))))

(defn get-path-to-entity-living
  "entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^PathNavigate this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getPathToEntityLiving entity-in))))

(defn try-move-to-entity-living
  "entity-in - `net.minecraft.entity.Entity`
  speed-in - `double`

  returns: `boolean`"
  (^Boolean [^PathNavigate this ^net.minecraft.entity.Entity entity-in ^Double speed-in]
    (-> this (.tryMoveToEntityLiving entity-in speed-in))))

(defn update-path
  ""
  ([^PathNavigate this]
    (-> this (.updatePath))))

(defn get-path-to-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^PathNavigate this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPathToPos pos))))

(defn can-entity-stand-on-pos?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^PathNavigate this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canEntityStandOnPos pos))))

(defn set-path
  "pathentity-in - `net.minecraft.pathfinding.Path`
  speed-in - `double`

  returns: `boolean`"
  (^Boolean [^PathNavigate this ^net.minecraft.pathfinding.Path pathentity-in ^Double speed-in]
    (-> this (.setPath pathentity-in speed-in))))

(defn on-update-navigation
  ""
  ([^PathNavigate this]
    (-> this (.onUpdateNavigation))))

(defn can-update-path-on-timeout?
  "returns: `boolean`"
  (^Boolean [^PathNavigate this]
    (-> this (.canUpdatePathOnTimeout))))

(defn get-path
  "returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^PathNavigate this]
    (-> this (.getPath))))

(defn get-path-search-range
  "returns: `float`"
  (^Float [^PathNavigate this]
    (-> this (.getPathSearchRange))))

(defn try-move-to-xyz
  "x - `double`
  y - `double`
  z - `double`
  speed-in - `double`

  returns: `boolean`"
  (^Boolean [^PathNavigate this ^Double x ^Double y ^Double z ^Double speed-in]
    (-> this (.tryMoveToXYZ x y z speed-in))))

(defn no-path
  "returns: `boolean`"
  (^Boolean [^PathNavigate this]
    (-> this (.noPath))))

(defn get-node-processor
  "returns: `net.minecraft.pathfinding.NodeProcessor`"
  (^net.minecraft.pathfinding.NodeProcessor [^PathNavigate this]
    (-> this (.getNodeProcessor))))

(defn clear-path-entity
  ""
  ([^PathNavigate this]
    (-> this (.clearPathEntity))))

(defn get-path-to-xyz
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^PathNavigate this ^Double x ^Double y ^Double z]
    (-> this (.getPathToXYZ x y z))))

