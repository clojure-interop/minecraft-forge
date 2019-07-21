(ns net.minecraftforge.event.entity.item.ItemExpireEvent
  "Event that is fired when an EntityItem's age has reached its maximum
  lifespan. Canceling this event will prevent the EntityItem from being
  flagged as dead, thus staying it's removal from the world. If canceled
  it will add more time to the entities life equal to extraLife."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.item ItemExpireEvent]))

(defn ->item-expire-event
  "Constructor.

  Creates a new event for an expiring EntityItem.

  entity-item - The EntityItem being deleted. - `net.minecraft.entity.item.EntityItem`
  extra-life - The amount of time to be added to this entities lifespan if the event is canceled. - `int`"
  (^ItemExpireEvent [^net.minecraft.entity.item.EntityItem entity-item ^Integer extra-life]
    (new ItemExpireEvent entity-item extra-life)))

(defn get-extra-life
  "returns: `int`"
  (^Integer [^ItemExpireEvent this]
    (-> this (.getExtraLife))))

(defn set-extra-life
  "extra-life - `int`"
  ([^ItemExpireEvent this ^Integer extra-life]
    (-> this (.setExtraLife extra-life))))

