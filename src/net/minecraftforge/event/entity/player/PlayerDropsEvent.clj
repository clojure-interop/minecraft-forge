(ns net.minecraftforge.event.entity.player.PlayerDropsEvent
  "Child class of LivingDropEvent that is fired specifically when a
  player dies.  Canceling the event will prevent ALL drops from entering the
  world."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerDropsEvent]))

(defn ->player-drops-event
  "Constructor.

  Creates a new event containing all the items that will drop into the
   world when a player dies.

  entity - The dying player. - `net.minecraft.entity.player.EntityPlayer`
  source - The source of the damage which is killing the player. - `net.minecraft.util.DamageSource`
  drops - List of all drops entering the world. - `java.util.List`
  recently-hit - `boolean`"
  (^PlayerDropsEvent [^net.minecraft.entity.player.EntityPlayer entity ^net.minecraft.util.DamageSource source ^java.util.List drops ^Boolean recently-hit]
    (new PlayerDropsEvent entity source drops recently-hit)))

(defn get-entity-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^PlayerDropsEvent this]
    (-> this (.getEntityPlayer))))

