(ns net.minecraftforge.event.entity.item.ItemEvent
  "Base class for all EntityItem events. Contains a reference to the
  EntityItem of interest. For most EntityItem events, there's little to no
  additional useful data from the firing method that isn't already contained
  within the EntityItem instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.item ItemEvent]))

(defn ->item-event
  "Constructor.

  Creates a new event for an EntityItem.

  item-entity - The EntityItem for this event - `net.minecraft.entity.item.EntityItem`"
  (^ItemEvent [^net.minecraft.entity.item.EntityItem item-entity]
    (new ItemEvent item-entity)))

(defn get-entity-item
  "The relevant EntityItem for this event, already cast for you.

  returns: `net.minecraft.entity.item.EntityItem`"
  (^net.minecraft.entity.item.EntityItem [^ItemEvent this]
    (-> this (.getEntityItem))))

