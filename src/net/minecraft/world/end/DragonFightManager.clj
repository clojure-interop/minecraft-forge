(ns net.minecraft.world.end.DragonFightManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.end DragonFightManager]))

(defn ->dragon-fight-manager
  "Constructor.

  world-in - `net.minecraft.world.WorldServer`
  compound - `net.minecraft.nbt.NBTTagCompound`"
  (^DragonFightManager [^net.minecraft.world.WorldServer world-in ^net.minecraft.nbt.NBTTagCompound compound]
    (new DragonFightManager world-in compound)))

(defn tick
  ""
  ([^DragonFightManager this]
    (-> this (.tick))))

(defn get-num-alive-crystals
  "returns: `int`"
  (^Integer [^DragonFightManager this]
    (-> this (.getNumAliveCrystals))))

(defn dragon-update
  "dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  ([^DragonFightManager this ^net.minecraft.entity.boss.EntityDragon dragon-in]
    (-> this (.dragonUpdate dragon-in))))

(defn has-previously-killed-dragon?
  "returns: `boolean`"
  (^Boolean [^DragonFightManager this]
    (-> this (.hasPreviouslyKilledDragon))))

(defn reset-spike-crystals
  ""
  ([^DragonFightManager this]
    (-> this (.resetSpikeCrystals))))

(defn on-crystal-destroyed
  "crystal - `net.minecraft.entity.item.EntityEnderCrystal`
  dmg-src - `net.minecraft.util.DamageSource`"
  ([^DragonFightManager this ^net.minecraft.entity.item.EntityEnderCrystal crystal ^net.minecraft.util.DamageSource dmg-src]
    (-> this (.onCrystalDestroyed crystal dmg-src))))

(defn get-compound
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^DragonFightManager this]
    (-> this (.getCompound))))

(defn respawn-dragon
  ""
  ([^DragonFightManager this]
    (-> this (.respawnDragon))))

(defn process-dragon-death
  "dragon - `net.minecraft.entity.boss.EntityDragon`"
  ([^DragonFightManager this ^net.minecraft.entity.boss.EntityDragon dragon]
    (-> this (.processDragonDeath dragon))))

