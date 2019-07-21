(ns net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedInEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent PlayerEvent$PlayerLoggedInEvent]))

(defn ->player-logged-in-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`"
  (^PlayerEvent$PlayerLoggedInEvent [^net.minecraft.entity.player.EntityPlayer player]
    (new PlayerEvent$PlayerLoggedInEvent player)))

