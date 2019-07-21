(ns net.minecraftforge.event.entity.minecart.MinecartCollisionEvent
  "MinecartCollisionEvent is fired when a minecart collides with an Entity.
  This event is fired whenever a minecraft collides in
  EntityMinecart.applyEntityCollision(Entity).

  collider contains the Entity the Minecart collided with.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.minecart MinecartCollisionEvent]))

(defn ->minecart-collision-event
  "Constructor.

  minecart - `net.minecraft.entity.item.EntityMinecart`
  collider - `net.minecraft.entity.Entity`"
  (^MinecartCollisionEvent [^net.minecraft.entity.item.EntityMinecart minecart ^net.minecraft.entity.Entity collider]
    (new MinecartCollisionEvent minecart collider)))

(defn get-collider
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^MinecartCollisionEvent this]
    (-> this (.getCollider))))

