(ns net.minecraft.world.storage.loot.ILootContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot ILootContainer]))

(defn get-loot-table
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^ILootContainer this]
    (-> this (.getLootTable))))

