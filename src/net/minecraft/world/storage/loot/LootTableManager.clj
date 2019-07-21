(ns net.minecraft.world.storage.loot.LootTableManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootTableManager]))

(defn ->loot-table-manager
  "Constructor.

  folder - `java.io.File`"
  (^LootTableManager [^java.io.File folder]
    (new LootTableManager folder)))

(defn get-loot-table-from-location
  "ressources - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.world.storage.loot.LootTable`"
  (^net.minecraft.world.storage.loot.LootTable [^LootTableManager this ^net.minecraft.util.ResourceLocation ressources]
    (-> this (.getLootTableFromLocation ressources))))

(defn reload-loot-tables
  ""
  ([^LootTableManager this]
    (-> this (.reloadLootTables))))

