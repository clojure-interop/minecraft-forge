(ns net.minecraftforge.event.entity.EntityStruckByLightningEvent
  "EntityStruckByLightningEvent is fired when an Entity is about to be struck by lightening.
  This event is fired whenever an EntityLightningBolt is updated to strike an Entity in
  EntityLightningBolt.onUpdate() via ForgeEventFactory.onEntityStruckByLightning(Entity, EntityLightningBolt).

  lightning contains the instance of EntityLightningBolt attempting to strike an entity.

  This event is Cancelable.
  If this event is canceled, the Entity is not struck by the lightening.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity EntityStruckByLightningEvent]))

(defn ->entity-struck-by-lightning-event
  "Constructor.

  entity - `net.minecraft.entity.Entity`
  lightning - `net.minecraft.entity.effect.EntityLightningBolt`"
  (^EntityStruckByLightningEvent [^net.minecraft.entity.Entity entity ^net.minecraft.entity.effect.EntityLightningBolt lightning]
    (new EntityStruckByLightningEvent entity lightning)))

(defn get-lightning
  "returns: `net.minecraft.entity.effect.EntityLightningBolt`"
  (^net.minecraft.entity.effect.EntityLightningBolt [^EntityStruckByLightningEvent this]
    (-> this (.getLightning))))

