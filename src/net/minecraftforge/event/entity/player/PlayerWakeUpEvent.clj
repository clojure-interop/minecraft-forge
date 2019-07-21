(ns net.minecraftforge.event.entity.player.PlayerWakeUpEvent
  "This event is fired when the player is waking up.
  This is merely for purposes of listening for this to happen.
  There is nothing that can be manipulated with this event."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerWakeUpEvent]))

(defn ->player-wake-up-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  wake-immediately - `boolean`
  update-world - `boolean`
  set-spawn - `boolean`"
  (^PlayerWakeUpEvent [^net.minecraft.entity.player.EntityPlayer player ^Boolean wake-immediately ^Boolean update-world ^Boolean set-spawn]
    (new PlayerWakeUpEvent player wake-immediately update-world set-spawn)))

(defn wake-immediately
  "Used for the 'wake up animation'.
   This is false if the player is considered 'sleepy' and the overlay should slowly fade away.

  returns: `boolean`"
  (^Boolean [^PlayerWakeUpEvent this]
    (-> this (.wakeImmediately))))

(defn update-world
  "Indicates if the server should be notified of sleeping changes.
   This will only be false if the server is considered 'up to date' already, because, for example, it initiated the call.

  returns: `boolean`"
  (^Boolean [^PlayerWakeUpEvent this]
    (-> this (.updateWorld))))

(defn should-set-spawn?
  "Indicates if the player's sleep was considered successful.
   In vanilla, this is used to determine if the spawn chunk is to be set to the bed's position.

  returns: `boolean`"
  (^Boolean [^PlayerWakeUpEvent this]
    (-> this (.shouldSetSpawn))))

