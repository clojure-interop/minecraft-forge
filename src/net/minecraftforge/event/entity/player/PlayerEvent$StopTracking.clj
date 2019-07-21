(ns net.minecraftforge.event.entity.player.PlayerEvent$StopTracking
  "Fired when an Entity is stopped to be \"tracked\" by this player (the player no longer receives updates about this entity, e.g. motion)."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent$StopTracking]))

(defn ->stop-tracking
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.entity.Entity`"
  (^PlayerEvent$StopTracking [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.Entity target]
    (new PlayerEvent$StopTracking player target)))

(defn get-target
  "The Entity no longer being tracked.

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^PlayerEvent$StopTracking this]
    (-> this (.getTarget))))

