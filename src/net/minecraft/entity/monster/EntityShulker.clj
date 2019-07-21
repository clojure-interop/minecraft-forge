(ns net.minecraft.entity.monster.EntityShulker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityShulker]))

(defn ->entity-shulker
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityShulker [^net.minecraft.world.World world-in]
    (new EntityShulker world-in)))

(def *-default-color
  "Static Constant.

  type: net.minecraft.item.EnumDyeColor"
  EntityShulker/DEFAULT_COLOR)

(defn *register-fixes-shulker
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityShulker/registerFixesShulker fixer)))

(defn set-position-and-rotation-direct
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  pos-rotation-increments - `int`
  teleport - `boolean`"
  ([^EntityShulker this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^Integer pos-rotation-increments ^Boolean teleport]
    (-> this (.setPositionAndRotationDirect x y z yaw pitch pos-rotation-increments teleport))))

(defn get-collision-border-size
  "returns: `float`"
  (^Float [^EntityShulker this]
    (-> this (.getCollisionBorderSize))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityShulker this]
    (-> this (.getEyeHeight))))

(defn get-old-attach-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityShulker this]
    (-> this (.getOldAttachPos))))

(defn set-position
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityShulker this ^Double x ^Double y ^Double z]
    (-> this (.setPosition x y z))))

(defn get-peek-tick
  "returns: `int`"
  (^Integer [^EntityShulker this]
    (-> this (.getPeekTick))))

(defn on-update
  ""
  ([^EntityShulker this]
    (-> this (.onUpdate))))

(defn apply-entity-collision
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityShulker this ^net.minecraft.entity.Entity entity-in]
    (-> this (.applyEntityCollision entity-in))))

(defn get-horizontal-face-speed
  "returns: `int`"
  (^Integer [^EntityShulker this]
    (-> this (.getHorizontalFaceSpeed))))

(defn get-client-peek-amount
  "p-184688-1 - `float`

  returns: `float`"
  (^Float [^EntityShulker this ^Float p-184688-1]
    (-> this (.getClientPeekAmount p-184688-1))))

(defn attached-to-block?
  "returns: `boolean`"
  (^Boolean [^EntityShulker this]
    (-> this (.isAttachedToBlock))))

(defn set-attachment-pos
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^EntityShulker this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.setAttachmentPos pos))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityShulker this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityShulker this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-vertical-face-speed
  "returns: `int`"
  (^Integer [^EntityShulker this]
    (-> this (.getVerticalFaceSpeed))))

(defn get-client-teleport-interp
  "returns: `int`"
  (^Integer [^EntityShulker this]
    (-> this (.getClientTeleportInterp))))

(defn play-living-sound
  ""
  ([^EntityShulker this]
    (-> this (.playLivingSound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityShulker this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-attachment-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityShulker this]
    (-> this (.getAttachmentPos))))

(defn get-sound-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^EntityShulker this]
    (-> this (.getSoundCategory))))

(defn move
  "type - `net.minecraft.entity.MoverType`
  x - `double`
  y - `double`
  z - `double`"
  ([^EntityShulker this ^net.minecraft.entity.MoverType type ^Double x ^Double y ^Double z]
    (-> this (.move type x y z))))

(defn get-attachment-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^EntityShulker this]
    (-> this (.getAttachmentFacing))))

(defn update-armor-modifier
  "p-184691-1 - `int`"
  ([^EntityShulker this ^Integer p-184691-1]
    (-> this (.updateArmorModifier p-184691-1))))

(defn get-collision-bounding-box
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^EntityShulker this]
    (-> this (.getCollisionBoundingBox))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityShulker this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn get-color
  "returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^EntityShulker this]
    (-> this (.getColor))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityShulker this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn on-living-update
  ""
  ([^EntityShulker this]
    (-> this (.onLivingUpdate))))

