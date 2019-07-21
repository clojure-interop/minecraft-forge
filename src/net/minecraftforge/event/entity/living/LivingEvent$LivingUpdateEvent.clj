(ns net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
  "LivingUpdateEvent is fired when an Entity is updated.
  This event is fired whenever an Entity is updated in
  EntityLivingBase.onUpdate().

  This event is fired via the ForgeHooks.onLivingUpdate(EntityLivingBase).

  This event is Cancelable.
  If this event is canceled, the Entity does not update.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingEvent$LivingUpdateEvent]))

(defn ->living-update-event
  "Constructor.

  e - `net.minecraft.entity.EntityLivingBase`"
  (^LivingEvent$LivingUpdateEvent [^net.minecraft.entity.EntityLivingBase e]
    (new LivingEvent$LivingUpdateEvent e)))

