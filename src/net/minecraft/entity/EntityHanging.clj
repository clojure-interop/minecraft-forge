(ns net.minecraft.entity.EntityHanging
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityHanging]))

(defn ->entity-hanging
  "Constructor.

  world-in - `net.minecraft.world.World`
  hanging-position-in - `net.minecraft.util.math.BlockPos`"
  (^EntityHanging [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos hanging-position-in]
    (new EntityHanging world-in hanging-position-in))
  (^EntityHanging [^net.minecraft.world.World world-in]
    (new EntityHanging world-in)))

(defn facing-direction
  "Instance Field.

  type: net.minecraft.util.EnumFacing"
  (^net.minecraft.util.EnumFacing [^EntityHanging this]
    (-> this .-facingDirection)))

(defn get-width-pixels
  "returns: `int`"
  (^Integer [^EntityHanging this]
    (-> this (.getWidthPixels))))

(defn set-position
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityHanging this ^Double x ^Double y ^Double z]
    (-> this (.setPosition x y z))))

(defn get-rotated-yaw
  "transform-rotation - `net.minecraft.util.Rotation`

  returns: `float`"
  (^Float [^EntityHanging this ^net.minecraft.util.Rotation transform-rotation]
    (-> this (.getRotatedYaw transform-rotation))))

(defn get-height-pixels
  "returns: `int`"
  (^Integer [^EntityHanging this]
    (-> this (.getHeightPixels))))

(defn get-mirrored-yaw
  "transform-mirror - `net.minecraft.util.Mirror`

  returns: `float`"
  (^Float [^EntityHanging this ^net.minecraft.util.Mirror transform-mirror]
    (-> this (.getMirroredYaw transform-mirror))))

(defn on-update
  ""
  ([^EntityHanging this]
    (-> this (.onUpdate))))

(defn add-velocity
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityHanging this ^Double x ^Double y ^Double z]
    (-> this (.addVelocity x y z))))

(defn on-broken
  "broken-entity - `net.minecraft.entity.Entity`"
  ([^EntityHanging this ^net.minecraft.entity.Entity broken-entity]
    (-> this (.onBroken broken-entity))))

(defn hit-by-entity
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityHanging this ^net.minecraft.entity.Entity entity-in]
    (-> this (.hitByEntity entity-in))))

(defn get-hanging-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityHanging this]
    (-> this (.getHangingPosition))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityHanging this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn entity-drop-item
  "stack - `net.minecraft.item.ItemStack`
  offset-y - `float`

  returns: `net.minecraft.entity.item.EntityItem`"
  (^net.minecraft.entity.item.EntityItem [^EntityHanging this ^net.minecraft.item.ItemStack stack ^Float offset-y]
    (-> this (.entityDropItem stack offset-y))))

(defn on-valid-surface
  "returns: `boolean`"
  (^Boolean [^EntityHanging this]
    (-> this (.onValidSurface))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityHanging this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityHanging this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn move
  "type - `net.minecraft.entity.MoverType`
  x - `double`
  y - `double`
  z - `double`"
  ([^EntityHanging this ^net.minecraft.entity.MoverType type ^Double x ^Double y ^Double z]
    (-> this (.move type x y z))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityHanging this]
    (-> this (.canBeCollidedWith))))

(defn on-struck-by-lightning
  "lightning-bolt - `net.minecraft.entity.effect.EntityLightningBolt`"
  ([^EntityHanging this ^net.minecraft.entity.effect.EntityLightningBolt lightning-bolt]
    (-> this (.onStruckByLightning lightning-bolt))))

(defn play-place-sound
  ""
  ([^EntityHanging this]
    (-> this (.playPlaceSound))))

(defn get-horizontal-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^EntityHanging this]
    (-> this (.getHorizontalFacing))))

