(ns net.minecraft.entity.passive.EntitySquid
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntitySquid]))

(defn ->entity-squid
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntitySquid [^net.minecraft.world.World world-in]
    (new EntitySquid world-in)))

(defn squid-pitch
  "Instance Field.

  type: float"
  (^Float [^EntitySquid this]
    (-> this .-squidPitch)))

(defn prev-squid-pitch
  "Instance Field.

  type: float"
  (^Float [^EntitySquid this]
    (-> this .-prevSquidPitch)))

(defn squid-yaw
  "Instance Field.

  type: float"
  (^Float [^EntitySquid this]
    (-> this .-squidYaw)))

(defn prev-squid-yaw
  "Instance Field.

  type: float"
  (^Float [^EntitySquid this]
    (-> this .-prevSquidYaw)))

(defn squid-rotation
  "Instance Field.

  type: float"
  (^Float [^EntitySquid this]
    (-> this .-squidRotation)))

(defn prev-squid-rotation
  "Instance Field.

  type: float"
  (^Float [^EntitySquid this]
    (-> this .-prevSquidRotation)))

(defn tentacle-angle
  "Instance Field.

  type: float"
  (^Float [^EntitySquid this]
    (-> this .-tentacleAngle)))

(defn last-tentacle-angle
  "Instance Field.

  type: float"
  (^Float [^EntitySquid this]
    (-> this .-lastTentacleAngle)))

(defn *register-fixes-squid
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySquid/registerFixesSquid fixer)))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntitySquid this]
    (-> this (.getEyeHeight))))

(defn on-living-update
  ""
  ([^EntitySquid this]
    (-> this (.onLivingUpdate))))

(defn move-entity-with-heading
  "strafe - `float`
  forward - `float`"
  ([^EntitySquid this ^Float strafe ^Float forward]
    (-> this (.moveEntityWithHeading strafe forward))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntitySquid this]
    (-> this (.getCanSpawnHere))))

(defn handle-status-update
  "id - `byte`"
  ([^EntitySquid this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn set-movement-vector
  "random-motion-vec-x-in - `float`
  random-motion-vec-y-in - `float`
  random-motion-vec-z-in - `float`"
  ([^EntitySquid this ^Float random-motion-vec-x-in ^Float random-motion-vec-y-in ^Float random-motion-vec-z-in]
    (-> this (.setMovementVector random-motion-vec-x-in random-motion-vec-y-in random-motion-vec-z-in))))

(defn has-movement-vector?
  "returns: `boolean`"
  (^Boolean [^EntitySquid this]
    (-> this (.hasMovementVector))))

