(ns net.minecraft.entity.EntityLeashKnot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityLeashKnot]))

(defn ->entity-leash-knot
  "Constructor.

  world-in - `net.minecraft.world.World`
  hanging-position-in - `net.minecraft.util.math.BlockPos`"
  (^EntityLeashKnot [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos hanging-position-in]
    (new EntityLeashKnot world-in hanging-position-in))
  (^EntityLeashKnot [^net.minecraft.world.World world-in]
    (new EntityLeashKnot world-in)))

(defn *create-knot
  "world-in - `net.minecraft.world.World`
  fence - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.entity.EntityLeashKnot`"
  (^net.minecraft.entity.EntityLeashKnot [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos fence]
    (EntityLeashKnot/createKnot world-in fence)))

(defn *get-knot-for-position
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.entity.EntityLeashKnot`"
  (^net.minecraft.entity.EntityLeashKnot [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (EntityLeashKnot/getKnotForPosition world-in pos)))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityLeashKnot this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityLeashKnot this]
    (-> this (.getEyeHeight))))

(defn get-width-pixels
  "returns: `int`"
  (^Integer [^EntityLeashKnot this]
    (-> this (.getWidthPixels))))

(defn set-position
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityLeashKnot this ^Double x ^Double y ^Double z]
    (-> this (.setPosition x y z))))

(defn get-height-pixels
  "returns: `int`"
  (^Integer [^EntityLeashKnot this]
    (-> this (.getHeightPixels))))

(defn on-broken
  "broken-entity - `net.minecraft.entity.Entity`"
  ([^EntityLeashKnot this ^net.minecraft.entity.Entity broken-entity]
    (-> this (.onBroken broken-entity))))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityLeashKnot this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLeashKnot this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn update-facing-with-bounding-box
  "facing-direction-in - `net.minecraft.util.EnumFacing`"
  ([^EntityLeashKnot this ^net.minecraft.util.EnumFacing facing-direction-in]
    (-> this (.updateFacingWithBoundingBox facing-direction-in))))

(defn on-valid-surface
  "returns: `boolean`"
  (^Boolean [^EntityLeashKnot this]
    (-> this (.onValidSurface))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLeashKnot this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn play-place-sound
  ""
  ([^EntityLeashKnot this]
    (-> this (.playPlaceSound))))

(defn write-to-nbt-optional
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `boolean`"
  (^Boolean [^EntityLeashKnot this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBTOptional compound))))

