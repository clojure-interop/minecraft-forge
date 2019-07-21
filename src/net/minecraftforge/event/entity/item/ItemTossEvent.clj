(ns net.minecraftforge.event.entity.item.ItemTossEvent
  "Event that is fired whenever a player tosses (Q) an item or drag-n-drops a
  stack of items outside the inventory GUI screens. Canceling the event will
  stop the items from entering the world, but will not prevent them being
  removed from the inventory - and thus removed from the system."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.item ItemTossEvent]))

(defn ->item-toss-event
  "Constructor.

  Creates a new event for EntityItems tossed by a player.

  entity-item - The EntityItem being tossed. - `net.minecraft.entity.item.EntityItem`
  player - The player tossing the item. - `net.minecraft.entity.player.EntityPlayer`"
  (^ItemTossEvent [^net.minecraft.entity.item.EntityItem entity-item ^net.minecraft.entity.player.EntityPlayer player]
    (new ItemTossEvent entity-item player)))

(defn get-player
  "The player tossing the item.

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^ItemTossEvent this]
    (-> this (.getPlayer))))

