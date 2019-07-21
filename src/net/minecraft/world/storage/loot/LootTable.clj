(ns net.minecraft.world.storage.loot.LootTable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootTable]))

(defn ->loot-table
  "Constructor.

  pools-in - `net.minecraft.world.storage.loot.LootPool[]`"
  (^LootTable [pools-in]
    (new LootTable pools-in)))

(def *-empty-loot-table
  "Static Constant.

  type: net.minecraft.world.storage.loot.LootTable"
  LootTable/EMPTY_LOOT_TABLE)

(defn generate-loot-for-pools
  "rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^LootTable this ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.generateLootForPools rand context))))

(defn fill-inventory
  "inventory - `net.minecraft.inventory.IInventory`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`"
  ([^LootTable this ^net.minecraft.inventory.IInventory inventory ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.fillInventory inventory rand context))))

(defn freeze
  ""
  ([^LootTable this]
    (-> this (.freeze))))

(defn frozen?
  "returns: `boolean`"
  (^Boolean [^LootTable this]
    (-> this (.isFrozen))))

(defn get-pool
  "name - `java.lang.String`

  returns: `net.minecraft.world.storage.loot.LootPool`"
  (^net.minecraft.world.storage.loot.LootPool [^LootTable this ^java.lang.String name]
    (-> this (.getPool name))))

(defn remove-pool
  "name - `java.lang.String`

  returns: `net.minecraft.world.storage.loot.LootPool`"
  (^net.minecraft.world.storage.loot.LootPool [^LootTable this ^java.lang.String name]
    (-> this (.removePool name))))

(defn add-pool
  "pool - `net.minecraft.world.storage.loot.LootPool`"
  ([^LootTable this ^net.minecraft.world.storage.loot.LootPool pool]
    (-> this (.addPool pool))))

