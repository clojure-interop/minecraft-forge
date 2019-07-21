(ns net.minecraft.pathfinding.PathNavigateClimber
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding PathNavigateClimber]))

(defn ->path-navigate-climber
  "Constructor.

  entity-living-in - `net.minecraft.entity.EntityLiving`
  world-in - `net.minecraft.world.World`"
  (^PathNavigateClimber [^net.minecraft.entity.EntityLiving entity-living-in ^net.minecraft.world.World world-in]
    (new PathNavigateClimber entity-living-in world-in)))

(defn get-path-to-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^PathNavigateClimber this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPathToPos pos))))

(defn get-path-to-entity-living
  "entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^PathNavigateClimber this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getPathToEntityLiving entity-in))))

(defn try-move-to-entity-living
  "entity-in - `net.minecraft.entity.Entity`
  speed-in - `double`

  returns: `boolean`"
  (^Boolean [^PathNavigateClimber this ^net.minecraft.entity.Entity entity-in ^Double speed-in]
    (-> this (.tryMoveToEntityLiving entity-in speed-in))))

(defn on-update-navigation
  ""
  ([^PathNavigateClimber this]
    (-> this (.onUpdateNavigation))))

