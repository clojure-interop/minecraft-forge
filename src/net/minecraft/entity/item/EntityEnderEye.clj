(ns net.minecraft.entity.item.EntityEnderEye
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityEnderEye]))

(defn ->entity-ender-eye
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityEnderEye [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityEnderEye world-in x y z))
  (^EntityEnderEye [^net.minecraft.world.World world-in]
    (new EntityEnderEye world-in)))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityEnderEye this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn on-update
  ""
  ([^EntityEnderEye this]
    (-> this (.onUpdate))))

(defn can-be-attacked-with-item?
  "returns: `boolean`"
  (^Boolean [^EntityEnderEye this]
    (-> this (.canBeAttackedWithItem))))

(defn move-towards
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^EntityEnderEye this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.moveTowards pos))))

(defn get-brightness-for-render
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^EntityEnderEye this ^Float partial-ticks]
    (-> this (.getBrightnessForRender partial-ticks))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityEnderEye this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-brightness
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^EntityEnderEye this ^Float partial-ticks]
    (-> this (.getBrightness partial-ticks))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityEnderEye this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn set-velocity
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityEnderEye this ^Double x ^Double y ^Double z]
    (-> this (.setVelocity x y z))))

