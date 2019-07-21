(ns net.minecraftforge.event.entity.player.EntityItemPickupEvent
  "This event is called when a player collides with a EntityItem on the ground.
  The event can be canceled, and no further processing will be done.

   You can set the result of this event to ALLOW which will trigger the
   processing of achievements, FML's event, play the sound, and kill the
   entity if all the items are picked up.

   setResult(ALLOW) is the same as the old setHandled()"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player EntityItemPickupEvent]))

(defn ->entity-item-pickup-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  item - `net.minecraft.entity.item.EntityItem`"
  (^EntityItemPickupEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.item.EntityItem item]
    (new EntityItemPickupEvent player item)))

(defn get-item
  "returns: `net.minecraft.entity.item.EntityItem`"
  (^net.minecraft.entity.item.EntityItem [^EntityItemPickupEvent this]
    (-> this (.getItem))))

