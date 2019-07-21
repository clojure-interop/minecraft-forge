(ns net.minecraft.entity.passive.EntitySkeletonHorse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntitySkeletonHorse]))

(defn ->entity-skeleton-horse
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntitySkeletonHorse [^net.minecraft.world.World world-in]
    (new EntitySkeletonHorse world-in)))

(defn *register-fixes-skeleton-horse
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySkeletonHorse/registerFixesSkeletonHorse fixer)))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntitySkeletonHorse this]
    (-> this (.getCreatureAttribute))))

(defn get-mounted-y-offset
  "returns: `double`"
  (^Double [^EntitySkeletonHorse this]
    (-> this (.getMountedYOffset))))

(defn on-living-update
  ""
  ([^EntitySkeletonHorse this]
    (-> this (.onLivingUpdate))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySkeletonHorse this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySkeletonHorse this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn trap?
  "returns: `boolean`"
  (^Boolean [^EntitySkeletonHorse this]
    (-> this (.isTrap))))

(defn set-trap
  "trap - `boolean`"
  ([^EntitySkeletonHorse this ^Boolean trap]
    (-> this (.setTrap trap))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntitySkeletonHorse this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

