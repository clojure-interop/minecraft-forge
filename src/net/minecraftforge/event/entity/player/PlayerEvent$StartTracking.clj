(ns net.minecraftforge.event.entity.player.PlayerEvent$StartTracking
  "Fired when an Entity is started to be \"tracked\" by this player (the player receives updates about this entity, e.g. motion)."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent$StartTracking]))

(defn ->start-tracking
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.entity.Entity`"
  (^PlayerEvent$StartTracking [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.Entity target]
    (new PlayerEvent$StartTracking player target)))

(defn get-target
  "The Entity now being tracked.

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^PlayerEvent$StartTracking this]
    (-> this (.getTarget))))

