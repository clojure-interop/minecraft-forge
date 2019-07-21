(ns net.minecraftforge.common.ForgeInternalHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeInternalHandler]))

(defn ->forge-internal-handler
  "Constructor."
  (^ForgeInternalHandler []
    (new ForgeInternalHandler )))

(defn on-entity-join-world
  "event - `net.minecraftforge.event.entity.EntityJoinWorldEvent`"
  ([^ForgeInternalHandler this ^net.minecraftforge.event.entity.EntityJoinWorldEvent event]
    (-> this (.onEntityJoinWorld event))))

(defn on-dimension-load
  "event - `net.minecraftforge.event.world.WorldEvent$Load`"
  ([^ForgeInternalHandler this ^net.minecraftforge.event.world.WorldEvent$Load event]
    (-> this (.onDimensionLoad event))))

(defn on-dimension-save
  "event - `net.minecraftforge.event.world.WorldEvent$Save`"
  ([^ForgeInternalHandler this ^net.minecraftforge.event.world.WorldEvent$Save event]
    (-> this (.onDimensionSave event))))

(defn on-dimension-unload
  "event - `net.minecraftforge.event.world.WorldEvent$Unload`"
  ([^ForgeInternalHandler this ^net.minecraftforge.event.world.WorldEvent$Unload event]
    (-> this (.onDimensionUnload event))))

