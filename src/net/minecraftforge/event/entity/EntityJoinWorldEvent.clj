(ns net.minecraftforge.event.entity.EntityJoinWorldEvent
  "EntityJoinWorldEvent is fired when an Entity joins the world.
  This event is fired whenever an Entity is added to the world in
  World.loadEntities(Collection), WorldServer.loadEntities(Collection) World.joinEntityInSurroundings(Entity), and World.spawnEntity(Entity).

  world contains the world in which the entity is to join.

  This event is Cancelable.
  If this event is canceled, the Entity is not added to the world.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity EntityJoinWorldEvent]))

(defn ->entity-join-world-event
  "Constructor.

  entity - `net.minecraft.entity.Entity`
  world - `net.minecraft.world.World`"
  (^EntityJoinWorldEvent [^net.minecraft.entity.Entity entity ^net.minecraft.world.World world]
    (new EntityJoinWorldEvent entity world)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^EntityJoinWorldEvent this]
    (-> this (.getWorld))))

