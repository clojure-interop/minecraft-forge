(ns net.minecraftforge.event.entity.EntityMountEvent
  "This event gets fired whenever a entity mounts/dismounts another entity.
  entityBeingMounted can be null, be sure to check for that.


  This event is Cancelable.
  If this event is canceled, the entity does not mount/dismount the other entity.

  This event does not have a result. Event.HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity EntityMountEvent]))

(defn ->entity-mount-event
  "Constructor.

  entity-mounting - `net.minecraft.entity.Entity`
  entity-being-mounted - `net.minecraft.entity.Entity`
  entity-world - `net.minecraft.world.World`
  is-mounting - `boolean`"
  (^EntityMountEvent [^net.minecraft.entity.Entity entity-mounting ^net.minecraft.entity.Entity entity-being-mounted ^net.minecraft.world.World entity-world ^Boolean is-mounting]
    (new EntityMountEvent entity-mounting entity-being-mounted entity-world is-mounting)))

(defn mounting?
  "returns: `boolean`"
  (^Boolean [^EntityMountEvent this]
    (-> this (.isMounting))))

(defn dismounting?
  "returns: `boolean`"
  (^Boolean [^EntityMountEvent this]
    (-> this (.isDismounting))))

(defn get-entity-mounting
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityMountEvent this]
    (-> this (.getEntityMounting))))

(defn get-entity-being-mounted
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityMountEvent this]
    (-> this (.getEntityBeingMounted))))

(defn get-world-obj
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^EntityMountEvent this]
    (-> this (.getWorldObj))))

