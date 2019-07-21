(ns net.minecraftforge.event.entity.living.LivingEvent
  "LivingEvent is fired whenever an event involving Living entities occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingEvent]))

(defn ->living-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`"
  (^LivingEvent [^net.minecraft.entity.EntityLivingBase entity]
    (new LivingEvent entity)))

(defn get-entity-living
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^LivingEvent this]
    (-> this (.getEntityLiving))))

