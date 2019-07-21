(ns net.minecraft.entity.projectile.EntityFishHook
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityFishHook]))

(defn ->entity-fish-hook
  "Constructor.

  world-in - `net.minecraft.world.World`
  p-i-47290-2 - `net.minecraft.entity.player.EntityPlayer`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityFishHook [^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer p-i-47290-2 ^Double x ^Double y ^Double z]
    (new EntityFishHook world-in p-i-47290-2 x y z))
  (^EntityFishHook [^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer fishing-player]
    (new EntityFishHook world-in fishing-player)))

(defn caught-entity
  "Instance Field.

  type: net.minecraft.entity.Entity"
  (^net.minecraft.entity.Entity [^EntityFishHook this]
    (-> this .-caughtEntity)))

(defn set-position-and-rotation-direct
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  pos-rotation-increments - `int`
  teleport - `boolean`"
  ([^EntityFishHook this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^Integer pos-rotation-increments ^Boolean teleport]
    (-> this (.setPositionAndRotationDirect x y z yaw pitch pos-rotation-increments teleport))))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityFishHook this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn func-191517-b
  "p-191517-1 - `int`"
  ([^EntityFishHook this ^Integer p-191517-1]
    (-> this (.func_191517_b p-191517-1))))

(defn on-update
  ""
  ([^EntityFishHook this]
    (-> this (.onUpdate))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityFishHook this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityFishHook this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-angler
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^EntityFishHook this]
    (-> this (.getAngler))))

(defn handle-hook-retraction
  "returns: `int`"
  (^Integer [^EntityFishHook this]
    (-> this (.handleHookRetraction))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityFishHook this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn set-dead
  ""
  ([^EntityFishHook this]
    (-> this (.setDead))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityFishHook this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn func-191516-a
  "p-191516-1 - `int`"
  ([^EntityFishHook this ^Integer p-191516-1]
    (-> this (.func_191516_a p-191516-1))))

