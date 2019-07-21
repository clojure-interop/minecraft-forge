(ns net.minecraft.entity.item.EntityBoat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityBoat]))

(defn ->entity-boat
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityBoat [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityBoat world-in x y z))
  (^EntityBoat [^net.minecraft.world.World world-in]
    (new EntityBoat world-in)))

(defn get-adjusted-horizontal-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^EntityBoat this]
    (-> this (.getAdjustedHorizontalFacing))))

(defn set-position-and-rotation-direct
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  pos-rotation-increments - `int`
  teleport - `boolean`"
  ([^EntityBoat this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^Integer pos-rotation-increments ^Boolean teleport]
    (-> this (.setPositionAndRotationDirect x y z yaw pitch pos-rotation-increments teleport))))

(defn set-boat-type
  "boat-type - `net.minecraft.entity.item.EntityBoat$Type`"
  ([^EntityBoat this ^net.minecraft.entity.item.EntityBoat$Type boat-type]
    (-> this (.setBoatType boat-type))))

(defn set-time-since-hit
  "time-since-hit - `int`"
  ([^EntityBoat this ^Integer time-since-hit]
    (-> this (.setTimeSinceHit time-since-hit))))

(defn set-damage-taken
  "damage-taken - `float`"
  ([^EntityBoat this ^Float damage-taken]
    (-> this (.setDamageTaken damage-taken))))

(defn get-boat-type
  "returns: `net.minecraft.entity.item.EntityBoat$Type`"
  (^net.minecraft.entity.item.EntityBoat$Type [^EntityBoat this]
    (-> this (.getBoatType))))

(defn on-update
  ""
  ([^EntityBoat this]
    (-> this (.onUpdate))))

(defn set-paddle-state
  "p-184445-1 - `boolean`
  p-184445-2 - `boolean`"
  ([^EntityBoat this ^Boolean p-184445-1 ^Boolean p-184445-2]
    (-> this (.setPaddleState p-184445-1 p-184445-2))))

(defn apply-entity-collision
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityBoat this ^net.minecraft.entity.Entity entity-in]
    (-> this (.applyEntityCollision entity-in))))

(defn get-damage-taken
  "returns: `float`"
  (^Float [^EntityBoat this]
    (-> this (.getDamageTaken))))

(defn get-time-since-hit
  "returns: `int`"
  (^Integer [^EntityBoat this]
    (-> this (.getTimeSinceHit))))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityBoat this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn get-controlling-passenger
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityBoat this]
    (-> this (.getControllingPassenger))))

(defn get-item-boat
  "returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^EntityBoat this]
    (-> this (.getItemBoat))))

(defn apply-orientation-to-entity
  "entity-to-update - `net.minecraft.entity.Entity`"
  ([^EntityBoat this ^net.minecraft.entity.Entity entity-to-update]
    (-> this (.applyOrientationToEntity entity-to-update))))

(defn update-passenger
  "passenger - `net.minecraft.entity.Entity`"
  ([^EntityBoat this ^net.minecraft.entity.Entity passenger]
    (-> this (.updatePassenger passenger))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityBoat this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-forward-direction
  "returns: `int`"
  (^Integer [^EntityBoat this]
    (-> this (.getForwardDirection))))

(defn get-water-level-above
  "returns: `float`"
  (^Float [^EntityBoat this]
    (-> this (.getWaterLevelAbove))))

(defn get-boat-glide
  "returns: `float`"
  (^Float [^EntityBoat this]
    (-> this (.getBoatGlide))))

(defn set-forward-direction
  "forward-direction - `int`"
  ([^EntityBoat this ^Integer forward-direction]
    (-> this (.setForwardDirection forward-direction))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityBoat this]
    (-> this (.canBeCollidedWith))))

(defn perform-hurt-animation
  ""
  ([^EntityBoat this]
    (-> this (.performHurtAnimation))))

(defn get-rowing-time
  "p-184448-1 - `int`
  limb-swing - `float`

  returns: `float`"
  (^Float [^EntityBoat this ^Integer p-184448-1 ^Float limb-swing]
    (-> this (.getRowingTime p-184448-1 limb-swing))))

(defn get-collision-bounding-box
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^EntityBoat this]
    (-> this (.getCollisionBoundingBox))))

(defn get-collision-box
  "entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^EntityBoat this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getCollisionBox entity-in))))

(defn get-mounted-y-offset
  "returns: `double`"
  (^Double [^EntityBoat this]
    (-> this (.getMountedYOffset))))

(defn get-paddle-state?
  "p-184457-1 - `int`

  returns: `boolean`"
  (^Boolean [^EntityBoat this ^Integer p-184457-1]
    (-> this (.getPaddleState p-184457-1))))

(defn can-be-pushed?
  "returns: `boolean`"
  (^Boolean [^EntityBoat this]
    (-> this (.canBePushed))))

(defn update-inputs
  "p-184442-1 - `boolean`
  p-184442-2 - `boolean`
  p-184442-3 - `boolean`
  p-184442-4 - `boolean`"
  ([^EntityBoat this ^Boolean p-184442-1 ^Boolean p-184442-2 ^Boolean p-184442-3 ^Boolean p-184442-4]
    (-> this (.updateInputs p-184442-1 p-184442-2 p-184442-3 p-184442-4))))

