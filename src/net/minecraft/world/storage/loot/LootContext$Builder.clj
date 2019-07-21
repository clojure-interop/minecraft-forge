(ns net.minecraft.world.storage.loot.LootContext$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootContext$Builder]))

(defn ->builder
  "Constructor.

  world-in - `net.minecraft.world.WorldServer`"
  (^LootContext$Builder [^net.minecraft.world.WorldServer world-in]
    (new LootContext$Builder world-in)))

(defn with-luck
  "luck-in - `float`

  returns: `net.minecraft.world.storage.loot.LootContext$Builder`"
  (^net.minecraft.world.storage.loot.LootContext$Builder [^LootContext$Builder this ^Float luck-in]
    (-> this (.withLuck luck-in))))

(defn with-looted-entity
  "entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.world.storage.loot.LootContext$Builder`"
  (^net.minecraft.world.storage.loot.LootContext$Builder [^LootContext$Builder this ^net.minecraft.entity.Entity entity-in]
    (-> this (.withLootedEntity entity-in))))

(defn with-player
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.world.storage.loot.LootContext$Builder`"
  (^net.minecraft.world.storage.loot.LootContext$Builder [^LootContext$Builder this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.withPlayer player-in))))

(defn with-damage-source
  "dmg-source - `net.minecraft.util.DamageSource`

  returns: `net.minecraft.world.storage.loot.LootContext$Builder`"
  (^net.minecraft.world.storage.loot.LootContext$Builder [^LootContext$Builder this ^net.minecraft.util.DamageSource dmg-source]
    (-> this (.withDamageSource dmg-source))))

(defn build
  "returns: `net.minecraft.world.storage.loot.LootContext`"
  (^net.minecraft.world.storage.loot.LootContext [^LootContext$Builder this]
    (-> this (.build))))

