(ns net.minecraft.util.CooldownTrackerServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util CooldownTrackerServer]))

(defn ->cooldown-tracker-server
  "Constructor.

  player-in - `net.minecraft.entity.player.EntityPlayerMP`"
  (^CooldownTrackerServer [^net.minecraft.entity.player.EntityPlayerMP player-in]
    (new CooldownTrackerServer player-in)))

