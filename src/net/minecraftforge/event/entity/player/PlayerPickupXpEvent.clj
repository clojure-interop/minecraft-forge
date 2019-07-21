(ns net.minecraftforge.event.entity.player.PlayerPickupXpEvent
  "This event is called when a player collides with a EntityXPOrb on the ground.
  The event can be canceled, and no further processing will be done."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerPickupXpEvent]))

(defn ->player-pickup-xp-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  orb - `net.minecraft.entity.item.EntityXPOrb`"
  (^PlayerPickupXpEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.item.EntityXPOrb orb]
    (new PlayerPickupXpEvent player orb)))

(defn get-orb
  "returns: `net.minecraft.entity.item.EntityXPOrb`"
  (^net.minecraft.entity.item.EntityXPOrb [^PlayerPickupXpEvent this]
    (-> this (.getOrb))))

