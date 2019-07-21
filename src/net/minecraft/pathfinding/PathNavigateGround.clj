(ns net.minecraft.pathfinding.PathNavigateGround
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding PathNavigateGround]))

(defn ->path-navigate-ground
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`
  world-in - `net.minecraft.world.World`"
  (^PathNavigateGround [^net.minecraft.entity.EntityLiving entityliving-in ^net.minecraft.world.World world-in]
    (new PathNavigateGround entityliving-in world-in)))

(defn get-path-to-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^PathNavigateGround this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPathToPos pos))))

(defn get-path-to-entity-living
  "entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^PathNavigateGround this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getPathToEntityLiving entity-in))))

(defn set-break-doors
  "can-break-doors - `boolean`"
  ([^PathNavigateGround this ^Boolean can-break-doors]
    (-> this (.setBreakDoors can-break-doors))))

(defn set-enter-doors
  "enter-doors - `boolean`"
  ([^PathNavigateGround this ^Boolean enter-doors]
    (-> this (.setEnterDoors enter-doors))))

(defn get-enter-doors?
  "returns: `boolean`"
  (^Boolean [^PathNavigateGround this]
    (-> this (.getEnterDoors))))

(defn set-can-swim
  "can-swim - `boolean`"
  ([^PathNavigateGround this ^Boolean can-swim]
    (-> this (.setCanSwim can-swim))))

(defn get-can-swim?
  "returns: `boolean`"
  (^Boolean [^PathNavigateGround this]
    (-> this (.getCanSwim))))

(defn set-avoid-sun
  "avoid-sun - `boolean`"
  ([^PathNavigateGround this ^Boolean avoid-sun]
    (-> this (.setAvoidSun avoid-sun))))

