(ns net.minecraftforge.event.entity.player.PlayerEvent
  "PlayerEvent is fired whenever an event involving Living entities occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent]))

(defn ->player-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`"
  (^PlayerEvent [^net.minecraft.entity.player.EntityPlayer player]
    (new PlayerEvent player)))

(defn get-entity-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^PlayerEvent this]
    (-> this (.getEntityPlayer))))

