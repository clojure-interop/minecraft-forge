(ns net.minecraft.entity.EntityCreature
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityCreature]))

(defn ->entity-creature
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityCreature [^net.minecraft.world.World world-in]
    (new EntityCreature world-in)))

(def *-fleeing-speed-modifier-uuid
  "Static Constant.

  type: java.util.UUID"
  EntityCreature/FLEEING_SPEED_MODIFIER_UUID)

(def *-fleeing-speed-modifier
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.AttributeModifier"
  EntityCreature/FLEEING_SPEED_MODIFIER)

(defn has-home?
  "returns: `boolean`"
  (^Boolean [^EntityCreature this]
    (-> this (.hasHome))))

(defn get-home-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityCreature this]
    (-> this (.getHomePosition))))

(defn within-home-distance-from-position?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^EntityCreature this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isWithinHomeDistanceFromPosition pos))))

(defn has-path?
  "returns: `boolean`"
  (^Boolean [^EntityCreature this]
    (-> this (.hasPath))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityCreature this]
    (-> this (.getCanSpawnHere))))

(defn within-home-distance-current-position?
  "returns: `boolean`"
  (^Boolean [^EntityCreature this]
    (-> this (.isWithinHomeDistanceCurrentPosition))))

(defn set-home-pos-and-distance
  "pos - `net.minecraft.util.math.BlockPos`
  distance - `int`"
  ([^EntityCreature this ^net.minecraft.util.math.BlockPos pos ^Integer distance]
    (-> this (.setHomePosAndDistance pos distance))))

(defn get-block-path-weight
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^EntityCreature this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockPathWeight pos))))

(defn get-maximum-home-distance
  "returns: `float`"
  (^Float [^EntityCreature this]
    (-> this (.getMaximumHomeDistance))))

(defn detach-home
  ""
  ([^EntityCreature this]
    (-> this (.detachHome))))

