(ns net.minecraftforge.event.entity.EntityEvent
  "EntityEvent is fired when an event involving any Entity occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  entity contains the entity that caused this event to occur.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity EntityEvent]))

(defn ->entity-event
  "Constructor.

  entity - `net.minecraft.entity.Entity`"
  (^EntityEvent [^net.minecraft.entity.Entity entity]
    (new EntityEvent entity)))

(defn get-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityEvent this]
    (-> this (.getEntity))))

