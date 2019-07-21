(ns net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerRespawnEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent PlayerEvent$PlayerRespawnEvent]))

(defn ->player-respawn-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  end-conquered - `boolean`"
  (^PlayerEvent$PlayerRespawnEvent [^net.minecraft.entity.player.EntityPlayer player ^Boolean end-conquered]
    (new PlayerEvent$PlayerRespawnEvent player end-conquered)))

(defn end-conquered?
  "Did this respawn event come from the player conquering the end?

  returns: if this respawn was because the player conquered the end - `boolean`"
  (^Boolean [^PlayerEvent$PlayerRespawnEvent this]
    (-> this (.isEndConquered))))

