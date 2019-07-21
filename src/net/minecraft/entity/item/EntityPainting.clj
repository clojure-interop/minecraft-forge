(ns net.minecraft.entity.item.EntityPainting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityPainting]))

(defn ->entity-painting
  "Constructor.

  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`
  title - `java.lang.String`"
  (^EntityPainting [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^java.lang.String title]
    (new EntityPainting world-in pos facing title))
  (^EntityPainting [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing]
    (new EntityPainting world-in pos facing))
  (^EntityPainting [^net.minecraft.world.World world-in]
    (new EntityPainting world-in)))

(defn art
  "Instance Field.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  (^net.minecraft.entity.item.EntityPainting$EnumArt [^EntityPainting this]
    (-> this .-art)))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPainting this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPainting this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-width-pixels
  "returns: `int`"
  (^Integer [^EntityPainting this]
    (-> this (.getWidthPixels))))

(defn get-height-pixels
  "returns: `int`"
  (^Integer [^EntityPainting this]
    (-> this (.getHeightPixels))))

(defn on-broken
  "broken-entity - `net.minecraft.entity.Entity`"
  ([^EntityPainting this ^net.minecraft.entity.Entity broken-entity]
    (-> this (.onBroken broken-entity))))

(defn play-place-sound
  ""
  ([^EntityPainting this]
    (-> this (.playPlaceSound))))

(defn set-location-and-angles
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`"
  ([^EntityPainting this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch]
    (-> this (.setLocationAndAngles x y z yaw pitch))))

(defn set-position-and-rotation-direct
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  pos-rotation-increments - `int`
  teleport - `boolean`"
  ([^EntityPainting this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^Integer pos-rotation-increments ^Boolean teleport]
    (-> this (.setPositionAndRotationDirect x y z yaw pitch pos-rotation-increments teleport))))

