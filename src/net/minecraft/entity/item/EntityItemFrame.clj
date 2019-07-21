(ns net.minecraft.entity.item.EntityItemFrame
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityItemFrame]))

(defn ->entity-item-frame
  "Constructor.

  world-in - `net.minecraft.world.World`
  p-i-45852-2 - `net.minecraft.util.math.BlockPos`
  p-i-45852-3 - `net.minecraft.util.EnumFacing`"
  (^EntityItemFrame [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos p-i-45852-2 ^net.minecraft.util.EnumFacing p-i-45852-3]
    (new EntityItemFrame world-in p-i-45852-2 p-i-45852-3))
  (^EntityItemFrame [^net.minecraft.world.World world-in]
    (new EntityItemFrame world-in)))

(defn *register-fixes-item-frame
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityItemFrame/registerFixesItemFrame fixer)))

(defn get-displayed-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityItemFrame this]
    (-> this (.getDisplayedItem))))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityItemFrame this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn get-collision-border-size
  "returns: `float`"
  (^Float [^EntityItemFrame this]
    (-> this (.getCollisionBorderSize))))

(defn set-displayed-item
  "stack - `net.minecraft.item.ItemStack`"
  ([^EntityItemFrame this ^net.minecraft.item.ItemStack stack]
    (-> this (.setDisplayedItem stack))))

(defn get-analog-output
  "returns: `int`"
  (^Integer [^EntityItemFrame this]
    (-> this (.getAnalogOutput))))

(defn get-width-pixels
  "returns: `int`"
  (^Integer [^EntityItemFrame this]
    (-> this (.getWidthPixels))))

(defn get-height-pixels
  "returns: `int`"
  (^Integer [^EntityItemFrame this]
    (-> this (.getHeightPixels))))

(defn on-broken
  "broken-entity - `net.minecraft.entity.Entity`"
  ([^EntityItemFrame this ^net.minecraft.entity.Entity broken-entity]
    (-> this (.onBroken broken-entity))))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityItemFrame this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityItemFrame this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityItemFrame this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityItemFrame this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-rotation
  "returns: `int`"
  (^Integer [^EntityItemFrame this]
    (-> this (.getRotation))))

(defn drop-item-or-self
  "entity-in - `net.minecraft.entity.Entity`
  p-146065-2 - `boolean`"
  ([^EntityItemFrame this ^net.minecraft.entity.Entity entity-in ^Boolean p-146065-2]
    (-> this (.dropItemOrSelf entity-in p-146065-2))))

(defn play-place-sound
  ""
  ([^EntityItemFrame this]
    (-> this (.playPlaceSound))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityItemFrame this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn set-item-rotation
  "rotation-in - `int`"
  ([^EntityItemFrame this ^Integer rotation-in]
    (-> this (.setItemRotation rotation-in))))

