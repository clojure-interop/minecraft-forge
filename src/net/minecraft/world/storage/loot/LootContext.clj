(ns net.minecraft.world.storage.loot.LootContext
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootContext]))

(defn ->loot-context
  "Constructor.

  luck-in - `float`
  world-in - `net.minecraft.world.WorldServer`
  loot-table-manager-in - `net.minecraft.world.storage.loot.LootTableManager`
  looted-entity-in - `net.minecraft.entity.Entity`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  damage-source-in - `net.minecraft.util.DamageSource`"
  (^LootContext [^Float luck-in ^net.minecraft.world.WorldServer world-in ^net.minecraft.world.storage.loot.LootTableManager loot-table-manager-in ^net.minecraft.entity.Entity looted-entity-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.DamageSource damage-source-in]
    (new LootContext luck-in world-in loot-table-manager-in looted-entity-in player-in damage-source-in)))

(defn get-entity
  "target - `net.minecraft.world.storage.loot.LootContext$EntityTarget`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^LootContext this ^net.minecraft.world.storage.loot.LootContext$EntityTarget target]
    (-> this (.getEntity target))))

(defn get-looting-modifier
  "returns: `int`"
  (^Integer [^LootContext this]
    (-> this (.getLootingModifier))))

(defn add-loot-table
  "loot-table-in - `net.minecraft.world.storage.loot.LootTable`

  returns: `boolean`"
  (^Boolean [^LootContext this ^net.minecraft.world.storage.loot.LootTable loot-table-in]
    (-> this (.addLootTable loot-table-in))))

(defn remove-loot-table
  "loot-table-in - `net.minecraft.world.storage.loot.LootTable`"
  ([^LootContext this ^net.minecraft.world.storage.loot.LootTable loot-table-in]
    (-> this (.removeLootTable loot-table-in))))

(defn get-luck
  "returns: `float`"
  (^Float [^LootContext this]
    (-> this (.getLuck))))

(defn get-loot-table-manager
  "returns: `net.minecraft.world.storage.loot.LootTableManager`"
  (^net.minecraft.world.storage.loot.LootTableManager [^LootContext this]
    (-> this (.getLootTableManager))))

(defn get-world
  "returns: `net.minecraft.world.WorldServer`"
  (^net.minecraft.world.WorldServer [^LootContext this]
    (-> this (.getWorld))))

(defn get-looted-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^LootContext this]
    (-> this (.getLootedEntity))))

(defn get-killer
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^LootContext this]
    (-> this (.getKiller))))

(defn get-killer-player
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^LootContext this]
    (-> this (.getKillerPlayer))))

