(ns net.minecraftforge.event.entity.EntityEvent$EntityConstructing
  "EntityConstructing is fired when an Entity is being created.
  This event is fired within the constructor of the Entity.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity EntityEvent$EntityConstructing]))

(defn ->entity-constructing
  "Constructor.

  entity - `net.minecraft.entity.Entity`"
  (^EntityEvent$EntityConstructing [^net.minecraft.entity.Entity entity]
    (new EntityEvent$EntityConstructing entity)))

