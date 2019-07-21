(ns net.minecraftforge.event.entity.EntityTravelToDimensionEvent
  "EntityTravelToDimensionEvent is fired before an Entity travels to a dimension.

  dimension contains the id of the dimension the entity is traveling to.

  This event is Cancelable.
  If this event is canceled, the Entity does not travel to the dimension.

  This event does not have a result. Event.HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity EntityTravelToDimensionEvent]))

(defn ->entity-travel-to-dimension-event
  "Constructor.

  entity - `net.minecraft.entity.Entity`
  dimension - `int`"
  (^EntityTravelToDimensionEvent [^net.minecraft.entity.Entity entity ^Integer dimension]
    (new EntityTravelToDimensionEvent entity dimension)))

(defn get-dimension
  "returns: `int`"
  (^Integer [^EntityTravelToDimensionEvent this]
    (-> this (.getDimension))))

