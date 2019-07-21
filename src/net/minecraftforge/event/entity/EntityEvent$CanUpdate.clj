(ns net.minecraftforge.event.entity.EntityEvent$CanUpdate
  "CanUpdate is fired when an Entity is being created.
  This event is fired whenever vanilla Minecraft determines that an entity
  cannot update in World.updateEntityWithOptionalForce(net.minecraft.entity.Entity, boolean)

  canUpdate contains the boolean value of whether this entity can update.
  If the modder decides that this Entity can be updated, they may change canUpdate to true,
  and the entity with then be updated.

  This event is not Cancelable.

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity EntityEvent$CanUpdate]))

(defn ->can-update
  "Constructor.

  entity - `net.minecraft.entity.Entity`"
  (^EntityEvent$CanUpdate [^net.minecraft.entity.Entity entity]
    (new EntityEvent$CanUpdate entity)))

(defn get-can-update?
  "returns: `boolean`"
  (^Boolean [^EntityEvent$CanUpdate this]
    (-> this (.getCanUpdate))))

(defn set-can-update
  "can-update - `boolean`"
  ([^EntityEvent$CanUpdate this ^Boolean can-update]
    (-> this (.setCanUpdate can-update))))

