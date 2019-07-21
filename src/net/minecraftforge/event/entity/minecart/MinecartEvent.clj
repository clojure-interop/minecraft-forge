(ns net.minecraftforge.event.entity.minecart.MinecartEvent
  "MinecartEvent is fired whenever an event involving minecart entities occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  minecart contains the minecart entity involved with this event.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.minecart MinecartEvent]))

(defn ->minecart-event
  "Constructor.

  minecart - `net.minecraft.entity.item.EntityMinecart`"
  (^MinecartEvent [^net.minecraft.entity.item.EntityMinecart minecart]
    (new MinecartEvent minecart)))

(defn get-minecart
  "returns: `net.minecraft.entity.item.EntityMinecart`"
  (^net.minecraft.entity.item.EntityMinecart [^MinecartEvent this]
    (-> this (.getMinecart))))

