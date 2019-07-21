(ns net.minecraftforge.event.LootTableLoadEvent
  "Event fired when a LootTable json is loaded from json.
  This event is fired whenever resources are loaded, or when the server starts.
  This event will NOT be fired for LootTables loaded from the world folder, these are
  considered configurations files and should not be modified by mods.

  Canceling the event will make it load a empty loot table."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event LootTableLoadEvent]))

(defn ->loot-table-load-event
  "Constructor.

  name - `net.minecraft.util.ResourceLocation`
  table - `net.minecraft.world.storage.loot.LootTable`"
  (^LootTableLoadEvent [^net.minecraft.util.ResourceLocation name ^net.minecraft.world.storage.loot.LootTable table]
    (new LootTableLoadEvent name table)))

(defn get-name
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^LootTableLoadEvent this]
    (-> this (.getName))))

(defn get-table
  "returns: `net.minecraft.world.storage.loot.LootTable`"
  (^net.minecraft.world.storage.loot.LootTable [^LootTableLoadEvent this]
    (-> this (.getTable))))

(defn set-table
  "table - `net.minecraft.world.storage.loot.LootTable`"
  ([^LootTableLoadEvent this ^net.minecraft.world.storage.loot.LootTable table]
    (-> this (.setTable table))))

