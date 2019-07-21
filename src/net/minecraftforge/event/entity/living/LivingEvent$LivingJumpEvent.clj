(ns net.minecraftforge.event.entity.living.LivingEvent$LivingJumpEvent
  "LivingJumpEvent is fired when an Entity jumps.
  This event is fired whenever an Entity jumps in
  EntityLivingBase.jump(), EntityMagmaCube.jump(),
  and EntityLivingBase.jump().

  This event is fired via the ForgeHooks.onLivingJump(EntityLivingBase).

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingEvent$LivingJumpEvent]))

(defn ->living-jump-event
  "Constructor.

  e - `net.minecraft.entity.EntityLivingBase`"
  (^LivingEvent$LivingJumpEvent [^net.minecraft.entity.EntityLivingBase e]
    (new LivingEvent$LivingJumpEvent e)))

