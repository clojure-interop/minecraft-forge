(ns net.minecraft.entity.monster.EntityEndermite
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityEndermite]))

(defn ->entity-endermite
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityEndermite [^net.minecraft.world.World world-in]
    (new EntityEndermite world-in)))

(defn *register-fixes-endermite
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityEndermite/registerFixesEndermite fixer)))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityEndermite this]
    (-> this (.getEyeHeight))))

(defn on-update
  ""
  ([^EntityEndermite this]
    (-> this (.onUpdate))))

(defn spawned-by-player?
  "returns: `boolean`"
  (^Boolean [^EntityEndermite this]
    (-> this (.isSpawnedByPlayer))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityEndermite this]
    (-> this (.getCanSpawnHere))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityEndermite this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntityEndermite this]
    (-> this (.getCreatureAttribute))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityEndermite this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn set-render-yaw-offset
  "offset - `float`"
  ([^EntityEndermite this ^Float offset]
    (-> this (.setRenderYawOffset offset))))

(defn get-y-offset
  "returns: `double`"
  (^Double [^EntityEndermite this]
    (-> this (.getYOffset))))

(defn set-spawned-by-player
  "spawned-by-player - `boolean`"
  ([^EntityEndermite this ^Boolean spawned-by-player]
    (-> this (.setSpawnedByPlayer spawned-by-player))))

(defn on-living-update
  ""
  ([^EntityEndermite this]
    (-> this (.onLivingUpdate))))

