(ns net.minecraft.entity.passive.EntityTameable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityTameable]))

(defn ->entity-tameable
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityTameable [^net.minecraft.world.World world-in]
    (new EntityTameable world-in)))

(defn can-be-leashed-to?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^EntityTameable this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canBeLeashedTo player))))

(defn set-sitting
  "sitting - `boolean`"
  ([^EntityTameable this ^Boolean sitting]
    (-> this (.setSitting sitting))))

(defn should-attack-entity?
  "p-142018-1 - `net.minecraft.entity.EntityLivingBase`
  p-142018-2 - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^EntityTameable this ^net.minecraft.entity.EntityLivingBase p-142018-1 ^net.minecraft.entity.EntityLivingBase p-142018-2]
    (-> this (.shouldAttackEntity p-142018-1 p-142018-2))))

(defn on-same-team?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityTameable this ^net.minecraft.entity.Entity entity-in]
    (-> this (.isOnSameTeam entity-in))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityTameable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityTameable this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn set-tamed
  "tamed - `boolean`"
  ([^EntityTameable this ^Boolean tamed]
    (-> this (.setTamed tamed))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityTameable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-owner
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityTameable this]
    (-> this (.getOwner))))

(defn owner?
  "entity-in - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^EntityTameable this ^net.minecraft.entity.EntityLivingBase entity-in]
    (-> this (.isOwner entity-in))))

(defn set-owner-id
  "p-184754-1 - `java.util.UUID`"
  ([^EntityTameable this ^java.util.UUID p-184754-1]
    (-> this (.setOwnerId p-184754-1))))

(defn tamed?
  "returns: `boolean`"
  (^Boolean [^EntityTameable this]
    (-> this (.isTamed))))

(defn sitting?
  "returns: `boolean`"
  (^Boolean [^EntityTameable this]
    (-> this (.isSitting))))

(defn get-ai-sit
  "returns: `net.minecraft.entity.ai.EntityAISit`"
  (^net.minecraft.entity.ai.EntityAISit [^EntityTameable this]
    (-> this (.getAISit))))

(defn get-team
  "returns: `net.minecraft.scoreboard.Team`"
  (^net.minecraft.scoreboard.Team [^EntityTameable this]
    (-> this (.getTeam))))

(defn get-owner-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^EntityTameable this]
    (-> this (.getOwnerId))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityTameable this ^Byte id]
    (-> this (.handleStatusUpdate id))))

