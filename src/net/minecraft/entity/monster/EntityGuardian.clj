(ns net.minecraft.entity.monster.EntityGuardian
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityGuardian]))

(defn ->entity-guardian
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityGuardian [^net.minecraft.world.World world-in]
    (new EntityGuardian world-in)))

(defn *register-fixes-guardian
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityGuardian/registerFixesGuardian fixer)))

(defn move-entity-with-heading
  "strafe - `float`
  forward - `float`"
  ([^EntityGuardian this ^Float strafe ^Float forward]
    (-> this (.moveEntityWithHeading strafe forward))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityGuardian this]
    (-> this (.getEyeHeight))))

(defn get-talk-interval
  "returns: `int`"
  (^Integer [^EntityGuardian this]
    (-> this (.getTalkInterval))))

(defn get-attack-animation-scale
  "p-175477-1 - `float`

  returns: `float`"
  (^Float [^EntityGuardian this ^Float p-175477-1]
    (-> this (.getAttackAnimationScale p-175477-1))))

(defn get-targeted-entity
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityGuardian this]
    (-> this (.getTargetedEntity))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityGuardian this]
    (-> this (.getCanSpawnHere))))

(defn get-spikes-animation
  "p-175469-1 - `float`

  returns: `float`"
  (^Float [^EntityGuardian this ^Float p-175469-1]
    (-> this (.getSpikesAnimation p-175469-1))))

(defn get-attack-duration
  "returns: `int`"
  (^Integer [^EntityGuardian this]
    (-> this (.getAttackDuration))))

(defn moving?
  "returns: `boolean`"
  (^Boolean [^EntityGuardian this]
    (-> this (.isMoving))))

(defn get-vertical-face-speed
  "returns: `int`"
  (^Integer [^EntityGuardian this]
    (-> this (.getVerticalFaceSpeed))))

(defn not-colliding?
  "returns: `boolean`"
  (^Boolean [^EntityGuardian this]
    (-> this (.isNotColliding))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityGuardian this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-tail-animation
  "p-175471-1 - `float`

  returns: `float`"
  (^Float [^EntityGuardian this ^Float p-175471-1]
    (-> this (.getTailAnimation p-175471-1))))

(defn get-block-path-weight
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^EntityGuardian this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockPathWeight pos))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityGuardian this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn has-targeted-entity?
  "returns: `boolean`"
  (^Boolean [^EntityGuardian this]
    (-> this (.hasTargetedEntity))))

(defn on-living-update
  ""
  ([^EntityGuardian this]
    (-> this (.onLivingUpdate))))

