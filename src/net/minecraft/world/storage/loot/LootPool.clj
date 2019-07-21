(ns net.minecraft.world.storage.loot.LootPool
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootPool]))

(defn ->loot-pool
  "Constructor.

  loot-entries-in - `net.minecraft.world.storage.loot.LootEntry[]`
  pool-conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  rolls-in - `net.minecraft.world.storage.loot.RandomValueRange`
  bonus-rolls-in - `net.minecraft.world.storage.loot.RandomValueRange`
  name - `java.lang.String`"
  (^LootPool [loot-entries-in pool-conditions-in ^net.minecraft.world.storage.loot.RandomValueRange rolls-in ^net.minecraft.world.storage.loot.RandomValueRange bonus-rolls-in ^java.lang.String name]
    (new LootPool loot-entries-in pool-conditions-in rolls-in bonus-rolls-in name)))

(defn generate-loot
  "stacks - `java.util.Collection`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`"
  ([^LootPool this ^java.util.Collection stacks ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.generateLoot stacks rand context))))

(defn freeze
  ""
  ([^LootPool this]
    (-> this (.freeze))))

(defn remove-entry
  "name - `java.lang.String`

  returns: `net.minecraft.world.storage.loot.LootEntry`"
  (^net.minecraft.world.storage.loot.LootEntry [^LootPool this ^java.lang.String name]
    (-> this (.removeEntry name))))

(defn get-entry
  "name - `java.lang.String`

  returns: `net.minecraft.world.storage.loot.LootEntry`"
  (^net.minecraft.world.storage.loot.LootEntry [^LootPool this ^java.lang.String name]
    (-> this (.getEntry name))))

(defn set-bonus-rolls
  "v - `net.minecraft.world.storage.loot.RandomValueRange`"
  ([^LootPool this ^net.minecraft.world.storage.loot.RandomValueRange v]
    (-> this (.setBonusRolls v))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^LootPool this]
    (-> this (.getName))))

(defn set-rolls
  "v - `net.minecraft.world.storage.loot.RandomValueRange`"
  ([^LootPool this ^net.minecraft.world.storage.loot.RandomValueRange v]
    (-> this (.setRolls v))))

(defn get-rolls
  "returns: `net.minecraft.world.storage.loot.RandomValueRange`"
  (^net.minecraft.world.storage.loot.RandomValueRange [^LootPool this]
    (-> this (.getRolls))))

(defn add-entry
  "entry - `net.minecraft.world.storage.loot.LootEntry`"
  ([^LootPool this ^net.minecraft.world.storage.loot.LootEntry entry]
    (-> this (.addEntry entry))))

(defn frozen?
  "returns: `boolean`"
  (^Boolean [^LootPool this]
    (-> this (.isFrozen))))

(defn get-bonus-rolls
  "returns: `net.minecraft.world.storage.loot.RandomValueRange`"
  (^net.minecraft.world.storage.loot.RandomValueRange [^LootPool this]
    (-> this (.getBonusRolls))))

