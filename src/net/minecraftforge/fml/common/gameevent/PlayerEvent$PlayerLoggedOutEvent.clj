(ns net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedOutEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent PlayerEvent$PlayerLoggedOutEvent]))

(defn ->player-logged-out-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`"
  (^PlayerEvent$PlayerLoggedOutEvent [^net.minecraft.entity.player.EntityPlayer player]
    (new PlayerEvent$PlayerLoggedOutEvent player)))

